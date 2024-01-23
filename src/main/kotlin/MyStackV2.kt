class MyStackV2<T>(
    initCollection : Collection<T> = listOf()
) {
    init {
        if (initCollection.isNotEmpty()) {
            for (elem in initCollection) {
                this.push(elem)
            }
        }
    }
    class Element<T>(val value: T, var next : Element<T>? = null)

    private var elements : Element<T>? = null

    private var size = 0

    fun push(value : T) {
        var currentElement = elements

        currentElement?.let {
            while (true) {
                currentElement?.next?.let {
                    currentElement = currentElement?.next
                } ?: break
            }
        } ?: let {
            elements = Element<T>(value)
            size++
            return
        }

        currentElement?.next = Element<T>(value)
        size++
    }

    fun pop() : T? {
        var currentElement = elements
        var prevElement = currentElement

        if (this.size == 1) {
            elements = null
            size = 0
            return currentElement?.value
        }

        currentElement?.let {
            while (true) {
                currentElement?.next?.let {
                    prevElement = currentElement
                    currentElement = currentElement?.next
                } ?: break
            }
        } ?: let {
            return null
        }

        prevElement?.next = null
        size--

        return currentElement?.value
    }

    fun peek() : T? {
        var currentElement = elements

        if (size == 1) {
            return elements?.value
        }

        for (i in 1 until size) {
            currentElement = currentElement?.next
        }

        return currentElement?.value
    }

    fun isEmpty(): Boolean = elements == null

    override fun toString(): String {
        var res = mutableListOf<T>()
        var currentElement = elements

        when (size) {
            0 -> return ""
            1 -> elements?.value?.let { res.add(it) }
            else -> let {
                for (i in 0 until size) {
                    currentElement?.value?.let {res.add(it)}
                    currentElement = currentElement?.next
                }
            }
        }

        return res.joinToString(", ")
    }
}