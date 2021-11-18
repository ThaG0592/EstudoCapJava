programa
{
	inclua biblioteca Matematica --> mat	
	funcao inicio()
	{
		cadeia vetorAlunos[3]
		real matrizNotas[3][4]
		real vetorMedias[3]
		real somaNotas =0.0

		para(inteiro linha=0; linha < 3; linha++){
			escreva("Informa o nome do aluno \n")
			leia(vetorAlunos[linha])

			para(inteiro coluna=0; coluna < 4; coluna++){
				escreva("Informe a nota nº ", coluna+1, "do aluno ", vetorAlunos[linha] ,"\t")
				leia(matrizNotas[linha][coluna])
				somaNotas = somaNotas + matrizNotas[linha][coluna]
			}
			
				vetorMedias[linha] = mat.arredondar((somaNotas/4), 2)
						
			para(inteiro media=0; media < 3; media++){
				se(vetorMedias[media] < 5.5){
					escreva("Aluno: ",vetorAlunos [media], " esta reprovado! \n", vetorMedias[media])
				
				}senao se(vetorMedias[media] >= 5.5 e vetorMedias[media] < 7.5){
					escreva("Aluno: ",vetorAlunos [media], " esta recuperação! \n", vetorMedias[media])
				
				}senao{
					escreva("Aluno: ",vetorAlunos [media], " esta Aprovado! \n", vetorMedias[media])
				}
			}
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 574; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */