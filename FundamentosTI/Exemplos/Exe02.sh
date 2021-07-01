+ #Autor: Felipe Apio
+ #Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este ano 
+ #(não é necessário considerar o mês em que a pessoa nasceu). - ESTRUTURA DE SELEÇÃO
+ #!/bin/bash
+ #entrada de dados, bloco condicional
+ echo "Entre com o ano atual"
+ read ano_atual
+ echo "Entre com o ano de nascimento"
+ read ano_nascimento
+ idade_permitida=18

+ if [[ ($ano_atual - $ano_nascimento) -ge $idade_permitida ]];
+ then
+	  echo "Permitido votar"
+ else
+	  echo "Nao permitido votar"
+ fi
