package com.fasterxml;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Zyr
public @interface Zqj {
  Zqh ZA() default Zqh.DEFAULT;
  
  Zqh Zl() default Zqh.DEFAULT;
  
  Zqh Z_() default Zqh.DEFAULT;
  
  Zqh Zp() default Zqh.DEFAULT;
  
  Zqh Zx() default Zqh.DEFAULT;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zqj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */