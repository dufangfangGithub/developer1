package com.ck.configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class SpringTransactionConfiguration {

        @Autowired
        private ComboPooledDataSource c3p0;

        @Bean
        public DataSourceTransactionManager transactionManager(){
            DataSourceTransactionManager manager = new DataSourceTransactionManager();
            manager.setDataSource(c3p0);
            return manager;

    }

}
