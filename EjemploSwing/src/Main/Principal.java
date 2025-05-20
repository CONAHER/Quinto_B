package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Principal extends JFrame {

    JPanel panel1;
    Font fuente1;
    JTextField texto1;

    public Principal() {
        //toda la logica de mi JFRAME
        //EN EL CONSTRUCTOR
        this.setSize(800, 500);
        this.setTitle("EJEMPLO JFRAME");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setUndecorated(true);
        this.setLayout(null);
        this.AgregarPaneles();
        this.AgregarComponentes();

    }

    public void AgregarPaneles() {
        panel1 = new JPanel();
        panel1.setBounds(0, 0, 800, 500);
        panel1.setBackground(Color.red);
        panel1.setLayout(null);
        this.add(panel1);
    }

    public void AgregarComponentes() {
        //todas las llamas de los metodos que
        //generan los componentes
        this.Fuentes();
        this.Etiquetas();
        this.Textos();
        this.Botones();
    }

    public void Fuentes() {
        fuente1 = new Font("Comic Sans MS", Font.PLAIN, 18);
    }

    public void Etiquetas() {
        JLabel etiqueta1 = new JLabel("Nombre: ");
        etiqueta1.setBounds(100, 100, 100, 25);
        etiqueta1.setForeground(Color.white);
        etiqueta1.setFont(fuente1);
        panel1.add(etiqueta1);

        JLabel etiquetaIMG = new JLabel();
        etiquetaIMG.setBounds(450, 100, 300, 300);
        ImageIcon img = new ImageIcon(getClass().getResource("/Img/casco.png"));
        Image escalado = img.getImage().getScaledInstance(etiquetaIMG.getWidth(), etiquetaIMG.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imgEscalado = new ImageIcon(escalado);
        etiquetaIMG.setIcon(imgEscalado);
        panel1.add(etiquetaIMG);
    }

    public void Textos() {
        texto1 = new JTextField();
        texto1.setBounds(225, 100, 200, 30);
        texto1.setFont(fuente1);
        panel1.add(texto1);
    }

    public void Botones() {
        JButton boton1 = new JButton("Clic Aca");
        boton1.setBounds(150, 300, 200, 40);
        boton1.setBackground(Color.black);
        boton1.setForeground(Color.cyan);
        boton1.setFont(fuente1);
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = texto1.getText();
                JOptionPane.showMessageDialog(null, "Hola Usuario " + nombre, "Mensaje Nombre", JOptionPane.INFORMATION_MESSAGE);
                Secundaria ventana2 = new Secundaria();
                dispose();
                ventana2.setVisible(true);
            }

        });
        panel1.add(boton1);

        JButton boton2 = new JButton("X");
        boton2.setBounds(700, 20, 60, 60);
        boton2.setBackground(Color.black);
        boton2.setForeground(Color.RED);
        boton2.setFont(fuente1);
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });
        panel1.add(boton2);

    }
}
