<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
	body {
		margin: 0px;
		padding: 0px;
		text-align: center;
	}
	
	#container {
		width: 60%;
		text-align: left;
		margin-top: 80px;
		/* 让div居中 */
		margin-left: auto;
		margin-right: auto;
		
		border:1px solid red;
	}
	</style>
</head>
<body>
	<div id="container">
		<table frame="border" cellpadding="0" cellspacing="0" style="width:100px;margin:auto;white-space: nowrap;" >
			<caption><h3>科室列表</h3></caption>
			<#list departmentList as dept>
			<tr>
			<td>${dept.name}</td>
			<td><a href="toEdit?id=${dept.id}">修改</a></td>
			<td><a href="delete?id=${dept.id}">删除</a></td>
			</tr>
			<tr><td></td></tr>
			</#list>
		</table>
	</div>
</body>
</html>