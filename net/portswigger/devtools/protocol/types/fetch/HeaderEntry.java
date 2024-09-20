package net.portswigger.devtools.protocol.types.fetch;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.fetch.HeaderEntry")
public class HeaderEntry {
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "value")
  public final String value;
  
  private static int[] ZN;
  
  @Zox
  public HeaderEntry(@Zc5(Ze = "name") String paramString1, @Zc5(Ze = "value") String paramString2) {
    this.name = paramString1;
    this.value = paramString2;
  }
  
  public static void ZL(int[] paramArrayOfint) {
    ZN = paramArrayOfint;
  }
  
  public static int[] ZE() {
    return ZN;
  }
  
  static {
    if (ZE() == null)
      ZL(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\fetch\HeaderEntry.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */