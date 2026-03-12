class Solutioninsert {
    public void insertAtIndex(int arr[], int sizeOfArray, int index, int element) {
        // Shift elements to the right from the end to the index
        for (int i = sizeOfArray - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        // Insert the new element at the specified index
        arr[index] = element;
    }
}


/*Sure! Let's break it down **line by line** to understand the Java code inside the `Solution` class:

---

### 🔹 `class Solution {`
- This defines a **class** named `Solution`.
- In Java, all methods must be inside a class, and this class may be used by the driver code to run the logic.

---

### 🔹 `public void insertAtIndex(int arr[], int sizeOfArray, int index, int element) {`
- This is the **method definition**.
- `public`: Access modifier — means this method can be accessed from outside the class.
- `void`: Return type — the method does **not return** anything.
- `insertAtIndex(...)`: Method name.
- Parameters:
  - `int arr[]`: The array in which we want to insert the element.
  - `int sizeOfArray`: Total size allocated to the array (including one empty spot for the new element).
  - `int index`: The index at which we want to insert the new element.
  - `int element`: The value to insert at the given index.

---

### 🔹 `for (int i = sizeOfArray - 1; i > index; i--) {`
- This `for` loop starts from the **last index** of the array and moves **backwards** until just **after the index** where we want to insert the new element.
- `i = sizeOfArray - 1`: Starts at the last position in the array.
- `i > index`: Continues looping until `i` is greater than `index` — we stop just after the target index.
- `i--`: Decrement the index each time — moving from right to left.

---

### 🔹 `arr[i] = arr[i - 1];`
- This line **shifts each element one position to the right**.
- We're making room for the new element at the target index.
- For example, if inserting at index 2:
  - `arr[5] = arr[4]`
  - `arr[4] = arr[3]`
  - `arr[3] = arr[2]`
- This ensures that the element at `index` and all elements to the right are moved right by one place.

---

### 🔹 `arr[index] = element;`
- After the loop has created space, this line **inserts the new element at the given index**.
- The original value at that index has been shifted to the right, so no data is lost.

---

### ✅ Final Summary
This method works by:
1. Shifting elements from the end to the right of the given index.
2. Placing the new element at the correct index.

It does this **in-place**, meaning it doesn't use any extra space — just shifts and inserts within the existing array.

Let me know if you want a dry-run with sample input or a visual explanation too! */