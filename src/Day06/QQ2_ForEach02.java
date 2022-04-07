package Day06;

public class QQ2_ForEach02 {
    public static void main(String[] args) {

        // String[] list = {"fruits", "vegetables", "meat", "milk"};
        // print array with for each loop
        // print length of each element

        // Part 2:
        // Print all the elements from array using for eachLoop
        // If an element starts with 'v' then quit the loop

        String liste[]={"fruits", "vegetables", "meat", "milk"};

        for (String each:liste
             ) {
            System.out.print(each+" ");
            System.out.println(each.length());
        }

        for (String each:liste
             ) {
            if (each.startsWith("v")){
                break;
            }
            System.out.println(each);
        }
    }
}
