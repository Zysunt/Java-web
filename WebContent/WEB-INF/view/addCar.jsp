<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>添加车辆</title>
		<style>
			h1{
				color: #66FFFF;
				}
			p {
				color: #32CD32;
				font-size: 30px;
			}
			
			td {
				height: 40px;
				width: 200px;
				text-align: center;
			}
			
			#button1 {
				background-color: #66FFFF;
				border: none;
				color: white;
			}
			
			#button2 {
				background-color: #66FFFF;
				border: none;
				color: white;
				padding: 10px 65px;
			}
			#head,#content{
				text-align: center;
			}
			table{
				margin: auto;
			}
			#option{
					width: 150px;
			}
		</style>
	</head>

	<body>
		<form action="${pageContext.request.contextPath }/insert" enctype="multipart/form-data" method="post">
			<div id="head">
					<h1>Easy-Car易人租车管理系统</h1>
				</div>
				<div id="content">
					<p>添加车辆</p>
					<table>
						<tr>
							<td>品牌</td>
								<td>
								<select name="B_id" id="option">
									<c:forEach items="${requestScope.brand}" var="i">
										<option value="${i.idBrand}">${i.bname}</option>
									</c:forEach>
								
								</select>
									
								</td>
							<td><input type="text" name="select" placeholder="浏览" /><button id="button1">浏览</button></td>
						</tr>
						<tr>
							<td>级别</td>
							<td>
								
								<select name="L_id" id="option">
									<c:forEach items="${requestScope.level}" var="i">
										<option value="${i.idLevel}">${i.lname}</option>
									</c:forEach>
								
								</select>
							
							</td>
						</tr>
						<tr>
							<td>型号</td>
							<td><input type="text" name="type" placeholder="请输入型号" /></td>
						</tr>
						<tr>
							<td>结构</td>
							<td><input type="text" name="structure" placeholder="请输入结构" /></td>
						</tr>
						<tr>
							<td>排量</td>
							<td><input type="text" name="output" placeholder="请输入排量" /></td>
						</tr>
						<tr>
							<td>变速箱</td>
							<td><input type="text" name="gearbox" placeholder="请输入变速箱" /></td>
						</tr>
						<tr>
							<td>乘坐人数</td>
							<td><input type="text" name="seat" placeholder="请输入乘坐人数" /></td>
						</tr>
						<tr>
							<td>原价</td>
							<td><input type="text" name="original" placeholder="请输入原价" /></td>
						</tr>
						<tr>
							<td>折扣</td>
							<td><input type="text" name="discount" placeholder="请输入折扣" /></td>
						</tr>
						<tr>
							<td>图片</td>
							<td><input type="file" name="file"  /></td>
						</tr>
						<tr>
							<td></td>
							<td><button id="button2">提交</button></td>
						</tr>
					</table>

				</div>
		</form>

	</body>

</html>