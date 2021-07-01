#Autor: Felipe Apio
#descrição: Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N #(inclusive). Considere que o N será sempre maior que ZERO.
echo "Entre com um valor"
read n
while [[ $n -gt 0 ]];
do
	echo ""$n""
	num_max=$(($num_max - 1))
done
