// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(document: String, textToHide: String, redactChar: Char = 'X'):String{
    val length = textToHide.length
    val redactString = redactChar.toString().repeat(length)

    if (length == 0) {
        return document
    }

    return document.replace(textToHide, redactString)
}