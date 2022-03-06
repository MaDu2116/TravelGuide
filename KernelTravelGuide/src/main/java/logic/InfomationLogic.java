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
		CityDao cityDao = new CityDao();
		return cityDao.getAllNameCity();
	}

	public List<TouristSpotDto> getAllTouristSpot(int currentPage, String searchStr, String city, String quality) {
		int offset = (currentPage - 1) * 3;
		TouristSpotDao touristSpotDao = new TouristSpotDao();
		return touristSpotDao.getAllTouristSpot(offset, searchStr, city, quality);
	}

	public List<HotelDto> getAllHotel(int currentPage, String searchStr, String city, String quality) {
		int offset = (currentPage - 1) * 3;
		HotelDao hotelDao = new HotelDao();
		return hotelDao.getAllHotel(offset, searchStr, city, quality);
	}

	public List<RestaurantDto> getAllRestaurant(int currentPage, String searchStr, String city, String quality) {
		int offset = (currentPage - 1) * 3;
		RestaurantDao restaurantDao = new RestaurantDao();
		return restaurantDao.getAllRestauran(offset, searchStr, city, quality);
	}

	public List<TravelDto> getAllTravel(int currentPage, String searchStr, String city, String quality) {
		int offset = (currentPage - 1) * 3;
		TravelDao travelDao = new TravelDao();
		return travelDao.getAllTravel(offset, searchStr, city, quality);
	}

	public List<ResortDto> getAllResort(int currentPage, String searchStr, String city, String quality) {
		int offset = (currentPage - 1) * 3;
		ResortDao resortDao = new ResortDao();
		return resortDao.getAllResort(offset, searchStr, city, quality);
	}

	public int totalPage(String type, String searchStr, String city, String available, String quality, String priceMin, String priceMax, String discount) {
		int totalPage = 0;
		switch (type) {
		case "showAllTouristSpot":
			TouristSpotDao touristSpotDao = new TouristSpotDao();
			totalPage = touristSpotDao.countAllTouristSpot(searchStr, city, quality);

			break;
		case "showAllHotel":
			HotelDao hotelDao = new HotelDao();
			totalPage = hotelDao.countAllHotel(searchStr, city, quality);

			break;
		case "showAllResort":
			ResortDao resortDao = new ResortDao();
			totalPage = resortDao.countAllResort(searchStr, city, quality);

			break;
		case "showAllRestaurant":
			RestaurantDao restaurantDao = new RestaurantDao();
			totalPage = restaurantDao.countAllRestaurant(searchStr, city, available, quality, priceMin, priceMax, discount );

			break;
		case "showAllTravel":
			TravelDao travelDao = new TravelDao();
			totalPage = travelDao.countAllTravel(searchStr, city, quality);
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

	public int countTotalItem(String type, String searchStr, String city, String quality, String available, String priceMin, String priceMax, String discount) {
		int totalItem = 0;
		switch (type) {
		case "showAllTouristSpot":
			TouristSpotDao touristSpotDao = new TouristSpotDao();
			totalItem = touristSpotDao.countAllTouristSpot(searchStr, city, quality);

			break;
		case "showAllHotel":
			HotelDao hotelDao = new HotelDao();
			totalItem = hotelDao.countAllHotel(searchStr, city, quality);

			break;
		case "showAllResort":
			ResortDao resortDao = new ResortDao();
			totalItem = resortDao.countAllResort(searchStr, city, quality);

			break;
		case "showAllRestaurant":
			RestaurantDao restaurantDao = new RestaurantDao();
			totalItem = restaurantDao.countAllRestaurant(searchStr, city, available, quality, priceMin, priceMax, discount );

			break;
		case "showAllTravel":
			TravelDao travelDao = new TravelDao();
			totalItem = travelDao.countAllTravel(searchStr, city, quality);
			break;

		default:
			break;
		}
		return totalItem;
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
