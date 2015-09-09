import java.nio.file.Path
import java.nio.file.Paths

Path f = Paths.get('resources/logic.txt')

def output = f.filterLine {
    it != ''
}

println output
