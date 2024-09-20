package net.portswigger.devtools.protocol.types.page;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.BackForwardCacheNotRestoredExplanationTree")
public class BackForwardCacheNotRestoredExplanationTree {
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "explanations")
  public final List<BackForwardCacheNotRestoredExplanation> explanations;
  
  @Zvd(Zp = "children")
  public final List<BackForwardCacheNotRestoredExplanationTree> children;
  
  @Zox
  public BackForwardCacheNotRestoredExplanationTree(@Zc5(Ze = "url") String paramString, @Zc5(Ze = "explanations") List<BackForwardCacheNotRestoredExplanation> paramList, @Zc5(Ze = "children") List<BackForwardCacheNotRestoredExplanationTree> paramList1) {
    this.url = paramString;
    this.explanations = paramList;
    this.children = paramList1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\BackForwardCacheNotRestoredExplanationTree.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */