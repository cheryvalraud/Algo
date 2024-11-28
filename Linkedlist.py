
class Node:
    def __init__(self,val):
        self.val = val
        self.next = None
        
        
a = Node(4)
b = Node(7)
c = Node(8)
d = Node(78)


a.next = b
b.next = c
c.next = d

current =  a

while current is not None:
    if current.next is None:
        print(current.val)
    else:
      print(current.val, end=" -> ")
    current = current.next
    
    
    
    
    
