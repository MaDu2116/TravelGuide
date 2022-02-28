package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.RestaurantDto;
import logic.DetailLogic;

@WebServlet(name = "/", urlPatterns = "/detailRestaurant")
public class DetailRestaurantController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("vao detail restaurant");
		String idRestaurant = req.getParameter("idRestaurant");
		DetailLogic detailLogic = new DetailLogic();
		System.out.println("idRestaurant= " + idRestaurant);
		RestaurantDto restaurantDto = new RestaurantDto();

		restaurantDto = detailLogic.getRestauranById(idRestaurant);

		req.setAttribute("restaurantDto", restaurantDto);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/Views/Home/DetailRestaurant/DetailRestaurant.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}