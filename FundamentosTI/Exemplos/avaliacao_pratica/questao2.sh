temp=$(ls -ld $1)

dir_or_arq=${temp:0:1}
permr=${temp:7:1}
permw=${temp:8:1}
permx=${temp:9:1}

if [[ $dir_or_arq == "d" ]];
then
  echo "Seu diretorio possui os seguintes permissionamentos para OUTROS usuarios:"
else
  echo "Seu arquivo possui os seguintes permissionamentos para OUTROS usuarios:" 
fi

if [[ $permr == "r" ]];
then
  echo "Possui permissionamento de leitura"
else
  echo "Nao possui permissionamento de leitura" 
fi

if [[ $permw == "w" ]];
then
  echo "Possui permissao de escrita"
else
  echo "Nao possui permissao de escrita:" 
fi

if [[ $permx == "x" ]];
then
  echo "Possui permissao de execução"
else
  echo "Nao possui permissao de execução" 
fi
