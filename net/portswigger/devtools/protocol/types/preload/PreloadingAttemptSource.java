package net.portswigger.devtools.protocol.types.preload;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.preload.PreloadingAttemptSource")
public class PreloadingAttemptSource {
  @Zvd(Zp = "key")
  public final PreloadingAttemptKey key;
  
  @Zvd(Zp = "ruleSetIds")
  public final List<String> ruleSetIds;
  
  @Zvd(Zp = "nodeIds")
  public final List<Integer> nodeIds;
  
  @Zox
  public PreloadingAttemptSource(@Zc5(Ze = "key") PreloadingAttemptKey paramPreloadingAttemptKey, @Zc5(Ze = "ruleSetIds") List<String> paramList, @Zc5(Ze = "nodeIds") List<Integer> paramList1) {
    this.key = paramPreloadingAttemptKey;
    this.ruleSetIds = paramList;
    this.nodeIds = paramList1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\preload\PreloadingAttemptSource.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */