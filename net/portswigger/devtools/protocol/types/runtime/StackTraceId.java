package net.portswigger.devtools.protocol.types.runtime;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.runtime.StackTraceId")
public class StackTraceId {
  @Zvd(Zp = "id")
  public final String id;
  
  @Zvd(Zp = "debuggerId")
  @Zj
  public final String debuggerId;
  
  @Zox
  public StackTraceId(@Zc5(Ze = "id") String paramString1, @Zc5(Ze = "debuggerId", ZS = "null") String paramString2) {
    this.id = paramString1;
    this.debuggerId = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\runtime\StackTraceId.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */