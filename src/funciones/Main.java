package funciones;

public class Main {

    public static final double IVA=0.21;

    public static void main(String[] args) {
        System.out.println(calculaIva(100));
    }

    public static double calculaIva(double importe){
        return importe+importe*IVA;
    }
}
