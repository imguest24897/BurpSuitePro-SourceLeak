package net.portswigger.devtools.protocol.types.browser;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.browser.PermissionDescriptor")
public class PermissionDescriptor {
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "sysex")
  @Zj
  public final Boolean sysex;
  
  @Zvd(Zp = "userVisibleOnly")
  @Zj
  public final Boolean userVisibleOnly;
  
  @Zvd(Zp = "allowWithoutSanitization")
  @Zj
  public final Boolean allowWithoutSanitization;
  
  @Zvd(Zp = "allowWithoutGesture")
  @Zj
  public final Boolean allowWithoutGesture;
  
  @Zvd(Zp = "panTiltZoom")
  @Zj
  public final Boolean panTiltZoom;
  
  @Zox
  public PermissionDescriptor(@Zc5(Ze = "name") String paramString, @Zc5(Ze = "sysex", ZS = "null") Boolean paramBoolean1, @Zc5(Ze = "userVisibleOnly", ZS = "null") Boolean paramBoolean2, @Zc5(Ze = "allowWithoutSanitization", ZS = "null") Boolean paramBoolean3, @Zc5(Ze = "allowWithoutGesture", ZS = "null") Boolean paramBoolean4, @Zc5(Ze = "panTiltZoom", ZS = "null") Boolean paramBoolean5) {
    this.name = paramString;
    this.sysex = paramBoolean1;
    int[] arrayOfInt = WindowForTarget.Zw();
    this.userVisibleOnly = paramBoolean2;
    this.allowWithoutSanitization = paramBoolean3;
    this.allowWithoutGesture = paramBoolean4;
    this.panTiltZoom = paramBoolean5;
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\browser\PermissionDescriptor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */