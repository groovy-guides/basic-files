import java.nio.file.Path
import java.nio.file.Paths

Path f = Paths.get('resources/upload.csv')

f.splitEachLine (/,/) {
    println "${it[0]} is out walking their pet ${it[1]}"
}
