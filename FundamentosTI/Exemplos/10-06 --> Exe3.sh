# autor: Felipe Apio.
# descricão: Devíamos criar um código que pedisse para o usuário nomes de pessoas utilziando o loop, e apenas parar de pedir os nomes quando a pessoa digitar um código de parada estipulado pela gente, e o código também deveria colocar os nomes da pessoas em um vetor e dizer a quantidade de pessoas que foram digitadas.
#!/bin/bash
Cod_Parada="exit"
nome=""
i=0
echo "Para sair escreva [exit]"
while [[ $nome != $Cod_Parada ]]
do
echo "Escreva um nome:"
read nome
if [[ $nome != $Cod_Parada ]]
then
vetor[$i]=$nome
i=$((i+1))
echo "O nome escolhido é $nome"
fi
done
