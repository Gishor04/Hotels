package hotel.servlet.roombooking;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hotel.dao.RoomsBookingDao;


import hotel.model.RoomBooking;

@WebServlet("/newRoomBook")
public class RoomBookingNewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RoomsBookingDao RoomsBookingDao;

	public void init() {
		RoomsBookingDao = new RoomsBookingDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
	
		RequestDispatcher dispatcher = request.getRequestDispatcher("NewRoomBook.jsp");
		
		
		
		dispatcher.forward(request, response);
	}

}