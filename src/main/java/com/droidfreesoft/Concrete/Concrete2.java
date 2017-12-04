package com.droidfreesoft.Concrete;

import com.droidfreesoft.Interface.ProductA;
import com.droidfreesoft.Interface.ProductB;
import com.droidfreesoft.Interface.ProductFactory;
import com.droidfreesoft.Product.ProductA2;
import com.droidfreesoft.Product.ProductB2;

/**
 * Created by gustavo on 12/3/2017.
 */
public class Concrete2 implements ProductFactory {
    public ProductA getProductA() {
        return new ProductA2();
    }

    public ProductB getProductB() {
        return new ProductB2();
    }
}
