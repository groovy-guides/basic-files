import java.nio.file.Path
import java.nio.file.Paths

Path f = Paths.get('resources/upload.csv')

f.withReader {
    for (line in it.lines()) {
        println line
    }
}
