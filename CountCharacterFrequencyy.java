import java.util.HashMap;
import java.util.Map;

public class CountCharacterFrequencyy {
    public static void main(String[] args) {
        String str = "StringProgramming";
        printDuplicateCharacters(str);
    }

    public static void printDuplicateCharacters(String str) {
        Map<Character, Integer> count = new HashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }

        // Print characters that occur more than once
        System.out.println("Characters with frequency > 1:");
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
           // if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " => " + entry.getValue());
            //}
        }
		//System.out.println(entry.getKey() + " => " + entry.getValue());
    }
}
/*
Sure! Here's a complete breakdown **word by word** of the Java code you provided:

---

### ✅ **Imports**
```java
import java.util.HashMap;
import java.util.Map;
```

- **`import`**: Keyword to include built-in or user-defined packages into the code.
- **`java.util.HashMap`**: A class from the Java Collection Framework that stores data as key-value pairs and allows fast retrieval.
- **`java.util.Map`**: An interface that defines a mapping between a key and a value. `HashMap` implements this interface.

---

### ✅ **Class Declaration**
```java
public class CountCharacterFrequencyy {
```

- **`public`**: Access modifier meaning this class is accessible from any other class.
- **`class`**: Keyword to declare a class.
- **`CountCharacterFrequencyy`**: Name of the class (Note: small typo in the name; likely meant to be `CountCharacterFrequency`).

---

### ✅ **Main Method**
```java
public static void main(String[] args) {
```

- **`public`**: Accessible from anywhere.
- **`static`**: Method belongs to the class, not to objects.
- **`void`**: Method returns nothing.
- **`main`**: Entry point of any Java program.
- **`String[] args`**: Command-line arguments passed during execution.

```java
String str = "StringProgramming";
```

- **`String`**: Java class representing a sequence of characters.
- **`str`**: Variable name.
- **`"StringProgramming"`**: The actual string to process.

```java
printDuplicateCharacters(str);
```

- Calls the method `printDuplicateCharacters` with `str` as the argument.

---

### ✅ **Custom Method to Print Duplicates**
```java
public static void printDuplicateCharacters(String str) {
```

- **`public static void`**: Method is accessible everywhere, belongs to class, returns nothing.
- **`printDuplicateCharacters`**: Method name.
- **`String str`**: Input parameter of type `String`.

```java
Map<Character, Integer> count = new HashMap<>();
```

- **`Map<Character, Integer>`**: Declares a `Map` where keys are `Character`s and values are `Integer`s.
- **`count`**: Variable name for the map.
- **`new HashMap<>()`**: Creates a new instance of a `HashMap`.

---

### ✅ **Counting Character Frequencies**
```java
for (char ch : str.toCharArray()) {
```

- **`for`**: Loop to iterate.
- **`char ch`**: Each character from the string.
- **`str.toCharArray()`**: Converts the string to an array of characters.

```java
count.put(ch, count.getOrDefault(ch, 0) + 1);
```

- **`count.put(key, value)`**: Inserts or updates the key with the value.
- **`count.getOrDefault(ch, 0)`**: Returns the current value for `ch` or `0` if not present, then adds `1` to update the count.

---

### ✅ **Printing Duplicate Characters**
```java
System.out.println("Characters with frequency > 1:");
```

- **`System.out.println()`**: Prints to the console.

```java
for (Map.Entry<Character, Integer> entry : count.entrySet()) {
```

- **`Map.Entry<Character, Integer>`**: Each entry in the map (a key-value pair).
- **`count.entrySet()`**: Returns a set of all key-value pairs.

```java
if (entry.getValue() > 1) {
```

- Checks if the character occurs more than once.

```java
System.out.println(entry.getKey() + " => " + entry.getValue());
```

- Prints the duplicate character and its frequency.

---

### 🧠 **Summary of What This Code Does:**

- Takes a string (in this case `"StringProgramming"`).
- Counts how often each character appears.
- Prints only the characters that appear **more than once**, along with their frequency.

---
27-01-2025

Would you like a version of this code with comments added inline?
























*/

count.put(ch,count.getOrDefault(ch,0)+1);