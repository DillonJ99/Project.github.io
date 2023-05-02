package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import databases.UserDAO;
import models.User;


@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher view = request.getRequestDispatcher("PhishingEmailServer.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String title = request.getParameter("title");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		int age = Integer.parseInt(request.getParameter("age"));
		String educationLevel = request.getParameter("educationLevel");
		String computerExperience = request.getParameter("computerExperience");
		String gender = request.getParameter("gender");

		int answer1 = 0; // Set a default value for answer1
		int answer2 = 0;
		int answer3 = 0;
		int answer4 = 0;
		int answer5 = 0;
		int answer6 = 0;
		int answer7 = 0;
		int answer8 = 0;
		int answer9 = 0;
		int answer10 = 0;
		// Check if the parameter is not null before parsing it
		String answer1Param = request.getParameter("answer1");
		if (answer1Param != null) {
			answer1 = Integer.parseInt(answer1Param);
		}
		String answer2Param = request.getParameter("answer2");
		if (answer2Param != null) {
			answer2 = Integer.parseInt(answer2Param);
		}
		String answer3Param = request.getParameter("answer3");
		if (answer3Param != null) {
			answer3 = Integer.parseInt(answer3Param);
		}
		String answer4Param = request.getParameter("answer4");
		if (answer4Param != null) {
			answer4 = Integer.parseInt(answer4Param);
		}
		String answer5Param = request.getParameter("answer5");
		if (answer5Param != null) {
			answer5 = Integer.parseInt(answer5Param);
		}
		String answer6Param = request.getParameter("answer6");
		if (answer6Param != null) {
			answer6 = Integer.parseInt(answer6Param);
		}
		String answer7Param = request.getParameter("answer7");
		if (answer7Param != null) {
			answer7 = Integer.parseInt(answer7Param);
		}
		String answer8Param = request.getParameter("answer8");
		if (answer8Param != null) {
			answer8 = Integer.parseInt(answer8Param);
		}
		String answer9Param = request.getParameter("answer9");
		if (answer9Param != null) {
			answer9 = Integer.parseInt(answer9Param);
		}
		String answer10Param = request.getParameter("answer10");
		if (answer10Param != null) {
			answer10 = Integer.parseInt(answer10Param);
		}
		User u = new User(title, firstName, lastName, age, gender, educationLevel, computerExperience, answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8,answer9,answer10);
		UserDAO dao = new UserDAO();
		PrintWriter out = response.getWriter();

		try {
			dao.insertUser(u);
			ArrayList<User> allUsers = dao.getAllUsers();
			request.setAttribute("getUsers", allUsers);
			RequestDispatcher rd = request.getRequestDispatcher("Answers.html");
			rd.include(request, response);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		out.close();
	}
}
