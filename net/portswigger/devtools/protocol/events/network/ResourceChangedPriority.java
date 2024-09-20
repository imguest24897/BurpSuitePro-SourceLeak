package net.portswigger.devtools.protocol.events.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.network.ResourcePriority;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.network.ResourceChangedPriority")
public class ResourceChangedPriority implements Zl {
  @Zvd(Zp = "requestId")
  public final String requestId;
  
  @Zvd(Zp = "newPriority")
  public final ResourcePriority newPriority;
  
  @Zvd(Zp = "timestamp")
  public final Double timestamp;
  
  @Zox
  public ResourceChangedPriority(@Zc5(Ze = "requestId") String paramString, @Zc5(Ze = "newPriority") ResourcePriority paramResourcePriority, @Zc5(Ze = "timestamp") Double paramDouble) {
    this.requestId = paramString;
    this.newPriority = paramResourcePriority;
    this.timestamp = paramDouble;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\network\ResourceChangedPriority.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */