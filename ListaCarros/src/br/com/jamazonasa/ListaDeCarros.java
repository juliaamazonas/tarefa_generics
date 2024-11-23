package br.com.jamazonasa;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCarros <T extends Carro> {
    private List<T> carros = new ArrayList<>();

    public void adicionarCarro(T carro){
        carros.add(carro);
    }

    public void listarCarros() {
        for (T carro : carros ) {
            carro.exibirDetalhes();
        }
    }
}
