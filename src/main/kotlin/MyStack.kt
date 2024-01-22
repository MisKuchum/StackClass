class MyStack<T>(
    rawItems: Collection<T> = listOf(),
) {

    // Список элементов стека
    private var items: MutableList<T>

    //Индекс последнего элемента стека
    private var top: Int = -1

    // Инициализирующий блок
    init {
        items = rawItems.toMutableList()
        top = items.size - 1
    }

    // Извлекает последний элемент
    fun pop(): T {
        val res = items[top]
        items.removeAt(top)
        top--
        return res
    }

    // Добавить элемент
    fun push(element: T) {
        items.add(element)
        top++
    }

    // Возвращает последний элемент
    fun peek(): T = items[top]

    // Проверка на пустой стек
    fun isEmpty(): Boolean = items.isEmpty()

    // Переопределение функции toString()
    override fun toString(): String = items.toString()
}