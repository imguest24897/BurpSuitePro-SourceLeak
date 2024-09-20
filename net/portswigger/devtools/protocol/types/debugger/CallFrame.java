package net.portswigger.devtools.protocol.types.debugger;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.runtime.RemoteObject;

@Zsi("net.portswigger.devtools.protocol.types.debugger.CallFrame")
public class CallFrame {
  @Zvd(Zp = "callFrameId")
  public final String callFrameId;
  
  @Zvd(Zp = "functionName")
  public final String functionName;
  
  @Zvd(Zp = "functionLocation")
  @Zj
  public final Location functionLocation;
  
  @Zvd(Zp = "location")
  public final Location location;
  
  @Zvd(Zp = "url")
  @Deprecated
  public final String url;
  
  @Zvd(Zp = "scopeChain")
  public final List<Scope> scopeChain;
  
  @Zvd(Zp = "that")
  public final RemoteObject that;
  
  @Zvd(Zp = "returnValue")
  @Zj
  public final RemoteObject returnValue;
  
  @Zvd(Zp = "canBeRestarted")
  @Zy
  @Zj
  public final Boolean canBeRestarted;
  
  @Zox
  public CallFrame(@Zc5(Ze = "callFrameId") String paramString1, @Zc5(Ze = "functionName") String paramString2, @Zc5(Ze = "functionLocation", ZS = "null") Location paramLocation1, @Zc5(Ze = "location") Location paramLocation2, @Zc5(Ze = "url") String paramString3, @Zc5(Ze = "scopeChain") List<Scope> paramList, @Zc5(Ze = "that") RemoteObject paramRemoteObject1, @Zc5(Ze = "returnValue", ZS = "null") RemoteObject paramRemoteObject2, @Zc5(Ze = "canBeRestarted", ZS = "null") Boolean paramBoolean) {
    this.callFrameId = paramString1;
    this.functionName = paramString2;
    this.functionLocation = paramLocation1;
    this.location = paramLocation2;
    this.url = paramString3;
    String str = WasmDisassemblyChunk.ZA();
    this.scopeChain = paramList;
    this.that = paramRemoteObject1;
    this.returnValue = paramRemoteObject2;
    this.canBeRestarted = paramBoolean;
    if (str == null)
      Zbqc.Zr(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\debugger\CallFrame.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */