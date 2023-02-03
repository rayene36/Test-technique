## Question 5 (SQL)

Given the following tables,

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

Write a SQL query that outputs the following data:

```
+-----------+----------+---------------+----------+
| firstName | lastName | city          | state    |
+-----------+----------+---------------+----------+
| Allen     | Wang     | Null          | Null     |
| Bob       | Alice    | New York City | New York |
+-----------+----------+---------------+----------+
```


## After the test

Once all questions are answered, commit your modifications using a significant commit message.

Your test will be reviewed later on a Pull Request.
