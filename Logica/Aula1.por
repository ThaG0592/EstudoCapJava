programa
{
	//programa proway
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real p1, p2, p3, p4, media = 0.0
		//variavel de acumulação

		real somaNotas = 0.0

		//entrada de sados
		escreva("Informe nota nº 1:")
		leia(p1)
		somaNotas  = somaNotas + p1
				
		escreva("Informe nota nº 2:")
		leia(p2)
		somaNotas  = somaNotas + p2

		escreva("Informe nota nº 3:")
		leia(p3)
		somaNotas  = somaNotas + p3

		escreva("Informe nota nº 4:")
		leia(p4)
		somaNotas  = somaNotas + p3

		media = somaNotas /4
		//media = (p1+p2+p3+p4) / 4
		escreva("Média "+ media)
		
		
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 346; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */