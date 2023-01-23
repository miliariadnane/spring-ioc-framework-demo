package dev.nano.core;

import dev.nano.core.util.Assert;

public class ApplicationContext {

    public ApplicationContext(Class... configClasses) {
        /*
        * 1. Register the config class itself as a bean
        * 2. Register all declared beans in the config class
        * 3. Scan base packages  for classes annotated with @Component
        * 4. Register all declared beans in the component classes
         */
        this.registerConfigClass(configClasses);
    }

    private void registerConfigClass (Class[] configClasses) {
        Assert.notEmpty(configClasses, "config classes list must not be empty");
        for (var configClass: configClasses) {
            if (configClass.isAnnotation() || configClass.isInterface())
                continue;
            registerConfigClass(configClass);
        }
    }

    private void registerConfigClass (Class configClass) {
        registerClass(configClass);
        registerDeclaredBeans(configClass);
        scanPackages(configClass);
    }

    private void scanPackages (Class configClass) {
    }

    private void registerDeclaredBeans (Class configClass) {
    }

    private void registerClass (Class clazz) {

    }

    public <T> T getBean (Class<T> type) {
        return null;
    }
}
