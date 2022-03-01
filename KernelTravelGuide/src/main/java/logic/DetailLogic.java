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

		HotelDto hotelDto = new HotelDto();
		HotelDao hotelDao = new HotelDao();
		hotelDto = hotelDao.getHotelById(idHotel);
		return hotelDto;
	}

	public RestaurantDto getRestauranById(String idRestaurant) {
		RestaurantDto restaurantDto = new RestaurantDto();
		RestaurantDao restaurantDao = new RestaurantDao();
		restaurantDto = restaurantDao.getRestauranById(idRestaurant);
		return restaurantDto;
	}

	public ResortDto getResortById(String idResort) {
		ResortDto resortDto = new ResortDto();
		ResortDao resortDao = new ResortDao();
		resortDto = resortDao.getResortById(idResort);
		return resortDto;
	}

	public TouristSpotDto getTouristSpotById(String idTouristSpot) {
		TouristSpotDto touristSpotDto = new TouristSpotDto();
		TouristSpotDao touristSpotDao = new TouristSpotDao();
		touristSpotDto = touristSpotDao.getTouristSpotById(idTouristSpot);
		return touristSpotDto;
	}

	public TravelDto getTravelById(String idTravel) {
		TravelDto travelDto = new TravelDto();
		TravelDao travelDao = new TravelDao();
		travelDto = travelDao.getTravelById(idTravel);
		return travelDto;
	}

}
