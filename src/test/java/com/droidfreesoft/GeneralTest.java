package com.droidfreesoft;

import com.droidfreesoft.Factory.Concrete1Factory;
import com.droidfreesoft.Factory.Concrete2Factory;
import com.droidfreesoft.Interface.ProductFactory;
import com.droidfreesoft.Interface.ProductService;
import com.droidfreesoft.Product.ProductA1;
import com.droidfreesoft.Product.ProductA2;
import com.droidfreesoft.Product.ProductB1;
import com.droidfreesoft.Product.ProductB2;
import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by gustavo on 12/3/2017.
 */
public class GeneralTest {

    @Test
    public void Concrete1test() throws Exception {
        ProductFactory productFactory = createProduct(new Concrete1Factory());

        ProductA1 productA1 = new ProductA1();
        ProductB1 productB1 = new ProductB1();

        Assert.assertEquals(productA1.view(), productFactory.getProductA().view());
        Assert.assertEquals(productB1.view(), productFactory.getProductB().view());


    }

    @Test
    public void Concrete2test() throws Exception {
        ProductFactory productFactory = createProduct(new Concrete2Factory());

        ProductA2 productA2 = new ProductA2();
        ProductB2 productB2 = new ProductB2();

        Assert.assertEquals(productA2.view(), productFactory.getProductA().view());
        Assert.assertEquals(productB2.view(), productFactory.getProductB().view());
    }


    public ProductFactory createProduct(ProductService productService) {
        ProductFactory productFactory = productService.createProduct();
        System.out.println(productFactory.getProductA().view());
        System.out.println(productFactory.getProductB().view());
        return productFactory;
    }
}
