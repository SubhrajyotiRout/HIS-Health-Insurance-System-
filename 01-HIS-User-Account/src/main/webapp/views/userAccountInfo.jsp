<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>CREATE ACCOUNT</h1>
    <form:form action="saveUserAccount" modelAttribute="userAccount" method="post">
    <table>
         <tr>
             <th>First Name::</th>
             <td><form:input path="FirstName"/></td>
         </tr>
         
         <tr>
             <th>Last Name::</th>
             <td><form:input path="LastName"/></td>
         </tr>
         
         <tr>
             <th>Email::</th>
             <td><form:input path="UserEmail"/></td>
         </tr>
         
         <tr>
             <th>Gender::</th>
             <td>Male:<form:radiobutton path="Gender" value="M" id="gender"/>
                 Fe-Male:<form:radiobutton path="Gender" value="F" id="gender"/>
                 </td>
         </tr>
         
         <tr>
            <th>Role:</th>
            <td><form:select path="countryId">
                     <form:option value="">-Select-</form:option>
                </form:select></td>
          </tr>
          
          <tr>
              <th></th>
              <td><input type="submit" value="Reset">&nbsp;
                  <input type="submit" value="Create"></td>
          </tr>
         
    </table>
    
  </form:form>

</body>
</html>