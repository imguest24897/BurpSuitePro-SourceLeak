package net.portswigger.devtools.client.impl;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.client.impl.devtools.protocol.message.log.impl.DefaultLogStrategy.ResponseProjection")
public class Zx_ {
  @Zvd(Zp = "url")
  public final String ZB;
  
  @Zvd(Zp = "statusText")
  public final String ZI;
  
  private static int Zo;
  
  @Zox
  public Zx_(@Zc5(Ze = "url") String paramString1, @Zc5(Ze = "statusText") String paramString2) {
    this.ZB = paramString1;
    int i = ZZ();
    this.ZI = paramString2;
    if (i != 0)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public static void ZF(int paramInt) {
    Zo = paramInt;
  }
  
  public static int ZZ() {
    return Zo;
  }
  
  public static int ZA() {
    int i = ZZ();
    return (i == 0) ? 86 : 0;
  }
  
  static {
    if (ZZ() != 0)
      ZF(93); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zx_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */