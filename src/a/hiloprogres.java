package a;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

public class hiloprogres {

    private JProgressBar barra;
    private boolean avanzar;
    private boolean viva;

    public hiloprogres(JProgressBar barra) {
        this.barra = barra;
        avanzar = true;
        viva = true;

    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isViva() {
        return viva;
    }

    public void setViva(boolean viva) {
        this.viva = viva;
    }

    public void run() {
        if (viva) {

            barra.setForeground(Color.red);
            barra.setMaximum(12);
            if (barra.getValue() == 12) {
                viva = false;
            }

            try {
                Thread.sleep(500 );
            } catch (InterruptedException ex) {
                Logger.getLogger(hiloprogres.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
