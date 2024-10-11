import java.util.ArrayList;
import java.util.Scanner;
public class todo{
    public static void main(String[] args) {
        ArrayList<String> todolist = new ArrayList<String>();
        Scanner scanner= new Scanner(System.in);

        while(true){
            System.out.println("====Todo List====");
            for(int i=0;i<todolist.size();i++){
                System.out.println((i+1)+"."+todolist.get(i));
            }
            System.out.println("=================");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                System.out.print("Enter item to add: ");
                String item = scanner.nextLine();
                todolist.add(item);
                System.out.println("Item added!");
            } else if (choice == 2) {
                System.out.print("Enter item number to remove: ");
                int itemNum = scanner.nextInt();
                scanner.nextLine();
                if (itemNum > 0 && itemNum <= todolist.size()) {
                    todolist.remove(itemNum-1);
                    System.out.println("Item removed!");
                } else {
                    System.out.println("Invalid item number.");
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("Exiting the to-do list app.");
        System.out.println("Thank You for using the to-do list app");
        scanner.close();
    }
}
