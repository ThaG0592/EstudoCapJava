programa
{
	
	funcao inicio()
	{
		
		real a,b,resultado
		
		escreva ("Informe o numero do poto A: \n")
		leia(a)
		escreva ("Informe o numero do poto B: \n")
		leia(b)
		resultado = a-b
		
		se(resultado<0){
			resultado = resultado *1
			escreva("O resultado de ", a, " menos ", b, " é ", resultado, " o resultado era negativo e foi invertido")
		}senao{
			escreva("O resultado de ", a, " menos ", b, " é ", resultado)

		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 380; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */