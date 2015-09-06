import java.nio.file.Path
import java.nio.file.Paths

Path f = Paths.get('resources/logic.txt')

//This will print each line of the file prefixed with a line number:
f.eachLine { text, lineNumber ->
    println "$lineNumber\t$text"
}

//This will print the lines in the reverse order:
def lines = f.readLines()
lines.reverse().each {
    println it
}
