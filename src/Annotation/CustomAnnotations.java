package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 10:49 2019/5/15
 * @Version: $
 */
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
public @interface CustomAnnotations {
    int age();
    String name();
}
