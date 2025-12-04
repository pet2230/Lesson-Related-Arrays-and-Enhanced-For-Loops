# Related Arrays & Enhanced For Loops — Annotated Solutions

Each solution includes explanations to help understand the logic, purpose, and flow of each problem.

## Problem 1 — Print Names With Scores

We use **two related arrays** and a regular index loop so we can access both arrays using the same index.

```java
public void run() {
    String[] names = {"Ana", "Ben", "Ming", "Lila", "Kai"};
    int[] scores = {12, 22, 18, 31, 15};

    for (int i = 0; i < names.length; i++) {
        System.out.println(names[i] + ": " + scores[i]);
    }
}
```



## Problem 2 — Highest Score and Player

We track the best score found so far and update both the score and its matching name when we see a new maximum.

```java
public void run() {
    String[] names = {"Ana", "Ben", "Ming", "Lila", "Kai"};
    int[] scores = {12, 22, 18, 31, 15};

    int bestScore = scores[0];     // start with first score
    String bestPlayer = names[0];  // matching name

    for (int i = 1; i < scores.length; i++) {
        if (scores[i] > bestScore) {
            bestScore = scores[i];
            bestPlayer = names[i];
        }
    }

    System.out.println("Top player: " + bestPlayer + " with " + bestScore + " points");
}
```



## Problem 3 — Average Temperature Using Enhanced For

Enhanced for loops (`for-each`) are ideal when you only need the **values**, not the index.

```java
public void run() {
    double[] temps = new double[5];

    for (int i = 0; i < temps.length; i++) {
        temps[i] = readDouble("Enter temperature #" + (i + 1) + ": ");
    }

    double total = 0;

    for (double temp : temps) {  // enhanced for
        total += temp;
    }

    double average = total / temps.length;

    System.out.println("Average temperature = " + average + " °C");
}
```



## Problem 4 — Count Honour Roll Students

Use enhanced for to count how many elements meet a condition.

```java
public void run() {
    int[] averages = {81, 90, 99, 78, 77, 94};

    int count = 0;

    for (int avg : averages) {
        if (avg >= 80) {
            count++;
        }
    }

    System.out.println("Honour roll students: " + count);
}
```



## Problem 5 — Month and Days Lookup

We use two related arrays.  
We must use an **index loop**, because enhanced for cannot access indices directly.

```java
public void run() {
    String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug",
                       "Sep", "Oct", "Nov", "Dec"};
    int[] days    = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    String input = readLine("Enter a month: ");

    for (int i = 0; i < months.length; i++) {
        if (input.equals(months[i])) {
            System.out.println(input + " has " + days[i] + " days.");
            return;
        }
    }

    System.out.println("Month not found.");
}
```



## Problem 6 — Sum of Prices

A classic use of enhanced for: summing values.

```java
public void run() {
    double[] prices = {5.99, 3.50, 12.00, 1.25};

    double total = 0;

    for (double price : prices) {
        total += price;
    }

    System.out.println("Total = " + total);
}
```



## Problem 7 — Find Matching Last Names

Two related arrays allow us to print matching first+last combinations.

```java
public void run() {
    String[] firstNames = {"Amy", "Ben", "Chris", "Dana"};
    String[] lastNames  = {"Lee", "Wong", "Wong", "Patel"};

    String search = readLine("Search last name: ");

    for (int i = 0; i < lastNames.length; i++) {
        if (search.equals(lastNames[i])) {
            System.out.println(firstNames[i] + " " + lastNames[i]);
        }
    }
}
```



## Problem 8 — Mirror Copy (Reverse Using Index Loop)

We build a **new array** and fill it using backward indexing.

```java
public void run() {
    int[] original = new int[5];

    for (int i = 0; i < original.length; i++) {
        original[i] = readInt("Enter number #" + (i + 1) + ": ");
    }

    int[] reversed = new int[original.length];

    for (int i = 0; i < original.length; i++) {
        reversed[i] = original[original.length - 1 - i];
    }

    System.out.print("Original: ");
    for (int i = 0; i < original.length; i++) {
        System.out.print(original[i] + " ");
    }
    System.out.println();

    System.out.print("Reversed: ");
    for (int i = 0; i < reversed.length; i++) {
        System.out.print(reversed[i] + " ");
    }
}
```



## Problem 9 — Count How Many Are Even

Simple condition-based counting with enhanced for.

```java
public void run() {
    int[] nums = {3, 10, 4, 7, 12, 5};

    int count = 0;

    for (int n : nums) {
        if (n % 2 == 0) {
            count++;
        }
    }

    System.out.println("Even numbers: " + count);
}
```



## Problem 10 — Parallel Search (Two Related Arrays)

A regular loop is required because we need the index.

```java
public void run() {
    String[] items = {"Pen", "Notebook", "Eraser", "Pencil"};
    double[] costs = {1.25, 3.50, 0.99, 0.75};

    String search = readLine("Enter item: ");

    for (int i = 0; i < items.length; i++) {
        if (search.equals(items[i])) {
            System.out.println("Price: $" + costs[i]);
            return;
        }
    }

    System.out.println("Item not found.");
}
```

