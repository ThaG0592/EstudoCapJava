programa
{
	//programa proway
	
inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		
		inteiro a, b, c, d, media = 0.0
		//variavel de acumulação

		real somaNotas = 0.0
		real multiplicaNotas = 0.0

		inteiro quadradoA, quadradoB = 0.0
		

		//entrada de sados
		escreva("Informe numero para A:\n")
		leia(a)
		escreva("O valor de A é:",a, "\n")
		

		escreva("Informe numero para B:\n")
		leia(b)

		escreva("Informe numero para C:\n")
		leia(c)

		escreva("Informe numero para D:\n")
		leia(d)

		escreva("Os valores B , C, D:","\t", b, "\t", c,"\t",  d,"\n")

		somaNotas = b+c

		escreva("Valor da soma \n")
		escreva(somaNotas + "\n")

		multiplicaNotas = b*d
		
		escreva("Valor da multiplicação \n")
		escreva(multiplicaNotas + "\n")

		quadradoA = a*a
		quadradoB = b*b
		escreva("O quadrado de A é:\n")
		escreva(quadradoA + "\n")
		
		escreva("O quadrado de B é:\n")
		escreva(quadradoB + "\n")

			
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 715; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */