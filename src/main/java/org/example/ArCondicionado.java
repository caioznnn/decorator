package org.example;

public class ArCondicionado extends CarroDecorator {
    public ArCondicionado(Carro carro) {
        super(carro);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Ar-Condicionado";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 2500.0;
    }
}
