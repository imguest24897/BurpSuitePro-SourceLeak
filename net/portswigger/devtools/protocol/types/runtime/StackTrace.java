package net.portswigger.devtools.protocol.types.runtime;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zsi("net.portswigger.devtools.protocol.types.runtime.StackTrace")
public class StackTrace {
  @Zvd(Zp = "description")
  @Zj
  public final String description;
  
  @Zvd(Zp = "callFrames")
  public final List<CallFrame> callFrames;
  
  @Zvd(Zp = "parent")
  @Zj
  public final StackTrace parent;
  
  @Zvd(Zp = "parentId")
  @Zy
  @Zj
  public final StackTraceId parentId;
  
  @Zox
  public StackTrace(@Zc5(Ze = "description", ZS = "null") String paramString, @Zc5(Ze = "callFrames") List<CallFrame> paramList, @Zc5(Ze = "parent", ZS = "null") StackTrace paramStackTrace, @Zc5(Ze = "parentId", ZS = "null") StackTraceId paramStackTraceId) {
    this.description = paramString;
    this.callFrames = paramList;
    this.parent = paramStackTrace;
    this.parentId = paramStackTraceId;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\runtime\StackTrace.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */