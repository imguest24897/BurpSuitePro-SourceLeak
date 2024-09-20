package net.portswigger.devtools.protocol.types.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.network.ConnectTiming")
public class ConnectTiming {
  @Zvd(Zp = "requestTime")
  public final Double requestTime;
  
  @Zox
  public ConnectTiming(@Zc5(Ze = "requestTime") Double paramDouble) {
    this.requestTime = paramDouble;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\ConnectTiming.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */