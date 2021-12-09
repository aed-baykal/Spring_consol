package app;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {
    private final ProductRepository productRepository;
    private final List<Product> cartProductList;

    public Cart(ProductRepository productRepository){
        this.productRepository = productRepository;
        cartProductList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartProductList=" + cartProductList +
                '}';
    }

    public void addProductById (Integer id){
        if (productRepository.findProdById(id) != null) {
            cartProductList.add(productRepository.findProdById(id));
        }
    }

    public void deleteProductById (Integer id){
        if (productRepository.findProdById(id) != null) {
            cartProductList.remove(productRepository.findProdById(id));
        }
    }

}
