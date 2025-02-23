```groovy
def myMethod(List<String> list) {
    list.eachWithIndex { item, index ->
        if (item == "someValue") {
            // The index might be outside of list bounds here!
            println list[index + 1] // Potential IndexOutOfBoundsException
        }
    }
}

myMethod(["someValue", "anotherValue", "yetAnother"])
```