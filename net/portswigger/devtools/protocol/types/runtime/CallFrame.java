package net.portswigger.devtools.protocol.types.runtime;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.runtime.CallFrame")
public class CallFrame {
  @Zvd(Zp = "functionName")
  public final String functionName;
  
  @Zvd(Zp = "scriptId")
  public final String scriptId;
  
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "lineNumber")
  public final Integer lineNumber;
  
  @Zvd(Zp = "columnNumber")
  public final Integer columnNumber;
  
  @Zox
  public CallFrame(@Zc5(Ze = "functionName") String paramString1, @Zc5(Ze = "scriptId") String paramString2, @Zc5(Ze = "url") String paramString3, @Zc5(Ze = "lineNumber") Integer paramInteger1, @Zc5(Ze = "columnNumber") Integer paramInteger2) {
    this.functionName = paramString1;
    this.scriptId = paramString2;
    this.url = paramString3;
    this.lineNumber = paramInteger1;
    this.columnNumber = paramInteger2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\runtime\CallFrame.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */