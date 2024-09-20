package net.portswigger.devtools.protocol.types.accessibility;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.accessibility.AXProperty")
public class AXProperty {
  @Zvd(Zp = "name")
  public final AXPropertyName name;
  
  @Zvd(Zp = "value")
  public final AXValue value;
  
  @Zox
  public AXProperty(@Zc5(Ze = "name") AXPropertyName paramAXPropertyName, @Zc5(Ze = "value") AXValue paramAXValue) {
    this.name = paramAXPropertyName;
    this.value = paramAXValue;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\accessibility\AXProperty.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */