# ☕ Java Immutability Example

This repository demonstrates how to create an **immutable class** in Java using a `Person` class as an example.

---

## 🔒 What is Immutability?

**Immutability** means that once an object is created, its state cannot be changed. Instead of modifying an existing object, you create a new one with the updated data. 
Immutable objects are widely used in Java and functional programming for many reasons:

### ✨ Benefits of Immutable Classes:
- ✅ **Thread-safe**: No synchronization needed as data can’t change.
- ✅ **Safe for caching & sharing**: Can be reused freely without side effects.
- ✅ **Reliable and predictable**: No accidental data changes after construction.
- ✅ **Easy to debug**: Object state remains consistent and traceable.
- ✅ **Used in collections**: Ideal for keys in hash-based collections like `HashMap`.

---

## Example of Predefined Immutable class in java
- String Class
- Wrapper Classes (Integer,Long, Double, Float, Short, Byte,Boolean, Character)
- LocalDate,LocalDateTime,LocalTime (Part of Java8 Date-Time Api)
- BigDecimal, BigInteger
---
## 🧱 How to Create an Immutable Class in Java

To create an immutable class, follow these rules:

1. Declare the class as `final` so it can't be subclassed.
2. Make all fields `private` and `final`.
3. Don’t provide setters for any field.
4. Initialize all fields through the constructor only.
5. For mutable fields (like `List`, `Map`, `Date`), return **defensive copies**.

---

## 📦 Project Structure
src/
└── com/self/immutablity/
    ├── Person.java             // Immutable class
    └── TestImmutableClass.java // Test class to demonstrate immutability

## ✅ Key Features in This Example

- `Person` class is marked `final` (can't be subclassed)
- Fields are `private` and `final`
- No setters
- Uses **defensive copying** for mutable fields like `List`
- All fields initialized only in the constructor

## 🛡️ Defensive Copy

A defensive copy is used to protect internal state:

```java
this.hobbies = new ArrayList<>(hobbies); // In constructor
return new ArrayList<>(hobbies);         // In getter
