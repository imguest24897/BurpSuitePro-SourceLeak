package net.portswigger.devtools.protocol.events.dom;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.dom.AttributeModified")
public class AttributeModified implements Zl {
  @Zvd(Zp = "nodeId")
  public final Integer nodeId;
  
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "value")
  public final String value;
  
  @Zox
  public AttributeModified(@Zc5(Ze = "nodeId") Integer paramInteger, @Zc5(Ze = "name") String paramString1, @Zc5(Ze = "value") String paramString2) {
    this.nodeId = paramInteger;
    this.name = paramString1;
    this.value = paramString2;
    String[] arrayOfString = TopLayerElementsUpdated.ZR();
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\dom\AttributeModified.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */