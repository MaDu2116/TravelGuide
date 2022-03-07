package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.Common;
import common.Constant;
import dto.HotelDto;
import dto.ResortDto;
import dto.RestaurantDto;
import dto.TouristSpotDto;
import dto.TravelDto;
import logic.InfomationLogic;

@WebServlet(urlPatterns = { "/infomation/showAllResort","/infomation/showAllTouristSpot", "/infomation/showAllHotel",
		"/infomation/showAllRestaurant", "/infomation/showAllTravel"  })
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
		List<String> nameCityList = infomationLogic.getAllNameCity();
		String city = req.getParameter(Constant.CITY);
		int totalPage = 1;
		String path = "";
		int totalItem = 0;
		try {

			int currentPage = req.getParameter(Constant.CURRENT_PAGE) != null
					? Integer.valueOf(req.getParameter(Constant.CURRENT_PAGE))
					: 1;
			String searchStr = req.getParameter(Constant.SEARCH_STRING);
			String quality = req.getParameter(Constant.QUALITY);
			String available = req.getParameter(Constant.AVAILABLE);
			String discount = req.getParameter(Constant.DISCOUNT);
			String minPrice = Common.ruleOfPrice(req.getParameter(Constant.MIN_PRICE));
			String maxPrice = Common.ruleOfPrice(req.getParameter(Constant.MAX_PRICE));
			switch (action) {
			case Constant.SHOW_ALL_TOURIST_SPOT:
				totalItem = infomationLogic.countTotalItem(Constant.SHOW_ALL_TOURIST_SPOT, searchStr, city, available, quality, minPrice, maxPrice, discount);
				List<TouristSpotDto> touristSpotDtoList = infomationLogic.getAllTouristSpot(currentPage, searchStr, city, quality);
				req.setAttribute(Constant.TOURIST_SPOT_DTO_LIST, touristSpotDtoList);
				path = "/Views/Information/ShowAllTouristSpot.jsp";
				break;

			case Constant.SHOW_ALL_HOTEL:
				totalItem = infomationLogic.countTotalItem(Constant.SHOW_ALL_HOTEL, searchStr, city, available, quality, minPrice, maxPrice, discount);
				List<HotelDto> hotelDtoList = infomationLogic.getAllHotel(currentPage, searchStr, city, available, quality, minPrice, maxPrice, discount);
				req.setAttribute("hotelDtoList", hotelDtoList);
				path = "/Views/Information/ShowAllHotel.jsp";
				break;

			case Constant.SHOW_ALL_RESTAURANT:
				totalItem = infomationLogic.countTotalItem(Constant.SHOW_ALL_RESTAURANT, searchStr, city, available, quality, minPrice, maxPrice, discount);
				List<RestaurantDto> restaurantDtoList = infomationLogic.getAllRestaurant(currentPage, searchStr, city, available, quality, minPrice, maxPrice, discount );
				req.setAttribute(Constant.RESTAURANT_DTO_LIST, restaurantDtoList);
				path = "/Views/Information/ShowAllRestaurant.jsp";
				break;

			case Constant.SHOW_ALL_RESORT:
				totalItem = infomationLogic.countTotalItem(Constant.SHOW_ALL_RESORT, searchStr, city, available, quality, minPrice, maxPrice, discount);
				List<ResortDto> resortDtoList = infomationLogic.getAllResort(currentPage, searchStr, city, available, quality, minPrice, maxPrice, discount);
				req.setAttribute(Constant.RESORT_DTO_LIST, resortDtoList);
				path = "/Views/Information/ShowAllResort.jsp";
				break;

			case Constant.SHOW_ALL_TRAVEL:
				totalItem = infomationLogic.countTotalItem(Constant.SHOW_ALL_TRAVEL, searchStr, city, available, quality, minPrice, maxPrice, discount);
				List<TravelDto> travelDtoList = infomationLogic.getAllTravel(currentPage, searchStr, city, available, quality, discount);
				req.setAttribute(Constant.TRAVEL_DTO_LIST, travelDtoList);
				path = "/Views/Information/ShowAllTravel.jsp";
				break;

			}
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
			List<Integer> listPaging = infomationLogic.getListPaging(totalPage, currentPage);
			req.setAttribute(Constant.NAME_CITY_LIST, nameCityList);
			req.setAttribute(Constant.TOTAL_PAGE, totalPage);
			req.setAttribute(Constant.LIST_PAGING, listPaging);
			req.setAttribute(Constant.CURRENT_PAGE, currentPage);
			req.setAttribute(Constant.SEARCH_STRING, searchStr);
			req.setAttribute(Constant.CITY, city);
			req.setAttribute(Constant.AVAILABLE, available);
			req.setAttribute(Constant.QUALITY, quality);
			req.setAttribute(Constant.MIN_PRICE, minPrice);
			req.setAttribute(Constant.MAX_PRICE, maxPrice);
			req.setAttribute(Constant.DISCOUNT, discount);
			dispatcher = req.getRequestDispatcher(path);
			dispatcher.forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
