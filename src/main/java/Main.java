import model.Carro;
import service.CarroService;
import service.CarroServiceImpl;

public class Main {

    /**
     *
     * Um carro tem os seguintes atributos:
     *  - cor
     *  - marca
     *  - modelo
     *  - ligado
     *  - velocidadeAtual
     *  - velocidadeMáxima
     *
     *  Enquanto o carro estiver desligado deve ser capaz de:
     *  - Ligar
     *  - Mostrar estado atual
     *
     * Enquanto o carro estiver ligado deve ser capaz de:
     * - Desligar
     * - Acelerar
     * - Frear
     * - Motrar estado atual
     *
     * Regras:
     *
     * - Só podemos realizar as ações como acelerar e frear com o carro ligado
     * - Só podemos desligar o carro quando ele parar totalmente (velocidadeAtual = 0)
     * - Não existe velocidade negativa
     * - O carro não pode passar de sua velocidade máxima
     *
     */

    public static void main(String[] args) {
        CarroService carroService = new CarroServiceImpl();

        /**
         *
         * Condição para retorno correto do teste
         * Todos os testes devem mostrar "true"
         *
         */

        // Teste 01: Deve ligar corretamente
        // Given
        Carro carroTeste01 = new Carro("Azul", "Fiat", "Uno", 2015, 150);

        // When
        carroService.ligar(carroTeste01);
        carroService.acelerar(carroTeste01, 10);
        carroService.frear(carroTeste01, 5);

        // Then
        System.out.println(carroTeste01.isLigado());


        // Teste 02: Deve acelerar corretamente
        // Given
        Carro carroTeste02 = new Carro("Azul", "Fiat", "Uno", 2015, 150);

        // When
        carroService.ligar(carroTeste02);
        carroService.acelerar(carroTeste02, 10);

        // Then
        System.out.println(carroTeste02.getVelocidadeAtual() == 10);


        // Teste 02: Deve frear corretamente
        // Given
        Carro carroTeste03 = new Carro("Azul", "Fiat", "Uno", 2015, 150);

        // When
        carroService.ligar(carroTeste03);
        carroService.acelerar(carroTeste03, 10);
        carroService.frear(carroTeste03, 5);

        // Then
        System.out.println(carroTeste03.getVelocidadeAtual() == 5);
    }
}
