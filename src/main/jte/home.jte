@param String username
@param boolean isLoggedIn

<!DOCTYPE html>
<html>
<head>
    <title>Головна</title>
</head>
<body>
<h1>Ласкаво просимо!</h1>

@if(isLoggedIn)
    <p>Вітаємо, ${username}!</p>
    <p><a href="/profile">Заповнити профіль</a></p>
    <a href="/logout">Вийти</a>
@else
    <p>Ви не авторизовані.</p>
    <a href="/login">Увійти</a> | <a href="/register">Зареєструватися</a>
@endif
</body>
</html>