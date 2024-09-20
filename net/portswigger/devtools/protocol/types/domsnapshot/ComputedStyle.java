package net.portswigger.devtools.protocol.types.domsnapshot;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.domsnapshot.ComputedStyle")
public class ComputedStyle {
  @Zvd(Zp = "properties")
  public final List<NameValue> properties;
  
  @Zox
  public ComputedStyle(@Zc5(Ze = "properties") List<NameValue> paramList) {
    this.properties = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\domsnapshot\ComputedStyle.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */