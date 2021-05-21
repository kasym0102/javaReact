package com.Service;


import com.Entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    Boolean addProduct(Product product);

    Boolean updateProduct(Product product);

    Boolean deleteProduct(String name, String printingOffice, String writter, int volume);

    List<Product> searchProduct(String search);

    List<Product> getProductsByCategory(int id);

}
