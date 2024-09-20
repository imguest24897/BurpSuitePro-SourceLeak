package com.fasterxml;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Zyr
public @interface Zvi {
  String value() default "";
  
  Zvg ZE() default Zvg.DEFAULT;
  
  Zvg Zr() default Zvg.DEFAULT;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zvi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */