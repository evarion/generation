package com.evarion.countpeople;

import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


public class MainGuiModule extends JFrame {

    public void limitInput(JTextField inputTextField, final int limitField) {
        inputTextField.setDocument(new PlainDocument() {//ограничение на jTextField
            final String chars = "0123456789.";


            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (chars.indexOf(str) != -1) {
                    if (getLength() < limitField) {
                        super.insertString(offs, str, a);
                    }
                }
            }
        });
    }

    public int inputData(JTextField inputYear) {
        String year = inputYear.getText();
        int num = 0;
        if (year.trim().length() != 0) {
            num = Integer.parseInt(year);
            return num;
        } else {
            System.out.println(num);
            return num;
        }

    }

    public String setYear(int year, int generate) {
        Generation generation = new Generation();
        String result;
        result = generation.calculationBigInteger(year, generate);
        return result;
    }
}
