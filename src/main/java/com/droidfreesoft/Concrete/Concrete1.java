package com.droidfreesoft.Concrete;

import com.droidfreesoft.Interface.ProductA;
import com.droidfreesoft.Interface.ProductB;
import com.droidfreesoft.Interface.ProductFactory;
import com.droidfreesoft.Product.ProductA1;
import com.droidfreesoft.Product.ProductB1;

/**
 * Created by gustavo on 12/3/2017.
 */
public class Concrete1 implements ProductFactory {

    public ProductA getProductA() {
        return new ProductA1();
    }

    public ProductB getProductB() {
        return new ProductB1();
    }
}
