package a;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class hiloprogres extends Thread {

    private JProgressBar barra;
    private JTextArea area;
    private int tiempo;
    private int num;
    private JTable tabla;
    private String acum;
    private JTextField a1;
    private JTextField a2;
    private JTextField a3;
    private JTextField a4;
    private JTextField a5;
    private JTextField a6;
    private JTextField a7;
    private JTextField a8;
    private JTextField a9;
    private JTextField a10;
    private JTextField a11;
    private JTextField a12;
    private JTextField a13;
    private JTextField a14;
    private JTextField a15;
    private JTextField a16;
    private JTextField a17;
    private JTextField a18;
    private JTextField a19;
    private JTextField a20;

    public hiloprogres(int num, JTable tabla, JProgressBar barra) {
        this.num = num;
        this.tabla = tabla;
        this.barra = barra;
    }

    public hiloprogres(JProgressBar barra, int num, JTextField a1, JTextField a2, JTextField a3, JTextField a4, JTextField a5, JTextField a6, JTextField a7, JTextField a8, JTextField a9, JTextField a10, JTextField a11, JTextField a12, JTextField a13, JTextField a14, JTextField a15, JTextField a16, JTextField a17, JTextField a18, JTextField a19, JTextField a20) {
        this.num = num;
        this.barra = barra;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
        this.a6 = a6;
        this.a7 = a7;
        this.a8 = a8;
        this.a9 = a9;
        this.a10 = a10;
        this.a11 = a11;
        this.a12 = a12;
        this.a13 = a13;
        this.a14 = a14;
        this.a15 = a15;
        this.a16 = a16;
        this.a17 = a17;
        this.a18 = a18;
        this.a19 = a19;
        this.a20 = a20;
    }

    public hiloprogres(int num, JProgressBar barra, JTextArea area, String acum) {
        this.num = num;
        this.barra = barra;
        this.area = area;
        this.acum = acum;
    }

    @Override
    public void run() {
        switch (num) {
            case 0:
                for (int i = 1; i <= 4; i++) {
                    barra.setMaximum(4);
                    barra.setMinimum(1);
                    barra.setBackground(Color.GREEN);
                    barra.setValue(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }
                }
                area.setText(acum);
                JOptionPane.showMessageDialog(null, "La operación se a realizado con éxito");
                break;
            case 1:
                for (int i = 1; i <= 5; i++) {
                    barra.setMaximum(5);
                    barra.setMinimum(1);
                    barra.setBackground(Color.orange);
                    barra.setValue(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }
                }
                area.setText(acum);
                JOptionPane.showMessageDialog(null, "La operación se a realizado con éxito");
                break;
            case 2:
                for (int i = 1; i <= 6; i++) {
                    barra.setMaximum(6);
                    barra.setMinimum(1);
                    barra.setBackground(Color.red);
                    barra.setValue(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }
                }
                area.setText(acum);
                JOptionPane.showMessageDialog(null, "La operación se a realizado con éxito");
                break;
            case 3:
                for (int i = 1; i <= 3; i++) {
                    barra.setMaximum(3);
                    barra.setMinimum(1);
                    barra.setBackground(Color.blue);
                    barra.setValue(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }
                }
                area.setText(acum);
                JOptionPane.showMessageDialog(null, "La operación se a realizado con éxito");
                break;
            case 4:
                for (int i = 1; i <= 6; i++) {
                    barra.setMaximum(6);
                    barra.setMinimum(1);
                    barra.setBackground(Color.yellow);
                    barra.setValue(i);
                    System.out.println("a");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }
                }
                a1.setText("");
                a2.setText("");
                a3.setText("");
                a4.setText("");
                a5.setText("");
                a6.setText("");
                a7.setText("");
                a8.setText("");
                a9.setText("");
                a10.setText("");
                a11.setText("");
                a12.setText("");
                a13.setText("");
                a14.setText("");
                a15.setText("");
                a16.setText("");
                a17.setText("");
                a18.setText("");
                a19.setText("");
                a20.setText("");
                JOptionPane.showMessageDialog(null, "La operación se a realizado con éxito");
                break;
            case 5:
                for (int i = 1; i <= 5; i++) {
                    barra.setMaximum(5);
                    barra.setMinimum(1);
                    barra.setBackground(Color.pink);

                    barra.setValue(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }
                }
                Dba db = new Dba("./Lab9.accdb");
                db.conectar();
                try {
                    System.out.println(tabla.getSelectedRow());
                    int temp = (int) tabla.getValueAt(tabla.getSelectedRow(), 0);
                    System.out.println(temp);
                    db.query.execute("delete from TenRecord where Id=" + temp);
                    db.commit();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                db.desconectar();
                JOptionPane.showMessageDialog(null, "La operación se a realizado con éxito");
                break;
            default:
                break;
        }
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getAcum() {
        return acum;
    }

    public void setAcum(String acum) {
        this.acum = acum;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

}
