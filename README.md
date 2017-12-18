## Projet Android Hello World (TD1)

*[Voir sujet TD1](https://github.com/Lion3000/Projet-Android/blob/master/android_td1.pdf)*

### Technologies utilisées (à installer pour démarrer le projet):

* [Java](https://www.java.com/en/)
* [Android Studio](https://developer.android.com/studio/index.html#win-bundle)
* [Kotlin](https://kotlinlang.org/)
* [Git](http://git-scm.com/)

### Structure des projets
```
TD1/
├── A
│   ├── app
│   ├── build.gradle
│   ├── gradle
│   ├── gradle.properties
│   ├── gradlew
│   ├── gradlew.bat
│   └── settings.gradle
├── C
│   ├── app
│   ├── build.gradle
│   ├── gradle
│   ├── gradle.properties
│   ├── gradlew
│   ├── gradlew.bat
│   └── settings.gradle
├── D
│   ├── app
│   ├── build.gradle
│   ├── gradle
│   ├── gradle.properties
│   ├── gradlew
│   ├── gradlew.bat
│   └── settings.gradle
└── E
    ├── app
    ├── build
    ├── build.gradle
    ├── E.iml
    ├── gradle
    ├── gradle.properties
    ├── gradlew
    ├── gradlew.bat
    ├── local.properties
    └── settings.gradle
```

### Démarrage du projet
* Cloner le projet en exécutant la ligne de commandes suivante
```
git clone https://github.com/Lion3000/Projet-Android.git
```
* Ouvrir avec Android Studio le répertoire correspondant à l'exercice ciblé

### Exercices du TP1

#### Exercice A / Création d'applications

L'application se lance bien. Le nom de l'activité est changé à **MyFirstAppE**

![ImageExA](/Screenshots/ExA.png)

#### Exercice C / Exploration de l'arborescence du projet

Le texte est changé et l'image est ajouté et bien placé dans le répertoire des ressources d'images. Le boutons change bien le texte initial.

![ImageExC](/Screenshots/ExC.png)

#### Exercice D / Expérimentation sur le cycle de vie d’une Activity

Les méthodes du cycle de vie sont bien surchargés et des messages correspondants sont affichés.

![ImageExD](/Screenshots/ExD.png)

#### Exercice E / Expérimentation sur la persistence des données

Nous voyons que le NumberPicker est présent avec des valeurs entre 0 et 50.

![ImageExE1](/Screenshots/ExE1.png)

Pour persister la donnée, c'est à dire, pour bien garder la valeur du NumberPicker après avoir passé en mode de paysage, les méthodes *onSaveInstanceState* et *onRestoreInstanceState* ont été utilisés.

![ImageExE2](/Screenshots/ExE2.png)

### Auteurs du Code

* **Alex Zarzitski** 
* **Camélia Zarzitski Benhmida** 

### Auteurs du README

* **El Karmoudi Mohamed** 
* **Ivaylo Dimitrov** 

[Vous trouverez notre projet "Android Hello World (TD1)" ici](https://bitbucket.org/lpsilidseandroid/android-hello-world)
