# Java Core Concepts Learning Project

## 📌 Overview
This project serves as a structured learning resource for core Java concepts. Each package represents a different Java topic, and within each package, there is a class with a `main` method that can be uncommented and executed to see the concept in action.

The goal of this project is to build **deep conceptual understanding** of Java fundamentals through practical examples.

---

## 🚀 How to Use
1. **Explore Packages** – Each package covers a different core Java topic.
2. **Run Examples** – Execute the `main` method inside each class.
3. **Observe Output Carefully** – Focus on *why* the output occurs.
4. **Read Comments** – Each class explains the concept in detail.
5. **Experiment** – Modify code and observe behavior changes.

---

## 📚 Concepts Covered

---

### 1️⃣ Comparable & Comparator (`com.java.comparable_comparator`)
- **Comparable** – Defines natural ordering of objects
- **Comparator** – Defines custom sorting logic
- Sorting objects using both approaches

---

### 2️⃣ Multithreading (`com.java.multithreading`)
- Understanding **Thread vs Runnable**
- Creating threads using:
  - Extending `Thread`
  - Implementing `Runnable`
- Inter-thread communication using:
  - `wait()`
  - `notify()`
- Example:
  - Printing **Even & Odd Numbers using two threads in sequence**

---

### 3️⃣ Polymorphism & Inheritance (`com.java.inheritance`)

This module demonstrates **core OOP concepts in Java**:

#### 🔹 Concepts Covered:
- **Method Overriding (Runtime Polymorphism)**
- **Method Overloading (Compile-time Polymorphism)**
- **Variable Hiding vs Method Overriding**
- **Static Method Hiding**
- **Upcasting & Downcasting**
- **Runtime Method Dispatch**
- **ClassCastException (Unsafe Casting)**

#### 🔹 Key Learnings:
- Fields are resolved at **compile-time**
- Methods are resolved at **runtime (dynamic binding)**
- Static methods are resolved based on **reference type**
- Overloading is decided at **compile-time**
- Overriding is decided at **runtime**

#### 🔹 Example Highlights:
- `A obj = new B()` → demonstrates runtime polymorphism
- `obj.x` vs `obj.show()` → variable vs method behavior
- Safe vs unsafe casting
- Parent calling overridden methods

---

### 4️⃣ String Immutability (`string_immutability`)

#### 🔹 Concepts Covered:
- **String immutability in Java**
- Difference between:
  - Heap objects (`new String()`)
  - String Constant Pool (SCP)
- Behavior of:
  - `toUpperCase()`
  - `toLowerCase()`
  - `toString()`

#### 🔹 Key Learnings:
- Strings are **immutable**
- Operations create **new objects only if content changes**
- JVM optimizes memory by reusing objects when possible

#### 🔹 Example Highlights:
- Reference comparison (`==`) behavior
- Same object reuse vs new object creation

---

## 🧠 Project Philosophy

This project is designed to:

- Build **strong fundamentals**
- Encourage **experimentation over memorization**
- Develop **interview-level clarity**
- Strengthen **problem-solving mindset**

---

## 🔥 Upcoming Concepts

- Exception Handling
- Collections Framework (Deep Dive)
- Generics
- Java Memory Model
- Advanced Multithreading (ExecutorService, Locks, etc.)

---

## 🚀 Contribution / Expansion

Feel free to:
- Add more examples
- Improve explanations
- Extend into advanced topics

---

## 💡 Final Note

> Don’t just run the code — understand *why it behaves that way*.  
> That’s what makes you a strong developer.

---