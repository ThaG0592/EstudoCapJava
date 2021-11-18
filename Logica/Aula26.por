programa
{
	
	funcao inicio()
	{
		mensagem	("Ola pessoal da capgemini")
		escreva("\n")
		escreva("O resultado da doma do numero 1 + numero 2", calculadora (3.0, 2.0))
		escreva("\n")
		mensagem("Tchau pessoal da Capgemini")
	}
	funcao mensagem (cadeia texto){
	
		para(inteiro i=0; i < 50; i++){
		escreva("-")
		}
		escreva ("\n", texto, "\n")
		para(inteiro i=0; i < 50; i++){
		escreva("-")
		}
	}
	funcao real calculadora (real numero1, real numero2){
		real resultado = 0.0
		
		resultado = numero1 + numero2
		retorne resultado
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 172; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */