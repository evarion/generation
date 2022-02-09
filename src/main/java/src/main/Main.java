package src.main;

import gui.MainGui;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainGui frame = new MainGui();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });

        Generation testBigInteger = new Generation();
        testBigInteger.calculationBigInteger(2019,65);
    }


}
    
