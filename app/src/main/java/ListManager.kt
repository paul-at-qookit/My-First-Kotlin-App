class ListManager {
    private val listOfTasks = mutableListOf<SingleListItem>()

    fun addItem(description: String) {
        val newItem = SingleListItem(taskDescription = description, itemID = listOfTasks.size + 1)
        listOfTasks.add(newItem)
    }

    fun markItemAsComplete(id: Int) {
        val itemCompleted = listOfTasks.find { it.itemID == id }
        itemCompleted?.isComplete = true
    }

    fun showAllTasks() {
        listOfTasks.forEach { println(it) }
    }
}

data class SingleListItem(
    var isComplete: Boolean = false,
    val itemID: Int = 0,
    var taskDescription: String
)

    fun main () {



    }
}