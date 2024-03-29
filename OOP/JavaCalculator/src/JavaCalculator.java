import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {
    private JPanel JavaCalculator;
    private JTextField textDisplay;
    private JButton btnEquals;
    private JButton btnMultiply;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnPoint;
    private JButton btnPus;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnMinus;
    private JButton btnDivide;
    private JButton btnOne;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnZero;

    private double total2 = 0.0;
    private double result = 0.0;
    private  char mathOperator;
    private int  sum = 0 ;

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    private void jButtonActionPerformed(java.awt.event.ActionEvent evn ){


    }


//        ДА направя метод , който при сумата на числата до сто да се поменя в
//        жълто , а ако надвиши сто да си променя цвета.






    private void getOperator(String btnText){
        mathOperator = btnText.charAt(0);
        total2=  Double.parseDouble(textDisplay.getText());
        textDisplay.setText(" ");


    }



    public JavaCalculator() {


        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textDisplay.getText() + btnZero.getText();
                textDisplay.setText(btnZeroText);
            }
        });

        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisplay.getText() + btnOne.getText();
                textDisplay.setText(btnOneText);
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textDisplay.getText() + btnTwo.getText();
                textDisplay.setText(btnTwoText);

            }
        });

        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textDisplay.getText() + btnThree.getText();
                textDisplay.setText(btnThreeText);
            }
        });

        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textDisplay.getText() + btnFour.getText();
                textDisplay.setText(btnFourText);

            }
        });

        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textDisplay.getText() + btnFive.getText();
                textDisplay.setText(btnFiveText);
            }
        });

        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textDisplay.getText() + btnSix.getText();
                textDisplay.setText(btnSixText);
            }
        });

        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textDisplay.getText() + btnSeven.getText();
                textDisplay.setText(btnSevenText);
            }
        });

        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textDisplay.getText() + btnEight.getText();
                textDisplay.setText(btnEightText);
            }
        });

        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textDisplay.getText() + btnNine.getText();
                textDisplay.setText(btnNineText);
            }
        });


        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnDivide.getText();
                getOperator(button_text);
            }
        });

        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMultiply.getText();
                getOperator(button_text);
            }
        });

        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnPointText = textDisplay.getText() + btnPoint.getText();
                textDisplay.setText(btnPointText);
            }
        });

        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMinus.getText();
                getOperator(button_text);
            }
        });


        btnPus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnPus.getText();
                getOperator(button_text);
            }
        });


        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (mathOperator){
                    case '+':
                        result=total2 + Double.parseDouble(textDisplay.getText());//ne znam zashto ne zachita izobshto total 1, shte raboti i bez nego

                        break;
                    case '-':
                        result=Math.abs( total2- Double.parseDouble(textDisplay.getText()));
                        break;
                    case '*':
                        result=(total2) * Double.parseDouble(textDisplay.getText());

                        break;
                    case '/':
                       result=(total2) /Double.parseDouble(textDisplay.getText());
                        break;
                }
                textDisplay.setText(Double.toString(result));
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result = 0;
                textDisplay.setText(" ");
            }

        });

        btnMinus.setBackground(Color.lightGray);
        btnPus.setBackground(Color.lightGray);
        btnPoint.setBackground(Color.lightGray);
        btnDivide.setBackground(Color.lightGray);
        btnMultiply.setBackground(Color.lightGray);
        btnEquals.setBackground(Color.yellow);
        btnClear.setBackground(Color.yellow);
        btnZero.setBackground(Color.pink);
        btnOne.setBackground(Color.pink);
        btnTwo.setBackground(Color.pink);
        btnThree.setBackground(Color.pink);
        btnFour.setBackground(Color.pink);
        btnFive.setBackground(Color.pink);
        btnSix.setBackground(Color.pink);
        btnSeven.setBackground(Color.pink);
        btnEight.setBackground(Color.pink);
        btnNine.setBackground(Color.pink);
        textDisplay.setBackground(Color.lightGray);






    }
}
