programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real altura
		real peso
		real IMC

		escreva(" Informe sua Altura \n")
		leia(altura)

		escreva(" Informe seu peso \n")
		leia(peso)

		IMC = mat.arredondar((peso/(mat.potencia(altura, 2.0))),1)
		

		se(IMC<18.5){
			escreva("Abaixo do Peso \n")

		}senao se(IMC >= 18.6 e IMC <= 24.9){
			escreva("Peso Ideal \n")
			
		}senao se(IMC >= 25 e IMC <= 29.9){
			escreva("Levemente Acima do peso \n")
			
		}senao se (IMC >= 30 e IMC <= 34.9){
			escreva("Obesidade I \n")
	
		}senao se (IMC >= 35 e IMC <= 29.9){
			escreva("Obesidade II \n")
	
		}senao se (IMC>40){
			escreva("Obesidade III Morbida \n")
	
		}escreva(IMC)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 317; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz;
 */