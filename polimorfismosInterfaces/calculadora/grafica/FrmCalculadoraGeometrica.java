package grafica;

import java.awt.*;
import javax.swing.*;

import grafica.ActionCalcularArea.OpcaoForma;

public class FrmCalculadoraGeometrica extends JFrame {
    private JTextField txtCircunferenciaRaio;
    private JTextField txtCircunferenciaArea;
    private JTextField txtRetanguloBase;
    private JTextField txtRetanguloAltura;
    private JTextField txtRetanguloArea;
    private JTextField txtTrianguloBase;
    private JTextField txtTrianguloAltura;
    private JTextField txtTrianguloArea;
    private JButton btnCircunferenciaCalcularArea;
    private JButton btnRetanguloCalcularArea;
    private JButton btnTrianguloCalcularArea;
    public FrmCalculadoraGeometrica() {
        setSize(new Dimension(720, 200));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1, 10, 10));
        
        JPanel pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Círculo"));
        add(pnl);
        pnl.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        pnl.add(new JLabel("Raio:"));
        txtCircunferenciaRaio = new JTextField(10);
        pnl.add(txtCircunferenciaRaio);
        btnCircunferenciaCalcularArea = new JButton("Calcular");
        pnl.add(btnCircunferenciaCalcularArea);
        pnl.add(new JLabel("Área:"));
        txtCircunferenciaArea = new JTextField(10);
        pnl.add(txtCircunferenciaArea);

        pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Retângulo"));
        add(pnl);
        pnl.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        pnl.add(new JLabel("Base:"));
        pnl.add(txtRetanguloBase = new JTextField(10));
        pnl.add(new JLabel("Altura:"));
        pnl.add(txtRetanguloAltura = new JTextField(10));
        pnl.add(btnRetanguloCalcularArea = new JButton("Calcular"));
        pnl.add(new JLabel("Área:"));
        pnl.add(txtRetanguloArea = new JTextField(10));

        pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Triângulo"));
        add(pnl);
        pnl.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        pnl.add(new JLabel("Base:"));
        pnl.add(txtTrianguloBase = new JTextField(10));
        pnl.add(new JLabel("Altura:"));
        pnl.add(txtTrianguloAltura = new JTextField(10));
        pnl.add(btnTrianguloCalcularArea = new JButton("Calcular"));
        pnl.add(new JLabel("Área:"));
        pnl.add(txtTrianguloArea = new JTextField(10));

        pack();

        ActionCalcularArea action = new ActionCalcularArea(txtCircunferenciaRaio, OpcaoForma.CIRCULO, txtCircunferenciaArea);

        btnCircunferenciaCalcularArea.addActionListener(action);
    }
}
