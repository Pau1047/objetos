import java.util.LinkedList;

public class Camion {
    private String matricula;
    private double volumenMaximo;
    private double pesoMaximo;

    LinkedList<Bulto> bultosCargados = new LinkedList<Bulto>();

    public Camion (String matricula, double volumenMaximo, double pesoMaximo) {
        this.matricula = matricula;
        this.volumenMaximo = volumenMaximo;
        this.pesoMaximo = pesoMaximo;
    }

    public void cargaBulto(Bulto bulto){
        bultosCargados.add(bulto);
    }

    public boolean cabeBulto(Bulto bulto){
        return bulto.getPeso() <=pesoDisponible() && bulto.getVolumen() <= volumenDisponible();

    }

    public double volumenDisponible(){
        return volumenMaximo - volumenCarga();
    }

    public double volumenCarga(){
        double volumenTotal = 0;
        for (Bulto bulto: bultosCargados) {
            volumenTotal += bulto.getVolumen();
        }
        return volumenTotal;
    }

    public double pesoDisponible(){
        return pesoMaximo - pesoCarga();
    }

    public double pesoCarga(){
        double pesoTotal = 0;
        for (Bulto bulto:bultosCargados) {
            pesoTotal += bulto.getPeso();
        }
        return pesoTotal;
    }

}
