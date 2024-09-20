package net.portswigger;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Zt8 {
  String Zd();
  
  String Ze() default "type";
  
  Class[] ZC();
  
  Class ZR() default void.class;
  
  boolean ZQ() default false;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zt8.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */