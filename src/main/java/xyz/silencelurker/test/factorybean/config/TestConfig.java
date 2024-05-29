package xyz.silencelurker.test.factorybean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import xyz.silencelurker.test.factorybean.pre.RepositoryFactoryBean;

/**
 * @author Silence_Lurker
 */
@Configuration
public class TestConfig {
    @Bean
    protected RepositoryFactoryBean repositoryFactoryBean() {
        return new RepositoryFactoryBean();
    }
}
