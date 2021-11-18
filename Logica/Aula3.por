programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real valorReal
		real cotacaoDolar
		real valorEmDolar

		escreva("Informe o valor em Real \n")
		leia(valorReal)
		escreva("Valor em Real:\n R$", valorReal , "\n")

		escreva("Informe a cotação do Dolar \n")
		leia(cotacaoDolar)
		escreva("Valor da Cotação","\n", cotacaoDolar , "\n")

		valorEmDolar = valorReal * cotacaoDolar

		escreva("O valor em Dolar: \n US$" +valorEmDolar)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 215; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */