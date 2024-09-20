package net.portswigger.devtools.protocol.events.dom;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.dom.ShadowRootPopped")
public class ShadowRootPopped implements Zl {
  @Zvd(Zp = "hostId")
  public final Integer hostId;
  
  @Zvd(Zp = "rootId")
  public final Integer rootId;
  
  @Zox
  public ShadowRootPopped(@Zc5(Ze = "hostId") Integer paramInteger1, @Zc5(Ze = "rootId") Integer paramInteger2) {
    this.hostId = paramInteger1;
    this.rootId = paramInteger2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\dom\ShadowRootPopped.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */