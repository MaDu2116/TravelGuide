package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.TouristSpotDto;
import logic.DetailLogic;

@WebServlet(urlPatterns = "/detailTouristSpot")
public class DetailTouristSpotController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idTouristSpot = req.getParameter("idTouristSpot");
		DetailLogic detailLogic = new DetailLogic();

		TouristSpotDto touristSpotDto = detailLogic.getTouristSpotById(idTouristSpot);

		req.setAttribute("touristSpotDto", touristSpotDto);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/Views/Home/DetailTouristSpot/DetailTouristSpot.jsp");
		dispatcher.forward(req, resp);
	}

}
