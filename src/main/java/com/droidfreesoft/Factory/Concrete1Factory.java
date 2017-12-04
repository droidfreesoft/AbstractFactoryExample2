package com.droidfreesoft.Factory;

import com.droidfreesoft.Concrete.Concrete1;
import com.droidfreesoft.Interface.ProductA;
import com.droidfreesoft.Interface.ProductB;
import com.droidfreesoft.Interface.ProductFactory;
import com.droidfreesoft.Interface.ProductService;
import com.droidfreesoft.Product.ProductA1;
import com.droidfreesoft.Product.ProductB1;

/**
 * Created by gustavo on 12/3/2017.
 */
public class Concrete1Factory implements ProductService {

    public ProductFactory createProduct() {
        return new Concrete1();
    }


}
