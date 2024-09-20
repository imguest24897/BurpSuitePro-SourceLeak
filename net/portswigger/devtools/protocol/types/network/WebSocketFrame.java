package net.portswigger.devtools.protocol.types.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.network.WebSocketFrame")
public class WebSocketFrame {
  @Zvd(Zp = "opcode")
  public final Double opcode;
  
  @Zvd(Zp = "mask")
  public final Boolean mask;
  
  @Zvd(Zp = "payloadData")
  public final String payloadData;
  
  @Zox
  public WebSocketFrame(@Zc5(Ze = "opcode") Double paramDouble, @Zc5(Ze = "mask") Boolean paramBoolean, @Zc5(Ze = "payloadData") String paramString) {
    this.opcode = paramDouble;
    this.mask = paramBoolean;
    this.payloadData = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\WebSocketFrame.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */