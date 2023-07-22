package ListClass;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        System.out.println("Number of Elements in the List: " + myList.size());
        System.out.println("List Capacity: " + myList.getCapacity());

        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);

        System.out.println("Number of Elements in the List: " + myList.size());
        System.out.println("List Capacity: " + myList.getCapacity());

        myList.add(50);
        myList.add(60);
        myList.add(70);
        myList.add(80);
        myList.add(90);
        myList.add(100);
        myList.add(110);

        System.out.println("Number of Elements in the List: " + myList.size());
        System.out.println("List Capacity: " + myList.getCapacity());

        System.out.println("Value at index 2: " + myList.get(2));

        myList.remove(2);
        myList.add(40);
        myList.set(0, 100);

        System.out.println("Value at index 2: " + myList.get(2));

        System.out.println(myList.toString());

        System.out.println("Index of 20: " + myList.indexOf(20));
        System.out.println("Index of 100: " + myList.indexOf(100));

        System.out.println("Last index of 20: " + myList.lastIndexOf(20));

        Object[] array = myList.toArray();
        System.out.println("First element of the Object array: " + array[0]);

        MyList<Integer> sublist = myList.subList(0, 3);
        System.out.println(sublist.toString());

        System.out.println("List contains 20: " + myList.contains(20));
        System.out.println("List contains 120: " + myList.contains(120));

        myList.clear();
        System.out.println(myList.toString());

        System.out.println("List is " + (myList.isEmpty() ? "Empty" : "Not Empty"));
    }
}

