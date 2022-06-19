package SwingAwtPackage;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.TextAction;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class App extends JFrame {

    private Button btn;
    private JPanel jp;
    private JTextField textField;
    private int W = 800;
    private int H = 800;
    private int k = 0;



    private void Init() {
        btn = new Button("Click me");
        btn.setBounds(W/2-45, H/2-10, 100,30);
        btn.setBackground(new Color(100,100,100));
        btn.setForeground(new Color(0,255,0));
        jp = new JPanel(new FlowLayout());

        //jp.setBounds(200,200,200,200);
        jp.setPreferredSize(new Dimension(250,250));

        textField = new JTextField("0");
        textField.setForeground(Color.GREEN);
        textField.setPreferredSize(new Dimension(120,20));
        textField.setFont(new Font("JetBrains Mono", Font.BOLD, 15));

        this.setLayout(new BorderLayout());
        this.add(jp);

        jp.add(btn);
        jp.add(textField);


    }

    public void BtnClick() {
        btn.addActionListener(e -> {
            JDialog dialog = new JDialog(this, "hello world", true);
            dialog.setSize(200,200);
            dialog.setVisible(true);

            k++;
            double r = Math.random()*255;
            double g = Math.random()*255;
            double b = Math.random()*255;
            textField.setText(String.valueOf(k));
            jp.setBackground(new Color((int) r,(int)g,(int)b));
        });
    }
    public App() {
        setSize(W,H);
        Init();
        BtnClick();

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
