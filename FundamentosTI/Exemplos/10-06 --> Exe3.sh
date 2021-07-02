# autor: Felipe Apio.
# descricão: Pedir para o usuário nomes de pessoas utilizando loop. Apenas parar de pedir a próxima pessoa quando o usuário digitar um “código de parada” da sua escolha. 
#Colocar esses nomes de pessoas em um vetor e ao final dizer a quantidade de pessoas digitadas.
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
