public static <T extends Comparable<T>> T getMax(T a, T b) {
    if (a.compareTo(b) > 0) {
        return a;
    } else {
        return b;
    }
}

Integer int1 = 5;
Integer int2 = 10;
Integer maxInt = getMax(int1, int2);
System.out.println(maxInt);

String str1 = "hello";
String str2 = "world";
String maxStr = getMax(str1, str2);
System.out.println(maxStr);