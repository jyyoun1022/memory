package lab.jaeyeal.memory.lab;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

@Profile("default")
@Slf4j
@Configuration
public class ExistsDefaultCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment env = context.getEnvironment();
        BeanDefinitionRegistry registry = context.getRegistry();
        log.info("===============================");
        log.info("REGISTRY_BEAN ::: {}",registry);
        return env.containsProperty("default");
    }
}
