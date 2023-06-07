public static <T> void printArray(T[] arr) {
    for (T t : arr) {
        System.out.print(t + " ");
    }
    System.out.println();
}

Integer[] intArray = {1, 2, 3, 4, 5};
String[] stringArray = {"apple", "banana", "orange"};

printArray(intArray);
printArray(stringArray);