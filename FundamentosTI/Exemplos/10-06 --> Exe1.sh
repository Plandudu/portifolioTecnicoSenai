# autor: Ademar Neto.
# descrição: Neste exercício nós deviamos criar um vetor com 3 nomes de pessoas de nossa escolha, e fazer um loop utilizando o "for".
#!/bin/bash
nomes=("Maria" "Marcos" "Jose")
for nome in ${nomes[@]}
do
echo "Oi, eu sou $nome"
done
