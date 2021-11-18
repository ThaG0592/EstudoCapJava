programa
{
	
	funcao inicio()
	{
		inteiro cargo
		cadeia descCargo
		real salario
		real ajuste

		escreva("Informe codigo do seu cargo: \n")
		leia(cargo)

		escolha(cargo){

			caso 1: descCargo = "Serviços Gerais"
			escreva("Informe o salario \n")
			leia(salario)
			ajuste = (salario * 0.5) + salario
			escreva("Salario ajustado:" , ajuste)
			pare
			caso 2: descCargo = "Vigia"
			escreva("Informe o salario \n")
			leia(salario)
			ajuste = (salario * 0.3) + salario
			escreva("Salario ajustado:" , ajuste)
			pare
			caso 3:descCargo = "Recepcionista"
			escreva("Informe o salario \n")
			leia(salario)
			ajuste = (salario * 0.25) + salario
			escreva("Salario ajustado:" , ajuste)
			pare
			caso 4: descCargo = "Vendedor"
			escreva("Informe o salario \n")
			leia(salario)
			ajuste = (salario * 0.15) + salario
			escreva("Salario ajustado:" , ajuste)
			pare
			caso contrario: escreva("Cargo não cadastrado")
			pare
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */