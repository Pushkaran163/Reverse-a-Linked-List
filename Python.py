class Node:
    def __init__(self, x):
        self.data = x
        self.next = None
    
def reverse_list(head):
    stack = []
    
    temp = head
    
    while temp.next is not None:
        stack.append(temp)
        temp = temp.next
    
    head = temp
    
    while stack:
        temp.next = stack.pop()
        temp = temp.next
        
    temp.next = None
    
    return head

def print_list(node):
    while(node is not None):
        print(f"{node.data} -> ", end="")
        node = node.next
    print()
    

head = Node(1)
head.next = Node(2)
head.next.next = Node(3)
head.next.next.next = Node(4)
head.next.next.next.next = Node(5)
head.next.next.next.next.next = Node(6)
head.next.next.next.next.next.next = Node(7)
head.next.next.next.next.next.next.next = Node(8)
head.next.next.next.next.next.next.next.next = Node(9)
head.next.next.next.next.next.next.next.next.next = Node(10)

print("Original List: ", end="")
print_list(head)

head = reverse_list(head)

print("Reversed List: ",end="")
print_list(head)