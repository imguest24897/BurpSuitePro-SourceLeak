package com.fasterxml.Zw;

import com.fasterxml.Zor.Zp;
import com.fasterxml.Zyr;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Zyr
public @interface Zb {
  Class<? extends Zp> value();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zw\Zb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */