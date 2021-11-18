programa
{
	
	funcao inicio()
	{
		real qtdJogadores,  somaAltura=0, mediaAltura = 0, alturaJogador, menoraltura = 0


		escreva("Informar quantidade de jogadores")
		leia(qtdJogadores)


		para(inteiro jogador = 1; jogador <= qtdJogadores; jogador++){
			escreva("informe um a latura \n", jogador, "\n")
			leia(alturaJogador)
			somaAltura = somaAltura + alturaJogador
		}
		mediaAltura = somaAltura/qtdJogadores
		escreva("Altura media do time", mediaAltura, "\n")
	
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 449; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */