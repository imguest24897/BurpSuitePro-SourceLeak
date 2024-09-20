package net.portswigger.devtools.protocol.types.runtime;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.runtime.PropertyPreview")
public class PropertyPreview {
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "type")
  public final PropertyPreviewType type;
  
  @Zvd(Zp = "value")
  @Zj
  public final String value;
  
  @Zvd(Zp = "valuePreview")
  @Zj
  public final ObjectPreview valuePreview;
  
  @Zvd(Zp = "subtype")
  @Zj
  public final PropertyPreviewSubtype subtype;
  
  @Zox
  public PropertyPreview(@Zc5(Ze = "name") String paramString1, @Zc5(Ze = "type") PropertyPreviewType paramPropertyPreviewType, @Zc5(Ze = "value", ZS = "null") String paramString2, @Zc5(Ze = "valuePreview", ZS = "null") ObjectPreview paramObjectPreview, @Zc5(Ze = "subtype", ZS = "null") PropertyPreviewSubtype paramPropertyPreviewSubtype) {
    this.name = paramString1;
    this.type = paramPropertyPreviewType;
    this.value = paramString2;
    this.valuePreview = paramObjectPreview;
    this.subtype = paramPropertyPreviewSubtype;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\runtime\PropertyPreview.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */