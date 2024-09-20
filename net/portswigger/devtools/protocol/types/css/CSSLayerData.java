package net.portswigger.devtools.protocol.types.css;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.css.CSSLayerData")
public class CSSLayerData {
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "subLayers")
  @Zj
  public final List<CSSLayerData> subLayers;
  
  @Zvd(Zp = "order")
  public final Double order;
  
  @Zox
  public CSSLayerData(@Zc5(Ze = "name") String paramString, @Zc5(Ze = "subLayers", ZS = "null") List<CSSLayerData> paramList, @Zc5(Ze = "order") Double paramDouble) {
    this.name = paramString;
    this.subLayers = paramList;
    this.order = paramDouble;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\CSSLayerData.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */