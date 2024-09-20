package com.fasterxml;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Zyr
public @interface Zv5 {
  Zg_ Ze();
  
  Zyc ZZ() default Zyc.PROPERTY;
  
  String Zr() default "";
  
  Class<?> Zg() default Zv5.class;
  
  boolean Zk() default false;
  
  Zqa Z_() default Zqa.DEFAULT;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zv5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */