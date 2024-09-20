package com.sun.javafx.logging.jfr;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jdk.jfr.Description;
import jdk.jfr.Name;
import jdk.jfr.Relational;

@Relational
@Name("javafx.PulseId")
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Description("Binds events with same pulse id together")
public @interface PulseId {}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\logging\jfr\PulseId.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */