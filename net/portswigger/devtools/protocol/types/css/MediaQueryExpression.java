package net.portswigger.devtools.protocol.types.css;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.css.MediaQueryExpression")
public class MediaQueryExpression {
  @Zvd(Zp = "value")
  public final Double value;
  
  @Zvd(Zp = "unit")
  public final String unit;
  
  @Zvd(Zp = "feature")
  public final String feature;
  
  @Zvd(Zp = "valueRange")
  @Zj
  public final SourceRange valueRange;
  
  @Zvd(Zp = "computedLength")
  @Zj
  public final Double computedLength;
  
  @Zox
  public MediaQueryExpression(@Zc5(Ze = "value") Double paramDouble1, @Zc5(Ze = "unit") String paramString1, @Zc5(Ze = "feature") String paramString2, @Zc5(Ze = "valueRange", ZS = "null") SourceRange paramSourceRange, @Zc5(Ze = "computedLength", ZS = "null") Double paramDouble2) {
    this.value = paramDouble1;
    this.unit = paramString1;
    this.feature = paramString2;
    this.valueRange = paramSourceRange;
    this.computedLength = paramDouble2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\MediaQueryExpression.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */