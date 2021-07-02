# autor: Felipe Apio.
# descricão: Pedir para o usuário nomes de pessoas utilizando loop. Apenas parar de pedir a próxima pessoa quando o usuário digitar um “código de parada” da sua escolha. 
#Colocar esses nomes de pessoas em um vetor e ao final dizer a quantidade de pessoas digitadas.
#!/bin/bash
nome=""
echo "Entrar com nomes de pessoas? 1 - sim / 0 - nao"
read boolean
i=0
if [[ $boolean -eq 1 ]];
then
        while [[ $boolean -eq 1 ]];
        do
                echo "Entre com o nome de uma pessoa"
                read nome[$i]
                i=$(($i + 1))

                echo "Entrar com nomes de pessoas? 1 - sim / 0 - nao"
                read boolean
        done

        for i in ${nome[*]};
        do
                echo "Oi, eu sou $i"
        done

fi
