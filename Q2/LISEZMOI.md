#Question 2 (Code propre et patrons de conception)

### A

Expliquez comment cette fonction respecte le Open-Closed Principle

```
public double Area(Shape[] shapes) {
    double area = 0;
    foreach (var shape in shapes)
    {
        area += shape.Area();
    }

    return area;
}

```

Pour ajouter d'autres formes à la fonction, nous n'avons pas besoin de modifier cette dernière. Elle est donc très ouverte à l'extension.
La fonction accepte seulement les formes, elle est donc fermée aux modifications.



## B

Réécrivez le code de la classe _ResponseBodyWriter_ afin de respecter les bonnes pratiques. Aussi, introduisez les patrons de conception (_Design Patterns_) que vous jugez nécessaire. La signature de la méthode _write()_ doit rester identique étant donné qu'elle est fournie par le _framework_. 

Veuillez réécrire le code directement dans le fichier `ResponseBodyWriter.java`.