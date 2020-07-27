package com.tuling.parsebeandefinition;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * Created by smlz on 2019/7/15.
 */
@Component
public class TulingImportBeanfinitionRegister implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		System.out.println("Œ“ «TulingImportBeanfinitionRegister")
		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(CompentB.class);
		registry.registerBeanDefinition("compentB",rootBeanDefinition);
		System.out.println("TulingImportBeanfinitionRegister execute  after")
		System.out.println("TulingImportBeanfinitionRegister execute  after  will register compentB")
	}
}
