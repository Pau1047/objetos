import java.util.LinkedList;

public class Mudanza {
    private String id;
    private double distancia;
    private Camion camion;

    public void setCamion(Camion camion) {
        this.camion = camion;
    }

    LinkedList<Bulto>bultos = new LinkedList<>();

    public Mudanza (String id, double distancia){
        this.id = id;
        this.distancia = distancia;
    }

    public void incluyeBulto(Bulto bulto){
        bultos.add(bulto);
    }

    public double coste(){
        return costeBultos(); //+ costeViajes();
    }

    public double costeBultos(){
        double coste = 0;
        for (Bulto bulto: bultos) {
            if(bulto.isEsFragil()){
                coste+=bulto.getPeso()*4;
            }
            else{
                coste += bulto.getPeso();
            }
        }
        return coste;
    }


    public double costeViajes() {
        return viajesNecesarios() * distancia * 2;
    }

    public int viajesNecesarios(){
        LinkedList<Bulto> copiaBultos = new LinkedList<>(bultos);
        int viajes = 0;

        while(!copiaBultos.isEmpty()){
            viajes++;
            cargaCamionMaximo(copiaBultos);
        }
        return 0;
    }


    private void cargaCamionMaximo(LinkedList<Bulto> bultos){
        for (Bulto bulto: bultos) {
            if(camion.cabeBulto(bulto)){
                camion.cargaBulto(bulto);
            }
        }

    }

}