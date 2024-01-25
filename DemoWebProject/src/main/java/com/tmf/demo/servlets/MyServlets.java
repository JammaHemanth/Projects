package com.tmf.demo.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlets extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//To specify the type of data to be displayed in browser
		resp.setContentType("text/html");
		resp.getWriter().print("Welcome to Servlet");
		resp.getWriter().print("<a href='index.html'>Home</a>");
	}
}
