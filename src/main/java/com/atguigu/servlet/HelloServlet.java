package com.atguigu.servlet;
import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;


public class HelloServlet implements Servlet {
	
	public HelloServlet() {
		System.out.println("1 構造器方法");
	}
	
	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		System.out.println("2 初始化方法");
		System.out.println("HelloServlet程序的別名是：" + servletConfig.getServletName());
		System.out.println("HelloServlet初始化參數username的值是：" + servletConfig.getInitParameter("username"));
		System.out.println("HelloServlet初始化參數url的值是：" + servletConfig.getInitParameter("url"));
		System.out.println(servletConfig.getServletContext());
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("4 destroy銷毀方法");
	}

	@Override
	public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("3 Service ===方法 Hello Servlet 被訪問了");
		
		HttpServletRequest httpSerletRequest = (HttpServletRequest) servletRequest;
		String Method = httpSerletRequest.getMethod();
		
		if("GET".equals(Method)) {
			doGet();
		}else if("POST".equals(Method)) {
			doPost();
		}
	}
	
	/*
	 * get請求的操作
	 */
	public void doGet() {
		System.out.println("GET請求");
	}
	
	/*
	 * post請求的操作
	 */
	public void doPost() {
		System.out.println("POST請求");
	}
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
