/**
 * @author alair
 */

public class Wrappers {

    public static void main(String args[]) {
    wrappers();
    primitivo();
    }

    private static void primitivo() {

        long cpf = 101101101;
        System.out.println(cpf);

    }

    public static void wrappers() {


        Long cpf1 = Long.valueOf(101101101L);
        System.out.println(cpf1);


    }
}
