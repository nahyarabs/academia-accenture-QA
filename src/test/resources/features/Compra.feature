@compra
Feature: Comprar no e-commerce
Background: abrir site
Given usuario abrir site "http://automationpractice.com/index.php"
 #o site vai abrir uma unica vez ja que
 #a primeira coisa q o usuario ira fazer sera o login
 #e depois nao sera necessario retornar a pagina inicial do site 
 

  @compra1
  Scenario: Usuario acessar site para realizar uma compra
    When usuario clicar no botao Sign in
    And escrever "<e_mail>" no campo E-mail
    And escrever "<senha>" no campo Senha
    And usuario clicar no botao Entrar
    And inserir nome do "<item>" no campo de busca
    And clicar no icone para realizar pesquisa
    And clicar no item escolhido
    And ver opcoes de tamanho
    And selecionar tamanho
    And selecionar cor
    And adcionar item escolhido ao carrinho
    And clicar ver resumo da compra
    And clicar para confirmar endereco
    And clicar para escolher envio
    And aceitar os temos de servico
    And clicar para continuar compra
    And escolher a forma de pagamento
    And clicar para concluir compra
    And encerrar navegacao    
    
      Examples: 
      | e_mail            | senha        | item   |
      | nahyara@gmail.com | 123nahyara   | dress  |
      