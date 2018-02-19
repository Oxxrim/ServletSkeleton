package org.itstep.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.itstep.service.SkeletonService;
/**
 * 
 * @author Okhrumenko Dmytro
 *
 */
@SuppressWarnings("serial")
//@WebServlet("/reverse")
public class SkeletonServlet extends HttpServlet {
	SkeletonService service = new SkeletonService();
    /**
     * 
     * method GET
     * parametrs requires
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		String text = request.getParameter("text");
		String reversedText = service.reverseText(text);
	
		session.setAttribute("reversedText",reversedText);
		session.setAttribute("met", "- GET");
		response.sendRedirect("/ServletSkeleton/jsp/redirect.jsp");
	}

	/**
	 * 
	 * method POST
	 * parametrs requires
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		String text = request.getParameter("text");
		String reversedText = service.reverseText(text);
		
		session.setAttribute("reversedText",reversedText);
		session.setAttribute("met", "- POST");
		response.sendRedirect("/ServletSkeleton/jsp/redirect.jsp");
	}

	/**
	 * 
	 * method PUT
	 * parametrs requires
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		String text = request.getParameter("text");
		String reversedText = service.reverseText(text);
		
		session.setAttribute("reversedText",reversedText);
		session.setAttribute("met", "- PUT");
		response.sendRedirect("/ServletSkeleton/jsp/redirect.jsp");
	}

	/**
	 * 
	 * method DELETE
	 * parametrs requires
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		String text = request.getParameter("text");
		String reversedText = service.reverseText(text);
		
		session.setAttribute("reversedText",reversedText);
		session.setAttribute("metod", "- DELETE");
		response.sendRedirect("/ServletSkeleton/jsp/redirect.jsp");
	}

}
