package com.fasterxml.Zw;

import com.fasterxml.Zo.Zzp;
import com.fasterxml.Zyr;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Zyr
public @interface Zz {
  Class<? extends Zzp> value();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zw\Zz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */