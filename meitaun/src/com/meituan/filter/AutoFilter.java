package com.meituan.filter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.meituan.domain.User;
import com.meituan.service.UserServiceImpl;

public class AutoFilter implements Filter{



	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse resp=(HttpServletResponse) response;
		String uri=req.getRequestURI();
		String path=req.getContextPath();
		path=uri.substring(path.length());
		if(!("/login.jsp".equals(path) || "/srvlet/UserServlet".equals(path))){
			User u=(User) req.getSession().getAttribute("user");
		if(u==null){
		Cookie[] cookies=req.getCookies();
		String username="";
		String password="";
		for(int i=0;i<cookies.length && cookies!=null;i++){
			if("user".equals(cookies[i].getName())){
				String value=cookies[i].getValue();
				System.out.print(value);
				String[] values=value.split("&");
				username=values[0];
				password=values[1];
			}	
				
		}
		
		UserServiceImpl us=new UserServiceImpl();
		User user=us.findUserName(username, password);
		if(user!=null){
			req.getSession().setAttribute("user", user);
		}
		}
		}
		chain.doFilter(request, response);
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
		
}
