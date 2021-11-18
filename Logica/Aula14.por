programa
{ // SomaAteValorIgualA0
	
	funcao inicio()
	{
		inteiro numInformado, somaNumero
		somaNumero = 0
		
		faca{
			escreva("Informe um numero diferente de 0 \n ou informe 0 para sair \n")
			leia(numInformado)
			somaNumero = somaNumero + numInformado
		}enquanto(numInformado > 0)
		escreva("A soma total dos números informados é \n", somaNumero)
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 362; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numInformado, 6, 10, 12}-{somaNumero, 6, 24, 10};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */