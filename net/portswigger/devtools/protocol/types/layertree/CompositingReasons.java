package net.portswigger.devtools.protocol.types.layertree;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.layertree.CompositingReasons")
public class CompositingReasons {
  @Zvd(Zp = "compositingReasons")
  public final List<String> compositingReasons;
  
  @Zvd(Zp = "compositingReasonIds")
  public final List<String> compositingReasonIds;
  
  @Zox
  public CompositingReasons(@Zc5(Ze = "compositingReasons") List<String> paramList1, @Zc5(Ze = "compositingReasonIds") List<String> paramList2) {
    this.compositingReasons = paramList1;
    this.compositingReasonIds = paramList2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\layertree\CompositingReasons.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */