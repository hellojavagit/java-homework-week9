package java_homework_week_9;

import java.util.Scanner;
//programme that tell you which line pass through particular stations.
 // Just use Zone 1 stations name

public class TubeStations_10 {
    public static void main(String[] args) {

        zone1Stations();
    }

       public static void zone1Stations()
        {
        String[] jubilee = {"Bakerstreet", "Bondstreet", "Greenpark", "Charingcross"};
        String[] metropolitan = {"Aldgate", "Liverpool street", "Moorgate", "Barbican", "Farringdon", "KingscrossSt.pancras", "Eustonsquare" +
                "GreatPortlandStreet", "Bakerstreet", "Finchleyroad"};
        String[] district = {"Victoria", "Edgwareroad,Paddington,NottinghillGate,Highstreetkensington", "Monument", "Southkensington", "Paddington", "Edgwareroad"};
        String[] circle = {"Blackfrairs", "Westminister", "Mansionhouse", "Southkensington", "Gloucestorroad", "Victoria", "Cannonstreet", "Monument" +
                " Barbican", "Moorgate", "Eustonsquare", "Bakerstreet"};
        String[] picadally = {"Southkensington", "Leicestersquare", "Holborn", "Coventgarden", "Hydeparkcorner", "Rusellsquare", "Greenpark"};
        String[] victoria = {"Victoria", "Greenpark", "Oxfordcircus", "Warrenstreet", "Euston", "KingscrossSt.pancras"};
        String[] bakerloo = {"Paddington", "Edgwareroad", "Marylebone", "Bakerstreet", "Regentspark", "Oxfordcircus", "Picadallycircus" +
                "Charingcross", "Embankment", "Waterloo", "Elephantandcastle"};

        System.out.println("Enter the station you want to check the line that passess");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean b = true;
        while (b) {

            for (int i = 0; i < jubilee.length; i++) {
                if (str.equals(jubilee[i]))
                    System.out.println("Jubilee line passess through this station " + str);
            }

            for (int j = 0; j < metropolitan.length; j++) {
                if (str.equals(metropolitan[j]))
                    System.out.println(" Metropolitan line  passess through this station " + str);
            }

            for (int y = 0; y < district.length; y++) {
                if (str.equals(district[y]))
                    System.out.println(" District line passess through this station " + str);
            }
            for (int a = 0; a < circle.length; a++) {
                if (str.equals(circle[a]))
                    System.out.println(" Circle line passess through this station " + str);
            }

            for (int k = 0; k < picadally.length; k++) {
                if (str.equals(picadally[k]))
                    System.out.println(" picadally line passess through this station " + str);
            }
            for (int j = 0; j < victoria.length; j++) {
                if (str.equals(victoria[j]))
                    System.out.println("Victoria  line passess through this station " + str);
            }
            for (int i = 0; i < bakerloo.length; i++) {
                if (str.equals(bakerloo[i]))
                    System.out.println("Bakerloo line passess thorugh this station " + str);
            }
            break;

        }
    }
}




