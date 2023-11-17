package homework_week_9;

import javax.swing.*;

public class Programme_10_TubeLine_Advanced {

    public static void main(String[] args) {
        //All station in zone 1
        String station[] = ("Aldgate,Angle,Baker Street,Bank,Barbican,Bayswater,Blackfriars,Bond Street," + "Borough,Canon Street,Chancery Lane,Charing Cross,Covent Garden,Earl's Court," + "Edgeware Road,Elephant & Castle,Embankment,Euston,Euston Square," + "Farringdon,Gloucester Road,Goodg Street,Great Portland Street,Green Park,").split(",");

        //Multidimensional array of TubeLines and Station
        String[][] alllines = new String[12][30];

        alllines[0][0] = "Bakerloo Line";
        alllines[0][0] = "Baker Street";
        alllines[0][0] = "Charing Cross";
        alllines[0][0] = "Edgware Road";
        alllines[0][0] = "Elephant & Castle";
        alllines[0][0] = "Embankment";

        alllines[1][0] = "Circle Line";
        alllines[1][1] = "Aldgate";
        alllines[1][2] = "Baker Street";
        alllines[1][3] = "Barbican";
        alllines[1][4] = "Bayswater";
        alllines[1][5] = "Blackfriars";
        alllines[1][6] = "Cannon Street";
        alllines[1][7] = "Earl's Court";
        alllines[1][8] = "Edgeware Road";
        alllines[1][9] = "Euston Square";
        alllines[1][10] = "Farringdon";
        alllines[1][11] = "Great Portland Street";

        alllines[2][0] = "Distric Line";
        alllines[2][1] = "Bayswater";
        alllines[2][2] = "Blacjfriars";
        alllines[2][3] = "Canon Street";
        alllines[2][4] = "Earl's Court";
        alllines[2][5] = "Edgware Road";
        alllines[2][6] = "Embankment";
        alllines[2][7] = "Gloucester Road";

        alllines[3][0] = "Hammersmith & City Line";
        alllines[3][0] = "Baker Street";
        alllines[3][0] = "Barbican";
        alllines[3][0] = "Edgware Road";
        alllines[3][0] = "Euston Squre";
        alllines[3][0] = "Farringdon";
        alllines[3][0] = "Great Portland Street";

        alllines[4][0] = "Jubilee Line";
        alllines[4][1] = "Baker Street";
        alllines[4][2] = "Bond Street";
        alllines[4][3] = "Green Park";

        alllines[5][0] = "Metropolitan Line";
        alllines[5][1] = "Aldgate";
        alllines[5][2] = "Baker Street";
        alllines[5][3] = "Barbican";
        alllines[5][4] = "Euston Square";
        alllines[5][5] = "Farringdon";
        alllines[5][6] = "Great Portland Street";

        alllines[6][0] = "Northern Line";
        alllines[6][1] = "Angle";
        alllines[6][2] = "Bank";
        alllines[6][3] = "Borough";
        alllines[6][4] = "Charing Cross";
        alllines[6][5] = "Elephant & Castle";
        alllines[6][6] = "Embankment";
        alllines[6][7] = "Euston";
        alllines[6][8] = "Goodgs Steet";

        alllines[7][0] = "Piccadilly Line";
        alllines[7][1] = "Covent Garden";
        alllines[7][2] = "Earl's Court";
        alllines[7][3] = "Gloucester Road";
        alllines[7][4] = "Green Park";

        alllines[8][0] = "Victoria Line ";
        alllines[8][1] = "Euston";
        alllines[8][2] = "Green Park";

        alllines[9][0] = "Central Line";
        alllines[9][1] = "Bank";
        alllines[9][2] = "Bond Street";
        alllines[9][3] = "Chancery Lane";

        alllines[10][0] = "Waterloo & City Line";
        alllines[10][1] = "Bank";

        String b;
        //Using do while loop for another try from user to input correct station
        do {
            //JFrame and JOptionPane is used for display and take input from user
            JFrame frame = new JFrame("JavaPractice.InputDialog");
            String str = JOptionPane.showInputDialog(frame, "Enter station Name Between A and G : ", "Station Name", JOptionPane.WARNING_MESSAGE);
            String c = "";

            //for loop use for stations name in zone 1
            for (int i = 0; i < station.length; i++) {
                if (str.equalsIgnoreCase(station[i])) {
                    c = station[i];
                }
            }
            if (str.equalsIgnoreCase(c)) {
                System.out.println("\n" + str + " Station is in Zone 1 ");
                System.out.println("\nThe lines passing through at " + str + "Station are : ");
                System.out.println("_________________________________________________________");

                //Two for loop used for multidimensional array

                for (int k = 0; k < alllines.length; k++) {
                    for (int j = 1; j < alllines.length; j++) {
                        String a = alllines[k][j];
                        if (str.equalsIgnoreCase(a)) {
                            System.out.println(alllines[k][0]);
                        }
                    }
                }
            } else {
                System.out.println(str + " station is not in zone 1 or your station name is wrong");
            }
            b = JOptionPane.showInputDialog(frame, "Do you want to try again then please press Y", "Press Y or N", JOptionPane.WARNING_MESSAGE).toLowerCase();
        } while (b.equals("y"));
        System.exit(0);
    }
}
