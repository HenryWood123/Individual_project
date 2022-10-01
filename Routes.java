import java.util.*;
import java.io.*;
public class Routes {


    private String Airline_code;
    private String Src_airport_code;
    private String Dest_airport_code;
    private int Stops;

    public Routes(String airline_code, String src_airport_code, String dest_airport_code, int stops) {
        Airline_code = airline_code;
        Src_airport_code = src_airport_code;
        Dest_airport_code = dest_airport_code;
        Stops = stops;
    }

    public static void reader(int i){
       FileReader fileViewer = null;
       BufferedReader bufferedReader = null;
       HashMap<String ,ArrayList<String>> routeInfo = new HashMap<String, ArrayList<String>>();

       try {
           fileViewer = new FileReader("routes.csv");
           bufferedReader = new BufferedReader(fileViewer);
           String newLine;
           while ((newLine = bufferedReader.readLine()) != null) {
               String[] route = newLine.split(",");
               String Airline_code = route[0];
               String Src_airport_code = route[2];
               String Dest_airport_code = route[4];
               String Stops = route[6];

               String key;
               key = Src_airport_code;
               routeInfo.putIfAbsent(key, new ArrayList<>());
               routeInfo.get(key).add(Src_airport_code);
           }
           System.out.println(routeInfo);
           bufferedReader.close();
       }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }catch (IOException e){
           throw new RuntimeException();
       }
   }
}
