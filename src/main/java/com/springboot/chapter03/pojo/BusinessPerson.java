package com.springboot.chapter03.pojo;

import com.springboot.chapter03.pojo.definition.Animal;
import com.springboot.chapter03.pojo.definition.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BusinessPerson implements Person, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    // @Autowired  // use type of property to find the corresponding Bean
//    @Qualifier("cat")
//    private Animal animal = null;
    private Animal animal = null;

    public BusinessPerson(@Autowired @Qualifier("cat") Animal animal) {
        this.animal = animal;
    }

    @Override
    public void service() {
        this.animal.use();
    }

    @Override
    @Autowired
    @Qualifier("dog")
    public void setAnimal(Animal animal) {
        System.out.println("delay the DI");
        this.animal = animal;
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("【" + this.getClass().getSimpleName()
                + "】调用BeanNameAware的setBeanName");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("【" + this.getClass().getSimpleName()
                + "】调用BeanFactoryAware的setBeanFactory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("【" + this.getClass().getSimpleName()
                + "】调用ApplicationContextAware的setApplicationContext");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("【" + this.getClass().getSimpleName()
                + "】调用InitializingBean的afterPropertiesSet方法");
    }

    @PostConstruct  // init function
    public void init() {
        System.out.println("【" + this.getClass().getSimpleName()
                + "】注解@PostConstruct定义的自定义初始化方法");
    }

    @PreDestroy // defined function of destroy
    public void destroy1() {
        System.out.println("【" + this.getClass().getSimpleName()
                + "】注解@PreDestroy定义的自定义销毁方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("【" + this.getClass().getSimpleName()
                + "】 DisposableBean方法");

    }
}
