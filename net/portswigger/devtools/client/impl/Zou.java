package net.portswigger.devtools.client.impl;

import java.util.Map;
import java.util.Optional;
import net.portswigger.browser.Zec;
import net.portswigger.devtools.protocol.types.network.ResourceType;

public class Zou implements Zx4<ResourceType, Zec> {
  private static final Zou ZX = new Zou();
  
  private static final Map<ResourceType, Zec> Zb = new Zx6();
  
  private static int[] ZQ;
  
  public static Zou Zi() {
    return ZX;
  }
  
  public Map<ResourceType, Zec> Zp() {
    return Zb;
  }
  
  public Zec Zw() {
    return Zec.IGNORED;
  }
  
  public Optional<ResourceType> Zn() {
    return Optional.of(ResourceType.OTHER);
  }
  
  static {
    ZG(null);
  }
  
  public static void ZG(int[] paramArrayOfint) {
    ZQ = paramArrayOfint;
  }
  
  public static int[] ZD() {
    return ZQ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zou.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */