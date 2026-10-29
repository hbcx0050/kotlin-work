// COMP2850 Portfolio: Week 4
// ToDoList class

import kotlinx.datetime.LocalDate
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

class ToDoList() {
    private val items = mutableListOf<ToDoItem>()

    val size: Int get() = items.size
    val notStarted: Int get() = items.count{it.status == ItemStatus.NotStarted}
    val inProgress: Int get() = items.count{it.status == ItemStatus.InProgress}
    val done: Int get() = items.count{it.status == ItemStatus.Done}
    val overdue:Int get() = items.count{it.isOverdue()}

    constructor(filename: String): this() {
        load(filename)
    }

    fun load(filename: String) {
        val path = Path(filename)
        path.forEachLine { line ->
            val parts = line.split(": ")

            if (parts.size ==3) {
                val date = LocalDate.parse(parts[0])
                val status = ItemStatus.valueOf(parts[1])
                val description = parts[2]
                items.add(ToDoItem(date, status, description))
            }
        }

    }

    fun save(filename: String) {
        Path(filename).writer().use {
            for (item in items) {
                it.write("$item\n")
            }
        }
    }

    fun add(vararg item: ToDoItem) = item.forEach {items.add(it)}

    fun deleteDone(): Boolean {
        return items.removeAll{it.status == ItemStatus.Done}
    }

    fun getItems(status: ItemStatus? = null): List<ToDoItem> {
        if (status == null){
            return items
        }
        return items.filter{it.status == status}
    }

    fun getItemsDueOn(date: LocalDate): List<ToDoItem> {
        return items.filter{it.dueDate == date}
    }
}
