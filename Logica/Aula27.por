programa
{	
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		
		real a,b, resultado = 0.0
		escreva ("Informe o numero do poto A: \n")
		leia(a)
		escreva ("Informe o numero do poto B: \n")
		leia(b)
		
		enquanto(a>b){
			escreva("O valor de A é: ", a, "\n")
			escreva("O valor de B é: ", b, "\n")
		}
			resultado = mat.potencia(a,b)
			escreva("O valor de é: ", resultado, "\n")
	}
	funcao real potenciaNumeros(real num1, real num2){
		real result = 0.0
			result = mat.potencia(num1, num2)
			retorne result
	}	
		
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 528; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */