package dev.nano;

import dev.nano.app.ProductService;
import dev.nano.app.config.AppConfig;
import dev.nano.core.ApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ApplicationContext(AppConfig.class);
        ProductService productService = applicationContext.getBean(ProductService.class);
    }
}
