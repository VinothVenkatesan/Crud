package com.crudexample.demo.controller;

import com.crudexample.demo.customException.BusinessException;
import com.crudexample.demo.customException.ControllerException;
import com.crudexample.demo.entity.Product;
import com.crudexample.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

//    @PostMapping("/addProduct")
//    public Product addProduct(@RequestBody Product product) {
//        try {
//            return productService.saveProduct(product);
//        } catch (BusinessException e) {
//            ControllerException c = new ControllerException(e.getErrorCode(), e.getErrorMessage());
//
//        } catch (Exception e) {
//
//        }
//    }

    @PostMapping("/addProduct")
    public ResponseEntity<?> addProduct(@RequestBody Product product) {
        try {
            Product p = productService.saveProduct(product);
            return new ResponseEntity<Product>(p, HttpStatus.CREATED);
            // return productService.saveProduct(product);
        } catch (BusinessException e) {
            ControllerException c = new ControllerException(e.getErrorCode(), e.getErrorMessage());
            return new ResponseEntity<ControllerException>(c, HttpStatus.BAD_REQUEST);

        } catch (Exception e) {
            ControllerException c = new ControllerException("611", "Something went wrong in Controller");
            return new ResponseEntity<ControllerException>(c, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return productService.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return productService.getProducts();
    }

//    @GetMapping("/productById/{id}")
//    public Product findProductById(@PathVariable int id) {
//        return productService.getProductById(id);
//    }

    @GetMapping("/productById/{id}")
    public ResponseEntity<?> findProductById(@PathVariable int id) {
        Product pro = productService.getProductById(id);
        return new ResponseEntity<Product>(pro, HttpStatus.OK);
    }

    @GetMapping("/productByName/{name}")
    public Product findProductByName(@PathVariable String name) {
        return productService.getProductByName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }

}
