package org.example;

public class RodasLigaLeve extends CarroDecorator {
    public RodasLigaLeve(Carro carro) {
        super(carro);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Rodas de Liga Leve";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 2000.0;
    }
}
