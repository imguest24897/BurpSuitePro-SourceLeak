package net.portswigger.devtools.protocol.types.page;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.AdFrameStatus")
public class AdFrameStatus {
  @Zvd(Zp = "adFrameType")
  public final AdFrameType adFrameType;
  
  @Zvd(Zp = "explanations")
  @Zj
  public final List<AdFrameExplanation> explanations;
  
  @Zox
  public AdFrameStatus(@Zc5(Ze = "adFrameType") AdFrameType paramAdFrameType, @Zc5(Ze = "explanations", ZS = "null") List<AdFrameExplanation> paramList) {
    this.adFrameType = paramAdFrameType;
    this.explanations = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\AdFrameStatus.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */