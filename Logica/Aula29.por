programa
{
	
	funcao inicio()
	{
		real  valor, percentual, valorTotal
		cadeia produto
		
		escreva("Informe o produto a ser consumido \n")
		leia (produto)
		escreva ("Informe o custo do produto \n")
		leia (valor)
		escreva ("Percentual de ajuste do valor \n")
		leia(percentual)
		valorTotal = reajValorlTotal(valor, percentual)
		
		escreva ("O valor ajustado do ", produto, " é de R$ ",valorTotal," \n")
	}
	funcao real reajValorlTotal( real valor, real percentual){
		real valorRealTotal = 0.0
		valorRealTotal = valor + (valor*(percentual/100))

	retorne valorRealTotal
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 290; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */