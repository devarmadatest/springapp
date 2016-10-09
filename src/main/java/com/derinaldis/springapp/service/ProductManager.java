package com.derinaldis.springapp.service;

import java.io.Serializable;
import java.util.List;
import com.derinaldis.springapp.domain.Product;

public interface ProductManager extends Serializable {

public void increasePrice(int percentage);

public List<Product> getProducts();

}
