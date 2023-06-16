package main.Collections.ArrayList;

import java.util.ArrayList;

public class CustomArrayList {
    int size = 5;

    class Product {
        private int id;
        private String name;
        private char availability;
        private double price;
        private float rating;

        public Product(int id, String name, char availability, double price, float rating) {
            this.id = id;
            this.name = name;
            this.availability = availability;
            this.price = price;
            this.rating = rating;
        }

    }
        public void addElements(int[] id, String[] name, char[] availability, double[] price, float[] rating) {
            ArrayList<Product> arrayList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                arrayList.add(new Product(id[i], name[i], availability[i], price[i], rating[i]));
            }
            displayElements(arrayList);

        }

        public void displayElements(ArrayList<Product> arrayList) {
            System.out.println("Product Id" + " Product Name" + " Pr Availability" + " Pr.Price  " + "Pr.Rating");
            System.out.println("------------------------------------------------------------------------------------");
            for (int i = 0; i < size; i++) {
                Product product = arrayList.get(i);
                System.out.println(product.id + "       " + product.name + "        " + product.availability + "          " + product.price + "     " + product.rating);
            }
        }
}
