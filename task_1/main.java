public static <T> void printElement(T element) {
    System.out.println(element);
}
public static void main(String[] args) {
    Integer i = 10;
    String s = "Hello, world!";
    Double d = 3.14;

    printElement(i);
    printElement(s);
    printElement(d);
}