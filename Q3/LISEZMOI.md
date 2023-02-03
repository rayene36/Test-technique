## Question 3 (API REST)

Concevez un API REST pour la situation suivante. Soyez certain d'inclure toutes les informations pertinentes (verbe, path, corps de la requête, code de réponse, entête de réponse, corps de réponse). Le tableau est fourni comme exemple. Vous pouvez écrire votre réponse dans un format différent. Pour le contexte de ce test, n'ajoutez pas les spécifications des erreurs possibles. Utilisez du JSON pour le format des requêtes. 
Nous voulons gérer les clients d'une compagnie. Un client possède 2 propriétés de base: nom et email. Les clients sont aussi abonnés à des plans payants. Ils peuvent se désabonner d'un plan. 

Voici les scénarios que nous voulons implémenter: 

* Créer un nouveau client
* Lister un client 
* Désabonner un client d'un plan.

Exemple de grille réponse:

| URL                              | Request Body                              | Response                                           | Response Body                                                         |
|----------------------------------|-------------------------------------------|----------------------------------------------------|-----------------------------------------------------------------------|
|          VERB /path?query        |{...}                                      | 100 FAKE ANSWER Header1: value, Header2: value     | {...}                                                                 |


Réponse:

| URL             | Request Body                                                        | Response                              | Response Body                                               |
|-----------------|---------------------------------------------------------------------|---------------------------------------|-------------------------------------------------------------|
| POST /register  | {nom : "nom", email : "email", password : "password", plan: "plan"} | 201 Created                           | {id : "id", nom : "nom", email : "email", plan: "plan"}     |
| GET /client/:id | Empty                                                               | 200 OK                                | {id : "id", nom : "nom", email : "email",plan: "plan" }     |
| PUT /plans/:id  | {plan: "new_plan" }                                                 | 200 OK Headers : Authorization: token | {id : "id", nom : "nom", email : "email",plan: "new_plan" } |
|                 |                                                                     |                                       |                                                             |
|                 |                                                                     |                                       |                                                             |
|                 |                                                                     |                                       |                                                             |
|                 |                                                                     |                                       |                                                             |
|                 |                                                                     |                                       |                                                             |

