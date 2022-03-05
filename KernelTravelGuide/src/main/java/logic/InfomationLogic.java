package logic;

import java.util.ArrayList;
import java.util.List;

import dao.CityDao;
import dao.HotelDao;
import dao.ResortDao;
import dao.RestaurantDao;
import dao.TouristSpotDao;
import dao.TravelDao;
import dto.HotelDto;
import dto.ResortDto;
import dto.RestaurantDto;
import dto.TouristSpotDto;
import dto.TravelDto;

public class InfomationLogic {

	public List<String> getAllNameCity() {
		List<String> nameCityList = new ArrayList<>();
		CityDao cityDao = new CityDao();
		nameCityList = cityDao.getAllNameCity();
		return nameCityList;
	}

	public List<TouristSpotDto> getAllTouristSpot(int currentPage, String searchStr, String city, String quality) {
		int offset = (currentPage - 1) * 3;
		List<TouristSpotDto> touristSpotDtoList = new ArrayList<>();
		TouristSpotDao touristSpotDao = new TouristSpotDao();
		touristSpotDtoList = touristSpotDao.getAllTouristSpot(offset, searchStr, city, quality);
		return touristSpotDtoList;
	}

	public List<HotelDto> getAllHotel() {
		List<HotelDto> hotelDtoList = new ArrayList<>();
		HotelDao hotelDao = new HotelDao();
		hotelDtoList = hotelDao.getAllHotel();
		return hotelDtoList;
	}

	public List<RestaurantDto> getAllRestaurant() {
		List<RestaurantDto> restaurantDtoList = new ArrayList<>();
		RestaurantDao restaurantDao = new RestaurantDao();
		restaurantDtoList = restaurantDao.getAllRestauran();
		return restaurantDtoList;
	}

	public List<TravelDto> getAllTravel() {
		List<TravelDto> travelDtoList = new ArrayList<>();
		TravelDao travelDao = new TravelDao();
		travelDtoList = travelDao.getAllTravel();
		return travelDtoList;
	}

	public List<ResortDto> getAllResort() {
		List<ResortDto> resortDtoList = new ArrayList<>();
		ResortDao resortDao = new ResortDao();
		resortDtoList = resortDao.getAllResort();
		return resortDtoList;
	}

	public int totalPage(String type, String searchStr, String city, String quality) {
		int totalPage = 0;
		switch (type) {
		case "showAllTouristSpot":
			TouristSpotDao touristSpotDao = new TouristSpotDao();
			totalPage = touristSpotDao.countAllTouristSpot(searchStr, city, quality);

			break;
		case "hotel":
			HotelDao hotelDao = new HotelDao();
			totalPage = hotelDao.countAllHotel();

			break;
		case "resort":
			ResortDao resortDao = new ResortDao();
			totalPage = resortDao.countAllResort();

			break;
		case "travel":
			TravelDao travelDao = new TravelDao();
			totalPage = travelDao.countAllTravel();
			break;

		default:
			break;
		}

		if (totalPage % 3 > 0) {
			totalPage = totalPage / 3 + 1;
		} else {
			totalPage /= 3;
		}

		return totalPage;

	}

	public int countTotalItem(String searchStr, String city, String quality) {
		TouristSpotDao touristSpotDao = new TouristSpotDao();
		return touristSpotDao.countAllTouristSpot(searchStr, city, quality);
	}

	public List<Integer> getListPaging(int totalPage, int currentPage) {
		List<Integer> listPaging = new ArrayList<Integer>();
		int pageRange = 3;
		int pageStart = 0;
		int pageEnd = 0;
		if (pageRange == 0 || totalPage <= pageRange) {
			pageStart = 1;
			pageEnd = totalPage;
		} else {
			int totalListPaging = getTotalListPaging(totalPage, pageRange);
			int positionOfListPagingFromCurrentPage = getPositionOfListPagingFromCurrentPage(totalListPaging, pageRange,
					currentPage);
			pageStart = positionOfListPagingFromCurrentPage * pageRange + 1;
			pageEnd = pageStart + pageRange - 1;
			if (pageEnd > totalPage) {
				pageEnd = totalPage;
			}
		}
		// add List Page to listPaging => from pageStart to pageEnd
		for (int i = pageStart; i <= pageEnd; i++) {
			System.err.println(pageStart + "---" + pageEnd);
			listPaging.add(i);
		}
		return listPaging;
	}

	public static int getTotalListPaging(int totalPage, int pageRange) {
		int totalListPaging = 0;
		totalListPaging = (int) Math.ceil((double) totalPage / pageRange);
		return totalListPaging;
	}

	public static int getPositionOfListPagingFromCurrentPage(int totalListPaging, int pageRange, int currentPage) {
		int positionOfListPagingFromCurrentPage = 0;
		for (int i = 0; i < totalListPaging; i++) {
			if (((i * pageRange + 1) <= currentPage) && (((i + 1) * pageRange) >= currentPage)) {
				positionOfListPagingFromCurrentPage = i;
				break;
			}
		}
		return positionOfListPagingFromCurrentPage;
	}

}
