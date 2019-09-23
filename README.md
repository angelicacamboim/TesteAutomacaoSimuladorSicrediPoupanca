# TesteAutomacaoSimuladorSicrediPoupanca

Estratégia de teste 

Partição de classe de equivalência e análise de valor limite para os inputs de entrada dos campos valor inicial e valor a investir para os testes de UI com Selenium WebDriver
Escolhi essa estratégia para limitar o número de caso de testes e ter um resultado satisfatório.

Ferramenta de teste

- Teste de UI com Selenium Webdriver em Java v1.8 com Junit, PageObject, DataDrivenTest (Gerenciamento de massa de dados), Chromedriver para versões do Chrome 77 e 75

- Teste de API com Rest Assured em Java v1.8 com Junit e BDD(Given, When, Then)

- IDE - Intellij com Maven

Casos de testes com Selenium

1 - simularInvestimentoDaPoupanca - Inserir inputs de entrada de valor inicial, valor a investir e tempo. Teste Positivo 

2- informarValorInferiorAoMinimoPermitido - Inserir inputs de entrada de valor inicial, valor a investir e tempo inferior ao minimo permitido. teste negativo
 
3-informarValorSuperiorAoMaximoPermitido - Inserir inputs de entrada de valor inicial e valor a investir superior ao maximo permitido. Teste negativo

Casos de teste com Rest Assured

1- criarNovaSimulacao - Inserir inputs de entrada de valor inicial, valor a investir, tempo e periodo. Teste Positivo (O resultado esperado era 201 porém retornou 400).

2- consultarDadosSimulacao - Consultar o resultado da simulação das 4 opções sugeridas pela aplicação de meses e valores. Teste Positivo

3- consultarRecursoInexistente - Somente uma consulta de um recurso inexistente para ver o comportamento do sistema. Teste negativo

4- tentarDeletarDadosSimulador - Teste de segurança, para garantir que os dados não possam ser deletados da base. Teste negativo

Como rodar no Intellij 

File > new > project from version control > Git e inserir a URL > https://github.com/angelicacamboim/TesteAutomacaoSimuladorSicrediPoupanca.git e selecionar um diretório e clicar no botão Clonar


