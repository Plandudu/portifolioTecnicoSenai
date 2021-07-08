# autor: Felipe Apio.
# descrição: Inicializar um vetor com 3 nomes de pessoa da sua escolha. Fazer um loop (utilizando while) para escrever para cada uma das pessoa “Oi, eu sou ____ !” 
#!/bin/bash
vetor=0
while [[ $vetor -lt ${#nomes[*]}  ]];
do
        echo "Oi, eu sou ${nomes[$vetor]}"
        vetor=$(($vetor + 1))
done
