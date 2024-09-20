package com.nimbusds.jose.shaded.asm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public interface FieldFilter {
  boolean canUse(Field paramField);
  
  boolean canUse(Field paramField, Method paramMethod);
  
  boolean canRead(Field paramField);
  
  boolean canWrite(Field paramField);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\asm\FieldFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */