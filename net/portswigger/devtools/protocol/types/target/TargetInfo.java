package net.portswigger.devtools.protocol.types.target;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zsi("net.portswigger.devtools.protocol.types.target.TargetInfo")
public class TargetInfo {
  @Zvd(Zp = "targetId")
  public final String targetId;
  
  @Zvd(Zp = "type")
  public final String type;
  
  @Zvd(Zp = "title")
  public final String title;
  
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "attached")
  public final Boolean attached;
  
  @Zvd(Zp = "openerId")
  @Zj
  public final String openerId;
  
  @Zvd(Zp = "canAccessOpener")
  @Zy
  public final Boolean canAccessOpener;
  
  @Zvd(Zp = "openerFrameId")
  @Zy
  @Zj
  public final String openerFrameId;
  
  @Zvd(Zp = "browserContextId")
  @Zy
  @Zj
  public final String browserContextId;
  
  @Zvd(Zp = "subtype")
  @Zy
  @Zj
  public final String subtype;
  
  private static int[] ZU;
  
  @Zox
  public TargetInfo(@Zc5(Ze = "targetId") String paramString1, @Zc5(Ze = "type") String paramString2, @Zc5(Ze = "title") String paramString3, @Zc5(Ze = "url") String paramString4, @Zc5(Ze = "attached") Boolean paramBoolean1, @Zc5(Ze = "openerId", ZS = "null") String paramString5, @Zc5(Ze = "canAccessOpener") Boolean paramBoolean2, @Zc5(Ze = "openerFrameId", ZS = "null") String paramString6, @Zc5(Ze = "browserContextId", ZS = "null") String paramString7, @Zc5(Ze = "subtype", ZS = "null") String paramString8) {
    this.targetId = paramString1;
    this.type = paramString2;
    this.title = paramString3;
    this.url = paramString4;
    this.attached = paramBoolean1;
    this.openerId = paramString5;
    this.canAccessOpener = paramBoolean2;
    this.openerFrameId = paramString6;
    this.browserContextId = paramString7;
    int[] arrayOfInt = ZD();
    this.subtype = paramString8;
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public static void ZN(int[] paramArrayOfint) {
    ZU = paramArrayOfint;
  }
  
  public static int[] ZD() {
    return ZU;
  }
  
  static {
    if (ZD() == null)
      ZN(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\target\TargetInfo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */