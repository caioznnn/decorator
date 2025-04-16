import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {

    @Test
    public void testCarroBase() {
        Carro carro = new CarroBase();
        assertEquals("Carro Básico", carro.getDescricao());
        assertEquals(30000.0, carro.getPreco());
    }

    @Test
    public void testCarroComArCondicionado() {
        Carro carro = new ArCondicionado(new CarroBase());
        assertEquals("Carro Básico, Ar-Condicionado", carro.getDescricao());
        assertEquals(32500.0, carro.getPreco());
    }

    @Test
    public void testCarroComTodosAcessorios() {
        Carro carro = new RodasLigaLeve(
                new Multimidia(
                        new TetoSolar(
                                new ArCondicionado(
                                        new CarroBase()
                                )
                        )
                )
        );

        assertEquals("Carro Básico, Ar-Condicionado, Teto Solar, Sistema Multimídia, Rodas de Liga Leve",
                carro.getDescricao());
        assertEquals(30000 + 2500 + 4000 + 3500 + 2000, carro.getPreco());
    }
}
