<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <title>List todos page</title>
    </head>
    <body>
        <div>
            welcome ${name}
        </div>
        <hr>
        <h1>
            here are your todos:
        </h1>
        <table>
            <thead>
            <tr>
                <th>id</th>
                <th>Description</th>
                <th>Target Date</th>
                <th>Is Done?</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <th>${todo.id}</th>
                    <th>${todo.description}</th>
                    <th>${todo.target}</th>
                    <th>${todo.done}</th>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </body>
</html>