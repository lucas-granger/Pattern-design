# Understanding the Singleton Design Pattern

## Why use the Singleton pattern?

The Singleton pattern ensures that a class has **only one instance** throughout the entire application. This is useful when exactly one object is needed to coordinate actions across the system, such as:

- Managing a shared resource (e.g., database connection).  
- Representing unique entities (e.g., a game boss, a configuration manager).  
- Controlling access to global state in a safe and consistent way.

Using Singleton avoids bugs caused by having multiple conflicting instances and simplifies access to this unique object from anywhere in the code.

---

## How does the Singleton pattern work?

- The class keeps a **private class-level variable** that stores the single instance.  
- When creating a new object, the class checks if the instance already exists:  
  - If it does, it returns the existing instance.  
  - If not, it creates it and stores it.  
- This means all requests for the class instance receive the **same object**.

This approach guarantees **one and only one** instance during the program’s life cycle.

---

## Example: DragonKing in a Game Context 🐉👑

Imagine a game where there is a **unique DragonKing boss** that players face. There should never be two DragonKings at once, or the game would break its logic.

Here, the Singleton pattern is useful because we only want one boss. Plus, we can access it from anywhere without a risk to get another instance of this class.