programa
{
	
	funcao inicio()
	{
		cadeia nomePessoa
		inteiro qtdPessoas = 0,opcao =1
		
		faca{
			escreva("Informe o nome da pessoa \n")
			leia(nomePessoa)
			qtdPessoas = qtdPessoas + 1
			escreva("Pessoa; ", nomePessoa,"\n")
			escreva("Inrfome a opçao 1-Continua 0-Finaliza \n")
			leia(opcao)

		}enquanto(opcao != 0)
		escreva("O total de de pessoas informadas é:", qtdPessoas,"\n")
		  
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 191; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */