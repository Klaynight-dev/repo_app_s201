# repo_app_s201

Application JavaFX de gestion d'emploi du temps pour des cours de danse.

## Description

Cette application permet de gérer un emploi du temps de cours avec les fonctionnalités suivantes :
- Affichage des cours dans un tableau
- Ajout de nouveaux cours
- Modification des cours existants
- Suppression de cours

## Prérequis

- Java 11 ou supérieur
- JavaFX (inclus avec Java 8, module séparé pour Java 11+)
- Eclipse ou IntelliJ IDEA

## Installation

### 1. Cloner le repository

```bash
git clone https://github.com/Klaynight-dev/repo_app_s201.git
cd repo_app_s201
```

### 2. Configuration dans Eclipse

1. Créer un nouveau projet Java dans Eclipse
2. Copier le contenu du dossier `src/` de ce repository dans le dossier `src/` de votre projet Eclipse
3. Votre structure de projet devrait ressembler à :
   ```
   S201_App/
   ├── src/
   │   ├── module-info.java
   │   ├── controleur/
   │   │   └── Main.java
   │   ├── modele/
   │   │   ├── Admin.java
   │   │   ├── Cours.java
   │   │   ├── Eleve.java
   │   │   ├── EmploiDuTemps.java
   │   │   ├── Membre.java
   │   │   ├── Professeur.java
   │   │   └── Salle.java
   │   ├── resources/
   │   │   ├── edit.fxml
   │   │   ├── main_SAE_201.fxml
   │   │   └── new.fxml
   │   └── vue/
   │       ├── CtrlModifCours.java
   │       ├── CtrlNewCours.java
   │       ├── CtrlSelectionCours.java
   │       ├── FenModifCours.java
   │       ├── FenNewCours.java
   │       └── FenSelectionCours.java
   ```

### 3. Configuration dans IntelliJ IDEA

1. Créer un nouveau projet Java dans IntelliJ IDEA
2. Copier le contenu du dossier `src/` de ce repository dans le dossier `src/` de votre projet IntelliJ
3. La structure sera identique à celle d'Eclipse

### 4. Configuration JavaFX

#### Pour Java 11+ :
1. Télécharger JavaFX SDK depuis [OpenJFX](https://openjfx.io/)
2. Ajouter les modules JavaFX au classpath de votre projet
3. Ajouter les arguments VM suivants :
   ```
   --module-path /chemin/vers/javafx/lib --add-modules javafx.controls,javafx.fxml
   ```

#### Pour Eclipse :
- Aller dans Properties → Java Build Path → Libraries
- Ajouter External JARs et sélectionner les JARs JavaFX

#### Pour IntelliJ :
- Aller dans File → Project Structure → Libraries
- Ajouter les JARs JavaFX

## Exécution

1. Compiler le projet
2. Exécuter la classe principale : [`controleur.Main`](src/controleur/Main.java)

## Structure du projet

- **controleur/** : Contient la classe principale et la logique de contrôle
- **modele/** : Classes métier (Cours, Professeur, Salle, etc.)
- **vue/** : Interfaces utilisateur (fenêtres et contrôleurs FXML)
- **resources/** : Fichiers FXML pour l'interface graphique

## Fonctionnalités

- **Fenêtre principale** : Affichage de la liste des cours
- **Ajouter un cours** : Formulaire de création d'un nouveau cours
- **Modifier un cours** : Formulaire de modification d'un cours existant
- **Supprimer un cours** : Suppression avec confirmation

## Technologies utilisées

- Java
- JavaFX
- FXML pour les interfaces
- Architecture MVC (Modèle-Vue-Contrôleur)