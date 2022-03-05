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

import common.Constant;
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

		String city = req.getParameter(Constant.CITY);

		int totalPage = 1;

		int currentPage = req.getParameter(Constant.CURRENT_PAGE) != null
				? Integer.valueOf(req.getParameter(Constant.CURRENT_PAGE))
				: 1;

		String searchStr = req.getParameter(Constant.SEARCH_STRING);
		String quality = req.getParameter(Constant.QUALITY);
		List<Integer> listPaging = new ArrayList<Integer>();

		String path = "";
		int totalItem = 0;
		switch (action) {
		case Constant.SHOW_ALL_TOURIST_SPOT:

			totalPage = infomationLogic.totalPage(Constant.SHOW_ALL_TOURIST_SPOT, searchStr, city, quality);

			List<TouristSpotDto> touristSpotDtoList = new ArrayList<>();
			touristSpotDtoList = infomationLogic.getAllTouristSpot(currentPage, searchStr, city, quality);
			req.setAttribute(Constant.TOURIST_SPOT_DTO_LIST, touristSpotDtoList);
			path = "/Views/Information/ShowAllTouristSpot.jsp";
			break;

		case Constant.SHOW_ALL_HOTEL:
			totalPage = infomationLogic.totalPage(Constant.SHOW_ALL_HOTEL, searchStr, city, quality);
			
			
			List<HotelDto> hotelDtoList = new ArrayList<>();
			hotelDtoList = infomationLogic.getAllHotel();
			req.setAttribute("hotelDtoList", hotelDtoList);
			path = "/Views/Information/ShowAllHotel.jsp";
			break;

		case Constant.SHOW_ALL_RESTAURANT:
			totalPage = infomationLogic.totalPage(Constant.SHOW_ALL_RESTAURANT, searchStr, city, quality);
			
			
			List<RestaurantDto> restaurantDtoList = new ArrayList<>();
			restaurantDtoList = infomationLogic.getAllRestaurant();
			req.setAttribute(Constant.RESTAURANT_DTO_LIST, restaurantDtoList);
			path = "/Views/Information/ShowAllRestaurant.jsp";
			break;

		case Constant.SHOW_ALL_RESORT:
			totalPage = infomationLogic.totalPage(Constant.SHOW_ALL_RESORT, searchStr, city, quality);
			
			
			List<ResortDto> resortDtoList = new ArrayList<>();
			resortDtoList = infomationLogic.getAllResort();
			req.setAttribute(Constant.RESORT_DTO_LIST, resortDtoList);
			path = "/Views/Information/ShowAllResort.jsp";
			break;

		case Constant.SHOW_ALL_TRAVEL:
			totalPage = infomationLogic.totalPage(Constant.SHOW_ALL_TRAVEL, searchStr, city, quality);
			
			
			List<TravelDto> travelDtoList = new ArrayList<>();
			travelDtoList = infomationLogic.getAllTravel();
			req.setAttribute(Constant.TRAVEL_DTO_LIST, travelDtoList);
			path = "/Views/Information/ShowAllTravel.jsp";
			break;

		}

		totalItem = infomationLogic.countTotalItem(searchStr, city, quality);
		totalPage = (int) Math.ceil((double) totalItem / 3);
		if (currentPage == 0) {
			currentPage = 1;
		}
		if (totalPage == 0) {
			currentPage = 0;
		}
		if (currentPage > totalPage) {
			currentPage = totalPage;
		}
		listPaging = infomationLogic.getListPaging(totalPage, currentPage);
		req.setAttribute(Constant.NAME_CITY_LIST, nameCityList);
		req.setAttribute(Constant.TOTAL_PAGE, totalPage);
		req.setAttribute(Constant.LIST_PAGING, listPaging);
		req.setAttribute(Constant.CURRENT_PAGE, currentPage);
		dispatcher = req.getRequestDispatcher(path);
		dispatcher.forward(req, resp);
	}
}
