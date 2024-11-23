package br.com.jamazonasa;

public class Honda extends Carro {

    public Honda(String modelo){
        super("Honda", modelo);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
    }
}
