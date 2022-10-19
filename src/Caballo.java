import java.util.Random;

import javax.swing.JLabel;
import javax.swing.SwingWorker;

public class Caballo extends SwingWorker<Void, Integer> {

    private int velocidad;
    private int distanciaCarrera;
    private int distanciaRecorrida;
    private JLabel marcador;
    private String nombre;

    public Caballo(int velocidad, int distanciaCarrera, int distanciaRecorrida, JLabel marcador, String nombre) {
        this.velocidad = velocidad;
        this.distanciaCarrera = distanciaCarrera;
        this.distanciaRecorrida = distanciaRecorrida;
        this.marcador = marcador;
        this.nombre = nombre;
    }

    public Caballo(int distanciaCarrera, JLabel marcador, String nombre) {
        this.velocidad = new Random().nextInt(30)+5;
        this.distanciaCarrera = distanciaCarrera;
        this.distanciaRecorrida = 0;
        this.marcador = marcador;
        this.nombre = nombre;
    }

    @Override
    protected Void doInBackground() throws Exception {
        
        while (distanciaRecorrida < distanciaCarrera){
            Thread.sleep(100);
            distanciaRecorrida += velocidad;
            if(distanciaRecorrida > distanciaCarrera){
                distanciaRecorrida = distanciaCarrera;
            }

            setProgress(distanciaCarrera*100/distanciaCarrera);
        }

        marcador.setText(nombre + ": He ganado");
        firePropertyChange("ganador", "", nombre);
        
        return null;
    }
    
}
