programa
{
	
	funcao inicio()
	{
		inteiro vetNumeros [10], vetMultCinco [10]
		
		

		para(inteiro i=0; i < 10; i++){
			escreva("Numeros a serem mutiplicados: \t \n")
			leia(vetNumeros[i])
			vetMultCinco[i] = vetNumeros[i] * 5
		
		}
		para(inteiro i=0; i < 10; i++){
			
			escreva("5 X", vetNumeros[i], "=", vetMultCinco[i], "\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 266; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */