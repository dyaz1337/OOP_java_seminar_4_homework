public class DataContainer<T> {
    private ArrayList<T> data;

    public DataContainer() {
        data = new ArrayList<>();
    }

    public void add(T element) {
        data.add(element);
    }

    public T get(int index) {
        return data.get(index);
    }

    public void sort(Comparator<T> comparator) {
        Collections.sort(data, comparator);
    }

    public void print() {
        for (T element : data) {
            System.out.println(element);
        }
    }
}

public static void main(String[] args) {
    DataContainer<String> container = new DataContainer<>();
    container.add("apple");
    container.add("banana");
    container.add("cherry");
    container.print(); // prints "apple", "banana", "cherry"
    container.sort((a, b) -> b.compareTo(a));
    container.print(); // prints "cherry", "banana", "apple"
}