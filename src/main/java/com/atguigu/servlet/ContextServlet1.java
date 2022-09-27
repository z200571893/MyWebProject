package com.atguigu.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ContextServlet1 extends HttpServlet {


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		System.out.println(context);
		System.out.println("保存之前： Context1 中獲取key1的值：" + context.getAttribute("key1"));
		context.setAttribute("key1","value1");
		System.out.println("Context1 中獲取域數據key1的值：" + context.getAttribute("key1"));
	}


}
