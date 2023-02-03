## Question 5 (SQL)

Étant donné les tables suivantes,

```
Person table:
+---------------+----------+-----------+
| personId (PK) | lastName | firstName |
+---------------+----------+-----------+
| 1             | Wang     | Allen     |
| 2             | Alice    | Bob       |
+---------------+----------+-----------+

Address table:
+----------------+---------------+---------------+------------+
| addressId (PK) | personId (FK) | city          | state      |
+----------------+---------------+---------------+------------+
| 1              | 2             | New York City | New York   |
| 2              | 3             | Leetcode      | California |
+----------------+---------------+---------------+------------+
```

### A.

Écrivez la requête SQL qui permet de sortir les données suivante:

```
+-----------+----------+---------------+----------+
| firstName | lastName | city          | state    |
+-----------+----------+---------------+----------+
| Allen     | Wang     | Null          | Null     |
| Bob       | Alice    | New York City | New York |
+-----------+----------+---------------+----------+
```


## Après le test

Quand vous avez fini de répondre aux questions précédentes, commitez vos modifications en utilisant un message de commit significatif.

Votre test sera review plus tard sur une Pull Request
