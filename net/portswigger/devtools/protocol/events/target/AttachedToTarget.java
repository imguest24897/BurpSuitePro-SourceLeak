package net.portswigger.devtools.protocol.events.target;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.target.TargetInfo;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.target.AttachedToTarget")
public class AttachedToTarget implements Zl {
  @Zvd(Zp = "sessionId")
  public final String sessionId;
  
  @Zvd(Zp = "targetInfo")
  public final TargetInfo targetInfo;
  
  @Zvd(Zp = "waitingForDebugger")
  public final Boolean waitingForDebugger;
  
  private static boolean ZX;
  
  @Zox
  public AttachedToTarget(@Zc5(Ze = "sessionId") String paramString, @Zc5(Ze = "targetInfo") TargetInfo paramTargetInfo, @Zc5(Ze = "waitingForDebugger") Boolean paramBoolean) {
    this.sessionId = paramString;
    this.targetInfo = paramTargetInfo;
    this.waitingForDebugger = paramBoolean;
  }
  
  public static void ZU(boolean paramBoolean) {
    ZX = paramBoolean;
  }
  
  public static boolean ZO() {
    return ZX;
  }
  
  public static boolean ZH() {
    boolean bool = ZO();
    return !bool;
  }
  
  static {
    if (!ZH())
      ZU(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\target\AttachedToTarget.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */