
## Build et Run

Ce pom.xml définit les dépendances nécessaires pour exécuter le projet. Il utilise également le plugin JavaFX Maven pour créer un exécutable JAR.

Explication du pom.xml

La section modelVersion définit la version du modèle de projet Maven utilisé.
La section groupId définit le nom du groupe Maven du projet.
La section artifactId définit le nom de l'artefact Maven du projet.
La section version définit la version du projet.
La section dependencies définit les dépendances du projet.
La section build définit les étapes de construction du projet.
Comment utiliser le pom.xml

Pour utiliser le pom.xml, il suffit de créer un projet Maven avec ce pom.xml. Une fois le projet créé, vous pouvez compiler et exécuter le projet en exécutant les commandes suivantes :

```bash


mvn clean javafx:run
```

Une fenêtre s'ouvrira avec quatre champs de texte. Saisissez les notes des élèves dans les quatre matières et cliquez sur le bouton "Calculer". La moyenne des notes sera affichée dans un label.