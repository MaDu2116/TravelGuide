package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.HotelDto;
import logic.DetailLogic;

@WebServlet(urlPatterns = "/detailHotel")
public class DetailHotelController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idHotel = req.getParameter("idHotel");
		DetailLogic detailLogic = new DetailLogic();
		HotelDto hotelDto = detailLogic.getHotelById(idHotel);

		req.setAttribute("hotelDto", hotelDto);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/Views/Home/DetailHotel/DetailHotel.jsp");
		dispatcher.forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
}
