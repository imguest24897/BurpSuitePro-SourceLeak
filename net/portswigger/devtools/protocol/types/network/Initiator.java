package net.portswigger.devtools.protocol.types.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.types.runtime.StackTrace;

@Zsi("net.portswigger.devtools.protocol.types.network.Initiator")
public class Initiator {
  @Zvd(Zp = "type")
  public final InitiatorType type;
  
  @Zvd(Zp = "stack")
  @Zj
  public final StackTrace stack;
  
  @Zvd(Zp = "url")
  @Zj
  public final String url;
  
  @Zvd(Zp = "lineNumber")
  @Zj
  public final Double lineNumber;
  
  @Zvd(Zp = "columnNumber")
  @Zj
  public final Double columnNumber;
  
  @Zvd(Zp = "requestId")
  @Zj
  public final String requestId;
  
  @Zox
  public Initiator(@Zc5(Ze = "type") InitiatorType paramInitiatorType, @Zc5(Ze = "stack", ZS = "null") StackTrace paramStackTrace, @Zc5(Ze = "url", ZS = "null") String paramString1, @Zc5(Ze = "lineNumber", ZS = "null") Double paramDouble1, @Zc5(Ze = "columnNumber", ZS = "null") Double paramDouble2, @Zc5(Ze = "requestId", ZS = "null") String paramString2) {
    this.type = paramInitiatorType;
    this.stack = paramStackTrace;
    this.url = paramString1;
    this.lineNumber = paramDouble1;
    this.columnNumber = paramDouble2;
    this.requestId = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\Initiator.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */