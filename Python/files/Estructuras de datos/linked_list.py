class Node:
    def __init__(self, value) -> None:
        self.value = value
        self.next = None

    def __str__(self) -> str:
        return str(self.value)


class LinkedList:
    def __init__(self) -> None:
        self.first = None
        self.size = 0

    def Append(self, value):
        my_node = Node(value)

        if self.size == 0:
            self.first = my_node
        else:
            current = self.first
            while current.next != None:
                current = current.next
            current.next = my_node

        self.size += 1
        return my_node

    def Remove(self, value):
        if self.size == 0:
            return False

        current = self.first
        try:
            while current.next.value != value:
                if current.next == None:
                    return False
                current = current.next
            delete_node = current.next
            current.next = delete_node.next

        except AttributeError:
            return False

        self.size -= 1
        return delete_node

    def __len__(self):
        return self.size

    def __str__(self) -> str:
        string = '['
        current = self.first
        for elment in range(len(self)):
            string += str(current)
            if elment != len(self) - 1:
                string += str(', ')
            current = current.next
        string += ']'
        return string


my_list = LinkedList()
my_list.Append(1)
my_list.Append(4)
my_list.Append(5)
my_list.Append(8)
my_list.Append(10)

print(my_list)

my_list.Remove(4)
print(my_list)
