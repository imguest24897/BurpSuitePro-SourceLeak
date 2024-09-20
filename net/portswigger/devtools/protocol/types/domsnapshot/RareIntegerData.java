package net.portswigger.devtools.protocol.types.domsnapshot;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.domsnapshot.RareIntegerData")
public class RareIntegerData {
  @Zvd(Zp = "index")
  public final List<Integer> index;
  
  @Zvd(Zp = "value")
  public final List<Integer> value;
  
  @Zox
  public RareIntegerData(@Zc5(Ze = "index") List<Integer> paramList1, @Zc5(Ze = "value") List<Integer> paramList2) {
    this.index = paramList1;
    this.value = paramList2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\domsnapshot\RareIntegerData.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */