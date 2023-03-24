<?php
//se não souber onde se inicia ou termina então o while
$i = 0;
while($i<=10){
    echo "Exemplo laço while: $i <br />";
    $i++;
}
//se souber o inicio e o fim usar o for
echo "<br />";
for($j=0;$j<=10;$j++){
    echo "Exemplo laço for com incremento: $i <br />";
}

echo "<br />";
$k=0;
do{

    echo "Exemplo laço do e while com incremento: $i <br />";
    $k++;
}while($k<=10);

//Declarando vetor no php//

echo "<br />";

$nome = array ();
$nome [0] = "Ana";
$nome [1] = "Bruno";
$nome [2] = "Zélia";
$nome [3] = "Pedro";
$nome [4] = "Camila";
$nome [5] = "João";
$nome [6] = "Fernanda";
$nome [7] = "Vinícius";

$idade = array ();
$idade [0] = 20;
$idade [1] = 25;
$idade [2] = 54;
$idade [3] = 22;
$idade [4] = 19;
$idade [5] = 18;
$idade [6] = 27;
$idade [7] = 19;


$pessoa = array ('Vinícius', 19, 'Desenvolvimento de Sistemas');

//Listando as variáveis 

list ($nome, $idade , $curso) = $pessoa;


//count é a contagem do vetor nome, 
for($i=0;$i<count($nome);$i++){
    echo "$nome[$i] $idade[$i] <br/ >";
}


//Declarando vetor no java $a[0]= 2 0 é  o índice e o 2 é o elemento 
?>