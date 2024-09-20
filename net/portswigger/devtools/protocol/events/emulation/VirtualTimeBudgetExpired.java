package net.portswigger.devtools.protocol.events.emulation;

import net.portswigger.Zsi;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.emulation.VirtualTimeBudgetExpired")
public class VirtualTimeBudgetExpired implements Zl {
  private static boolean ZO;
  
  public static void Zn(boolean paramBoolean) {
    ZO = paramBoolean;
  }
  
  public static boolean ZF() {
    return ZO;
  }
  
  public static boolean ZY() {
    boolean bool = ZF();
    return !bool;
  }
  
  static {
    if (ZF())
      Zn(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\emulation\VirtualTimeBudgetExpired.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */