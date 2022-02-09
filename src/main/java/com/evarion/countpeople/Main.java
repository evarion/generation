package com.evarion.countpeople;


public class Main {
    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainGui frame = new MainGui();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
        //Generation testBigInteger = new Generation();
        //testBigInteger.calculationBigInteger(2019,65);
    }
}
    
