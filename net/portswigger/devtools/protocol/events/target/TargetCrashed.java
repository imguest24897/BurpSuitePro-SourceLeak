package net.portswigger.devtools.protocol.events.target;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.target.TargetCrashed")
public class TargetCrashed implements Zl {
  @Zvd(Zp = "targetId")
  public final String targetId;
  
  @Zvd(Zp = "status")
  public final String status;
  
  @Zvd(Zp = "errorCode")
  public final Integer errorCode;
  
  @Zox
  public TargetCrashed(@Zc5(Ze = "targetId") String paramString1, @Zc5(Ze = "status") String paramString2, @Zc5(Ze = "errorCode") Integer paramInteger) {
    this.targetId = paramString1;
    this.status = paramString2;
    this.errorCode = paramInteger;
    boolean bool = AttachedToTarget.ZH();
    if (!bool)
      Zbqc.Zr(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\target\TargetCrashed.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */