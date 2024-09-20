package net.portswigger.devtools.protocol.types.css;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.css.FontVariationAxis")
public class FontVariationAxis {
  @Zvd(Zp = "tag")
  public final String tag;
  
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "minValue")
  public final Double minValue;
  
  @Zvd(Zp = "maxValue")
  public final Double maxValue;
  
  @Zvd(Zp = "defaultValue")
  public final Double defaultValue;
  
  @Zox
  public FontVariationAxis(@Zc5(Ze = "tag") String paramString1, @Zc5(Ze = "name") String paramString2, @Zc5(Ze = "minValue") Double paramDouble1, @Zc5(Ze = "maxValue") Double paramDouble2, @Zc5(Ze = "defaultValue") Double paramDouble3) {
    this.tag = paramString1;
    this.name = paramString2;
    this.minValue = paramDouble1;
    this.maxValue = paramDouble2;
    this.defaultValue = paramDouble3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\FontVariationAxis.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */