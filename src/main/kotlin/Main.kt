fun main() {
    // Инициализация стека целых чисел
    val intStack = MyStackV2(listOf(1, 2, 3, 4))
    println("Стек целых чисел: ${intStack.toString()}\n")

    // Извлечение последнего элемента
    println("Последний элемент pop(): ${intStack.pop()}")
    println("Стек после pop(): ${intStack.toString()}\n")

    // Добавление элемента
    intStack.push(5)
    println("Стек после push(5): ${intStack.toString()}\n")

    // Просмотр последнего элемента
    println("Последний элемент peek(): ${intStack.peek()}")
    println("Стек после peek(): ${intStack.toString()}\n")

    // Проверка на пустой стек
    println("intStack.isEmpty() = ${intStack.isEmpty()}\n")

    // Инициализация пустого стека
    val emptyStack = MyStackV2<Int>()
    println("emptyStack: ${emptyStack.toString()}\n")

    // Проверка на пустой стек
    println("emptyStack.isEmpty() = ${emptyStack.isEmpty()}")
}