package service;

import model.Carro;
import org.junit.Assert;
import org.junit.Test;

public class CarroServiceTest {

    @Test
    public void deveLigarCorretamente() {
        // Given
        CarroService carroService = new CarroServiceImpl();
        Carro carro =
                new Carro("cor", "marca", "modelo", 2022, 150);

        // When
        carroService.ligar(carro);

        // Then
        Assert.assertTrue(carro.isLigado());
    }

    @Test
    public void deveAcelerarCorretamente() {
        // Given
        CarroService carroService = new CarroServiceImpl();
        Carro carro =
                new Carro("cor", "marca", "modelo", 2022, 150);

        // When
        carroService.ligar(carro);
        carroService.acelerar(carro, 10);

        // Then
        Assert.assertTrue(carro.getVelocidadeAtual() == 10);
    }

    @Test
    public void deveFrearCorretamente() {
        // Given
        CarroService carroService = new CarroServiceImpl();
        Carro carro =
                new Carro("cor", "marca", "modelo", 2022, 150);

        // When
        carroService.ligar(carro);
        carroService.acelerar(carro, 10);
        carroService.frear(carro, 5);

        // Then
        Assert.assertTrue(carro.getVelocidadeAtual() == 5);
    }

}
