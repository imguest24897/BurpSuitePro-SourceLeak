package net.portswigger.devtools.protocol.types.css;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zsi("net.portswigger.devtools.protocol.types.css.CSSProperty")
public class CSSProperty {
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "value")
  public final String value;
  
  @Zvd(Zp = "important")
  @Zj
  public final Boolean important;
  
  @Zvd(Zp = "implicit")
  @Zj
  public final Boolean implicit;
  
  @Zvd(Zp = "text")
  @Zj
  public final String text;
  
  @Zvd(Zp = "parsedOk")
  @Zj
  public final Boolean parsedOk;
  
  @Zvd(Zp = "disabled")
  @Zj
  public final Boolean disabled;
  
  @Zvd(Zp = "range")
  @Zj
  public final SourceRange range;
  
  @Zvd(Zp = "longhandProperties")
  @Zy
  @Zj
  public final List<CSSProperty> longhandProperties;
  
  @Zox
  public CSSProperty(@Zc5(Ze = "name") String paramString1, @Zc5(Ze = "value") String paramString2, @Zc5(Ze = "important", ZS = "null") Boolean paramBoolean1, @Zc5(Ze = "implicit", ZS = "null") Boolean paramBoolean2, @Zc5(Ze = "text", ZS = "null") String paramString3, @Zc5(Ze = "parsedOk", ZS = "null") Boolean paramBoolean3, @Zc5(Ze = "disabled", ZS = "null") Boolean paramBoolean4, @Zc5(Ze = "range", ZS = "null") SourceRange paramSourceRange, @Zc5(Ze = "longhandProperties", ZS = "null") List<CSSProperty> paramList) {
    this.name = paramString1;
    this.value = paramString2;
    this.important = paramBoolean1;
    this.implicit = paramBoolean2;
    this.text = paramString3;
    this.parsedOk = paramBoolean3;
    this.disabled = paramBoolean4;
    this.range = paramSourceRange;
    this.longhandProperties = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\CSSProperty.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */