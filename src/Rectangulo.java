public class Rectangulo {

    private int puntoCentral;

    public int getPuntoCentral() {
        return puntoCentral;
    }

    private int base;

    public int getBase() {
        return base;
    }

    private int altura;

    public int getAltura() {
        return altura;
    }

    private int radio;
    public int getRadio() {
        return radio;
    }

    public Rectangulo (int puntoCentral, int base, int altura){
        this.puntoCentral = puntoCentral;
        this.base= base;
        this.altura = altura;
    }

    public Rectangulo (int puntoCentral, int radio){
        this.puntoCentral = puntoCentral;
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "puntoCentral=" + puntoCentral +
                ", base=" + base +
                ", altura=" + altura +
                ", radio=" + radio +
                '}';
    }

    public double arearectangulo(int base, int altura){
       double afigura = base + altura;
        return afigura;
    }

    public double areacirculo(int radio){
        double articulo = (Math.PI * (radio*radio));
        return articulo;
    }


    public double distancia (){

        return 0;
    }

}
