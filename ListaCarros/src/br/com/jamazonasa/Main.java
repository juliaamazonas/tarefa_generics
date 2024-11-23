package br.com.jamazonasa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaDeCarros<Carro> listaDeCarros = new ListaDeCarros<>();

        listaDeCarros.adicionarCarro(new Honda("SUV"));
        listaDeCarros.adicionarCarro(new Civic("Civic"));

        listaDeCarros.listarCarros();

        }
    }
