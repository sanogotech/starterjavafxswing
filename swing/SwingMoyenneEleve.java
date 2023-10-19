import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingMoyenneEleve {

    private JFrame frame;
    private JTextField tfNom;
    private JTextField tfPrenom;
    private JTextField tfNote1;
    private JTextField tfNote2;
    private JTextField tfNote3;
    private JButton btnCalculer;
    private JLabel lblNom;
    private JLabel lblPrenom;
    private JLabel lblNote1;
    private JLabel lblNote2;
    private JLabel lblNote3;
    private JLabel lblMoyenne;

    public SwingMoyenneEleve() {
        frame = new JFrame("Moyenne d'un élève");
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(6, 2));

        tfNom = new JTextField();
        tfPrenom = new JTextField();
        tfNote1 = new JTextField();
        tfNote2 = new JTextField();
        tfNote3 = new JTextField();
        btnCalculer = new JButton("Calculer");
        lblNom = new JLabel("Nom : ");
        lblPrenom = new JLabel("Prénom : ");
        lblNote1 = new JLabel("Note 1 : ");
        lblNote2 = new JLabel("Note 2 : ");
        lblNote3 = new JLabel("Note 3 : ");
        lblMoyenne = new JLabel("Moyenne : ");

        frame.add(lblNom);
        frame.add(tfNom);
        frame.add(lblPrenom);
        frame.add(tfPrenom);
        frame.add(lblNote1);
        frame.add(tfNote1);
        frame.add(lblNote2);
        frame.add(tfNote2);
        frame.add(lblNote3);
        frame.add(tfNote3);
        frame.add(btnCalculer);
        frame.add(lblMoyenne);

        btnCalculer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nom = tfNom.getText();
                String prenom = tfPrenom.getText();
                int note1 = Integer.parseInt(tfNote1.getText());
                int note2 = Integer.parseInt(tfNote2.getText());
                int note3 = Integer.parseInt(tfNote3.getText());

                int moyenne = (note1 + note2 + note3) / 3;

                lblMoyenne.setText("Moyenne de " + nom + " " + prenom + " : " + moyenne);
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SwingMoyenneEleve();
    }
}
