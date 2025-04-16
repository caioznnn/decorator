package org.example;

public abstract class CarroDecorator implements Carro {
    protected Carro carro;

    public CarroDecorator(Carro carro) {
        this.carro = carro;
    }

    public String getDescricao() {
        return carro.getDescricao();
    }

    public double getPreco() {
        return carro.getPreco();
    }
}
