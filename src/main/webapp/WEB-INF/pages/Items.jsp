<%@ page import="com.model.Item" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: liuji
  Date: 2018/3/29
  Time: 下午4:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>

<%
    ArrayList list = (ArrayList) request.getAttribute("items");
%>


<h2 align="center">图书列表</h2>
<table border=1px align="center">
    <tr>
        <th>名称</th>
        <th>价格</th>
        <th>详细</th>
    </tr>
    <!-- 继续使用jsp语句 循环放入存放于list中的Book实体类中的数据 -->
    <%
        for (int i = 0; i < list.size(); i++) {
            Item item = (Item) list.get(i);%>
    <tr>
        <th><%=item.getName() %>
        </th>
        <th><%=item.getPrice()%>
        </th>
        <th><%=item.getDetail()%>
        </th>
    </tr>

    <% }
    %>
</table>
</table>
</body>
</html>
