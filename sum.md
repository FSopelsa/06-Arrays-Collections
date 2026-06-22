Here's a concise study summary of the presentation, with extra focus on the concepts that are most likely to appear in exercises, workshops, interviews, and future Java programming.

        **Source:**

        # Arrays, Collections & Unit Testing – Summary

The presentation covers three major topics:

        1. **Arrays**
        2. **Unit Testing with JUnit 5**
        3. **Java Collections Framework (JCF)**

        ---

        # 1. Arrays

Arrays are fixed-size data structures used to store multiple values of the same type.

        ### Key Concepts

* Arrays have a fixed length once created.
* Indexing starts at **0**.
        * Last index is `length - 1`.
        * Elements are stored in contiguous memory.
        * Accessing an invalid index causes an `ArrayIndexOutOfBoundsException`.

Example:

        ```java
int[] numbers = {10, 20, 30, 40};
```

        ### Important Skills to Practice

#### Creating Arrays

```java
int[] arr = new int[5];
```

        #### Initializing Arrays

```java
int[] arr = {1, 2, 3, 4};
```

        #### Accessing Elements

```java
arr[0]
arr[3]
        ```

        #### Modifying Elements

```java
arr[1] = 100;
        ```

        #### Using `.length`

        ```java
arr.length
```

        ---

        ## Array Iteration

### Basic for-loop

```java
for(int i = 0; i < arr.length; i++)
        ```

Use when:

        * You need the index.
        * You need to modify elements.

### Enhanced for-loop (for-each)

```java
for(int number : arr)
        ```

Use when:

        * You only need to read values.
        * Simpler and cleaner syntax.

        ### Very Important

Changing the loop variable in a for-each loop does **not** modify the array.

```java
for(int number : arr){
number = 999;
        }
        ```

The array remains unchanged.

This is a common beginner mistake.

        ---

        ## Array Expansion

Arrays cannot grow.

To add an element:

        1. Create a larger array.
        2. Copy elements.
        3. Add the new value.

        Example:

        ```java
Arrays.copyOf(original, original.length + 1);
```

        ### Important to Understand

This limitation is one of the main reasons collections (especially ArrayList) exist.

        ---

        ## Arrays Utility Class

Useful methods:

        ```java
Arrays.toString()
Arrays.sort()
Arrays.binarySearch()
Arrays.equals()
Arrays.fill()
Arrays.copyOf()
```

        ### Most Important Methods

Practice:

        ```java
Arrays.toString(arr);
Arrays.sort(arr);
Arrays.copyOf(arr, newSize);
```

These appear constantly in Java exercises.

        ---

        # 2. Unit Testing (JUnit 5)

Unit testing verifies that individual methods work correctly.

Example:

        ```java
findMaxNumber()
```

You write tests to ensure it behaves correctly.

        ---

        ## Why Unit Testing Matters

* Finds bugs early.
* Makes refactoring safer.
* Documents expected behavior.
* Improves code quality.

---

        ## Test Categories

### Happy Path

Normal expected input.

        Example:

        ```java
add(2, 3)
```

Expected:

        ```java
5
        ```

        ---

        ### Negative Cases

Invalid input.

Example:

        ```java
divide(5, 0)
```

        ---

        ### Edge Cases

Boundary values.

Examples:

        * Empty array
* Array with one element
* Maximum allowed size

---

        ### Corner Cases

Several extreme conditions at the same time.

---

        ## JUnit Annotations

Know these:

        ```java
@Test
@BeforeEach
@AfterEach
@BeforeAll
@AfterAll
@DisplayName
```

Especially:

        ```java
@Test
```

because every test method uses it.

        ---

        ## Assertions

Most important JUnit methods:

        ```java
assertEquals()
assertTrue()
assertFalse()
assertNull()
assertNotNull()
assertThrows()
```

        ### Must Know

```java
assertEquals()
assertThrows()
```

These are used constantly.

        ---

        # 3. Java Collections Framework (JCF)

Collections solve many limitations of arrays.

Most commonly used:

        ```java
        ArrayList
HashSet
        HashMap
```

        ---

        ## Arrays vs Collections

Arrays:

        * Fixed size
* Can store primitives

Collections:

        * Dynamic size
* Rich functionality
* Easier to use

---

        # Wrapper Classes

Collections only store objects.

Therefore:

        ```java
int
```

becomes

```java
        Integer
```

Examples:

        | Primitive | Wrapper   |
        | --------- | --------- |
        | int       | Integer   |
        | double    | Double    |
        | boolean   | Boolean   |
        | char      | Character |

        ---

        ## Autoboxing & Unboxing

```java
Integer x = 10;   // Autoboxing
int y = x;        // Unboxing
```

        ### Important

This happens automatically in modern Java.

You should understand what is happening behind the scenes.

---

        # ArrayList

The most important collection for beginners.

### Creating

```java
ArrayList<String> names = new ArrayList<>();
```

        ### Common Operations

Add:

        ```java
names.add("Erik");
```

Get:

        ```java
names.get(0);
```

Update:

        ```java
names.set(0, "Fredrik");
```

Remove:

        ```java
names.remove(0);
```

Size:

        ```java
names.size();
```

Contains:

        ```java
names.contains("Erik");
```

        ---

        ## Practice These Until Comfortable

```java
add()
get()
set()
remove()
contains()
size()
```

These appear in nearly every beginner/intermediate Java project.

---

        # Collections Utility Class

Useful methods:

        ```java
Collections.sort()
Collections.reverse()
Collections.shuffle()
Collections.min()
Collections.max()
```

        ### Most Important

```java
Collections.sort()
```

Sorting lists is extremely common.

---

        # Objects Utility Class

Provides null-safe operations.

Examples:

        ```java
Objects.equals()
Objects.requireNonNull()
Objects.isNull()
Objects.nonNull()
```

        ### Most Important

```java
Objects.equals()
Objects.requireNonNull()
```

These help avoid NullPointerExceptions.

        ---

        # equals() and hashCode()

One of the most important OOP concepts in the entire presentation.

        By default:

        ```java
person1.equals(person2)
```

compares object references (memory addresses).

Not object data.

---

        ## Why Override Them?

For custom classes:

        ```java
        Person
Car
        Student
Book
```

you usually want equality based on data.

        Example:

        ```java
        id
name
        email
```

instead of memory location.

        ---

        ## Collections Depend on Them

Methods such as:

        ```java
contains()
remove()
HashSet
        HashMap
```

rely on proper implementations of:

        ```java
equals()
hashCode()
```

If these are not overridden correctly:

        ```java
list.contains(person)
```

may unexpectedly return:

        ```java
false
        ```

even when identical data exists.

---

        # Highest-Priority Topics to Master

If you only have limited study time, focus on these:

        ### Arrays

✅ Creating arrays
✅ Accessing elements
✅ for-loops vs for-each loops
✅ `.length`
        ✅ `Arrays.sort()`
        ✅ `Arrays.copyOf()`

        ### Unit Testing

✅ Happy path / negative / edge cases
✅ `@Test`
        ✅ `assertEquals()`
        ✅ `assertThrows()`

        ### Collections

✅ ArrayList
✅ add/get/set/remove
✅ size()
✅ contains()
✅ Collections.sort()

### Object-Oriented Java

✅ Wrapper classes
✅ Autoboxing/unboxing
✅ equals()
✅ hashCode()

---

        # What I Would Expect on a Workshop or Test

1. Create and iterate through an array.
        2. Find the largest/smallest value in an array.
3. Sort an array.
4. Convert an array solution into an `ArrayList`.
        5. Add/remove/search elements in an `ArrayList`.
        6. Write JUnit tests for a simple method.
7. Identify happy path, negative cases, and edge cases.
        8. Explain why `equals()` and `hashCode()` are needed.
        9. Explain why collections are usually preferred over arrays.
        10. Explain autoboxing and wrapper classes.

If you can comfortably solve those 10 tasks, you'll have covered most of the practical knowledge from this presentation.
