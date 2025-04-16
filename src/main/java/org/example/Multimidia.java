package org.example;

public class Multimidia extends CarroDecorator {
    public Multimidia(Carro carro) {
        super(carro);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Sistema Multimídia";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 3500.0;
    }
}
