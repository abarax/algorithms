class node(object):
    pass

class linked_list:

    size = 0

    def append(self, node):
        if self.size == 0:
            self.head, self.tail = node, node
        else:
            self.tail.next = node

        self.size = self.size + 1

l = linked_list()

n = node()
n.data = 'test'

l.append(n)

m = node()

m.data = 'test-next'

l.append(m)


print l


def reverse (previous, current)
    if current.next == nil
        current.next = previous

    reverse(current, current.next)

    current.next = previous


reverse(nil, head)
        
