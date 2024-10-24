package com.vishawamtech.servicelocator.config;


import com.vishawamtech.servicelocator.service.PaymentServiceRegistry;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceLocatorConfig {

    @Bean
    public FactoryBean<?> getPaymentServiceBean() {
        ServiceLocatorFactoryBean bean = new ServiceLocatorFactoryBean();
        bean.setServiceLocatorInterface(PaymentServiceRegistry.class);
        return bean;
    }


}
