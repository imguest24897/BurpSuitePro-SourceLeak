package net.portswigger.devtools.protocol.events.heapprofiler;

import burp.Zbqc;
import net.portswigger.Zsi;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.heapprofiler.ResetProfiles")
public class ResetProfiles implements Zl {
  private static Zbqc[] Zf;
  
  public static void ZI(Zbqc[] paramArrayOfZbqc) {
    Zf = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZF() {
    return Zf;
  }
  
  static {
    if (ZF() == null)
      ZI(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\heapprofiler\ResetProfiles.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */