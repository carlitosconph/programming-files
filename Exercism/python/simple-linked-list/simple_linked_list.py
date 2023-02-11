class Node:
    def __init__(self, value, next):
        self.c_value = value
        self.c_next = next

    def value(self):
        return self.c_value

    def next(self):
        return self.c_next


class LinkedList:
    def __init__(self, values=[]):
        self.c_len = 0
        self.c_head = None

        for value in values:
            self.push(value)

    def __len__(self):
        return self.c_len

    def head(self):
        if self.c_head == None:
            raise EmptyListException("The list is empty.")
        return self.c_head

    def push(self, value):
        new_node = Node(value, self.c_head)
        self.c_len += 1
        self.c_head = new_node

    def pop(self):
        if self.c_head == None:
            raise EmptyListException("The list is empty.")
        removed_node = self.c_head
        self.c_head = self.c_head.c_next
        self.c_len -= 1
        return removed_node.c_value

    def reversed(self):
        values = list(self)
        return LinkedList(values)

    def __iter__(self):
        return LinkedListIterator(self.c_head)

class LinkedListIterator:
    def __init__(self, start):
        self.c_pointer = start
    
    def __next__(self):
        if self.c_pointer == None:
            raise StopIteration
        output_value = self.c_pointer.c_value
        self.c_pointer = self.c_pointer.c_next
        return output_value
    


class EmptyListException(Exception):
    def __init__(self, message):
        self.message = message
