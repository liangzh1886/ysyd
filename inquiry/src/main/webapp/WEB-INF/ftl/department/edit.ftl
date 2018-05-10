<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add department</title>
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
		<form method="post" action="edit">
			科室名: <input type="text" name="name" value="${department.name}"/><br/>
			所属科室:<input type="" name=""/><br/>
			<input type="hidden" value="${department.id}" name="id">
			<input type="submit" value="提交"/>
		</form>
	</div>
</body>
</html>