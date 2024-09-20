package net.portswigger.devtools.protocol.events.deviceaccess;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.deviceaccess.PromptDevice;

@Zsi("net.portswigger.devtools.protocol.events.deviceaccess.DeviceRequestPrompted")
public class DeviceRequestPrompted implements Zl {
  @Zvd(Zp = "id")
  public final String id;
  
  @Zvd(Zp = "devices")
  public final List<PromptDevice> devices;
  
  private static Zbqc[] ZC;
  
  @Zox
  public DeviceRequestPrompted(@Zc5(Ze = "id") String paramString, @Zc5(Ze = "devices") List<PromptDevice> paramList) {
    this.id = paramString;
    Zbqc[] arrayOfZbqc = Zf();
    this.devices = paramList;
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public static void ZU(Zbqc[] paramArrayOfZbqc) {
    ZC = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zf() {
    return ZC;
  }
  
  static {
    if (Zf() != null)
      ZU(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\deviceaccess\DeviceRequestPrompted.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */