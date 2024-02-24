public class Main {

    public static void main(String[] args) {

        notasProvas();
    }

    private static void notasProvas() {

        int prova = 9;
        int execicio = 7;
        int tarefa = 5;
        double redacao = 6.5;

        double total = (9 + 7 + 5 + 6.5) / 4;
        System.out.println(total);

        double result = total;
        if (result > 1 && result < 4) {
            System.out.println("Reprovado");
        } else if (result > 5 && result < 8) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Aprovado");
        }

    }
}

