/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Product.Product;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author raunak
 */
public class Employee {

    private HashMap<String, ArrayList<Product>> productsHashMap;

    public HashMap<String, ArrayList<Product>> getProductsHashMap() {
        return productsHashMap;
    }

    public void setProductsHashMap(HashMap<String, ArrayList<Product>> productsHashMap) {
        this.productsHashMap = productsHashMap;
    }

    private String name;
    private int id;
    private static int count = 1;

    public Employee() {
        productsHashMap = new HashMap<String, ArrayList<Product>>();
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}
