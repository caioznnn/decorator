package org.example;

public class CarroBase implements Carro {
    @Override
    public String getDescricao() {
        return "Carro Básico";
    }

    @Override
    public double getPreco() {
        return 30000.0;
    }
}
