<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<div class="divOuterFrame">
	<div class="divInnerFrame">欢迎使用Gather调查系统!</div>
</div>
<div class="divWhiteLine"></div>
<div class="divNavigatorOuterFrame">
	<div class="divNavigatorInnerFrame">
		<s:a action="LoginAction_toLogPage" namespace="/">[首页]</s:a>&nbsp;
		<s:a action="SurveyAction_addSurvey" namespace="/">[新建调查]</s:a>&nbsp;
		<s:a action="SurveyAction_mySurvey" namespace="/">[我的调查]</s:a>&nbsp;
		[参与调查]&nbsp;
		[用户注册]&nbsp;
		[用户授权管理]&nbsp;
		[角色管理]&nbsp;
		[权限管理]&nbsp;
		[日志管理]&nbsp;
	</div>
</div>
<div class="divWhiteLine"></div>