# Algorithms EPAMX

EPAM Mexico Algorithms study group.

### How it works

* We have defined a learning path combining some books (listed at the bottom) to follow.
* Every Monday, a problem will be presented, according to the next topic listed in the learning path.
* A volunteer will be the owner of the topic, and will be responsible of defining the problem and the theoretical background.
* Developers will have the whole week to study the topic and to solve the problem with the most optimal solution.
* As a Developer, you should create your own branch from master repository `$ git checkout -b <my-branch-name>`
* Use your branch to commit your solutions, in the format/language you prefer.
* Next week, the topic owner will present the most optimal solution and the link between problem and theory.
* Any of the participants can present better/innovative solution, but as requisite it needs to be pushed into participant branch.
* An assigned moderator per week will help to have smooth conversation and topic discussions.
* After this, a new set topic will be presented according to the learning path.

### Setting up the problems and updating the branch

Each topic will have the following convention: `##_<Topic>`, having ## = topic number. 

Example: `00_Big0` for Big(O) Notation.

Inside the topic folder, on master branch the following files will be placed:

* A markdown file (.md) containing the problem instructions, called README.md.
* A set of .in and .out files, containing sample test cases (optional).
* A markdown file containing some of the theoretical background (optional).

To update the branch, with the new problems, use: `$ git rebase -p origin/master`

### Programming Languages

Participants are free to use the programming language they want.

### Learning Path

|  # | topic | date | owner | moderator |
|----|-------|------|-------|-----------|
| 00 | Big(O) Notation | Nov 22 | Christian Velázquez | Francisco Jauregui |
| 01 | Arrays | Nov 29 | Francisco Jauregui | Emmanuel García |
| 02 | HashTables | Dic 06 | Emmanuel García | Ernesto Espinosa |
| 03 | Resizable Arrays | Dic 13 | Ernesto Espinosa | Sinuhé Jaime |

### References

* Thomas Cormen - Introduction to Algorithms - [https://goo.gl/3dyovL]
* Gayle Laakman - Cracking the Coding Interview - [https://goo.gl/v2sk1o]

### Contact

* Christian [https://github.com/chris-mx]
* Sier      [https://github.com/sierisimo]
* Erneshto  [https://github.com/enchf]
* Paco      [https://github.com/jaureguif]
