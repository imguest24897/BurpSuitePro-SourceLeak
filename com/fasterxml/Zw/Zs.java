package com.fasterxml.Zw;

import com.fasterxml.Zor.Ze;
import com.fasterxml.Zyr;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Zyr
public @interface Zs {
  Class<? extends Ze> value() default Ze.class;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zw\Zs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */