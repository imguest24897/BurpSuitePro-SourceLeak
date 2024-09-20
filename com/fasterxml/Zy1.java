package com.fasterxml;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Zyr
public @interface Zy1 {
  String value() default "";
  
  String Zc() default "";
  
  boolean ZZ() default false;
  
  int Zh() default -1;
  
  String ZH() default "";
  
  Zyj Zk() default Zyj.AUTO;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zy1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */