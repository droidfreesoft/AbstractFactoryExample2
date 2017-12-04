package com.droidfreesoft.Product;

import com.droidfreesoft.Interface.ProductA;
import com.droidfreesoft.Interface.ProductB;

/**
 * Created by gustavo on 12/3/2017.
 */
public class ProductB1 implements ProductB {
    public ProductB1() {
    }

    public String view() {
        return "This is a Product B1";
    }
}
