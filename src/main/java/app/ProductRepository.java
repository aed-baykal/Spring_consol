package app;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    List<Product> productList;

    ProductRepository() {
        this.productList = new ArrayList<>();
        productList.add(new Product(1, "prod1", 10.5f));
        productList.add(new Product(2, "prod2", 11.5f));
        productList.add(new Product(3, "prod3", 12.5f));
        productList.add(new Product(4, "prod4", 13.5f));
        productList.add(new Product(5, "prod5", 14.5f));
    }

    public Product findProdById(Integer id){
        for (Product product : productList) {
            if (product.getId().equals(id)) return product;
        }
        return null;
    }

}
