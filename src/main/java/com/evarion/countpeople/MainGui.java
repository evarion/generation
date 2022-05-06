package com.evarion.countpeople;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MainGui extends JFrame {

    MainGuiModule mainGuiModule = new MainGuiModule(); //проверить возоможность через импорт
    ImageIcon imageIcon = new ImageIcon("images/picture.png");
    JLabel imageIconLabel = new JLabel();


    String resultFinal = "";

    JPanel jPanelLeftMain = new JPanel();
    JPanel jPanelRightMain = new JPanel();
    JPanel jPaneLeftTop = new JPanel();
    JPanel jPanelLeftDown = new JPanel();

    JPanel jPanelEmpty0 = new JPanel();
    JPanel jPanelEmpty1 = new JPanel();
    JPanel jPanelEmpty2 = new JPanel();

    JTextField inputYear = new JTextField();
    JTextField inputCountGeneration = new JTextField();

    JButton buttonOk = new JButton("Ok");
    //JButton buttonExit = new JButton("Exit");

    JLabel labelYear = new JLabel("ВВЕДИТЕ ГОД ВАШЕГО РОЖДЕНИЯ");
    JLabel labelGeneration = new JLabel("ВВЕДИТЕ ЧИСЛО КОЛИЧЕСТВА СТРОК");


    JTextArea textResultArea = new JTextArea();
    JScrollPane scroll;

    public MainGui() {
        super("App");
        createGUI();
    }

    public void createGUI() {
        addPanel();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 2));
        setLocation(200, 40);
        setMinimumSize(new Dimension(1600, 900));

    }


    public void addPanel() {
        add(jPanelLeftMain);
        jPanelLeftMain.add(jPaneLeftTop);
        jPanelLeftMain.add(jPanelLeftDown);

        jPaneLeftTop.add(jPanelEmpty0);
        jPaneLeftTop.add(inputYear);
        jPaneLeftTop.add(labelYear);
        jPaneLeftTop.add(jPanelEmpty1);
        jPaneLeftTop.add(inputCountGeneration);
        jPaneLeftTop.add(labelGeneration);
        jPaneLeftTop.add(jPanelEmpty2);
        jPaneLeftTop.add(buttonOk);

        add(jPanelRightMain);
        scroll = new JScrollPane(textResultArea);
        jPanelRightMain.add(scroll);

        jPanelLeftDown.add(imageIconLabel);

        setPanels();
        setInputYear();
        setButtonOk();
        setInputCountGeneration();
    }


    private void setPanels() {
        jPanelEmpty0.setBackground(Color.ORANGE);
        jPanelEmpty1.setBackground(Color.ORANGE);
        jPanelEmpty2.setBackground(Color.ORANGE);
        jPanelEmpty0.setMaximumSize(new Dimension(12, 12));
        jPanelEmpty1.setMaximumSize(new Dimension(12, 12));
        jPanelEmpty2.setMaximumSize(new Dimension(12, 12));

        jPanelLeftMain.setBackground(Color.GRAY);
        jPanelLeftMain.setLayout(new GridLayout(2, 1));

        jPaneLeftTop.setBackground(Color.ORANGE);
        //jPaneLeftTop.setLayout(new BoxLayout(jPaneLeftTop, BoxLayout.X_AXIS));
        jPaneLeftTop.setLayout(new BoxLayout(jPaneLeftTop, BoxLayout.Y_AXIS));


        jPanelRightMain.setBackground(Color.LIGHT_GRAY);
        jPanelRightMain.setLayout(new BoxLayout(jPanelRightMain, BoxLayout.Y_AXIS));

        imageIconLabel.setIcon(imageIcon);


    }


    private void setInputYear() {
        inputYear.setBackground(Color.cyan);

        inputYear.setPreferredSize(new Dimension(400, 30));
        inputYear.setMaximumSize(new Dimension(400, 30));
        mainGuiModule.limitInput(inputYear, 4);

    }

    private void setButtonOk() {
        buttonOk.addActionListener(new GetInput());

    }

    private void setInputCountGeneration() {
        inputCountGeneration.setPreferredSize(new Dimension(400, 30));
        inputCountGeneration.setMaximumSize(new Dimension(400, 30));
        mainGuiModule.limitInput(inputCountGeneration, 2);
    }

    class GetInput implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            resultFinal = mainGuiModule.setYear(mainGuiModule.inputData(inputYear), mainGuiModule.inputData(inputCountGeneration));
            setLabelResultText(resultFinal);
            System.out.println(resultFinal);

        }
    }

    private void setLabelResultText(String inputText) {
        textResultArea.setText(inputText);


    }
}


