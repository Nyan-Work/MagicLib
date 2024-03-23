package top.hendrixshen.magiclib.api.dependency.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * CompositeDependencies annotation.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CompositeDependencies {
    /**
     * The dependencies located in this list are logical and.
     *
     * @return Dependencies list.
     */
    Dependencies[] value() default {};
}
