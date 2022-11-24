package com.crudexample.demo.service;

import com.crudexample.demo.customException.BusinessException;
import com.crudexample.demo.entity.Product;
import com.crudexample.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product) {
        if (product.getName().isEmpty() || product.getName().length() == 0) {
            throw new BusinessException("601", "Product Name is Empty");
        }
        try {
            return repository.save(product);
        } catch (IllegalArgumentException e) {
            throw new BusinessException("602", "Given Product is null" + e.getMessage());

        } catch (Exception e) {
            throw new BusinessException("603", "Some Other Exception in Product Save Service Layer" + e.getMessage());
        }
    }

    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product getProductById(int id) {
        return repository.findById(id).get();
    }

    public Product getProductByName(String name) {
        return repository.findByName(name);
    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "Product" + " " + id + " " + "Deleted Successfully";
    }

    public Product updateProduct(Product product) {
        Product exisitingProduct = repository.findById(product.getId()).orElse(null);
        exisitingProduct.setName(product.getName());
        exisitingProduct.setQuantity(product.getQuantity());
        exisitingProduct.setPrice(product.getPrice());
        return repository.save(exisitingProduct);
    }
}
