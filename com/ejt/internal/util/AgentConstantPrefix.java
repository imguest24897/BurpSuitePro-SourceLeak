package com.ejt.internal.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface AgentConstantPrefix {
  String value();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\ejt\interna\\util\AgentConstantPrefix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */