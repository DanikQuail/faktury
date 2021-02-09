package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String[]> data = new ArrayList<>();

        //region :read
        try {
            BufferedReader br = new BufferedReader(new FileReader("data/VF_2015.dat"));

            String nextLine = br.readLine();
            while (nextLine != null){
                String [] row = nextLine.split(",");
                data.add(row);


                nextLine = br.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        //endregion

        //region: write
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter("ukol1/VF_2015.csv"));

            for (int i = 0; i < data.size(); i++) {
                br.write(data.get(i)[0]);
                br.write(";");
                br.write(data.get(i)[1]);
                br.write(";");
                br.write(data.get(i)[2]);
                br.newLine();
            }

            br.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        //endregion
    }

}
