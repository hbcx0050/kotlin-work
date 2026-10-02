// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    val file = Path("test.txt")

    file.writeText("Hello from the first call!\n")
    file.appendText("Hello from the second call!\n")

    val contents = file.readText()
    print(contents)
}
