package logic;

import java.util.ArrayList;
import java.util.List;

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

	public List<TouristSpotDto> getAllTouristSpot() {
		List<TouristSpotDto> touristSpotDtoList = new ArrayList<>();
		TouristSpotDao touristSpotDao = new TouristSpotDao();
		touristSpotDtoList = touristSpotDao.getAllTouristSpot();
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

	public int totalPage(String type) {
		int totalPage = 0;
		switch (type) {
		case "showAllTouristSpot":
			TouristSpotDao touristSpotDao = new TouristSpotDao();
			totalPage = touristSpotDao.countAllTouristSpot();

			break;
		case "hotel":

			break;
		case "resort":

			break;
		case "travel":

			break;

		default:
			break;
		}

		return totalPage;

	}

}
