import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Carrera {

    private JFrame frameCarrera;
    private JProgressBar pbCaballo1;
    private JProgressBar pbCaballo2;
    private JProgressBar pbCaballo3;
    private JProgressBar pbCaballo4;
    private JProgressBar pbCaballo5;
    private JProgressBar pbCaballo6;
    private JProgressBar pbCaballo7;
    private JProgressBar pbCaballo8;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JTextField tfDistancia;
    private JButton btCorrer;
    private JLabel distancia;
    private JLabel marcador;
    private JLabel progresoCaballo1;

    private void run(){
        int distancia = Integer.parseInt(tfDistancia.getText());

        final Caballo caballo1 = new Caballo(distancia, marcador, "Perdigón");
        final Caballo caballo2 = new Caballo(distancia, marcador, "Rocinante");
        final Caballo caballo3 = new Caballo(distancia, marcador, "Tornado");
        final Caballo caballo4 = new Caballo(distancia, marcador, "Pegaso");
        final Caballo caballo5 = new Caballo(distancia, marcador, "Spirit");
        final Caballo caballo6 = new Caballo(distancia, marcador, "Marengo");
        final Caballo caballo7 = new Caballo(distancia, marcador, "Galán");
        final Caballo caballo8 = new Caballo(distancia, marcador, "Hidalgo");

        caballo1.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent event) {
                if(event.getPropertyName().equals("progress")){
                    pbCaballo1.setValue((Integer) event.getNewValue());
                    progresoCaballo1.setText(event.getNewValue()+" %");
                }
                if(event.getPropertyName().equals("ganador")){
                    caballo2.cancel(true);
                    caballo3.cancel(true);
                    caballo4.cancel(true);
                    caballo5.cancel(true);
                    caballo6.cancel(true);
                    caballo7.cancel(true);
                    caballo8.cancel(true);
                }
            }
        });
        caballo2.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent event) {
                if(event.getPropertyName().equals("progress")){
                    pbCaballo2.setValue((Integer) event.getNewValue());
                }
                if(event.getPropertyName().equals("ganador")){
                    caballo1.cancel(true);
                    caballo3.cancel(true);
                    caballo4.cancel(true);
                    caballo5.cancel(true);
                    caballo6.cancel(true);
                    caballo7.cancel(true);
                    caballo8.cancel(true);
                }
            }
        });
        caballo3.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent event) {
                if(event.getPropertyName().equals("progress")){
                    pbCaballo3.setValue((Integer) event.getNewValue());
                }
                if(event.getPropertyName().equals("ganador")){
                    caballo2.cancel(true);
                    caballo1.cancel(true);
                    caballo4.cancel(true);
                    caballo5.cancel(true);
                    caballo6.cancel(true);
                    caballo7.cancel(true);
                    caballo8.cancel(true);
                }
            }
        });
        caballo4.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent event) {
                if(event.getPropertyName().equals("progress")){
                    pbCaballo4.setValue((Integer) event.getNewValue());
                }
                if(event.getPropertyName().equals("ganador")){
                    caballo2.cancel(true);
                    caballo3.cancel(true);
                    caballo1.cancel(true);
                    caballo5.cancel(true);
                    caballo6.cancel(true);
                    caballo7.cancel(true);
                    caballo8.cancel(true);
                }
            }
        });
        caballo5.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent event) {
                if(event.getPropertyName().equals("progress")){
                    pbCaballo5.setValue((Integer) event.getNewValue());
                }
                if(event.getPropertyName().equals("ganador")){
                    caballo2.cancel(true);
                    caballo3.cancel(true);
                    caballo4.cancel(true);
                    caballo1.cancel(true);
                    caballo6.cancel(true);
                    caballo7.cancel(true);
                    caballo8.cancel(true);
                }
            }
        });
        caballo6.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent event) {
                if(event.getPropertyName().equals("progress")){
                    pbCaballo6.setValue((Integer) event.getNewValue());
                }
                if(event.getPropertyName().equals("ganador")){
                    caballo2.cancel(true);
                    caballo3.cancel(true);
                    caballo4.cancel(true);
                    caballo5.cancel(true);
                    caballo1.cancel(true);
                    caballo7.cancel(true);
                    caballo8.cancel(true);
                }
            }
        });
        caballo7.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent event) {
                if(event.getPropertyName().equals("progress")){
                    pbCaballo7.setValue((Integer) event.getNewValue());
                }
                if(event.getPropertyName().equals("ganador")){
                    caballo2.cancel(true);
                    caballo3.cancel(true);
                    caballo4.cancel(true);
                    caballo5.cancel(true);
                    caballo6.cancel(true);
                    caballo1.cancel(true);
                    caballo8.cancel(true);
                }
            }
        });
        caballo8.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent event) {
                if(event.getPropertyName().equals("progress")){
                    pbCaballo8.setValue((Integer) event.getNewValue());
                }
                if(event.getPropertyName().equals("ganador")){
                    caballo2.cancel(true);
                    caballo3.cancel(true);
                    caballo4.cancel(true);
                    caballo5.cancel(true);
                    caballo6.cancel(true);
                    caballo7.cancel(true);
                    caballo1.cancel(true);
                }
            }
        });

        caballo1.execute();
        caballo2.execute();
        caballo3.execute();
        caballo4.execute();
        caballo5.execute();
        caballo6.execute();
        caballo7.execute();
        caballo8.execute();
    }

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    Carrera window = new Carrera();
                    window.frameCarrera.setVisible(true);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
    }

    public Carrera(){
        initialize();
    }

    private void initialize(){
        frameCarrera = new JFrame();
        frameCarrera.setTitle("Carrera de caballos");
        frameCarrera.setBounds(100,100,450,300);
        frameCarrera.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameCarrera.getContentPane().setLayout(null);
        frameCarrera.getContentPane().add(getPbCaballo1());
        frameCarrera.getContentPane().add(getPbCaballo2());
        frameCarrera.getContentPane().add(getPbCaballo3());
        frameCarrera.getContentPane().add(getPbCaballo4());
        frameCarrera.getContentPane().add(getPbCaballo5());
        frameCarrera.getContentPane().add(getPbCaballo6());
        frameCarrera.getContentPane().add(getPbCaballo6());
        frameCarrera.getContentPane().add(getPbCaballo7());
        frameCarrera.getContentPane().add(getPbCaballo8());
        frameCarrera.getContentPane().add(getLabel1());
        frameCarrera.getContentPane().add(getLabel2());
        frameCarrera.getContentPane().add(getLabel3());
        frameCarrera.getContentPane().add(getLabel4());
        frameCarrera.getContentPane().add(getLabel5());
        frameCarrera.getContentPane().add(getLabel6());
        frameCarrera.getContentPane().add(getLabel7());
        frameCarrera.getContentPane().add(getLabel8());
        frameCarrera.getContentPane().add(getTfDistancia());
        frameCarrera.getContentPane().add(getBtCorrer());
        frameCarrera.getContentPane().add(getTfDistancia());
        frameCarrera.getContentPane().add(getMarcador());
        frameCarrera.getContentPane().add(getProgresoCaballo1());

    }

    public JProgressBar getPbCaballo1(){
        if(pbCaballo1 == null){
            pbCaballo1 = new JProgressBar();
            pbCaballo1.setBounds(10,65,422,19);
        }
        return pbCaballo1;
    }

    public JProgressBar getPbCaballo2(){
        if(pbCaballo2 == null){
            pbCaballo2 = new JProgressBar();
            pbCaballo2.setBounds(10,137,422,19);
        }
        return pbCaballo2;
    }

    public JProgressBar getPbCaballo3(){
        if(pbCaballo3 == null){
            pbCaballo3 = new JProgressBar();
            pbCaballo3.setBounds(10,209,422,19);
        }
        return pbCaballo3;
    }

    public JProgressBar getPbCaballo4(){
        if(pbCaballo4 == null){
            pbCaballo4 = new JProgressBar();
            pbCaballo4.setBounds(10,281,422,19);
        }
        return pbCaballo4;
    }

    public JProgressBar getPbCaballo5(){
        if(pbCaballo5 == null){
            pbCaballo5 = new JProgressBar();
            pbCaballo5.setBounds(10,353,422,19);
        }
        return pbCaballo5;
    }

    public JProgressBar getPbCaballo6(){
        if(pbCaballo6 == null){
            pbCaballo6 = new JProgressBar();
            pbCaballo6.setBounds(10,425,422,19);
        }
        return pbCaballo6;
    }

    public JProgressBar getPbCaballo7(){
        if(pbCaballo7 == null){
            pbCaballo7 = new JProgressBar();
            pbCaballo7.setBounds(10,497,422,19);
        }
        return pbCaballo7;
    }

    public JProgressBar getPbCaballo8(){
        if(pbCaballo8 == null){
            pbCaballo8 = new JProgressBar();
            pbCaballo8.setBounds(10,569,422,19);
        }
        return pbCaballo8;
    }

    public JLabel getLabel1() {
        if (label1 == null) {
            label1 = new JLabel("Perdigón");
            label1.setBounds(10, 43, 60, 14);
        }
        return label1;
    }

    public JLabel getLabel2() {
        if (label2 == null) {
            label2 = new JLabel("Rocinante");
            label2.setBounds(10, 114, 60, 14);
        }
        return label2;
    }

    public JLabel getLabel3() {
        if (label3 == null) {
            label3 = new JLabel("Tornado");
            label3.setBounds(10, 184, 60, 14);
        }
        return label3;
    }

    public JLabel getLabel4() {
        if (label4 == null) {
            label4 = new JLabel("Pegaso");
            label4.setBounds(10, 254, 60, 14);
        }
        return label4;
    }

    public JLabel getLabel5() {
        if (label5 == null) {
            label5 = new JLabel("Spirit");
            label5.setBounds(10, 324, 60, 14);
        }
        return label5;
    }

    public JLabel getLabel6() {
        if (label6 == null) {
            label6 = new JLabel("Marengo");
            label6.setBounds(10, 394, 60, 14);
        }
        return label6;
    }

    public JLabel getLabel7() {
        if (label7 == null) {
            label7 = new JLabel("Galán");
            label7.setBounds(10, 464, 60, 14);
        }
        return label7;
    }

    public JLabel getLabel8() {
        if (label8 == null) {
            label8 = new JLabel("Hidalgo");
            label8.setBounds(10, 534, 60, 14);
        }
        return label8;
    }

    public JTextField getTfDistancia() {
        if (tfDistancia == null) {
            tfDistancia = new JTextField();
            tfDistancia.setBounds(247, 12, 86, 20);
            tfDistancia.setColumns(10);
        }
        return tfDistancia;
    }

    public JButton getBtCorrer() {
        if (btCorrer == null) {
            btCorrer = new JButton("Correr");
            btCorrer.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    run();
                }
            });
            btCorrer.setBounds(343, 11, 89, 23);
        }
        return btCorrer;
    }

    public JLabel getLblDistancia() {
        if (distancia == null) {
            distancia = new JLabel("Distancia");
            distancia.setBounds(176, 15, 72, 14);
        }
        return distancia;
    }
    public JLabel getMarcador() {
        if (marcador == null) {
            marcador = new JLabel("");
            marcador.setBounds(147, 241, 144, 14);
        }
        return marcador;
    }

    public JLabel getProgresoCaballo1() {
        if (progresoCaballo1 == null) {
            progresoCaballo1 = new JLabel("");
            progresoCaballo1.setBounds(65, 40, 60, 14);
        }
        return progresoCaballo1;
    }



}
