package xyz.silencelurker.test.factorybean.pre;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Repository;

/**
 * @author Silence_Lurker
 */
public class RepositoryFactoryBean implements FactoryBean, BeanPostProcessor {

    private List<Repository> repositories;

    @Override
    public Object getObject() throws Exception {
        return repositories.get(0);
    }

    @Override
    public Class getObjectType() {
        return Repository.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Repository) {
            repositories.add((Repository) bean);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

}
