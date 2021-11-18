programa
{
	
	funcao inicio()
	{
		inteiro numero,maiornumero = 0, menorNumero = 0
		
		para(inteiro i=1; i <= 10; i++){
			escreva("informe um numero \n")
			leia(numero)

			se(i==1){
				maiornumero = numero
				menorNumero = numero
			}
			se (numero > maiornumero){
				maiornumero = numero
			}senao se (numero < menorNumero){
				menorNumero = numero
			}
		}
		escreva("O menor numero é:", menorNumero, "\n")
		escreva("O maior numero é:", maiornumero, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 190; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */