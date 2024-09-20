package net.portswigger.devtools.protocol.events.cast;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.cast.Sink;

@Zsi("net.portswigger.devtools.protocol.events.cast.SinksUpdated")
public class SinksUpdated implements Zl {
  @Zvd(Zp = "sinks")
  public final List<Sink> sinks;
  
  private static Zbqc[] ZB;
  
  @Zox
  public SinksUpdated(@Zc5(Ze = "sinks") List<Sink> paramList) {
    Zbqc[] arrayOfZbqc = ZW();
    this.sinks = paramList;
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public static void Za(Zbqc[] paramArrayOfZbqc) {
    ZB = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZW() {
    return ZB;
  }
  
  static {
    if (ZW() != null)
      Za(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\cast\SinksUpdated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */