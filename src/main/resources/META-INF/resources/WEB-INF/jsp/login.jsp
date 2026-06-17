<html>
    <head>
        <title>Login</title>
    </head>
    <body>
        <div class="container">
            <form method="post">
                Name:<input type="text" name="name">
                Password:<input type="password" name="password">
                <input type="submit">
            </form>
            <div>${errorMessage}</div>
        </div>
    </body>
</html>