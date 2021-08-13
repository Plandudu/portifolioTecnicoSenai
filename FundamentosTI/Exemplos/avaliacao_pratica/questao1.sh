#!/bin/bash

valor=$(cut -d":" -f3 /etc/passwd)
numero_uset=0

for i in $valor
do
	if [[ $i -gt 999 ]];
	then
		echo "$i"
	fi
done
