package net.portswigger.devtools.protocol.types.accessibility;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.accessibility.AXValueSource")
public class AXValueSource {
  @Zvd(Zp = "type")
  public final AXValueSourceType type;
  
  @Zvd(Zp = "value")
  @Zj
  public final AXValue value;
  
  @Zvd(Zp = "attribute")
  @Zj
  public final String attribute;
  
  @Zvd(Zp = "attributeValue")
  @Zj
  public final AXValue attributeValue;
  
  @Zvd(Zp = "superseded")
  @Zj
  public final Boolean superseded;
  
  @Zvd(Zp = "nativeSource")
  @Zj
  public final AXValueNativeSourceType nativeSource;
  
  @Zvd(Zp = "nativeSourceValue")
  @Zj
  public final AXValue nativeSourceValue;
  
  @Zvd(Zp = "invalid")
  @Zj
  public final Boolean invalid;
  
  @Zvd(Zp = "invalidReason")
  @Zj
  public final String invalidReason;
  
  @Zox
  public AXValueSource(@Zc5(Ze = "type") AXValueSourceType paramAXValueSourceType, @Zc5(Ze = "value", ZS = "null") AXValue paramAXValue1, @Zc5(Ze = "attribute", ZS = "null") String paramString1, @Zc5(Ze = "attributeValue", ZS = "null") AXValue paramAXValue2, @Zc5(Ze = "superseded", ZS = "null") Boolean paramBoolean1, @Zc5(Ze = "nativeSource", ZS = "null") AXValueNativeSourceType paramAXValueNativeSourceType, @Zc5(Ze = "nativeSourceValue", ZS = "null") AXValue paramAXValue3, @Zc5(Ze = "invalid", ZS = "null") Boolean paramBoolean2, @Zc5(Ze = "invalidReason", ZS = "null") String paramString2) {
    this.type = paramAXValueSourceType;
    this.value = paramAXValue1;
    String str = AXNode.Zz();
    this.attribute = paramString1;
    this.attributeValue = paramAXValue2;
    this.superseded = paramBoolean1;
    this.nativeSource = paramAXValueNativeSourceType;
    this.nativeSourceValue = paramAXValue3;
    this.invalid = paramBoolean2;
    this.invalidReason = paramString2;
    if (Zbqc.Zwu() == null)
      AXNode.Zh("eSmmb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\accessibility\AXValueSource.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */