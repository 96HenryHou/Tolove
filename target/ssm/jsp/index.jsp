<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<form action="error.jsp" method="post">
    <p align="center"><strong>恶意脚本发送方页面demo </strong></p>
    <div align="center">
        <table width="270" border="0">
            <tr>
                <td width="130"><strong>输入一段脚本:</strong></td>
                <td width="120"><input name="input" type="text" id="input" /></td>
            </tr>
            <tr>
                <td width="100">
                    <input name="submit" type="submit" value="点击触发恶意脚本" />
                </td>
            </tr>
        </table>
    </div>
</form>
</body>
</html>