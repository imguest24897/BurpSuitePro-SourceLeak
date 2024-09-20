package net.portswigger.devtools.protocol.events.webaudio;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.webaudio.NodesDisconnected")
public class NodesDisconnected implements Zl {
  @Zvd(Zp = "contextId")
  public final String contextId;
  
  @Zvd(Zp = "sourceId")
  public final String sourceId;
  
  @Zvd(Zp = "destinationId")
  public final String destinationId;
  
  @Zvd(Zp = "sourceOutputIndex")
  @Zj
  public final Double sourceOutputIndex;
  
  @Zvd(Zp = "destinationInputIndex")
  @Zj
  public final Double destinationInputIndex;
  
  private static String ZO;
  
  @Zox
  public NodesDisconnected(@Zc5(Ze = "contextId") String paramString1, @Zc5(Ze = "sourceId") String paramString2, @Zc5(Ze = "destinationId") String paramString3, @Zc5(Ze = "sourceOutputIndex", ZS = "null") Double paramDouble1, @Zc5(Ze = "destinationInputIndex", ZS = "null") Double paramDouble2) {
    this.contextId = paramString1;
    String str = ZP();
    this.sourceId = paramString2;
    this.destinationId = paramString3;
    this.sourceOutputIndex = paramDouble1;
    this.destinationInputIndex = paramDouble2;
    if (str != null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public static void Zi(String paramString) {
    ZO = paramString;
  }
  
  public static String ZP() {
    return ZO;
  }
  
  static {
    if (ZP() != null)
      Zi("RIwcBc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\webaudio\NodesDisconnected.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */