import java.nio.file.Path
import java.nio.file.Paths

def shoppingList = [
        'bread',
        'milk',
        'chocolate',
]

Path f = Paths.get('tmp/tmp-shoppinglist.txt')

f.write 'My shopping list\n'

for (item in shoppingList) {
    f << " - $item\n"
}

println f.text
