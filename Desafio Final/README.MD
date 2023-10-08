## DESAFIO FINAL DO MÓDULO
Com base em todo conteúdo visto nas aulas anteriores, você precisará desenvolver um...

### Sistema de Gerenciamento de Veículos
Neste desafio, você deve criar um sistema para gerenciar diferentes tipos de veículos em uma revenda usando os conceitos de programação orientada a objetos (POO).

#### Vamos ao desafio:
1. Crie uma classe abstrata **Veiculo** com os seguintes
**atributos**
    * placa (String).
    * marca (String).
    * modelo (String).
    * ano (int).
    * preço (double).
**métodos** 
    * Construtor com todos os parâmetros.
    * Métodos getters e setters.
    * Método abstrato 'exibirDetalhes()' que retorna uma String.
2. Crie classes concretas: **Carro** e **Moto**
    * Ambas devem herdar da classe Veículo
    * Atributos específicos: 
        * Carro: qtdPortas (int)
        * Moto: tipoFreio: (String)
    * implemente o método 'exibirDetalhes()'
3. Crie uma Interface **Promocao**
    * Método 'aplicarDesconto(double valor)': que receba o valor de desconto.
4. Implementando a interface
    * Faça as classes Carro e Moto implementarem a interface Promocao.
    * Implemente o método aplicarDesconto de modo que **carros recebam um desconto de no máximo 10%** e **motos de no máximo 5%** do preço original.
5. Crie uma classe **Revenda**:
    * Crie 5 atributos do tipo Veiculo
    * Crie um método adicionarVeiculo(Veiculo veiculo): para adicionar um veículo.
    * Crie um método removerVeiculo(String placa): para remover um veículo
    * Crie um método listarVeiculos(): para listar todos os veículos
    * Crie um método adicionarDesconto(String placa, double valorDesconto): para adicionar um desconto no veículo específico.
6. Na classe Principal:
    * Instancie alguns carros e motos.
    * Crie uma instância da revenda.
    * Adicione os veículos à revenda.
    * Liste todos os veículos.
    * Aplique um desconto em um carro e em uma moto.
    * Liste novamente os veículos para verificar os novos preços.