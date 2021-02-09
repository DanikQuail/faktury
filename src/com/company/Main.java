package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String[]> data2015 = new ArrayList<>();
        ArrayList<String[]> data2016 = new ArrayList<>();
        ArrayList<String[]> data2017 = new ArrayList<>();
        ArrayList<String[]> data2018 = new ArrayList<>();
        ArrayList<String[]> data2019 = new ArrayList<>();
        ArrayList<String[]> data2020 = new ArrayList<>();


        
        //region :read2015
        try {
            BufferedReader br = new BufferedReader(new FileReader("data/VF_2015.dat"));

            String nextLine = br.readLine();
            while (nextLine != null){
                String [] row = nextLine.split(",");
                data2015.add(row);


                nextLine = br.readLine();
            }
            for (int i = 0; i < data2015.size(); i++) {
                if (data2015.get(i)[1].equals("05159822")){
                    data2015.get (i)[1] = "BlueNet, s.r.o.";
                } else if (data2015.get (i)[1].equals("06230932")){
                    data2015.get(i)[1] = "Epic Internet a.s.";
                } else if (data2015.get (i)[1].equals("18539217")){
                    data2015.get(i)[1] = "Big žirafa s.r.o.";
                } else if (data2015.get (i)[1] .equals( "02838109")){
                    data2015.get(i)[1] = "Martin Nový";
                } else if (data2015.get (i)[1] .equals( "01846359")){
                    data2015.get(i)[1] = "GreenStyles.";
                } else if (data2015.get (i)[1] .equals( "9831829")){
                    data2015.get(i)[1] = "Valza";
                } else if (data2015.get (i)[1] .equals( "33828139")){
                    data2015.get(i)[1] = "ZCZ";
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        //endregion

        //region: write2015
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("ukol1/VF_2015.csv"));

            for (int i = 0; i < data2015.size(); i++) {
                bw.write(data2015.get(i)[0]);
                bw.write(";");
                bw.write(data2015.get(i)[1]);
                bw.write(";");
                bw.write(data2015.get(i)[2]);
                bw.newLine();
            }

            bw.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        //endregion

        //region :read2016
        try {
            BufferedReader br2 = new BufferedReader(new FileReader("data/VF_2016.dat"));

            String nextLine2 = br2.readLine();
            while (nextLine2 != null){
                String [] row = nextLine2.split(",");
                data2016.add(row);


                nextLine2 = br2.readLine();
            }
            for (int i = 0; i < data2016.size(); i++) {
                if (data2016.get(i)[1] .equals( "05159822")){
                    data2016.get (i)[1] = "BlueNet, s.r.o.";
                } else if (data2016.get (i)[1] .equals( "06230932")){
                    data2016.get(i)[1] = "Epic Internet a.s.";
                } else if (data2016.get (i)[1] .equals( "18539217")){
                    data2016.get(i)[1] = "Big žirafa s.r.o.";
                } else if (data2016.get (i)[1] .equals( "02838109")){
                    data2016.get(i)[1] = "Martin Nový";
                } else if (data2016.get (i)[1] .equals( "01846359")){
                    data2016.get(i)[1] = "GreenStyles.";
                } else if (data2016.get (i)[1] .equals( "9831829")){
                    data2016.get(i)[1] = "Valza";
                } else if (data2016.get (i)[1] .equals( "33828139")){
                    data2016.get(i)[1] = "ZCZ";
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        //endregion22

        //region: write2016
        try {
            BufferedWriter bw2 = new BufferedWriter(new FileWriter("ukol1/VF_2016.csv"));

            for (int i = 0; i < data2016.size(); i++) {
                bw2.write(data2016.get(i)[0]);
                bw2.write(";");
                bw2.write(data2016.get(i)[1]);
                bw2.write(";");
                bw2.write(data2016.get(i)[2]);
                bw2.newLine();
            }

            bw2.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        //endregion2

        //region :read2017
        try {
            BufferedReader br3 = new BufferedReader(new FileReader("data/VF_2017.dat"));

            String nextLine3 = br3.readLine();
            while (nextLine3 != null){
                String [] row = nextLine3.split(",");
                data2017.add(row);


                nextLine3 = br3.readLine();
            }
            for (int i = 0; i < data2017.size(); i++) {
                if (data2017.get(i)[1] .equals( "05159822")){
                    data2017.get (i)[1] = "BlueNet, s.r.o.";
                } else if (data2017.get (i)[1] .equals( "06230932")){
                    data2017.get(i)[1] = "Epic Internet a.s.";
                } else if (data2017.get (i)[1] .equals( "18539217")){
                    data2017.get(i)[1] = "Big žirafa s.r.o.";
                } else if (data2017.get (i)[1] .equals( "02838109")){
                    data2017.get(i)[1] = "Martin Nový";
                } else if (data2017.get (i)[1] .equals( "01846359")){
                    data2017.get(i)[1] = "GreenStyles.";
                } else if (data2017.get (i)[1] .equals( "9831829")){
                    data2017.get(i)[1] = "Valza";
                } else if (data2017.get (i)[1] .equals( "33828139")){
                    data2017.get(i)[1] = "ZCZ";
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        //endregion

        //region: write2017
        try {
            BufferedWriter bw3 = new BufferedWriter(new FileWriter("ukol1/VF_2017.csv"));

            for (int i = 0; i < data2017.size(); i++) {
                bw3.write(data2017.get(i)[0]);
                bw3.write(";");
                bw3.write(data2017.get(i)[1]);
                bw3.write(";");
                bw3.write(data2017.get(i)[2]);
                bw3.newLine();
            }

            bw3.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        //endregion2

        //region :read2018
        try {
            BufferedReader br4 = new BufferedReader(new FileReader("data/VF_2018.dat"));

            String nextLine4 = br4.readLine();
            while (nextLine4 != null){
                String [] row = nextLine4.split(",");
                data2018.add(row);


                nextLine4 = br4.readLine();
            }
            for (int i = 0; i < data2018.size(); i++) {
                if (data2018.get(i)[1] .equals( "05159822")){
                    data2018.get (i)[1] = "BlueNet, s.r.o.";
                } else if (data2018.get (i)[1] .equals( "06230932")){
                    data2018.get(i)[1] = "Epic Internet a.s.";
                } else if (data2018.get (i)[1] .equals( "18539217")){
                    data2018.get(i)[1] = "Big žirafa s.r.o.";
                } else if (data2018.get (i)[1] .equals( "02838109")){
                    data2018.get(i)[1] = "Martin Nový";
                } else if (data2018.get (i)[1] .equals( "01846359")){
                    data2018.get(i)[1] = "GreenStyles.";
                } else if (data2018.get (i)[1] .equals( "9831829")){
                    data2018.get(i)[1] = "Valza";
                } else if (data2018.get (i)[1] .equals( "33828139")){
                    data2018.get(i)[1] = "ZCZ";
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        //endregion22

        //region: write2018
        try {
            BufferedWriter bw4 = new BufferedWriter(new FileWriter("ukol1/VF_2018.csv"));

            for (int i = 0; i < data2018.size(); i++) {
                bw4.write(data2018.get(i)[0]);
                bw4.write(";");
                bw4.write(data2018.get(i)[1]);
                bw4.write(";");
                bw4.write(data2018.get(i)[2]);
                bw4.newLine();
            }

            bw4.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        //endregion2

        //region :read2019
        try {
            BufferedReader br5 = new BufferedReader(new FileReader("data/VF_2019.dat"));

            String nextLine5 = br5.readLine();
            while (nextLine5 != null){
                String [] row = nextLine5.split(",");
                data2019.add(row);


                nextLine5 = br5.readLine();
            }
            for (int i = 0; i < data2019.size(); i++) {
                if (data2019.get(i)[1] .equals( "05159822")){
                    data2019.get (i)[1] = "BlueNet, s.r.o.";
                } else if (data2019.get (i)[1] .equals( "06230932")){
                    data2019.get(i)[1] = "Epic Internet a.s.";
                } else if (data2019.get (i)[1] .equals( "18539217")){
                    data2019.get(i)[1] = "Big žirafa s.r.o.";
                } else if (data2019.get (i)[1] .equals( "02838109")){
                    data2019.get(i)[1] = "Martin Nový";
                } else if (data2019.get (i)[1] .equals( "01846359")){
                    data2019.get(i)[1] = "GreenStyles.";
                } else if (data2019.get (i)[1] .equals( "9831829")){
                    data2019.get(i)[1] = "Valza";
                } else if (data2019.get (i)[1] .equals( "33828139")){
                    data2019.get(i)[1] = "ZCZ";
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        //endregion22

        //region: write2019
        try {
            BufferedWriter bw5 = new BufferedWriter(new FileWriter("ukol1/VF_2019.csv"));

            for (int i = 0; i < data2019.size(); i++) {
                bw5.write(data2019.get(i)[0]);
                bw5.write(";");
                bw5.write(data2019.get(i)[1]);
                bw5.write(";");
                bw5.write(data2019.get(i)[2]);
                bw5.newLine();
            }

            bw5.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        //endregion2

        //region :read2020
        try {
            BufferedReader br6 = new BufferedReader(new FileReader("data/VF_2020.dat"));

            String nextLine6 = br6.readLine();
            while (nextLine6 != null){
                String [] row = nextLine6.split(",");
                data2020.add(row);


                nextLine6 = br6.readLine();
            }
            for (int i = 0; i < data2020.size(); i++) {
                if (data2020.get(i)[1] .equals( "05159822")){
                    data2020.get (i)[1] = "BlueNet, s.r.o.";
                } else if (data2020.get (i)[1] .equals( "06230932")){
                    data2020.get(i)[1] = "Epic Internet a.s.";
                } else if (data2020.get (i)[1] .equals( "18539217")){
                    data2020.get(i)[1] = "Big žirafa s.r.o.";
                } else if (data2020.get (i)[1] .equals( "02838109")){
                    data2020.get(i)[1] = "Martin Nový";
                } else if (data2020.get (i)[1] .equals( "01846359")){
                    data2020.get(i)[1] = "GreenStyles.";
                } else if (data2020.get (i)[1] .equals( "9831829")){
                    data2020.get(i)[1] = "Valza";
                } else if (data2020.get (i)[1] .equals( "33828139")){
                    data2020.get(i)[1] = "ZCZ";
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        //endregion22

        //region: write2020
        try {
            BufferedWriter br6 = new BufferedWriter(new FileWriter("ukol1/VF_2020.csv"));

            for (int i = 0; i < data2020.size(); i++) {
                br6.write(data2020.get(i)[0]);
                br6.write(";");
                br6.write(data2020.get(i)[1]);
                br6.write(";");
                br6.write(data2020.get(i)[2]);
                br6.newLine();
            }

            br6.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        //endregion2

    }

}
