programa
{
	
	funcao inicio()
	{
			inteiro numero, par[10], impar[10], resto

		para(inteiro i=0; i < 10; i++){
			escreva("Informe o numero:  \n  \t")
			leia(numero)
			resto = numero % 2
		
			se(resto == 0){
				par[i] = numero
				
			}senao{
				impar[i] = numero
			}
		}
		para(inteiro i=0; i < 10; i++){
			resto = impar [i] % 2
			se (resto == 0){
				escreva("Numero par  ", par[i], " ")
				escreva("Par resto = ", resto, "\n")
			} senao {
				escreva("Numero impar  ", impar[i], " ")
				escreva("Impar resto= ", resto, " \n ")
				
				
			}
				
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 486; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */