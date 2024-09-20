package com.fasterxml;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Zyr
public @interface Zvm {
  Zqg value() default Zqg.ALWAYS;
  
  Zqg Zg() default Zqg.ALWAYS;
  
  Class<?> Zr() default Void.class;
  
  Class<?> Zk() default Void.class;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zvm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */