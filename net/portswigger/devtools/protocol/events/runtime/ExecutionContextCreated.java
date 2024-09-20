package net.portswigger.devtools.protocol.events.runtime;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.runtime.ExecutionContextDescription;

@Zsi("net.portswigger.devtools.protocol.events.runtime.ExecutionContextCreated")
public class ExecutionContextCreated implements Zl {
  @Zvd(Zp = "context")
  public final ExecutionContextDescription context;
  
  @Zox
  public ExecutionContextCreated(@Zc5(Ze = "context") ExecutionContextDescription paramExecutionContextDescription) {
    this.context = paramExecutionContextDescription;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\runtime\ExecutionContextCreated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */