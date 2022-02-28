package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.HotelEntity;
import entity.ResortEntity;
import entity.RestaurantEntity;
import entity.TouristSpotsEntity;
import entity.TravelEntity;
import logic.HomeLogic;

@WebServlet(name = "KernelTravelGuide", urlPatterns = { "/", "/home" })
public class HomeController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HomeLogic homeLogic = new HomeLogic();
		System.out.println("vao index");
		// getDataHotel
		List<HotelEntity> hotelEntityList = new ArrayList<HotelEntity>();
		hotelEntityList = homeLogic.getHotels();
		req.setAttribute("hotelEntityList", hotelEntityList);

		// get Restaurant
		List<RestaurantEntity> restaurantEntityList = new ArrayList<>();
		restaurantEntityList = homeLogic.getRestaurant();
		req.setAttribute("restaurantEntityList", restaurantEntityList);

		// get Resort
		List<ResortEntity> resortEntityList = new ArrayList<>();
		resortEntityList = homeLogic.getResorts();
		req.setAttribute("resortEntityList", resortEntityList);

		// get TouristSpots
		List<TouristSpotsEntity> touristSpotsEntityList = new ArrayList<>();
		touristSpotsEntityList = homeLogic.GetTourisSpots();
		req.setAttribute("tourisSpotsEntityList", touristSpotsEntityList);

		// getTravels
		List<TravelEntity> travelEntityList = new ArrayList<TravelEntity>();
		travelEntityList = homeLogic.getTravels();
		req.setAttribute("travelEntityList", travelEntityList);

		RequestDispatcher dispatcher = req.getRequestDispatcher("Views/index.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("dôpst");
		super.doPost(req, resp);
	}

}
