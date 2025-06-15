@param String error

<!DOCTYPE html>
<html>
<head>
    <title>Новий профіль</title>
</head>
<body>
<h2>Створити профіль</h2>
<form method="post" action="/profile/create">
    <label for="fullName">Ім’я повністю:</label>
    <input type="text" name="fullName" required /><br/>

    <label for="age">Вік:</label>
    <input type="number" name="age" required /><br/>

    <button type="submit">Зберегти</button>
</form>

@if(error != null) {
    <p style="color:red;">${error}</p>
    }
@endif
</body>
</html>
