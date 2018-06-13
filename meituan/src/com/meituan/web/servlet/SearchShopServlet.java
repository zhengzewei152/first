package com.meituan.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.meituan.damian.Shop;
import com.meituan.service.ShopService;


public class SearchShopServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
       String id =request.getParameter("id");
       String category =request.getParameter("category");
       String name =request.getParameter("name");
       String minprice =request.getParameter("minprice");
       String maxprice =request.getParameter("maxprice");
       ShopService ss=new ShopService();
      List<Shop> list=ss.searchShop(id, category, name, minprice, maxprice);
		request.setAttribute("shops", list);
		request.getRequestDispatcher("/admin/products/list.jsp").forward(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>;
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
