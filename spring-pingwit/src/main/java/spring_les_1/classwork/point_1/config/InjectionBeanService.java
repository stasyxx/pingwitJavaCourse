package spring_les_1.classwork.point_1.config;


import org.springframework.stereotype.Component;
import spring_les_1.classwork.point_1.model.Product;

@Component
public class InjectionBeanService {

    public InjectionBeanService(Product product) {
    }
}