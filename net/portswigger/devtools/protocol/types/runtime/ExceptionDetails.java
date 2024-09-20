package net.portswigger.devtools.protocol.types.runtime;

import java.util.Map;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zsi("net.portswigger.devtools.protocol.types.runtime.ExceptionDetails")
public class ExceptionDetails {
  @Zvd(Zp = "exceptionId")
  public final Integer exceptionId;
  
  @Zvd(Zp = "text")
  public final String text;
  
  @Zvd(Zp = "lineNumber")
  public final Integer lineNumber;
  
  @Zvd(Zp = "columnNumber")
  public final Integer columnNumber;
  
  @Zvd(Zp = "scriptId")
  @Zj
  public final String scriptId;
  
  @Zvd(Zp = "url")
  @Zj
  public final String url;
  
  @Zvd(Zp = "stackTrace")
  @Zj
  public final StackTrace stackTrace;
  
  @Zvd(Zp = "exception")
  @Zj
  public final RemoteObject exception;
  
  @Zvd(Zp = "executionContextId")
  @Zj
  public final Integer executionContextId;
  
  @Zvd(Zp = "exceptionMetaData")
  @Zy
  @Zj
  public final Map<String, Zi7> exceptionMetaData;
  
  @Zox
  public ExceptionDetails(@Zc5(Ze = "exceptionId") Integer paramInteger1, @Zc5(Ze = "text") String paramString1, @Zc5(Ze = "lineNumber") Integer paramInteger2, @Zc5(Ze = "columnNumber") Integer paramInteger3, @Zc5(Ze = "scriptId", ZS = "null") String paramString2, @Zc5(Ze = "url", ZS = "null") String paramString3, @Zc5(Ze = "stackTrace", ZS = "null") StackTrace paramStackTrace, @Zc5(Ze = "exception", ZS = "null") RemoteObject paramRemoteObject, @Zc5(Ze = "executionContextId", ZS = "null") Integer paramInteger4, @Zc5(Ze = "exceptionMetaData", ZS = "null") Map<String, Zi7> paramMap) {
    this.exceptionId = paramInteger1;
    this.text = paramString1;
    this.lineNumber = paramInteger2;
    this.columnNumber = paramInteger3;
    this.scriptId = paramString2;
    this.url = paramString3;
    this.stackTrace = paramStackTrace;
    this.exception = paramRemoteObject;
    this.executionContextId = paramInteger4;
    this.exceptionMetaData = paramMap;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\runtime\ExceptionDetails.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */