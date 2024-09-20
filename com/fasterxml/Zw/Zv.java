package com.fasterxml.Zw;

import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zyr;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Zyr
public @interface Zv {
  Class<? extends Zyd> Zo() default com.fasterxml.Zor.Zyh.class;
  
  Class<? extends Zyd> Zu() default com.fasterxml.Zor.Zyh.class;
  
  Class<? extends Zyd> ZY() default com.fasterxml.Zor.Zyh.class;
  
  Class<? extends Zyd> Zd() default com.fasterxml.Zor.Zyh.class;
  
  Class<?> ZM() default Void.class;
  
  Class<?> Zh() default Void.class;
  
  Class<?> Zw() default Void.class;
  
  Zk ZE() default Zk.DEFAULT_TYPING;
  
  Class<? extends com.fasterxml.Zm.Zv> ZZ() default com.fasterxml.Zm.Ze8.class;
  
  Class<? extends com.fasterxml.Zm.Zv> Zt() default com.fasterxml.Zm.Ze8.class;
  
  @Deprecated
  Zj ZT() default Zj.DEFAULT_INCLUSION;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zw\Zv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */