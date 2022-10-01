import java.util.*;
import java.io.*;

public class main {
    String start_city = "";
    String end_city = "";
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Scanner read = new Scanner(new File("search.txt"));
            String start_city = read.nextLine();
            String end_city = read.nextLine();
            BFS(start_city,end_city);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public static Object BFS(String start_city, String end_city) {
        Node node = new Node();
        ArrayList<String> data = new ArrayList<>();
        ArrayList<String> check = new ArrayList<>();
        ArrayList<String> check2 = new ArrayList<>();
        Queue<Node> frontier = new LinkedList<>();
        HashSet<Node> explored = new HashSet<>();
        data = Airports.reader().getAirport_name();

        while (!frontier.isEmpty()) {
            node = frontier.poll();
            explored.add(node.getState());
            System.out.println("removed: " + node.getState());
            String state = node.setState();
            ArrayList<String> Routes = new ArrayList<>();

            if (state == end_city){
                System.out.println("found");
                return node.getSolution_path();
            }
            if (!explored.contains(node)){
                explored.add(node);
            }
//            for (int i = 0; i < Routes.getState());





        } return null;
    }
}
