package net.portswigger.devtools.protocol.types.runtime;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.runtime.CustomPreview")
public class CustomPreview {
  @Zvd(Zp = "header")
  public final String header;
  
  @Zvd(Zp = "bodyGetterId")
  @Zj
  public final String bodyGetterId;
  
  @Zox
  public CustomPreview(@Zc5(Ze = "header") String paramString1, @Zc5(Ze = "bodyGetterId", ZS = "null") String paramString2) {
    this.header = paramString1;
    this.bodyGetterId = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\runtime\CustomPreview.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */