package net.portswigger.devtools.protocol.events.heapprofiler;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.heapprofiler.LastSeenObjectId")
public class LastSeenObjectId implements Zl {
  @Zvd(Zp = "lastSeenObjectId")
  public final Integer lastSeenObjectId;
  
  @Zvd(Zp = "timestamp")
  public final Double timestamp;
  
  @Zox
  public LastSeenObjectId(@Zc5(Ze = "lastSeenObjectId") Integer paramInteger, @Zc5(Ze = "timestamp") Double paramDouble) {
    Zbqc[] arrayOfZbqc = ResetProfiles.ZF();
    this.lastSeenObjectId = paramInteger;
    this.timestamp = paramDouble;
    if (Zbqc.Zwu() == null)
      ResetProfiles.ZI(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\heapprofiler\LastSeenObjectId.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */