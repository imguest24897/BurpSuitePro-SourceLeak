package net.portswigger.devtools.protocol.types.page;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.BackForwardCacheNotRestoredExplanation")
public class BackForwardCacheNotRestoredExplanation {
  @Zvd(Zp = "type")
  public final BackForwardCacheNotRestoredReasonType type;
  
  @Zvd(Zp = "reason")
  public final BackForwardCacheNotRestoredReason reason;
  
  @Zvd(Zp = "context")
  @Zj
  public final String context;
  
  @Zvd(Zp = "details")
  @Zj
  public final List<BackForwardCacheBlockingDetails> details;
  
  @Zox
  public BackForwardCacheNotRestoredExplanation(@Zc5(Ze = "type") BackForwardCacheNotRestoredReasonType paramBackForwardCacheNotRestoredReasonType, @Zc5(Ze = "reason") BackForwardCacheNotRestoredReason paramBackForwardCacheNotRestoredReason, @Zc5(Ze = "context", ZS = "null") String paramString, @Zc5(Ze = "details", ZS = "null") List<BackForwardCacheBlockingDetails> paramList) {
    this.type = paramBackForwardCacheNotRestoredReasonType;
    this.reason = paramBackForwardCacheNotRestoredReason;
    this.context = paramString;
    this.details = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\BackForwardCacheNotRestoredExplanation.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */