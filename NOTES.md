# 📝 Java Strings: Concepts & Notes

## 1. Core Principles
* **Immutability**: Java Strings (`java.lang.String`) are immutable. Once created, their value cannot be changed. Any modification (like concatenation) results in a new string being created in memory.
* **Storage**: Strings are stored in the **String Pool** (heap memory) to optimize performance.

## 2. Essential Methods Cheat Sheet
| Method | Description |
| :--- | :--- |
| `.length()` | Returns the count of characters. |
| `.charAt(index)` | Returns the character at a specific integer position. |
| `.compareTo(str)` | Compares strings lexicographically (`0` = equal). |
| `.substring(start, end)` | Extracts a part of the string from `start` to `end-1`. |
| `.equals(str)` | Compares the actual content/value of two strings. |

## 3. Type Conversion
* **String to Int**: `int num = Integer.parseInt(str);`
* **Int to String**: `String str = Integer.toString(num);`

## 4. Why StringBuilder? (Tomorrow's Milestone)
Since Strings are **immutable**, using `str += "a"` inside a loop is slow.
* **Solution**: `StringBuilder` is **mutable**. It allows us to perform modifications directly on the same object using `append()`.

---
## 🎯 Milestone
- [ ] **StringBuilder Class**: Understanding `append()`, `insert()`, `delete()`, and `reverse()` operations.

---
*Learning in public - Arpit Dhiman*