package net.portswigger.devtools.protocol.events.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.network.LoadingFinished")
public class LoadingFinished implements Zl {
  @Zvd(Zp = "requestId")
  public final String requestId;
  
  @Zvd(Zp = "timestamp")
  public final Double timestamp;
  
  @Zvd(Zp = "encodedDataLength")
  public final Double encodedDataLength;
  
  @Zox
  public LoadingFinished(@Zc5(Ze = "requestId") String paramString, @Zc5(Ze = "timestamp") Double paramDouble1, @Zc5(Ze = "encodedDataLength") Double paramDouble2) {
    this.requestId = paramString;
    this.timestamp = paramDouble1;
    this.encodedDataLength = paramDouble2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\network\LoadingFinished.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */