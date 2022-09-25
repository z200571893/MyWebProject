package com.atguigu.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ContextServlet extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletConfig().getServletContext();
		String username = context.getInitParameter("username");
		System.out.println("context-param參數username的值是：" + username);
		System.out.println("context-param參數password的值是：" + context.getInitParameter("password"));
		System.out.println("當前工程路徑：" + context.getContextPath());
		System.out.println("工程部屬的路徑：" + context.getRealPath("/"));
		System.out.println("工程下css目錄的絕對路徑：" + context.getRealPath("/css"));
		System.out.println("工程下imgs目錄1.jpg的絕對路徑：" + context.getRealPath("/imgs/1.jpg"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
