##  Stacks and Queues
> A stack is a data structure that consists of Nodes. Each Node references the next Node in the stack,
but does not reference its previous.
* FILO First In Last Out
* LIFO Last In First Out
> Queues:
* FIFO First In First Out
* LILO Last In Last Out

> Challenge
Using a Linked List as the underlying data storage mechanism, implement both a Stack and a Queue

> Approach & Efficiency

* bigO space:o(1) time :o(1)


> Create a Stack class that has a top property. It creates an empty Stack when instantiated. This object should be aware of a default empty value assigned to top when the stack is created. The class should contain the following methods:

>>> API

* push Arguments: value adds a new node with that value to the top of the stack with an O(1) Time performance.

* pop Arguments: none Returns: the value from node from the top of the stack - Removes the node from the top of the stack Should raise exception when called on empty stack

* peek Arguments: none Returns: Value of the node located at the top of the stack Should raise exception when called on empty stack

* is empty Arguments: none Returns: Boolean indicating whether or not the stack is empty


* Create a Queue class that has a front property. It creates an empty Queue when instantiated. This object should be aware of a default empty value assigned to front when the queue is created. The class should contain the following methods:

* enqueue Arguments: value adds a new node with that value to the back of the queue with an O(1) Time performance.

* dequeue Arguments: none Returns: the value from node from the front of the queue Removes the node from the front of the queue Should raise exception when called on empty queue

* peek Arguments: none Returns: Value of the node located at the front of the queue Should raise exception when called on empty stack

* is empty Arguments: none Returns: Boolean indicating whether or not the queue is empty







>  