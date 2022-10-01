import java.util.*;
import java.io.*;
public class Airlines {
    private String Airline_ID;
    private String Airline_name;
    private String Alias;
    private String IATA_code;
    private String ICAO_code;
    private String Callsign;
    private String Country;


    public static void reader(){
        FileReader fileViewer = null;
        BufferedReader bufferedReader = null;
        HashMap<String, ArrayList<String>> airlineInfo = new HashMap<String, ArrayList<String>>();
        try {
            fileViewer = new FileReader("airlines.csv");
            bufferedReader = new BufferedReader(fileViewer);
            String newLine;
            while ((newLine = bufferedReader.readLine()) != null) {
                String[] airline = newLine.split(",");
                String Airline_ID = airline[0];
                String Airline_name = airline[1];
                String Country = airline[6];

                String key = Airline_ID +"|"+Airline_name;
                airlineInfo.putIfAbsent(key, new ArrayList<>());
                airlineInfo.get(key).add(Airline_ID);
            }
            System.out.println(airlineInfo);
            bufferedReader.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            throw new RuntimeException();
        }
    }
}


