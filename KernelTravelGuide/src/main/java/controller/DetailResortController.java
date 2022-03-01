package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.ResortDto;
import logic.DetailLogic;

@WebServlet(urlPatterns = "/detailResort")
public class DetailResortController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idResort = req.getParameter("idResort");
		DetailLogic detailLogic = new DetailLogic();
		ResortDto resortDto = new ResortDto();

		resortDto = detailLogic.getResortById(idResort);

		req.setAttribute("resortDto", resortDto);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/Views/Home/DetailResort/DetailResort.jsp");
		dispatcher.forward(req, resp);

	}

}
