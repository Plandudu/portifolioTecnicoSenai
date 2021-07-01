#Autor: Felipe Apio
#descrição: Ler um valor e escrever se é positivo ou negativo 
#(considere o valor zero como positivo).
 
 
#!/bin/bash
echo "Entre com um valor"
read a
if [[ $a -ge 0 ]];
then
	echo "Positivo"
else
	echo "Negativo"
fi
