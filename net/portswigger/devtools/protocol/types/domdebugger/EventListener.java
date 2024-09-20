package net.portswigger.devtools.protocol.types.domdebugger;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.types.runtime.RemoteObject;

@Zsi("net.portswigger.devtools.protocol.types.domdebugger.EventListener")
public class EventListener {
  @Zvd(Zp = "type")
  public final String type;
  
  @Zvd(Zp = "useCapture")
  public final Boolean useCapture;
  
  @Zvd(Zp = "passive")
  public final Boolean passive;
  
  @Zvd(Zp = "once")
  public final Boolean once;
  
  @Zvd(Zp = "scriptId")
  public final String scriptId;
  
  @Zvd(Zp = "lineNumber")
  public final Integer lineNumber;
  
  @Zvd(Zp = "columnNumber")
  public final Integer columnNumber;
  
  @Zvd(Zp = "handler")
  @Zj
  public final RemoteObject handler;
  
  @Zvd(Zp = "originalHandler")
  @Zj
  public final RemoteObject originalHandler;
  
  @Zvd(Zp = "backendNodeId")
  @Zj
  public final Integer backendNodeId;
  
  private static boolean ZM;
  
  @Zox
  public EventListener(@Zc5(Ze = "type") String paramString1, @Zc5(Ze = "useCapture") Boolean paramBoolean1, @Zc5(Ze = "passive") Boolean paramBoolean2, @Zc5(Ze = "once") Boolean paramBoolean3, @Zc5(Ze = "scriptId") String paramString2, @Zc5(Ze = "lineNumber") Integer paramInteger1, @Zc5(Ze = "columnNumber") Integer paramInteger2, @Zc5(Ze = "handler", ZS = "null") RemoteObject paramRemoteObject1, @Zc5(Ze = "originalHandler", ZS = "null") RemoteObject paramRemoteObject2, @Zc5(Ze = "backendNodeId", ZS = "null") Integer paramInteger3) {
    this.type = paramString1;
    this.useCapture = paramBoolean1;
    this.passive = paramBoolean2;
    this.once = paramBoolean3;
    this.scriptId = paramString2;
    this.lineNumber = paramInteger1;
    this.columnNumber = paramInteger2;
    this.handler = paramRemoteObject1;
    boolean bool = ZU();
    this.originalHandler = paramRemoteObject2;
    this.backendNodeId = paramInteger3;
    if (bool)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public static void Zt(boolean paramBoolean) {
    ZM = paramBoolean;
  }
  
  public static boolean Zh() {
    return ZM;
  }
  
  public static boolean ZU() {
    boolean bool = Zh();
    return !bool;
  }
  
  static {
    if (!Zh())
      Zt(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\domdebugger\EventListener.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */