package com.meituan.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.meituan.domain.User;
import com.meituan.service.UserServiceImpl;

public class UserServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    
		response.setContentType("text/html");
		System.out.print("aaaaaaaaaaaaaaaaaa");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		UserServiceImpl us=new UserServiceImpl();
		User user=us.findUserName(username, password);
		System.out.print(user);;
		if(user!=null){
			String autologin=request.getParameter("autologin");
			Cookie cookie=new Cookie("user",user.getUsername()+"&"+user.getPassword());
			cookie.setPath("/");
			if(autologin!=null){
				cookie.setMaxAge(60*60*24*7);	
			}else{
				cookie.setMaxAge(0);
			}
			response.addCookie(cookie);
			request.getSession().setAttribute("user", user);
			request.getRequestDispatcher("/home.jsp").forward(request, response);
		}else{
			response.getWriter().write("it is a error");
			response.setHeader("refresh", "1,url="+request.getContextPath()+"/index.jsp");
		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
