package net.portswigger.devtools.client.impl;

import java.util.Map;
import java.util.Optional;
import net.portswigger.browser.Zce;
import net.portswigger.devtools.protocol.types.network.InitiatorType;

public class Zxh implements Zx4<InitiatorType, Zce> {
  private static final Zxh Zc = new Zxh();
  
  private static final Map<InitiatorType, Zce> ZD = Map.of(InitiatorType.PARSER, Zce.PARSER, InitiatorType.SCRIPT, Zce.SCRIPT);
  
  public static Zxh Zm() {
    return Zc;
  }
  
  public Map<InitiatorType, Zce> Zp() {
    return ZD;
  }
  
  public Zce Zk() {
    return Zce.IGNORED;
  }
  
  public Optional<InitiatorType> Zn() {
    return Optional.of(InitiatorType.OTHER);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zxh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */