package ElevadorPapagaios;

public class Main {
    public static void main (String [] args){
        Elevdor elavador = new Elevdor( 5, -1, 600);
        System.out.println(elavador.getPisoatual());
        System.out.println(elavador.getPesoatual());
        elavador.irpiso(30);
        System.out.println(elavador.getPisoatual());

    }
}
