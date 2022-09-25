package com.atguigu.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet2 extends HttpServlet{
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("重寫了init初始化方法，做了一些工作");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("HelloServlet2 doGet方法");
		ServletConfig servletConfig = getServletConfig();
		System.out.println(servletConfig);
		System.out.println("HelloServlet初始化參數username的值是：" + servletConfig.getInitParameter("username"));
		System.out.println("HelloServlet初始化參數url的值是：" + servletConfig.getInitParameter("url"));
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("HelloServlet2 doPost方法");
	}
	
}
