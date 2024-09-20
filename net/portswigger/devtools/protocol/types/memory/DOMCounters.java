package net.portswigger.devtools.protocol.types.memory;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.memory.DOMCounters")
public class DOMCounters {
  @Zvd(Zp = "documents")
  public final Integer documents;
  
  @Zvd(Zp = "nodes")
  public final Integer nodes;
  
  @Zvd(Zp = "jsEventListeners")
  public final Integer jsEventListeners;
  
  @Zox
  public DOMCounters(@Zc5(Ze = "documents") Integer paramInteger1, @Zc5(Ze = "nodes") Integer paramInteger2, @Zc5(Ze = "jsEventListeners") Integer paramInteger3) {
    this.documents = paramInteger1;
    this.nodes = paramInteger2;
    this.jsEventListeners = paramInteger3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\memory\DOMCounters.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */