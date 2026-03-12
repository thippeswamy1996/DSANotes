public class GetLargest{
public static void main(String[] args){
int arr[]={2,3,4,22,33,44,55,66,77,77,88,99};
  int result=laegest(arr);
  System.out.println(result);
  System.out.println(arr[result]);}
  public static int laegest(int [] arr){
  
  
  int n=arr.length;
  for(int i=0;i<n;i++){
  boolean flag=true;
  for(int j=0;j<n;j++){
  if(arr[j]>arr[i]){
  flag=false;
  break;}
  }
  if(flag==true){
  return i;}
  
  }
  return -1;
  }
  }
  /*
  Absolutely! Let's break down your Java program **line by line**, so you fully understand what each part does.

---

### ✅ Full Code:
```java
public class GetLargest {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 22, 33, 44, 55, 66, 77, 77, 88, 99};
        int result = laegest(arr);
        System.out.println("Index of largest element: " + result);
        System.out.println("Largest element: " + arr[result]);
    }

    public static int laegest(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                return i;
            }
        }
        return -1;
    }
}
```

---

### 🔍 Line-by-Line Explanation:

#### `public class GetLargest {`
- Declares a public class named `GetLargest`.
- Java requires all code to be inside a class.

---

#### `public static void main(String[] args) {`
- Entry point of the program. When you run the program, execution starts here.

---

#### `int arr[] = {2, 3, 4, 22, 33, 44, 55, 66, 77, 77, 88, 99};`
- Creates an array `arr` of integers with 12 elements.
- This is the array where we want to find the **largest element**.

---

#### `int result = laegest(arr);`
- Calls the method `laegest()` (misspelled "largest", but still valid as a method name).
- Passes the array as an argument.
- Stores the returned **index of the largest element** in `result`.

---

#### `System.out.println("Index of largest element: " + result);`
- Prints the index of the largest element found.

---

#### `System.out.println("Largest element: " + arr[result]);`
- Prints the actual value at the `result` index in the array — which is the **largest number**.

---

### 🔽 Method: `public static int laegest(int[] arr)`

---

#### `int n = arr.length;`
- Stores the length of the array in variable `n` for convenience.

---

#### `for (int i = 0; i < n; i++) {`
- Outer loop: Picks each element one-by-one to check if it is the largest.

---

#### `boolean flag = true;`
- Initializes a flag assuming `arr[i]` is the largest for now.

---

#### `for (int j = 0; j < n; j++) {`
- Inner loop: Compares `arr[i]` with **every other element** `arr[j]`.

---

#### `if (arr[j] > arr[i]) {`
- If **any other element is greater** than `arr[i]`, then `arr[i]` is not the largest.

---

#### `flag = false; break;`
- Set `flag` to `false` and break out of the inner loop.

---

#### `if (flag == true) { return i; }`
- If `flag` is still `true` after inner loop, it means `arr[i]` is **not smaller than any element**, hence it is the **largest**.
- Return its **index**.

---

#### `return -1;`
- If for some reason the loop doesn't return (e.g., array is empty), this is a fallback value.

---

### 🧠 Summary:
This program **finds the index of the largest element** in an array using **nested loops** by comparing each element with all others. Once found, it prints both the **index** and the **value**.

---

Would you like a version using a **single loop for better performance** or want to add functionality like **finding all maximums if there are duplicates**?*/