package ElevadorPapagaios;

public class Elevdor {
    private int pisoatual;
    private float pesoatual;
    public int pisomaximo;
    private int pisominimo;
    public int Final;

    public Elevdor(int max,int min,int cargamaxima){
        pisomaximo = max;
        pisominimo = min;
        Final = cargamaxima;
        pisoatual = pisominimo;
        cargamaxima =0;

    }
    private void subierpiso(){
        if(pisoatual<pisomaximo && pesoatual<=Final){
            pisoatual++;
        }else{
            System.out.println("Nao pode subir o elavador");
        }

    }
    private void Baixarpiso(){
        if(pisoatual>pisominimo && pesoatual<=Final){
            pisoatual--;
        }else{
            System.out.println("Nao pode subir o elavador");
        }

    }
    public void irpiso(int piso){
        if(piso<=pisomaximo&&piso>=pisominimo){
            if(pisoatual!=piso){
                if(piso>pisoatual){
                    while(piso>pisoatual){
                        subierpiso();
                        System.out.println("Subindo");
                    }
                }else{

                }
            }else{
                System.out.println("Ja esta no piso");
            }
        }else{
            System.out.println("Nao existe o andar");
        }
    }

    public void Somapeso(float peso){
        if(peso>0){
            pesoatual = pesoatual +peso;
        }else{
            System.out.println("Limite de peso exicito");
        }


    }
    public void peso(float peso){
        pesoatual=pesoatual-peso;
        if(pesoatual<0){
            pesoatual=0;
        }else{
            System.out.println("Nao pode subir o elavador");
        }
    }
    public float getPesoatual(){
        return pesoatual;
    }
    public int getPisoatual(){
        return pisoatual;
    }





}
