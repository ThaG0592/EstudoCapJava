programa
{
	
	funcao inicio()
{
		inteiro aluno = 0
		real media = 0.0, mediaMaior = 0.0, mediaMenor  = 0.0

		escreva("Informe o numero do alunos \n")
		leia(aluno)
	
		para(inteiro i=1; i <= aluno; i++){
			escreva("Informe a mediado aluno: ", i," \n")
			leia(media)	
			
			enquanto(media==0 ou media>10){
			escreva("Valor de media indevida")	
			leia(media)
			
			}
			se(i==1){
			mediaMaior = media
			mediaMenor = media

			}
			se (media<mediaMenor){
				mediaMenor = media
			}
			senao se (media>mediaMaior){
				mediaMaior = media
			}
		}

		escreva("A maior media foi:", mediaMaior, "\n") 
		escreva("A menor media foi:", mediaMenor, "\n")	
	}

}



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 668; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */