package cn.bugstack.domain.strategy.service.annotation;

import cn.bugstack.domain.strategy.service.rule.filter.factory.DefaultLogicFactory;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 24565
 * @date 2025/2/18 12:23
 * @description 策略自定义注解
 */
//引入 @LogicStrategy 注解后，Spring可以自动扫描和管理这些策略类，
// 并且根据注解中的 logicMode 来将它们动态地注册到 DefaultLogicFactory中
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface  LogicStrategy {
    DefaultLogicFactory.LogicModel logicMode();
}
