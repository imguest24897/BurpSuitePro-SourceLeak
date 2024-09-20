package com.github.weisj.jsvg.nodes.prototype.spec;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ElementCategories {
  Category[] value();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\prototype\spec\ElementCategories.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */