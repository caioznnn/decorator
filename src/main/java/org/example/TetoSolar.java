package org.example;

public class TetoSolar extends CarroDecorator {
    public TetoSolar(Carro carro) {
        super(carro);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Teto Solar";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 4000.0;
    }
}
