package logic;

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

public class DetailLogic {

	public HotelDto getHotelById(String idHotel) {
		HotelDao hotelDao = new HotelDao();
		return hotelDao.getHotelById(idHotel);
	}

	public RestaurantDto getRestauranById(String idRestaurant) {
		RestaurantDao restaurantDao = new RestaurantDao();
		return restaurantDao.getRestauranById(idRestaurant);
	}

	public ResortDto getResortById(String idResort) {
		ResortDao resortDao = new ResortDao();
		return resortDao.getResortById(idResort);
	}

	public TouristSpotDto getTouristSpotById(String idTouristSpot) {
		TouristSpotDao touristSpotDao = new TouristSpotDao();
		return touristSpotDao.getTouristSpotById(idTouristSpot);
	}

	public TravelDto getTravelById(String idTravel) {
		TravelDao travelDao = new TravelDao();
		return travelDao.getTravelById(idTravel);
	}

}
