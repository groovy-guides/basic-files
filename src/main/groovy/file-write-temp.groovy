import java.nio.file.Files
import java.nio.file.Path

Path f = Files.createTempFile('groovy-tutorial', 'tmp')

f.write '''
hello, world
'''

println "Temp file saved to: $f"
