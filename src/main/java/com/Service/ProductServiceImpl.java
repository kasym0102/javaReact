package com.Service;

import com.Repository.ProductIDentifier;
import com.Repository.ProductDAO;
import com.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductDAO productDAO;

    @Override
    public List<Product> getProducts() {
        return productDAO.findAll();
    }

    @Override
    public Boolean addProduct(Product product) {
        if( getProduct(product.getProductIDentifier().getName(),
                product.getProductIDentifier().getPrinter(),
                product.getProductIDentifier().getWritter(),
                product.getProductIDentifier().getVolume()).isPresent() == false){
            productDAO.save(product);
            return true;
        }else{
            return false;
        }

    }

    @Override
    public Boolean updateProduct(Product product) {
        if( getProduct(product.getProductIDentifier().getName(),
                product.getProductIDentifier().getPrinter(),
                product.getProductIDentifier().getWritter(),
                product.getProductIDentifier().getVolume()).isPresent() == true){
            productDAO.save(product);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Boolean deleteProduct(String name, String printingOffice, String writter, int volume) {
        try{
            productDAO.deleteById(new ProductIDentifier(name, printingOffice, writter, volume));
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public List<Product> searchProduct(String search) {

        Hashtable<String, Product> products = new Hashtable<String, Product>();
        for (String temp : search.split(" ")) {

            productDAO.searchProduct(temp);

            for (Product temp2 : productDAO.searchProduct(temp)) {
                String x = temp2.getProductIDentifier().getName() + " " +
                        temp2.getProductIDentifier().getPrinter() + " " +
                        temp2.getProductIDentifier().getWritter() + " " +
                        temp2.getProductIDentifier().getVolume();
                if (!products.containsKey(x)) {
                    products.put(x, temp2);
                }
            }
        }

        return new ArrayList<Product>(products.values());

    }

    @Override
    public List<Product> getProductsByCategory(int id) {
        return productDAO.findByCategoryId(id);
    }


    private Optional<Product> getProduct(String name, String printingOffice, String writter, int volume) {
        return productDAO.findById(new ProductIDentifier(name,printingOffice,writter,volume));
    }
}
