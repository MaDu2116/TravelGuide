package logic;

import java.util.ArrayList;
import java.util.List;

import dao.HotelDao;
import dao.ResortDao;
import dao.RestaurantDao;
import dao.TouristSpotDao;
import dao.TravelDao;
import entity.HotelEntity;
import entity.ResortEntity;
import entity.RestaurantEntity;
import entity.TouristSpotsEntity;
import entity.TravelEntity;

public class HomeLogic {
	public List<HotelEntity> getHotels() {
		HotelDao hotelDao = new HotelDao();
		List<HotelEntity> hotelEntitieList = new ArrayList<HotelEntity>();
		hotelEntitieList = hotelDao.getHotels();
		return hotelEntitieList;
	}

	public List<TravelEntity> getTravels() {
		TravelDao travelDao = new TravelDao();
		List<TravelEntity> travelEntitieList = new ArrayList<>();
		travelEntitieList = travelDao.GetTravels();
		return travelEntitieList;
	}

	public List<RestaurantEntity> getRestaurant() {
		RestaurantDao restaurantDao = new RestaurantDao();
		List<RestaurantEntity> restaurantEntityList = new ArrayList<>();
		restaurantEntityList = restaurantDao.getRestaurants();
		return restaurantEntityList;
	}

	public List<ResortEntity> getResorts() {
		ResortDao resortDao = new ResortDao();
		List<ResortEntity> resortEntityList = new ArrayList<>();
		resortEntityList = resortDao.getResorts();
		return resortEntityList;
	}

	public List<TouristSpotsEntity> GetTourisSpots() {
		TouristSpotDao touristSpotDao = new TouristSpotDao();
		List<TouristSpotsEntity> tourisSpotsEntityList = new ArrayList<>();
		tourisSpotsEntityList = touristSpotDao.getTourisSpots();
		return tourisSpotsEntityList;
	}
}
