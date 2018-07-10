<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title></title>
		<style>
			h1 {
				color: #66FFFF;
			}
			
			#img {
				width: 67%;
				height: 200px;
			}
			
			table {
				float: right;
				width: 340px;
				height: 200px;
			}
			
			a {
				color: #66FFFF;
			}
			
			a:hover {
				color: #88AA00;
			}
			button{
				background-color: #00FFFF;
				border: none;
				color: white;
				padding: 10px 60px;
			}
		</style>
	</head>

	<body>
		<form action="${pageContext.request.contextPath }/login" method="post">
				<h1>Easy-Car易人租车管理系统</h1>
				<img id="img" src="${pageContext.request.contextPath }/img/login.png" />
				<table>
					<tr>
						<td>欢迎登录</td>
						<td>
							<a href="#">免费注册</a>
						</td>
					</tr>
					<tr>

						<td>账号</td>
						<td><input type="text" name="username" /></td>
					</tr>
					<tr>
						<td>密码</td>
						<td><input type="password" name="password" /></td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;</td>
						<td><button>登录</button></td>
					</tr>

				</table>
		</form>

	</body>

</html>