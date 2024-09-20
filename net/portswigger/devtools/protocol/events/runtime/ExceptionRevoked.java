package net.portswigger.devtools.protocol.events.runtime;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.runtime.ExceptionRevoked")
public class ExceptionRevoked implements Zl {
  @Zvd(Zp = "reason")
  public final String reason;
  
  @Zvd(Zp = "exceptionId")
  public final Integer exceptionId;
  
  @Zox
  public ExceptionRevoked(@Zc5(Ze = "reason") String paramString, @Zc5(Ze = "exceptionId") Integer paramInteger) {
    this.reason = paramString;
    this.exceptionId = paramInteger;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\runtime\ExceptionRevoked.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */