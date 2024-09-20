package net.portswigger.devtools.protocol.types.domsnapshot;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.domsnapshot.TextBoxSnapshot")
public class TextBoxSnapshot {
  @Zvd(Zp = "layoutIndex")
  public final List<Integer> layoutIndex;
  
  @Zvd(Zp = "bounds")
  public final List<List<Double>> bounds;
  
  @Zvd(Zp = "start")
  public final List<Integer> start;
  
  @Zvd(Zp = "length")
  public final List<Integer> length;
  
  @Zox
  public TextBoxSnapshot(@Zc5(Ze = "layoutIndex") List<Integer> paramList1, @Zc5(Ze = "bounds") List<List<Double>> paramList, @Zc5(Ze = "start") List<Integer> paramList2, @Zc5(Ze = "length") List<Integer> paramList3) {
    this.layoutIndex = paramList1;
    this.bounds = paramList;
    this.start = paramList2;
    this.length = paramList3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\domsnapshot\TextBoxSnapshot.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */