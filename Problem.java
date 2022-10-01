import java.util.*;

public class Problem extends Node{
    private String start_City;
    private String start_Country;
    private String end_City;
    private String end_Country;


    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter start city and country: ");
        String start_City = myObj.nextLine();
        String start_Country = myObj.nextLine();

        System.out.println("Enter end city and country: ");
        String end_City = myObj.nextLine();
        String end_Country = myObj.nextLine();
    }
}
