# autor: Felipe Apio.
# descrição: Neste exercício nós devíamos criar um vetor com o nome de 3 pessoas de nossa escolha, e fazer um loop utilizando o "while".
#!/bin/bash
nomes=("João" "Bruno" "Maicon")
auxiliar=0
while [ $auxiliar -lt ${#nomes[@]} ]
do
echo "Oi, eu sou ${nomes[$auxiliar]}"
auxiliar=$((auxiliar+1))
done
