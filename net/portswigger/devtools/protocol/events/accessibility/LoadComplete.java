package net.portswigger.devtools.protocol.events.accessibility;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.accessibility.AXNode;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.accessibility.LoadComplete")
public class LoadComplete implements Zl {
  @Zvd(Zp = "root")
  public final AXNode root;
  
  @Zox
  public LoadComplete(@Zc5(Ze = "root") AXNode paramAXNode) {
    String[] arrayOfString = NodesUpdated.ZD();
    this.root = paramAXNode;
    if (Zbqc.Zwu() == null)
      NodesUpdated.Zj(new String[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\accessibility\LoadComplete.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */