// Task 7.7.2: phone book simulator

const val CSV_FILENAME = "phone.csv"

fun main() {
    // Implement the main program here
    // (You can add other functions to this file if you wish)
    val db = createDatabase()
    db.load(CSV_FILENAME)

    while (true){
        println("Enter a name (or 'exit' to quit):")
        val name = readln()

        if (name in db){
            println("The number is: ${db[name]}")
        } else{
            println("Name not found. Enter a number to add:")
            val number = readln()
            db[name] = number
            db.save(CSV_FILENAME)
        }
        
    }
}
