// This is the main class that demonstrates the functionality of the MyList class
package ListClass;

public class Main {
    public static void main(String[] args) {
        // Create a new instance of MyList with type parameter Integer
        MyList<Integer> myList = new MyList<>();

        // Print the initial size and capacity of the list
        System.out.println("Number of Elements in the List: " + myList.size());
        System.out.println("List Capacity: " + myList.getCapacity());

        // Add four elements to the list and print the updated size and capacity
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        System.out.println("Number of Elements in the List: " + myList.size());
        System.out.println("List Capacity: " + myList.getCapacity());

        // Add ten more elements to the list and print the updated size and capacity
        myList.add(50);
        myList.add(60);
        myList.add(70);
        myList.add(80);
        myList.add(90);
        myList.add(100);
        myList.add(110);
        System.out.println("Number of Elements in the List: " + myList.size());
        System.out.println("List Capacity: " + myList.getCapacity());

        // Retrieve and print the value at index 2 in the list
        System.out.println("Value at index 2: " + myList.get(2));

        // Remove an element, add a new element, and modify an existing element in the list
        myList.remove(2);
        myList.add(40);
        myList.set(0, 100);
        System.out.println("Value at index 2: " + myList.get(2));

        // Print the contents of the list using the toString() method
        System.out.println(myList.toString());

        // Find the index of specific values in the list
        System.out.println("Index of 20: " + myList.indexOf(20));
        System.out.println("Index of 100: " + myList.indexOf(100));
        System.out.println("Last index of 20: " + myList.lastIndexOf(20));

        // Convert the list to an array and print the first element of the array
        Object[] array = myList.toArray();
        System.out.println("First element of the Object array: " + array[0]);

        // Create a sublist of the first three elements of the list and print it
        MyList<Integer> sublist = myList.subList(0, 3);
        System.out.println(sublist.toString());

        // Check if the list contains specific values
        System.out.println("List contains 20: " + myList.contains(20));
        System.out.println("List contains 120: " + myList.contains(120));

        // Clear the list and check if it is empty
        myList.clear();
        System.out.println(myList.toString());
        System.out.println("List is " + (myList.isEmpty() ? "Empty" : "Not Empty"));
    }
}