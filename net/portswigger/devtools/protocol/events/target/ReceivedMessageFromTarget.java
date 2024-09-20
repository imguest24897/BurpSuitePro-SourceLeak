package net.portswigger.devtools.protocol.events.target;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.target.ReceivedMessageFromTarget")
public class ReceivedMessageFromTarget implements Zl {
  @Zvd(Zp = "sessionId")
  public final String sessionId;
  
  @Zvd(Zp = "message")
  public final String message;
  
  @Zvd(Zp = "targetId")
  @Deprecated
  @Zj
  public final String targetId;
  
  @Zox
  public ReceivedMessageFromTarget(@Zc5(Ze = "sessionId") String paramString1, @Zc5(Ze = "message") String paramString2, @Zc5(Ze = "targetId", ZS = "null") String paramString3) {
    this.sessionId = paramString1;
    this.message = paramString2;
    boolean bool = AttachedToTarget.ZO();
    this.targetId = paramString3;
    if (Zbqc.Zwu() == null)
      AttachedToTarget.ZU(!bool); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\target\ReceivedMessageFromTarget.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */