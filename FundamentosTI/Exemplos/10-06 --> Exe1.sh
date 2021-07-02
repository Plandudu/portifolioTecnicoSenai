# autor: Felipe Apio.
# descrição: Inicializar um vetor com 3 nomes de pessoa da sua escolha. Fazer um loop (utilizando for) para escrever para cada uma das pessoa “Oi, eu sou ____ !” 
#!/bin/bash
for i in ${nomes[*]};
do
        echo "Oi, eu sou $i"
done
