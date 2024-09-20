package net.portswigger.devtools.protocol.types.domsnapshot;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.domsnapshot.RareBooleanData")
public class RareBooleanData {
  @Zvd(Zp = "index")
  public final List<Integer> index;
  
  @Zox
  public RareBooleanData(@Zc5(Ze = "index") List<Integer> paramList) {
    this.index = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\domsnapshot\RareBooleanData.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */