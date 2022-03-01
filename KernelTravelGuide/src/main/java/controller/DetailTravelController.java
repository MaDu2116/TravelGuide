package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.TravelDto;
import logic.DetailLogic;

@WebServlet(urlPatterns = "/detailTravel")
public class DetailTravelController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idTravel = req.getParameter("idTravel");
		DetailLogic detailLogic = new DetailLogic();

		TravelDto travelDto = new TravelDto();

		travelDto = detailLogic.getTravelById(idTravel);

		req.setAttribute("travelDto", travelDto);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/Views/Home/DetailTravel/DetailTravel.jsp");
		dispatcher.forward(req, resp);
		;
	}

}
