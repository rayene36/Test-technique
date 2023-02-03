# Question 1 (Injection de dépendances et tests)

## A
Utilisez l'injection de dépendances pour rendre les dépendances de cette classe explicites. 

Répondez directement dans le fichier _FlightService_

## B

Écrivez tous les **tests unitaires automatisés** pour cette méthode (_delayFlight_()). 

Créez un fichier de test dans le dossier _test_ pour répondre à la question.

Je n'ai pas eu le temps d'écrire tous les tests automatisées pour la méthod delayFlight(). Il faudrait d'abord tester le cas si le if est false et que la fonction retourne void, il faudrait aussi tester le cas ou le if est vraie. Dans ce cas, il faudrait tester que les méthodes retournent bien une exception en utilisant des mocks afin de créer les objets). Il faudrait aussi vérifier que toutes les fonctions appelées retournent les bons outputs

### C

Expliquez le cycle du TDD et expliquez ce qui est fait dans chacune des étapes et comment la transition vers l'étape suivante s'effectue.

Avant de d'écrire nos fonctions, nous commencons d'abord par écrire les tests unitaires de la fonction. Cela permet d'identifier les input/ouput. Après, nous écrivons notre fonction et la testons. Si nécéssaire, nous pouvons faire des ajustements aux tests déjà écrits 