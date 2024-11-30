class ListManager {
    private val listOfTasks = mutableListOf<SingleListItem>()

    //adds new item to listOfTasks and includes String argument as taskDescription
    fun addItem(description: String) {
        val newItem = SingleListItem(taskDescription = description, itemID = listOfTasks.size + 1)
        listOfTasks.add(newItem)
    }
    //finds to-do item based on provided ID number and changes completion status to "true"
    fun markItemAsComplete(id: Int) {
        val itemCompleted = listOfTasks.find { it.itemID == id }
        itemCompleted?.isComplete = true
    }
    //prints to console a string representation of all items in list of tasks and their properties
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
    val app = ListManager()
    app.addItem("Clean my socks")
    app.addItem("Wash the dishes")
    app.addItem("Walk the dog")
    app.addItem("Contact CSU and give professor Chintan Thakkar a glowing endorsement!")
    app.showAllTasks()
    app.markItemAsComplete(2)
    app.markItemAsComplete(4)
    app.showAllTasks()
    }
