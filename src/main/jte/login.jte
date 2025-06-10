@param String error

<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h2>Login</h2>
<form method="post" action="/login">
    <label for="username">Username:</label>
    <input type="text" name="username" required /><br/>

    <label for="password">Password:</label>
    <input type="password" name="password" required /><br/>

    <button type="submit">Login</button>
</form>

<p>Ще не маєте акаунту? <a href="/register">Зареєструватися</a></p>

@if(error != null) {
<p style="color:red;">${error}</p>
}
@endif
</body>
</html>
