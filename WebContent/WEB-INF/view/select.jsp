<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员-更新车辆</title>
<script src="/JS/jquery-3.3.1.min.js"></script>
<style type="text/css">

	h1,button {
	color: #66FFFF;
	}
	h3 {
	color: #00DD00;
	}
	a {
	color: #66FFFF;
	}
	a:hover {
	color: #88AA00;
	}
	table {
	width: 100%;
	}
	th {
	height: 50px;
	}
	

	
</style>

</head>
<body>
	<form action="${pageContext.request.contextPath }/select" method="post">
	
		<center>
			<div id="head">
				<h1>Easy-Car易人租车管理系统</h1>
			</div>
			
			<div id="content">
				
				<h3>更新车辆</h3>
				<hr><br>
				品牌：<input type="text" name="brand" id="brand"/><button id="select">查询</button>
				<a href="${pageContext.request.contextPath }/goinsert">添加新车</a><br><br>
				<hr>
				<table>
						<tr>
							<td>#</td><td>品牌</td><td>型号</td><td>结构</td><td>排量</td><td>变速器</td><td>乘坐人数</td><td>原价</td><td>折扣</td><td>操作</td>
						
						</tr>
					<c:forEach items="${requestScope.car}" var="i">
						<tr>
							<td>${i.idCar}</td>
							<td>${i.bname}</td>
							<td>${i.type}</td>
							<td>${i.structure}</td>
							<td>${i.output}</td>
							<td>${i.gearbox}</td>
							<td>${i.seat}</td>
							<td>${i.original}</td>
							<td>${i.discount}</td>
							<td>
								 <a href="${pageContext.request.contextPath }/goupdate?idCar=${i.idCar }">更新</a>
								 <a href="${pageContext.request.contextPath }/deleteByid?idCar=${i.idCar }">删除</a>
							 </td>

						</tr>

					</c:forEach>
					<c:if test="${0==requestScope.car.size()}">
						<tr>
							<td colspan="10">
								<center>
									<span>没有相关数据</span>
								</center>
							</td>
						</tr>
					</c:if>
				</table>
				<br><br><hr><hr><br><br>
				<a href="${pageContext.request.contextPath }/spage?currentpage=1">1</a>
				<a href="${pageContext.request.contextPath }/spage?currentpage=2">2</a>
				<a href="${pageContext.request.contextPath }/spage?currentpage=3">3</a>
				<a href="${pageContext.request.contextPath }/spage?currentpage=4">4</a>
				&nbsp;&nbsp;跳到<input type="text" name="selectpage"/>页<button>确定</button>
				
			</div>
		
		</center>
	</form>
</body>
<script type="text/javascript">
	$(function() {
		$("#select").click(function() {
				$.ajax({
					type:"post",
					async:true,
					url:"${pageContext.request.contextPath }/select",
					data:$('#brand').val(),
					success:function(result){
						if(result.success){
							alert("执行成功");
						}
					},
					error:function(){
						alert("不允许为空");
					}
				
				});
				
		
				if(!($('#brand').val()=='')){
					alert('查询值不允许为空');
				}
			})
	})

</script>
</html>