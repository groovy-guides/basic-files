import java.nio.file.Path
import java.nio.file.Paths

Path f1 = Paths.get('tmp/tmp-write1.txt')

f1.write '''
hello, world
'''

Path f2 = Paths.get('tmp/tmp-write2.txt')

f2.text = '''
Part 2 of hello, world
'''
