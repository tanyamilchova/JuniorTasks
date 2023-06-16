package main.Collections.ArrayList;

public class DemoCustomedArrayList {
    public static void main(String[] args) {
        int[] id={21823,89774,34007,12098,10067};
        String[]name={"HP Laptop ","Investers ","Volats AC ","iP        ","Phone     "};
        char[]availability={'Y','Y','N','Y','Y'};
        double[]price={31987,16900,28000,99000,67570,605};
        float rating[]={4.5f,4.0f,4.7f,4.5f,3.9f,4.0f};

        CustomArrayList customArrayList=new CustomArrayList();
        customArrayList.addElements(id,name,availability,price,rating);
    }
}

