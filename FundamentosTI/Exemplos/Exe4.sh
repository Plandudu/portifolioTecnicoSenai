#Autor: Felipe Apio
#Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10 (inclusive) em ordem decrescente. - ESTRUTURA DE REPETIÇÃO
#/bin/bash
num=1
num_max=10
while [[ $num_max -ge $num ]];
do
  echo ""$num_max""
  
  num_max=$(($num_max - 1))
done
