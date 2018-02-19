package org.itstep.service;

//import javax.servlet.Servlet;
//
//import org.itstep.controller.SkeletonServlet;

public class SkeletonService {

	public String reverseText(String text) {
		
		String[] words = text.split(" ");
		String reverseText = "";
		for (int i = words.length - 1; i >= 0; i--) {
			reverseText += words[i] + " ";
		}
		
		return reverseText.trim();
	}
}
