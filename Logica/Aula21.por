programa
{
	funcao inicio()
	{
		caracter operacaoMat
		inteiro  numero1, numero2, resultado = 0

		escreva("Informe o primeiro nr : \n")
		leia(numero1)			
		escreva("Informe o segundo  nr : \n")
		leia(numero2)
		escreva("Informe a operacao matemática \n")
		escreva(" + = soma  - subtrai  * = multiplica  / = divide \n")
		leia(operacaoMat)
					
		se(operacaoMat == '+'){
			resultado = numero1 + numero2
		}senao se(operacaoMat == '-'){
			resultado = numero1 - numero2
		}senao se(operacaoMat == '*'){
			resultado = numero1 * numero2			
		}senao se(operacaoMat == '/'){
			resultado = numero1 / numero2			
		}senao{
			escreva("Operação Informada Inválida \n")
		}
		escreva("Resultado : ", resultado)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 708; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */