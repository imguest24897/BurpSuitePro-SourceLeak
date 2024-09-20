package net.portswigger.devtools.protocol.events.runtime;

import java.util.Map;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.runtime.RemoteObject;

@Zsi("net.portswigger.devtools.protocol.events.runtime.InspectRequested")
public class InspectRequested implements Zl {
  @Zvd(Zp = "object")
  public final RemoteObject object;
  
  @Zvd(Zp = "hints")
  public final Map<String, Zi7> hints;
  
  @Zvd(Zp = "executionContextId")
  @Zy
  @Zj
  public final Integer executionContextId;
  
  private static int ZE;
  
  @Zox
  public InspectRequested(@Zc5(Ze = "object") RemoteObject paramRemoteObject, @Zc5(Ze = "hints") Map<String, Zi7> paramMap, @Zc5(Ze = "executionContextId", ZS = "null") Integer paramInteger) {
    this.object = paramRemoteObject;
    this.hints = paramMap;
    this.executionContextId = paramInteger;
  }
  
  public static void Zi(int paramInt) {
    ZE = paramInt;
  }
  
  public static int ZG() {
    return ZE;
  }
  
  public static int ZC() {
    int i = ZG();
    return (i == 0) ? 62 : 0;
  }
  
  static {
    if (ZC() == 0)
      Zi(92); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\runtime\InspectRequested.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */