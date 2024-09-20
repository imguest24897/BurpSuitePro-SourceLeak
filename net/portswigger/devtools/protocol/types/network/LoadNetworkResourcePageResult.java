package net.portswigger.devtools.protocol.types.network;

import java.util.Map;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.network.LoadNetworkResourcePageResult")
public class LoadNetworkResourcePageResult {
  @Zvd(Zp = "success")
  public final Boolean success;
  
  @Zvd(Zp = "netError")
  @Zj
  public final Double netError;
  
  @Zvd(Zp = "netErrorName")
  @Zj
  public final String netErrorName;
  
  @Zvd(Zp = "httpStatusCode")
  @Zj
  public final Double httpStatusCode;
  
  @Zvd(Zp = "stream")
  @Zj
  public final String stream;
  
  @Zvd(Zp = "headers")
  @Zj
  public final Map<String, Zi7> headers;
  
  @Zox
  public LoadNetworkResourcePageResult(@Zc5(Ze = "success") Boolean paramBoolean, @Zc5(Ze = "netError", ZS = "null") Double paramDouble1, @Zc5(Ze = "netErrorName", ZS = "null") String paramString1, @Zc5(Ze = "httpStatusCode", ZS = "null") Double paramDouble2, @Zc5(Ze = "stream", ZS = "null") String paramString2, @Zc5(Ze = "headers", ZS = "null") Map<String, Zi7> paramMap) {
    this.success = paramBoolean;
    this.netError = paramDouble1;
    this.netErrorName = paramString1;
    this.httpStatusCode = paramDouble2;
    this.stream = paramString2;
    this.headers = paramMap;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\LoadNetworkResourcePageResult.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */