package net.portswigger;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Zsb {
  String ZH() default "GET";
  
  String ZL();
  
  String Zc() default "";
  
  @Deprecated
  boolean ZW() default false;
  
  Class<? extends Zrmb> Zp() default Zk1.class;
  
  boolean Ze() default false;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zsb.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */