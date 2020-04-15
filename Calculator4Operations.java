import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator4Operations extends JFrame {
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton Button_7;
    private JButton Button_3;
    private JButton Button_6;
    private JButton Button_4;
    private JButton Button_1;
    private JButton Button_2;
    private JButton Button_5;
    private JButton Button_8;
    private JButton Button_9;
    private JButton Button_0;
    private JButton Button_point;
    private JButton Button_00;
    private JButton Button_plus;
    private JButton Button_minus;
    private JButton Button_multiply;
    private JButton Button_div;
    private JButton Button_equals;
    private JButton button_clear;
    private JButton Button_degree;

    private static StringBuilder sb = new StringBuilder();

    static double x;
    static double y;
    static char sign;

    public Calculator4Operations(){
        add(mainPanel);
        setSize(590,410);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Button_1.addActionListener(e -> {
            sb.append("1");
            textField1.setText(sb.toString());
        });

        Button_2.addActionListener(e -> {
            sb.append("2");
            textField1.setText(sb.toString());
        });

        Button_3.addActionListener(e -> {
            sb.append("3");
            textField1.setText(sb.toString());
        });

        Button_4.addActionListener(e -> {
            sb.append("4");
            textField1.setText(sb.toString());
        });

        Button_5.addActionListener(e -> {
            sb.append("5");
            textField1.setText(sb.toString());
        });

        Button_6.addActionListener(e -> {
            sb.append("6");
            textField1.setText(sb.toString());
        });

        Button_7.addActionListener(e -> {
            sb.append("7");
            textField1.setText(sb.toString());
        });

        Button_8.addActionListener(e -> {
            sb.append("8");
            textField1.setText(sb.toString());
        });

        Button_9.addActionListener(e -> {
            sb.append("9");
            textField1.setText(sb.toString());
        });

        Button_00.addActionListener(e -> {
            sb.append("00");
            textField1.setText(sb.toString());
        });

        Button_0.addActionListener(e -> {
            sb.append("0");
            textField1.setText(sb.toString());
        });

        Button_point.addActionListener(e -> {
            sb.append(".");
            textField1.setText(sb.toString());
        });

        Button_plus.addActionListener(e -> {
            x = Double.parseDouble(sb.toString());
            sign = '+';
            sb.setLength(0);

            textField1.setText("введи второе значение");

        });
        Button_minus.addActionListener(e -> {
            x = Double.parseDouble(sb.toString());
            sign = '-';
            sb.setLength(0);

            textField1.setText("введи второе значение");
        });
        Button_multiply.addActionListener(e -> {
            x = Double.parseDouble(sb.toString());
            sign = '*';
            sb.setLength(0);

            textField1.setText("введи второе значение");
        });
        Button_div.addActionListener(e -> {
            x = Double.parseDouble(sb.toString());
            sign = '/';
            sb.setLength(0);

            textField1.setText("введи второе значение");
        });

        Button_equals.addActionListener(e -> {
            y = Double.parseDouble(sb.toString());

            switch (sign){
                case '+' : textField1.setText(String.valueOf(x + y));
                break;
                case '-' : textField1.setText(String.valueOf(x - y));
                break;
                case '*' : textField1.setText(String.valueOf(x * y));
                break;
                case '/' : textField1.setText(String.valueOf(x / y));
                break;
                case '#' : double result = 1;
                    for (int i = 0; i < y; i++) {
                        result = x * result;
                    }
                    textField1.setText(String.valueOf(result));
                    break;
            }


        });
        button_clear.addActionListener(e -> {
            sb.setLength(0);
            textField1.setText(sb.toString());
        });


        Button_degree.addActionListener(e -> {
            x = Double.parseDouble(sb.toString());
            sign = '#';
            sb.setLength(0);

            textField1.setText("введи значение степени ");
        });
    }

}
