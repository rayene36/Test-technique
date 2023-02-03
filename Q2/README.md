## Question 2 (Clean code and Design patterns)
### A
Explain how this function respects the Open-Closed Principle


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

## B
Rewrite the code of the _ResponseBodyWriter_ class, making sure that it complies to best practices. Also introduce any design pattern you deem appropriate. the only thing that must not change is the signature of write()

Please rewrite the code directly in the `ResponseBodyWriter.java` file. 