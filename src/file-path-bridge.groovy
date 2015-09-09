import java.nio.file.Path

File f = new File('resources/logic.txt')
Path p = f.toPath()
println p.text
