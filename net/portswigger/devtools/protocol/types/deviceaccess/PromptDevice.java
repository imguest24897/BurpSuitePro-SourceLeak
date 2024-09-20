package net.portswigger.devtools.protocol.types.deviceaccess;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.deviceaccess.PromptDevice")
public class PromptDevice {
  @Zvd(Zp = "id")
  public final String id;
  
  @Zvd(Zp = "name")
  public final String name;
  
  private static int Zd;
  
  @Zox
  public PromptDevice(@Zc5(Ze = "id") String paramString1, @Zc5(Ze = "name") String paramString2) {
    int i = Zd();
    this.id = paramString1;
    this.name = paramString2;
    if (i == 0)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public static void Ze(int paramInt) {
    Zd = paramInt;
  }
  
  public static int Zu() {
    return Zd;
  }
  
  public static int Zd() {
    int i = Zu();
    return (i == 0) ? 106 : 0;
  }
  
  static {
    if (Zu() != 0)
      Ze(122); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\deviceaccess\PromptDevice.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */