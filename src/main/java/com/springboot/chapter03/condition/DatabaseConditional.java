package com.springboot.chapter03.condition;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DatabaseConditional implements Condition {
    /*
     * @param context 条件上下文
     * @param metadata 注释类型的元数据
     * @return true 装配Bean，否则不装配
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment env = context.getEnvironment();
        return env.containsProperty("database.driverName")
                && env.containsProperty("database.url")
                && env.containsProperty("database.username")
                && env.containsProperty("database.password");
    }
}
