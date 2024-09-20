package com.nimbusds.jose.shaded.json.annotate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@JsonSmartAnnotation
public @interface JsonIgnore {
  boolean value() default true;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\annotate\JsonIgnore.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */