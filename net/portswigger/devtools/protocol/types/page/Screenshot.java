package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.Screenshot")
public class Screenshot {
  @Zvd(Zp = "image")
  public final ImageResource image;
  
  @Zvd(Zp = "formFactor")
  public final String formFactor;
  
  @Zvd(Zp = "label")
  @Zj
  public final String label;
  
  @Zox
  public Screenshot(@Zc5(Ze = "image") ImageResource paramImageResource, @Zc5(Ze = "formFactor") String paramString1, @Zc5(Ze = "label", ZS = "null") String paramString2) {
    this.image = paramImageResource;
    this.formFactor = paramString1;
    this.label = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\Screenshot.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */