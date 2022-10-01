import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Airports {


    private String Airport_ID;
    private static String Airport_name;
    private String City;
    private String Country;
    private String IATA_code;

    public String getAirport_ID() {
        return Airport_ID;
    }

    public String getAirport_name() {
        return Airport_name;
    }

    public String getCity() {
        return City;
    }

    public String getCountry() {
        return Country;
    }

    public String getIATA_code() {
        return IATA_code;
    }

    public String getICAO_code() {
        return ICAO_code;
    }

    public double getLatitude() {
        return Latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public int getAltitude() {
        return Altitude;
    }

    public int getTimezone() {
        return Timezone;
    }

    public String getDST() {
        return DST;
    }

    private String ICAO_code;
    private double Latitude;
    private double Longitude;
    private int Altitude;
    private int Timezone;
    private String DST;

    public static void reader(){
        FileReader fileViewer = null;
        BufferedReader bufferedReader = null;
        HashMap<String, ArrayList<String>> airportInfo = new HashMap<String, ArrayList<String>>();
        try {
            fileViewer = new FileReader("airports.csv");
            bufferedReader = new BufferedReader(fileViewer);
            String newLine;
            while ((newLine = bufferedReader.readLine()) != null) {
                String[] airport = newLine.split(",");
                String Airport_ID = airport[0];
                String Airport_name = airport[1];
                String City = airport[2];
                String Country = airport[3];
                String IATA_code = airport[4];
                String ICAO_code = airport[5];
                String Latitude = airport[6];
                String Longitude = airport[7];

                String key = City + Country;
                airportInfo.putIfAbsent(key, new ArrayList<>());
                airportInfo.get(key).add(Airport_ID);
            }
            System.out.println(airportInfo);
            bufferedReader.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            throw new RuntimeException();
        }
    }
}

