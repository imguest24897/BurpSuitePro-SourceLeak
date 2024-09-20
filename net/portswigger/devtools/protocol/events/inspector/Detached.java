package net.portswigger.devtools.protocol.events.inspector;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.inspector.Detached")
public class Detached implements Zl {
  @Zvd(Zp = "reason")
  public final String reason;
  
  @Zox
  public Detached(@Zc5(Ze = "reason") String paramString) {
    Zbqc[] arrayOfZbqc = TargetReloadedAfterCrash.Zb();
    this.reason = paramString;
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\inspector\Detached.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */