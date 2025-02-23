```groovy
def myMethod(List<String> list) {
    list.eachWithIndex { item, index ->
        if (item == "someValue" && index < list.size() - 1) {
            println list[index + 1]
        } else if (item == "someValue") {
            println "Last Element"
        }
    }
}

myMethod(["someValue", "anotherValue", "yetAnother"])
myMethod(["someValue"])
```