package net.portswigger.devtools.protocol.types.log;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.types.runtime.RemoteObject;
import net.portswigger.devtools.protocol.types.runtime.StackTrace;

@Zsi("net.portswigger.devtools.protocol.types.log.LogEntry")
public class LogEntry {
  @Zvd(Zp = "source")
  public final LogEntrySource source;
  
  @Zvd(Zp = "level")
  public final LogEntryLevel level;
  
  @Zvd(Zp = "text")
  public final String text;
  
  @Zvd(Zp = "category")
  @Zj
  public final LogEntryCategory category;
  
  @Zvd(Zp = "timestamp")
  public final Double timestamp;
  
  @Zvd(Zp = "url")
  @Zj
  public final String url;
  
  @Zvd(Zp = "lineNumber")
  @Zj
  public final Integer lineNumber;
  
  @Zvd(Zp = "stackTrace")
  @Zj
  public final StackTrace stackTrace;
  
  @Zvd(Zp = "networkRequestId")
  @Zj
  public final String networkRequestId;
  
  @Zvd(Zp = "workerId")
  @Zj
  public final String workerId;
  
  @Zvd(Zp = "args")
  @Zj
  public final List<RemoteObject> args;
  
  @Zox
  public LogEntry(@Zc5(Ze = "source") LogEntrySource paramLogEntrySource, @Zc5(Ze = "level") LogEntryLevel paramLogEntryLevel, @Zc5(Ze = "text") String paramString1, @Zc5(Ze = "category", ZS = "null") LogEntryCategory paramLogEntryCategory, @Zc5(Ze = "timestamp") Double paramDouble, @Zc5(Ze = "url", ZS = "null") String paramString2, @Zc5(Ze = "lineNumber", ZS = "null") Integer paramInteger, @Zc5(Ze = "stackTrace", ZS = "null") StackTrace paramStackTrace, @Zc5(Ze = "networkRequestId", ZS = "null") String paramString3, @Zc5(Ze = "workerId", ZS = "null") String paramString4, @Zc5(Ze = "args", ZS = "null") List<RemoteObject> paramList) {
    this.source = paramLogEntrySource;
    this.level = paramLogEntryLevel;
    this.text = paramString1;
    this.category = paramLogEntryCategory;
    this.timestamp = paramDouble;
    this.url = paramString2;
    Zbqc[] arrayOfZbqc = ViolationSettingName.Zs();
    this.lineNumber = paramInteger;
    this.stackTrace = paramStackTrace;
    this.networkRequestId = paramString3;
    this.workerId = paramString4;
    this.args = paramList;
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\log\LogEntry.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */