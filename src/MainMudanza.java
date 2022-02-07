public class MainMudanza {
    public static void main(String[] args) {
        Bulto sofa = new Bulto("sofa", 20, 20, false);
        Bulto sillas = new Bulto("sillaa", 10, 15, false);
        Bulto mesa = new Bulto("mesa", 25, 50, false);
        Bulto jarron = new Bulto("jarron", 20, 20, true);


        Camion camion = new Camion("1234QWE",50 ,100 );

        camion.cargaBulto(sofa);
        camion.cargaBulto(sillas);
        camion.cargaBulto(mesa);
        camion.cargaBulto(jarron);



    }
}
