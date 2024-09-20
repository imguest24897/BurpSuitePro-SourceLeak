package com.fasterxml;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Zyr
public @interface Zqq {
  String Zt() default "@id";
  
  Class<? extends Zys<?>> ZM();
  
  Class<? extends Zq_> Zs() default Zvu.class;
  
  Class<?> Zm() default Object.class;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zqq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */