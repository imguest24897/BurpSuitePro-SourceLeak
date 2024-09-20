package net.portswigger.devtools.protocol.events.runtime;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;

@Zsi("net.portswigger.devtools.protocol.events.runtime.ExecutionContextDestroyed")
public class ExecutionContextDestroyed implements Zl {
  @Zvd(Zp = "executionContextId")
  @Deprecated
  public final Integer executionContextId;
  
  @Zvd(Zp = "executionContextUniqueId")
  @Zy
  public final String executionContextUniqueId;
  
  @Zox
  public ExecutionContextDestroyed(@Zc5(Ze = "executionContextId") Integer paramInteger, @Zc5(Ze = "executionContextUniqueId") String paramString) {
    this.executionContextId = paramInteger;
    this.executionContextUniqueId = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\runtime\ExecutionContextDestroyed.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */