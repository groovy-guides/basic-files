/*
 * @Grab('org.apache.tika:tika-core:1.10')
 * @Grab('org.apache.tika:tika-parsers:1.10')
 */

import org.apache.tika.Tika
import org.apache.tika.metadata.Metadata

import java.nio.file.Path
import java.nio.file.Paths

Path f = Paths.get('resources/xfile.docx')

Tika tika = new Tika()

Metadata metadata = new Metadata()

Reader r = tika.parse(f.newInputStream(), metadata)

print '''
File metadata:
--------------------
'''

for (name in metadata.names()) {
    println "$name: ${metadata.get(name)}"
}

print """
Plain text content:
--------------------
$r.text
"""
