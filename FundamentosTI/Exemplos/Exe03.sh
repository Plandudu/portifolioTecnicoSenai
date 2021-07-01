# autor: Felipe Apio.
# descrição: No exercício 3 o código quando executado imprime os valores de 1 a 10 em ordem crescente.
if [ $# -eq 0 ]
then
 i=0
 for i in $(seq 1 10)
 do
  echo "$i"
 done
 else
  echo "Execute o arquivo sem digitar nenhum parâmetro"
fi
