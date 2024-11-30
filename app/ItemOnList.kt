class MyToDoApp {
    private val listOfTasks = mutableListOf<SingleListItem>()

    fun addItem(description: String){
        val newItem = SingleListItem(taskDescription = description, itemID = listOfTasts.size + 1)
    }

sdfadf


f23f32...,.s

    data class SingleListItem(
        var isCompleted: boolean = false,
        val itemID: Int=0,
        var taskDescription: String
    )

    fun main () {

    }

}