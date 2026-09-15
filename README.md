<div id="top">

<!-- HEADER STYLE: MODERN -->
<div align="left" style="position: relative; width: 100%; height: 100%; ">

<img src="readmeai/assets/logos/purple.svg" width="30%" style="position: absolute; top: 0; right: 0;" alt="Project Logo"/>

# MOTUSGAME

<em><em>

<!-- BADGES -->
<img src="https://img.shields.io/github/license/LTherage/MotusGame?style=for-the-badge&logo=opensourceinitiative&logoColor=white&color=ff4500" alt="license">
<img src="https://img.shields.io/github/last-commit/LTherage/MotusGame?style=for-the-badge&logo=git&logoColor=white&color=ff4500" alt="last-commit">
<img src="https://img.shields.io/github/languages/top/LTherage/MotusGame?style=for-the-badge&color=ff4500" alt="repo-top-language">
<img src="https://img.shields.io/github/languages/count/LTherage/MotusGame?style=for-the-badge&color=ff4500" alt="repo-language-count">

<em>Built with the tools and technologies:</em>

- Java
- PlantUML
- IntelliJ IDEA / Java SE project structure

</div>
</div>
<br clear="right">

---

## 📖 Table of Contents

<details>
<summary>Table of Contents</summary>

- [📖 Table of Contents](#-table-of-contents)
- [🎉 Overview](#-overview)
- [🦄 Features](#-features)
- [🎨 Project Structure](#-project-structure)
    - [📚 Project Index](#-project-index)
- [🚀 Getting Started](#-getting-started)
    - [📝 Prerequisites](#-prerequisites)
    - [🛠️ Installation](#-installation)
    - [🤖 Usage](#-usage)
    - [🧪 Testing](#-testing)
- [✨ Roadmap](#-roadmap)
- [🤗 Contributing](#-contributing)
- [📃 License](#-license)
- [👏 Acknowledgments](#-acknowledgments)

</details>

---

## 🎉 Overview

MotusGame is a Java implementation of the classic Motus word-guessing game. The project models the main game loop, word validation, players, attempts, and feedback mechanisms based on letters that are correctly placed or misplaced.

The codebase is organized around a core `Motus` package and several utility classes for input, random generation, ANSI-colored output, and dictionary management. It also includes PlantUML diagrams that document the design of the classes used in this object-oriented project.

---

## 🦄 Features

- Classic word-guessing gameplay with a hidden target word and limited attempts
- Pattern-based feedback using the `!` motif to represent unknown or not-yet-found letters
- Support for both human and computer players
- Random word selection from a French lexicon manager
- Console-based interaction and colored output for gameplay feedback
- Class design documented with UML diagrams in the `plantuml` folder

---

## 🎨 Project Structure

```sh
└── MotusGame/
    ├── plantuml/
    │   ├── Motus.puml
    │   ├── Partie.puml
    │   ├── Tentative.puml
    │   ├── diagramme_classe_fiche_3_exercice_1_etudiant.puml
    │   ├── diagramme_classe_fiche_3_exercice_2_etudiant.puml
    │   └── plantuml.jar
    ├── src/
    │   └── Motus/
    │       ├── GestionnaireMots.java
    │       ├── LexiqueMotus.java
    │       ├── Motus.java
    │       ├── Partie.java
    │       ├── Tentative.java
    │       ├── joueurs/
    │       │   ├── Joueur.java
    │       │   ├── JoueurHumain.java
    │       │   ├── JoueurOrdinateur.java
    │       │   └── UtilJoueurs.java
    │       └── util/
    │           ├── LexiqueFr.java
    │           ├── UtilAffichage.java
    │           ├── UtilAleatoire.java
    │           └── UtilSaisies.java
    ├── .gitignore
    ├── .idea/
    ├── projet_COO_2024.iml
    └── README.md
```

### 📚 Project Index

<details open>
    <summary><b><code>MOTUSGAME/</code></b></summary>
    <details>
        <summary><b>plantuml</b></summary>
        <blockquote>
            <div class='directory-path' style='padding: 8px 0; color: #666;'>
                <code><b>⦿ plantuml</b></code>
            <table style='width: 100%; border-collapse: collapse;'>
            <thead>
                <tr style='background-color: #f8f9fa;'>
                    <th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
                    <th style='text-align: left; padding: 8px;'>Summary</th>
                </tr>
            </thead>
                <tr style='border-bottom: 1px solid #eee;'>
                    <td style='padding: 8px;'><b><a href='https://github.com/LTherage/MotusGame/blob/master/plantuml/diagramme_classe_fiche_3_exercice_2_etudiant.puml'>diagramme_classe_fiche_3_exercice_2_etudiant.puml</a></b></td>
                    <td style='padding: 8px;'><code>❯ Class diagram for the second OOP exercise and game structure.</code></td>
                </tr>
                <tr style='border-bottom: 1px solid #eee;'>
                    <td style='padding: 8px;'><b><a href='https://github.com/LTherage/MotusGame/blob/master/plantuml/Partie.puml'>Partie.puml</a></b></td>
                    <td style='padding: 8px;'><code>❯ UML model of the game session and turn management.</code></td>
                </tr>
                <tr style='border-bottom: 1px solid #eee;'>
                    <td style='padding: 8px;'><b><a href='https://github.com/LTherage/MotusGame/blob/master/plantuml/Tentative.puml'>Tentative.puml</a></b></td>
                    <td style='padding: 8px;'><code>❯ UML model for a player's proposed word and feedback.</code></td>
                </tr>
                <tr style='border-bottom: 1px solid #eee;'>
                    <td style='padding: 8px;'><b><a href='https://github.com/LTherage/MotusGame/blob/master/plantuml/Motus.puml'>Motus.puml</a></b></td>
                    <td style='padding: 8px;'><code>❯ Main UML diagram for the Motus application entry point.</code></td>
                </tr>
                <tr style='border-bottom: 1px solid #eee;'>
                    <td style='padding: 8px;'><b><a href='https://github.com/LTherage/MotusGame/blob/master/plantuml/diagramme_classe_fiche_3_exercice_1_etudiant.puml'>diagramme_classe_fiche_3_exercice_1_etudiant.puml</a></b></td>
                    <td style='padding: 8px;'><code>❯ Class diagram for the first assignment and early game model.</code></td>
                </tr>
            </table>
        </blockquote>
    </details>
    <details>
        <summary><b>src</b></summary>
        <blockquote>
            <div class='directory-path' style='padding: 8px 0; color: #666;'>
                <code><b>⦿ src</b></code>
            <details>
                <summary><b>Motus</b></summary>
                <blockquote>
                    <div class='directory-path' style='padding: 8px 0; color: #666;'>
                        <code><b>⦿ src.Motus</b></code>
                    <table style='width: 100%; border-collapse: collapse;'>
                    <thead>
                        <tr style='background-color: #f8f9fa;'>
                            <th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
                            <th style='text-align: left; padding: 8px;'>Summary</th>
                        </tr>
                    </thead>
                        <tr style='border-bottom: 1px solid #eee;'>
                            <td style='padding: 8px;'><b><a href='https://github.com/LTherage/MotusGame/blob/master/src/Motus/LexiqueMotus.java'>LexiqueMotus.java</a></b></td>
                            <td style='padding: 8px;'><code>❯ French dictionary manager used to validate and randomly pick words.</code></td>
                        </tr>
                        <tr style='border-bottom: 1px solid #eee;'>
                            <td style='padding: 8px;'><b><a href='https://github.com/LTherage/MotusGame/blob/master/src/Motus/Partie.java'>Partie.java</a></b></td>
                            <td style='padding: 8px;'><code>❯ Main game session, turn order, and end-of-game logic.</code></td>
                        </tr>
                        <tr style='border-bottom: 1px solid #eee;'>
                            <td style='padding: 8px;'><b><a href='https://github.com/LTherage/MotusGame/blob/master/src/Motus/Tentative.java'>Tentative.java</a></b></td>
                            <td style='padding: 8px;'><code>❯ One guess attempt, including correct and misplaced letters.</code></td>
                        </tr>
                        <tr style='border-bottom: 1px solid #eee;'>
                            <td style='padding: 8px;'><b><a href='https://github.com/LTherage/MotusGame/blob/master/src/Motus/GestionnaireMots.java'>GestionnaireMots.java</a></b></td>
                            <td style='padding: 8px;'><code>❯ Word-management contract and motif utilities for pattern matching.</code></td>
                        </tr>
                        <tr style='border-bottom: 1px solid #eee;'>
                            <td style='padding: 8px;'><b><a href='https://github.com/LTherage/MotusGame/blob/master/src/Motus/Motus.java'>Motus.java</a></b></td>
                            <td style='padding: 8px;'><code>❯ Application entry point for launching the game.</code></td>
                        </tr>
                    </table>
                    <details>
                        <summary><b>joueurs</b></summary>
                        <blockquote>
                            <div class='directory-path' style='padding: 8px 0; color: #666;'>
                                <code><b>⦿ src.Motus.joueurs</b></code>
                            <table style='width: 100%; border-collapse: collapse;'>
                            <thead>
                                <tr style='background-color: #f8f9fa;'>
                                    <th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
                                    <th style='text-align: left; padding: 8px;'>Summary</th>
                                </tr>
                            </thead>
                                <tr style='border-bottom: 1px solid #eee;'>
                                    <td style='padding: 8px;'><b><a href='https://github.com/LTherage/MotusGame/blob/master/src/Motus/joueurs/JoueurHumain.java'>JoueurHumain.java</a></b></td>
                                    <td style='padding: 8px;'><code>❯ Human player implementation using console input.</code></td>
                                </tr>
                                <tr style='border-bottom: 1px solid #eee;'>
                                    <td style='padding: 8px;'><b><a href='https://github.com/LTherage/MotusGame/blob/master/src/Motus/joueurs/JoueurOrdinateur.java'>JoueurOrdinateur.java</a></b></td>
                                    <td style='padding: 8px;'><code>❯ Computer player selecting candidate words from the current motif.</code></td>
                                </tr>
                                <tr style='border-bottom: 1px solid #eee;'>
                                    <td style='padding: 8px;'><b><a href='https://github.com/LTherage/MotusGame/blob/master/src/Motus/joueurs/UtilJoueurs.java'>UtilJoueurs.java</a></b></td>
                                    <td style='padding: 8px;'><code>❯ Helper for creating and configuring player lists.</code></td>
                                </tr>
                                <tr style='border-bottom: 1px solid #eee;'>
                                    <td style='padding: 8px;'><b><a href='https://github.com/LTherage/MotusGame/blob/master/src/Motus/joueurs/Joueur.java'>Joueur.java</a></b></td>
                                    <td style='padding: 8px;'><code>❯ Abstract player class with score and solved-word counters.</code></td>
                                </tr>
                            </table>
                        </blockquote>
                    </details>
                    <details>
                        <summary><b>util</b></summary>
                        <blockquote>
                            <div class='directory-path' style='padding: 8px 0; color: #666;'>
                                <code><b>⦿ src.Motus.util</b></code>
                            <table style='width: 100%; border-collapse: collapse;'>
                            <thead>
                                <tr style='background-color: #f8f9fa;'>
                                    <th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
                                    <th style='text-align: left; padding: 8px;'>Summary</th>
                                </tr>
                            </thead>
                                <tr style='border-bottom: 1px solid #eee;'>
                                    <td style='padding: 8px;'><b><a href='https://github.com/LTherage/MotusGame/blob/master/src/Motus/util/UtilAleatoire.java'>UtilAleatoire.java</a></b></td>
                                    <td style='padding: 8px;'><code>❯ Random integer generator used in word selection.</code></td>
                                </tr>
                                <tr style='border-bottom: 1px solid #eee;'>
                                    <td style='padding: 8px;'><b><a href='https://github.com/LTherage/MotusGame/blob/master/src/Motus/util/UtilAffichage.java'>UtilAffichage.java</a></b></td>
                                    <td style='padding: 8px;'><code>❯ ANSI-color console output for game messages and feedback.</code></td>
                                </tr>
                                <tr style='border-bottom: 1px solid #eee;'>
                                    <td style='padding: 8px;'><b><a href='https://github.com/LTherage/MotusGame/blob/master/src/Motus/util/UtilSaisies.java'>UtilSaisies.java</a></b></td>
                                    <td style='padding: 8px;'><code>❯ Input helpers for reading text, integers, and yes/no answers.</code></td>
                                </tr>
                                <tr style='border-bottom: 1px solid #eee;'>
                                    <td style='padding: 8px;'><b><a href='https://github.com/LTherage/MotusGame/blob/master/src/Motus/util/LexiqueFr.java'>LexiqueFr.java</a></b></td>
                                    <td style='padding: 8px;'><code>❯ Base French lexicon abstraction defining word-size bounds.</code></td>
                                </tr>
                            </table>
                        </blockquote>
                    </details>
                </blockquote>
            </details>
        </blockquote>
    </details>
</details>

---

## 🚀 Getting Started

### 📝 Prerequisites

This project requires the following dependencies:

- Java JDK 17 or later
- A terminal or IDE with Java support (IntelliJ IDEA, VS Code, or plain javac)
- Optional: PlantUML for rendering the diagram files in `plantuml/`

### 🛠️ Installation

Clone the repository and build the Java sources from the project root:

```sh
❯ git clone https://github.com/LTherage/MotusGame
❯ cd MotusGame
❯ mkdir -p out
❯ find src -name '*.java' -print0 | xargs -0 javac -d out
```

### 🤖 Usage

Run the game entry point from the compiled output folder:

```sh
❯ java -cp out Motus.Motus
```

### 🧪 Testing

This repository does not yet include a dedicated automated test framework. The current validation step is to compile the Java sources:

```sh
❯ find src -name '*.java' -print0 | xargs -0 javac -d out
```

---

## ✨ Roadmap

- [X] **`Core model`**: Define the Motus game objects and relationships.
- [X] **`Player logic`**: Implement human and computer player abstractions.
- [X] **`Pattern utilities`**: Add letter-position and misplaced-letter computations.
- [ ] **`Complete gameplay loop`**: Finish the full game flow in `Motus.java` and `Partie.java`.
- [ ] **`Real dictionary`**: Integrate a complete French lexicon and validation layer.
- [ ] **`Automated tests`**: Add a Java test suite for gameplay and utilities.

---

## 🤗 Contributing

- **💬 [Join the Discussions](https://github.com/LTherage/MotusGame/discussions)**: Share your insights, provide feedback, or ask questions.
- **🐛 [Report Issues](https://github.com/LTherage/MotusGame/issues)**: Submit bugs found or log feature requests for the `MotusGame` project.
- **💡 [Submit Pull Requests](https://github.com/LTherage/MotusGame/blob/main/CONTRIBUTING.md)**: Review open PRs, and submit your own PRs.

<details closed>
<summary>Contributing Guidelines</summary>

1. **Fork the Repository**: Start by forking the project repository to your GitHub account.
2. **Clone Locally**: Clone the forked repository to your local machine using a Git client.
   ```sh
   git clone https://github.com/LTherage/MotusGame
   ```
3. **Create a New Branch**: Always work on a new branch, giving it a descriptive name.
   ```sh
   git checkout -b new-feature-x
   ```
4. **Make Your Changes**: Develop and test your changes locally.
5. **Commit Your Changes**: Commit with a clear message describing your updates.
   ```sh
   git commit -m 'Implemented new feature x.'
   ```
6. **Push to GitHub**: Push the changes to your forked repository.
   ```sh
   git push origin new-feature-x
   ```
7. **Submit a Pull Request**: Create a PR against the original project repository. Clearly describe the changes and their motivations.
8. **Review**: Once your PR is reviewed and approved, it will be merged into the main branch.
</details>

<details closed>
<summary>Contributor Graph</summary>
<br>
<p align="left">
    <a href="https://github.com/LTherage/MotusGame/graphs/contributors">
       <img src="https://contrib.rocks/image?repo=LTherage/MotusGame">
    </a>
</p>
</details>

---

## 📃 License

This repository does not currently include a dedicated `LICENSE` file. The project is structured as a university-oriented Java OOP exercise and should be used with the project owner's licensing terms in mind.

---

## 👏 Acknowledgments

- Built as an educational object-oriented programming project around the Motus word game
- Inspired by classic letter-guessing games and French dictionary-based gameplay
- UML diagrams generated with PlantUML to document the class structure

<div align="right">

[![][back-to-top]](#top)

</div>

[back-to-top]: https://img.shields.io/badge/-BACK_TO_TOP-151515?style=flat-square

---
