package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(App_config.class);

        var cart1 = context.getBean(Cart.class);
        var cart2 = context.getBean(Cart.class);
        cart1.addProductById(3);
        cart1.addProductById(1);
        cart1.addProductById(10);
        cart1.deleteProductById(1);
        cart1.deleteProductById(10);
        cart2.addProductById(2);
        cart2.addProductById(4);
        cart2.addProductById(11);
        cart2.deleteProductById(2);
        cart2.deleteProductById(11);
        System.out.println(cart1);
        System.out.println(cart2);
        context.close();
    }

}
