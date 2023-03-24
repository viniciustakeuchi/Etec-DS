<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=Dee, initial-scale=1.0">
    <link rel="stylesheet" href="CSS/decisao.css">
    <title>Document</title>
</head>
<body>
    <?php
    $nota1 = 10;
    $nota2 = 4;
    $nota3 = 5;
    $nota4 = 7;

    $media = ($nota1 + $nota2 + $nota3 + $nota4) / 4;

    if($media >6){
        echo "<p class= 'aprovado'> $media</p>";

    }
    else if($media <6){
        echo "<p class= 'reprovado'> $media </p>";

    }
    ?>
</body>
</html>