package com.mystore.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    
    public static void main(String[] arg) {
       
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the beans
        Product tumbler = context.getBean("tumbler", Product.class);
        Product bucket = context.getBean("bucket", Product.class);

        // Product p1 = new Product();
        tumbler.setId(1);
        tumbler.setName("Tumbler");
        System.out.println(tumbler);

        // Product p2 = new Product();
        bucket.setId(2);
        bucket.setName("Bucket");        
        System.out.println(bucket);

        
    }  
}