<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'middel.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<meta charset="utf-8">
<title>无标题文档</title>
<style type="text/css">
a{text-decoration:none}

#divhead1{
	width:980px;
	font-style: 15px;
	height:80px;
	margin-left:141px;
	margin-right:auto;  /*边界左自动，右自动是居中*/
	margin-top:12px;
}

</style >
</head>

<body>
  <div id="divhead1">
  <table  cellspacing="0" >
  <tr height="80">
      <td width="120">
	      <a href="#">商品分类</a>
	 </td>
	 <td width="60">
          <a href="#"> 全部</a>
    </td> 
    <td width="60">     
	      <a href="#">美食</a>
	</td> 
	    <td width="60">
	      <a href="#">超市</a>
	 </td>
	 <td width="90">
          <a href="#"> 精选小吃</a>
    </td> 
    <td width="75">     
	      <a href="#">鲜果购</a>
	</td>  
	<td width="75">     
	      <a href="#">下午茶</a>
	</td> 
	  </tr>
	</table>
	</div>
</body>
</html>
