# linked-list

Example of a linked list.

## Run

```bash
task run
```

## Advantages

- Dynamic Size: Linked lists can easily grow and shrink in size during
  execution, as memory allocation is done dynamically. This makes them flexible
  for use cases where the size of the data structure is not known in advance.
- Insertions and Deletions: Insertions and deletions can be performed
  efficiently at any position in the list without the need to shift other
  elements, as in arrays. This makes linked lists suitable for applications
  where frequent insertions and deletions are required.
- Memory Utilization: Linked lists utilize memory efficiently. They only consume
  as much memory as required for storing the data elements, plus a small amount
  of extra memory for storing the pointers.
- No Pre-allocation: Unlike arrays, linked lists do not require pre-allocation
  of memory. Memory is allocated as and when required, reducing the chances of
  memory wastage.
- Ease of Implementation: Linked lists are relatively simple to implement
  compared to other data structures like trees and graphs. The basic operations
  (insertion, deletion, traversal) can be implemented with straightforward logic.

## Disadvantages

- Random Access: Unlike arrays, linked lists do not support constant-time random
  access to elements. Accessing an element at a specific position requires
  traversing the list from the beginning, which can be inefficient for large
  lists.
- Memory Overhead: Linked lists require extra memory for storing
  pointers/references to the next node, leading to higher memory overhead
  compared to arrays, especially for small data types.
- Cache Inefficiency: Traversing a linked list may result in poor cache
  performance, especially in large lists, due to non-contiguous memory
  allocation. This can lead to slower access times compared to arrays, which
  exhibit better cache locality.
- Sequential Access: While insertions and deletions are efficient, sequential
  access to elements in a linked list can be slower compared to arrays due to
  cache inefficiency and the need to follow pointers from one node to another.
- Complexity in Management: Linked lists require extra care in memory
  management, as memory for each node must be dynamically allocated and
  de-allocated. Improper management can lead to memory leaks or dangling
  pointers, causing runtime errors.
