package com.Controller;

import com.Repository.ProductIDentifier;
import com.Service.ProductService;
import com.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;


    @GetMapping
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @PostMapping("/addProduct")
    public ResponseEntity addProduct(@RequestBody Product product) {
        if( productService.addProduct(product)){ ;
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.unprocessableEntity().build();
    }

    @PutMapping("/updateProduct")
    public ResponseEntity updateProduct(@RequestBody Product product) {
        if(productService.updateProduct(product)){
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.unprocessableEntity().build();
    }

    @DeleteMapping("/deleteProduct")
    public ResponseEntity deleteProduct(@RequestBody ProductIDentifier temp) {
        if( productService.deleteProduct(temp.getName(), temp.getPrinter(), temp.getWritter(), temp.getVolume())){
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.unprocessableEntity().build();
    }

    @GetMapping("/category_id={id}")
    public List<Product> getProductsByCategory(@PathVariable int id) {
        return productService.getProductsByCategory(id);
    }



    @GetMapping("/search={search}")
    public List<Product> searchProduct(@PathVariable String search) {
        return productService.searchProduct(search);
    }


}
