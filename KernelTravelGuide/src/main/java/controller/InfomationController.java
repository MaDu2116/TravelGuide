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

@WebServlet(urlPatterns = { "/infomation/showAllTouristSpot", "/infomation/showAllHotel",
		"/infomation/showAllRestaurant", "/infomation/showAllTravel", "/infomation/showAllResort" })
public class InfomationController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String act[] = req.getRequestURL().toString().split("/");
		String action = act[act.length - 1];
		RequestDispatcher dispatcher = null;
		InfomationLogic infomationLogic = new InfomationLogic();

		List<String> nameCityList = new ArrayList<>();
		nameCityList = infomationLogic.getAllNameCity();
		req.setAttribute("nameCityList", nameCityList);

		String city = req.getParameter("city");
		System.out.println(city);
		int totalPage = 1;
		
		int currentPage = req.getParameter("page") != null ? Integer.valueOf(req.getParameter("page")) : 1;

		switch (action) {
		case "showAllTouristSpot":
			totalPage = infomationLogic.totalPage("showAllTouristSpot");
			req.setAttribute("totalPage", totalPage);
			List<TouristSpotDto> touristSpotDtoList = new ArrayList<>();
			touristSpotDtoList = infomationLogic.getAllTouristSpot(currentPage);
			req.setAttribute("touristSpotDtoList", touristSpotDtoList);
			dispatcher = req.getRequestDispatcher("/Views/Information/ShowAllTouristSpot.jsp");
			break;

		case "showAllHotel":
			totalPage = infomationLogic.totalPage("showAllHotel");
			req.setAttribute("totalPage", totalPage);
			List<HotelDto> hotelDtoList = new ArrayList<>();
			hotelDtoList = infomationLogic.getAllHotel();
			req.setAttribute("hotelDtoList", hotelDtoList);
			dispatcher = req.getRequestDispatcher("/Views/Information/ShowAllHotel.jsp");
			break;
		case "showAllRestaurant":
			totalPage = infomationLogic.totalPage("showAllRestaurant");
			req.setAttribute("totalPage", totalPage);
			List<RestaurantDto> restaurantDtoList = new ArrayList<>();
			restaurantDtoList = infomationLogic.getAllRestaurant();
			req.setAttribute("restaurantDtoList", restaurantDtoList);
			dispatcher = req.getRequestDispatcher("/Views/Information/ShowAllRestaurant.jsp");
			break;
		case "showAllResort":
			totalPage = infomationLogic.totalPage("showAllResort");
			req.setAttribute("totalPage", totalPage);
			List<ResortDto> resortDtoList = new ArrayList<>();
			resortDtoList = infomationLogic.getAllResort();
			req.setAttribute("resortDtoList", resortDtoList);
			dispatcher = req.getRequestDispatcher("/Views/Information/ShowAllResort.jsp");
			break;
		case "showAllTravel":
			totalPage = infomationLogic.totalPage("showAllTravel");
			req.setAttribute("totalPage", totalPage);
			List<TravelDto> travelDtoList = new ArrayList<>();
			travelDtoList = infomationLogic.getAllTravel();
			req.setAttribute("travelDtoList", travelDtoList);
			dispatcher = req.getRequestDispatcher("/Views/Information/ShowAllTravel.jsp");
			break;
//		default:
//			System.out.println("vao default");
////			touristSpotDtoList = new ArrayList<>();
////			touristSpotDtoList = infomationLogic.getAllTouristSpot();
////			req.setAttribute("touristSpotDtoList", touristSpotDtoList);
//			dispatcher = req.getRequestDispatcher("/Views/Information/ShowAllTouristSpot.jsp");
//			break;
		}

		dispatcher.forward(req, resp);
	}
}
