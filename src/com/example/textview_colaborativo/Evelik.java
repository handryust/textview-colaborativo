package com.example.textview_colaborativo;

/**
 * Created by quynna on 23/08/13.
 */
public class Evelik {
    public String getText(){
        return " hola mundo 1";
    }


    public class readData {
        public static String readStr() {
            String sdato = "";
            try{
                BufferedReader readIn = new BufferedReader(new InputStreamReader(System.in));
                sdato = readIn.readLine();
            } catch( IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
            return sdato;
        }
    }
}

