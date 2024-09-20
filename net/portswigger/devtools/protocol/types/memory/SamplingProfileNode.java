package net.portswigger.devtools.protocol.types.memory;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.memory.SamplingProfileNode")
public class SamplingProfileNode {
  @Zvd(Zp = "size")
  public final Double size;
  
  @Zvd(Zp = "total")
  public final Double total;
  
  @Zvd(Zp = "stack")
  public final List<String> stack;
  
  private static String ZR;
  
  @Zox
  public SamplingProfileNode(@Zc5(Ze = "size") Double paramDouble1, @Zc5(Ze = "total") Double paramDouble2, @Zc5(Ze = "stack") List<String> paramList) {
    this.size = paramDouble1;
    String str = Z_();
    this.total = paramDouble2;
    this.stack = paramList;
    if (Zbqc.Zwu() == null)
      Z_("xrFtCc"); 
  }
  
  public static void Z_(String paramString) {
    ZR = paramString;
  }
  
  public static String Z_() {
    return ZR;
  }
  
  static {
    if (Z_() == null)
      Z_("M8Yd0"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\memory\SamplingProfileNode.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */