package net.portswigger.devtools.protocol.events.layertree;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.layertree.Layer;

@Zsi("net.portswigger.devtools.protocol.events.layertree.LayerTreeDidChange")
public class LayerTreeDidChange implements Zl {
  @Zvd(Zp = "layers")
  @Zj
  public final List<Layer> layers;
  
  private static String[] ZA;
  
  @Zox
  public LayerTreeDidChange(@Zc5(Ze = "layers", ZS = "null") List<Layer> paramList) {
    String[] arrayOfString = Zr();
    this.layers = paramList;
    if (Zbqc.Zwu() == null)
      ZT(new String[4]); 
  }
  
  public static void ZT(String[] paramArrayOfString) {
    ZA = paramArrayOfString;
  }
  
  public static String[] Zr() {
    return ZA;
  }
  
  static {
    if (Zr() == null)
      ZT(new String[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\layertree\LayerTreeDidChange.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */