import java.util.Scanner;

public class CarroServiceImpl implements CarroService {
    @Override
    public void execute(Carro carro) {
        Scanner entrada = new Scanner(System.in);
        int escolha;

        while(carro.estaLigado()) { // Enquanto meu carro estiver ligado ->
            System.out.println();
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Frear");
            System.out.println("3 - Estado atual");
            System.out.println("0 - Desligar");
            System.out.printf("Operacao: ");
            System.out.println();
            escolha = entrada.nextInt(); // Entrada do usuario

            if(escolha == 1) {
                carro.acelerar(10);
            } else if(escolha == 2) {
                carro.frear(10);
            } else if(escolha == 3) {
                carro.mostrarEstadoAtual();
            } else if(escolha == 0) {
                carro.desligar();
            } else {
                System.out.println("Escolha invalida, tente novamente");
            }
        }

        entrada.close();
    }
}
