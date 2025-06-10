@param String error

<!DOCTYPE html>
<html>
<head>
    <title>Реєстрація</title>
</head>
<body>
<h2>Реєстрація</h2>
<form method="post" action="/register">
    <label for="username">Ім'я користувача:</label>
    <input type="text" name="username" required /><br/>

    <label for="password">Пароль:</label>
    <input type="password" name="password" required /><br/>

    <label for="confirmPassword">Підтвердіть пароль:</label>
    <input type="password" name="confirmPassword" required /><br/>

    <button type="submit">Зареєструватися</button>
</form>

<p>Вже маєте акаунт? <a href="/login">Увійти</a></p>

@if(error != null) {
<p style="color:red;">${error}</p>
}
@endif
</body>
</html>
