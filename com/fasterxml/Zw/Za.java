package com.fasterxml.Zw;

import com.fasterxml.Zm.Zv;
import com.fasterxml.Zor.Zf;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zyr;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Zyr
public @interface Za {
  Class<? extends Zyo> Zd() default com.fasterxml.Zor.Zyf.class;
  
  Class<? extends Zyo> Zc() default com.fasterxml.Zor.Zyf.class;
  
  Class<? extends Zf> Za() default com.fasterxml.Zor.Zw.class;
  
  Class<?> Zh() default Void.class;
  
  Class<? extends Zv> ZW() default com.fasterxml.Zm.Ze8.class;
  
  Class<? extends Zv> Zi() default com.fasterxml.Zm.Ze8.class;
  
  Class<?> Zk() default Void.class;
  
  Class<?> ZC() default Void.class;
  
  Class<?> Zy() default Void.class;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zw\Za.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */