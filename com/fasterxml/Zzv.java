package com.fasterxml;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Zyr
public @interface Zzv {
  String ZH() default "";
  
  Zqi Zb() default Zqi.ANY;
  
  String ZD() default "##default";
  
  String ZR() default "##default";
  
  Zqa Zd() default Zqa.DEFAULT;
  
  Zye[] ZN() default {};
  
  Zye[] Zy() default {};
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zzv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */