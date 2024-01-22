class MyStack<T>(
    rawItems: Collection<T> = listOf(),
) {
    // Список элементов стека
    private var items: MutableList<T> = rawItems.toMutableList()

    // Извлекает последний элемент
    fun pop(): T? {
        val res = items.lastOrNull() ?: return null
        items.removeAt(items.size - 1)
        return res
    }

    // Добавить элемент
    fun push(element: T) {
        items.add(element)
    }

    // Возвращает последний элемент
    fun peek(): T? = items.lastOrNull()

    // Проверка на пустой стек
    fun isEmpty(): Boolean = items.isEmpty()

    // Переопределение функции toString()
    override fun toString(): String = items.toString()
}