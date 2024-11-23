package br.com.jamazonasa;

public class Civic extends Honda {
    public Civic(String modelo) {
        super(modelo);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
    }
}
