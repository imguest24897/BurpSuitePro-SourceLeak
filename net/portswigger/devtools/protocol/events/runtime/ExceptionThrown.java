package net.portswigger.devtools.protocol.events.runtime;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.runtime.ExceptionDetails;

@Zsi("net.portswigger.devtools.protocol.events.runtime.ExceptionThrown")
public class ExceptionThrown implements Zl {
  @Zvd(Zp = "timestamp")
  public final Double timestamp;
  
  @Zvd(Zp = "exceptionDetails")
  public final ExceptionDetails exceptionDetails;
  
  @Zox
  public ExceptionThrown(@Zc5(Ze = "timestamp") Double paramDouble, @Zc5(Ze = "exceptionDetails") ExceptionDetails paramExceptionDetails) {
    this.timestamp = paramDouble;
    this.exceptionDetails = paramExceptionDetails;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\runtime\ExceptionThrown.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */