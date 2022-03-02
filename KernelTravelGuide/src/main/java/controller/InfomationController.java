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

import dto.HotelDto;
import dto.ResortDto;
import dto.RestaurantDto;
import dto.TouristSpotDto;
import dto.TravelDto;
import logic.InfomationLogic;

@WebServlet(name = "infomation", urlPatterns = "/")
public class InfomationController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String act[] = req.getRequestURL().toString().split("/");
		String action = act[act.length - 1];
		System.out.println(action);
		RequestDispatcher dispatcher = null;
		InfomationLogic infomationLogic = new InfomationLogic();
		switch (action) {
		case "showAllTouristSpot":
			List<TouristSpotDto> touristSpotDtoList = new ArrayList<>();
			touristSpotDtoList = infomationLogic.getAllTouristSpot();
			req.setAttribute("touristSpotDtoList", touristSpotDtoList);
			System.out.println(touristSpotDtoList.get(0).getAddressTouristSpot());
			dispatcher = req.getRequestDispatcher("/Views/Information/ShowAllTouristSpot.jsp");
			break;

		case "showAllHotel":
			List<HotelDto> hotelDtoList = new ArrayList<>();
			hotelDtoList = infomationLogic.getAllHotel();
			req.setAttribute("hotelDtoList", hotelDtoList);
			dispatcher = req.getRequestDispatcher("/Views/Information/ShowAllHotel.jsp");
			break;
		case "showAllRestaurant":
			// ToDo
			List<RestaurantDto> restaurantDtoList = new ArrayList<>();
			restaurantDtoList = infomationLogic.getAllRestaurant();
			req.setAttribute("restaurantDtoList", restaurantDtoList);
			dispatcher = req.getRequestDispatcher("/Views/Information/ShowAllRestaurant.jsp");
			break;
		case "showAllResort":
			// ToDo
			List<ResortDto> resortDtoList = new ArrayList<>();
			resortDtoList = infomationLogic.getAllResort();
			req.setAttribute("resortDtoList", resortDtoList);
			dispatcher = req.getRequestDispatcher("/Views/Information/ShowAllResort.jsp");
			break;
		case "showAllTravel":
			// ToDo
			List<TravelDto> travelDtoList = new ArrayList<>();
			travelDtoList = infomationLogic.getAllTravel();
			req.setAttribute("travelDtoList", travelDtoList);
			dispatcher = req.getRequestDispatcher("/Views/Information/ShowAllTravel.jsp");
			break;
		default:
			dispatcher = req.getRequestDispatcher("/Views/Information/ShowAllTouristSpot.jsp");
			break;
		}

		dispatcher.forward(req, resp);
	}
}
