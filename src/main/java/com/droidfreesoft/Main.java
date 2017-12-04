package com.droidfreesoft;

import com.droidfreesoft.Factory.Concrete1Factory;
import com.droidfreesoft.Factory.Concrete2Factory;
import com.droidfreesoft.Interface.ProductFactory;
import com.droidfreesoft.Interface.ProductService;

/**
 * Created by gustavo on 12/3/2017.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Create product group 1");
        createProduct(new Concrete1Factory());

        System.out.println("Create product group 2");
        createProduct(new Concrete2Factory());

    }

    public static void createProduct(ProductService productService) {
        ProductFactory productFactory = productService.createProduct();
        System.out.println("---------------------------------");
        System.out.println(productFactory.getProductA().view());
        System.out.println(productFactory.getProductB().view());
        System.out.println("---------------------------------");
    }
}
