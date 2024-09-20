package net.jcip.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ThreadSafe {}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\jcip\annotations\ThreadSafe.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */