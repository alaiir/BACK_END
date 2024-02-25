import java.util.*;

public class Main {
    public static void main(String[] args) {
        listaAlunos();
    }

    private static void listaAlunos() {
        Set<String> lista = new TreeSet<>();
        lista.add("Joao da silva");
        lista.add("Joao Gomes");
        lista.add("Mateus da Cunha");
        lista.add("Francisco Alves");
        lista.add("Patricia Antonia");
        lista.add("Patricia Antonieta");
        lista.add("Joao Barbosa");
        System.out.println(lista);
    }

}