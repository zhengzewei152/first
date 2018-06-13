package com.meituan.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.meituan.damian.PageBean;
import com.meituan.damian.Shop;
import com.meituan.service.ShopService;

public class FindCategoryServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        /*   String category=request.getParameter("category");
           ShopService ss=new ShopService();
           List<Shop> shops=ss.findCategory(category);
           int pageSize = 16;
   		
   		int currentPage = 1;//当前页数
   		String currPage = request.getParameter("currentPage");
   		if(currPage!=null&&!"".equals(currPage)){
   			currentPage = Integer.parseInt(currPage);
   		}
   		
  
   		
   		PageBean pb = ss.findShopsPage(currentPage,pageSize);
   		
   		
   		request.setAttribute("pb", pb);
   		request.getRequestDispatcher("/index.jsp").forward(request, response);
           */
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
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
