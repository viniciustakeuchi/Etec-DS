<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="../CSS/dados.css">
</head>
<body>
<header>
    <nav>
        <ul>
            <li>
                <a href="decisao.php">Decisão</a>
            </li>
        </ul>
    </nav>
</header>

<?php
    $valor = "Juarez";
    $idade = 28;
    $email = "juarez@gmail.com";

    echo "<p class= 'titulo1'> $valor </p>";
    echo "<p class= 'titulo2'> $idade</p>";
    echo "<p class= 'titulo3'> $email</p>";
?>
</body>
</html>