public class Bulto {
    private String id;

    private double volumen;
    public double getVolumen() {
        return volumen;
    }

    private double peso;
    public double getPeso() {
        return peso;
    }

    private boolean esFragil;
    public boolean isEsFragil() {
        return esFragil;
    }

    public Bulto(String id, double volumen, double peso, boolean esFragil){
        this.id = id;
        this.volumen = volumen;
        this.peso = peso;
        this.esFragil = esFragil;
    }
}
