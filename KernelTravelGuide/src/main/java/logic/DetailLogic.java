package logic;

import dao.HotelDao;
import dao.RestaurantDao;
import dto.HotelDto;
import dto.RestaurantDto;

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

}
