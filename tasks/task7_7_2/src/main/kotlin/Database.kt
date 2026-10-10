// Task 7.7.2: database-handling functions

import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

typealias Database = MutableMap<String,String>

fun createDatabase() = mutableMapOf<String,String>()

fun Database.load(filename: String) {
    // Add code here to read names and numbers from the file
    // and insert them as keys and values into the map

    val lines = Path(filename).forEachLine{ line ->
        val splitLine = line.split(",")
        this[splitLine[0]] = splitLine[1]
    }
}

fun Database.save(filename: String) {
    // Add code here to write the keys and values of the map to
    // the file, separated by a comma, one pairing per line
    Path(filename).writer().use { writer ->
        for ((name, number) in this) {
            writer.write("$name,$number\n")
        }
    }
}
