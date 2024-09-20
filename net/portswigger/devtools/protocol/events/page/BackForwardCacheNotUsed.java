package net.portswigger.devtools.protocol.events.page;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.page.BackForwardCacheNotRestoredExplanation;
import net.portswigger.devtools.protocol.types.page.BackForwardCacheNotRestoredExplanationTree;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.page.BackForwardCacheNotUsed")
public class BackForwardCacheNotUsed implements Zl {
  @Zvd(Zp = "loaderId")
  public final String loaderId;
  
  @Zvd(Zp = "frameId")
  public final String frameId;
  
  @Zvd(Zp = "notRestoredExplanations")
  public final List<BackForwardCacheNotRestoredExplanation> notRestoredExplanations;
  
  @Zvd(Zp = "notRestoredExplanationsTree")
  @Zj
  public final BackForwardCacheNotRestoredExplanationTree notRestoredExplanationsTree;
  
  @Zox
  public BackForwardCacheNotUsed(@Zc5(Ze = "loaderId") String paramString1, @Zc5(Ze = "frameId") String paramString2, @Zc5(Ze = "notRestoredExplanations") List<BackForwardCacheNotRestoredExplanation> paramList, @Zc5(Ze = "notRestoredExplanationsTree", ZS = "null") BackForwardCacheNotRestoredExplanationTree paramBackForwardCacheNotRestoredExplanationTree) {
    this.loaderId = paramString1;
    this.frameId = paramString2;
    this.notRestoredExplanations = paramList;
    this.notRestoredExplanationsTree = paramBackForwardCacheNotRestoredExplanationTree;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\page\BackForwardCacheNotUsed.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */