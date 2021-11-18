programa
{
	
	funcao inicio()
	{
		inteiro qtdItens

		inteiro qtdItem
		real vlrUnitItem
		cadeia descItem

		real VlrTotaItem = 0.0, vlrTotalNota = 0.0

		escreva("Informe a quantidade de intes")
		leia(qtdItens)

		para (inteiro itens=1; itens <= qtdItens; itens ++){
			escreva("Informe a quantidade de item vendido \n")
			leia(qtdItem)
			escreva("Informe o valor unitario de intem  \n")
			leia(vlrUnitItem)
			escreva("Informe a descriçao do intem \n")
			leia(descItem)
			VlrTotaItem = qtdItem * vlrUnitItem
			vlrTotalNota = vlrTotalNota + vlrUnitItem

			escreva("Item Nr", itens,"/n" ,"Qtd" , qtdItem, " \n" ,"Descrição", descItem," \n", "Valor uni" , vlrUnitItem," \n", "Valot Total" , VlrTotaItem)
			
		}
		escreva("Ovalor totals da Nota é:","\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 220; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */