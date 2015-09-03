import java.nio.file.Path
import java.nio.file.Paths

Path f = Paths.get('tmp/tmp-numbers.txt')

f.withWriter { writer ->
    for (i in 1..12) {
        for (j in 1..12) {
            writer << "${i*j}\t"
        }
        writer << '\n'
    }
}

print f.text
