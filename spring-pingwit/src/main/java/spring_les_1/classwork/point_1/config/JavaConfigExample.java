package spring_les_1.classwork.point_1.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_les_1.classwork.point_1.model.Product;
import spring_les_1.classwork.point_1.model.ProductImpl;
import spring_les_1.classwork.point_1.model.Store;

@Configuration
public class JavaConfigExample {

    @Bean
    public Product product() {
        return new ProductImpl();
    }

    @Bean
    public Store store() {
        Store store = new Store();
        store.setProduct(product());
        return store;
    }
}