package net.portswigger.devtools.protocol.events.inspector;

import burp.Zbqc;
import net.portswigger.Zsi;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.inspector.TargetReloadedAfterCrash")
public class TargetReloadedAfterCrash implements Zl {
  private static Zbqc[] ZA;
  
  public static void Zi(Zbqc[] paramArrayOfZbqc) {
    ZA = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zb() {
    return ZA;
  }
  
  static {
    if (Zb() != null)
      Zi(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\inspector\TargetReloadedAfterCrash.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */