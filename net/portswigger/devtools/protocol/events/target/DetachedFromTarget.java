package net.portswigger.devtools.protocol.events.target;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.target.DetachedFromTarget")
public class DetachedFromTarget implements Zl {
  @Zvd(Zp = "sessionId")
  public final String sessionId;
  
  @Zvd(Zp = "targetId")
  @Deprecated
  @Zj
  public final String targetId;
  
  @Zox
  public DetachedFromTarget(@Zc5(Ze = "sessionId") String paramString1, @Zc5(Ze = "targetId", ZS = "null") String paramString2) {
    this.sessionId = paramString1;
    this.targetId = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\target\DetachedFromTarget.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */