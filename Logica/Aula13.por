programa
{// Escrever os inteiros de 1 a n
	
	funcao inicio()
	{
		inteiro numInformado, contaNumero

		faca{
			escreva("Informe um número inteiro diferente de 0 \n ou informe 0 para sair \n")
			leia(numInformado)
			
			contaNumero = 1
			enquanto(contaNumero <= numInformado){
				escreva
				(contaNumero," ")
				contaNumero = contaNumero + 1
			}			
		}enquanto(numInformado > 1)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 387; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */