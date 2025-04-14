# ADS Assignment 2

## Overview
This Java project implements custom data structures and uses only java.util.Iterator. It includes two physical data structures (`MyArrayList`, `MyLinkedList`) and three logical structures built on top of them (`MyStack`, `MyQueue`, `MyMinHeap`).

## Project Structure
src/Main.java - Contains example usage and testing  
src/MyList.java - Interface for list-like structures  
src/MyArrayList.java - Array-based dynamic list  
src/MyLinkedList.java - Doubly linked list  
src/MyStack.java - LIFO structure using MyArrayList  
src/MyQueue.java - FIFO structure using MyLinkedList  
src/MyMinHeap.java - Binary heap using MyArrayList  

## Project's work
### Classes

#### Main  
Demonstrates how to use `MyStack`, `MyQueue`, and `MyMinHeap`.

You can modify this file to test any of the data structures.

#### MyList  
Defines the interface for basic list operations.

Implemented by both `MyArrayList` and `MyLinkedList`.

#### MyArrayList  
Implements a dynamic array.

Used as the internal structure for `MyStack` and `MyMinHeap`.

Supports insertion, deletion, sorting, and searching.

#### MyLinkedList  
Implements a doubly linked list.

Used internally by `MyQueue`.

Efficient for inserting/removing at head or tail.

#### MyStack  
Implements LIFO logic (last in, first out) using `MyArrayList`.

Supports methods: `push`, `pop`, `peek`, `size`, `isEmpty`.

#### MyQueue  
Implements FIFO logic (first in, first out) using `MyLinkedList`.

Supports methods: `enqueue`, `dequeue`, `peek`, `size`, `isEmpty`.

#### MyMinHeap  
Implements a binary min-heap using `MyArrayList`.

Maintains the smallest element at the top using `siftUp` and `siftDown`.

Supports methods: `insert`, `extractMin`, `peekMin`, `size`, `isEmpty`.

## Setup & Run
### Prerequisites

Install Java JDK 17+  

### Compile the Program

Navigate to the `src` folder and compile:
javac Main.java

### Run the Program (checking various functions)
java Main
