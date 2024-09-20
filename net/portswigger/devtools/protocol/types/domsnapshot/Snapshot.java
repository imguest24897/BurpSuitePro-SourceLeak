package net.portswigger.devtools.protocol.types.domsnapshot;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.domsnapshot.Snapshot")
public class Snapshot {
  @Zvd(Zp = "domNodes")
  public final List<DOMNode> domNodes;
  
  @Zvd(Zp = "layoutTreeNodes")
  public final List<LayoutTreeNode> layoutTreeNodes;
  
  @Zvd(Zp = "computedStyles")
  public final List<ComputedStyle> computedStyles;
  
  private static String Zx;
  
  @Zox
  public Snapshot(@Zc5(Ze = "domNodes") List<DOMNode> paramList, @Zc5(Ze = "layoutTreeNodes") List<LayoutTreeNode> paramList1, @Zc5(Ze = "computedStyles") List<ComputedStyle> paramList2) {
    this.domNodes = paramList;
    this.layoutTreeNodes = paramList1;
    this.computedStyles = paramList2;
  }
  
  public static void ZM(String paramString) {
    Zx = paramString;
  }
  
  public static String ZQ() {
    return Zx;
  }
  
  static {
    if (ZQ() == null)
      ZM("VLjC4"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\domsnapshot\Snapshot.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */