#Autor: Felipe Apio
#descrição: Faça um algoritmo para ler o preço de 15 produtos, calcular e escrever:
#- o maior preço lido
#- a média aritmética dos preços dos produtos 
 
#!/bin/bash
maior_preco=10
preco=0
soma_preco=0
produtos=15
for i in seq 15;
do
	echo "Digite o preço do produto:"
	read preco
	
	soma_preco=$(($soma_preco + $preco))
	if [[ $preco -gt $maior_preco ]];
	then
		maior_preco=$preco
	fi

done
echo "Maior preço = "$maior_preco""

media=$((soma_preco/produtos))
echo "MEdia artmetica = "$media""
