package net.portswigger.devtools.protocol.events.accessibility;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.accessibility.AXNode;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.accessibility.NodesUpdated")
public class NodesUpdated implements Zl {
  @Zvd(Zp = "nodes")
  public final List<AXNode> nodes;
  
  private static String[] ZD;
  
  @Zox
  public NodesUpdated(@Zc5(Ze = "nodes") List<AXNode> paramList) {
    this.nodes = paramList;
    String[] arrayOfString = ZD();
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public static void Zj(String[] paramArrayOfString) {
    ZD = paramArrayOfString;
  }
  
  public static String[] ZD() {
    return ZD;
  }
  
  static {
    if (ZD() == null)
      Zj(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\accessibility\NodesUpdated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */