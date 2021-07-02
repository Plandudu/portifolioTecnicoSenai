# autor: Felipe Apio.
# descricão: Pedir para o usuário nomes de pessoas utilizando loop. Apenas parar de pedir a próxima pessoa quando o usuário digitar um “código de parada” da sua escolha. 
#Colocar esses nomes de pessoas em um vetor e ao final dizer a quantidade de pessoas digitadas.
#!/bin/bash
nomes=""
echo "Entrar com nomes de pessoas? 1 - sim / 0 - nao"
read boolean
if [[ $boolean -eq 1 ]];
then
        while [[ $boolean -eq 1 ]];
        do
                echo "Entre com o nome de uma pessoa"
                read nomes
                echo "Entrar com nomes de pessoas? 1 - sim / 0 - nao"
                read boolean
        done
        for i in ${nomes[*]};
        do
                echo "Oi, eu sou $i"
        done
fi
