package  com.macrosoft.myfxecole;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MoyenneEleve extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Créer la fenêtre
        primaryStage.setTitle("Calcul de moyenne des élèves");
        Scene scene = new Scene(new VBox(), 300, 250);
        primaryStage.setScene(scene);

        // Créer les composants
        Label labelMat = new Label("Maths");
        Label labelFrancais = new Label("Français");
        Label labelPhysique = new Label("Physique");
        Label labelAnglais = new Label("Anglais");
        TextField tfMat = new TextField();
        TextField tfFrancais = new TextField();
        TextField tfPhysique = new TextField();
        TextField tfAnglais = new TextField();
        Button btnCalculer = new Button("Calculer");

        // Ajouter les composants au layout
        VBox vbox = (VBox) scene.getRoot();
        vbox.getChildren().addAll(labelMat, tfMat, labelFrancais, tfFrancais, labelPhysique, tfPhysique, labelAnglais, tfAnglais, btnCalculer);

        // Ajouter un listener à bouton
        btnCalculer.setOnAction(e -> {

            // Récupérer les notes
            int noteMat = Integer.parseInt(tfMat.getText());
            int noteFrancais = Integer.parseInt(tfFrancais.getText());
            int notePhysique = Integer.parseInt(tfPhysique.getText());
            int noteAnglais = Integer.parseInt(tfAnglais.getText());

            // Calculer la moyenne
            float moyenne = (noteMat + noteFrancais + notePhysique + noteAnglais) / 4;

            // Afficher la moyenne
            Label labelMoyenne = new Label("Moyenne : " + moyenne);
            vbox.getChildren().add(labelMoyenne);
        });

        // Afficher la fenêtre
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
