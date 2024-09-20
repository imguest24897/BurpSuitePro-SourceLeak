package net.portswigger.devtools.protocol.events.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;

@Zsi("net.portswigger.devtools.protocol.events.network.DataReceived")
public class DataReceived implements Zl {
  @Zvd(Zp = "requestId")
  public final String requestId;
  
  @Zvd(Zp = "timestamp")
  public final Double timestamp;
  
  @Zvd(Zp = "dataLength")
  public final Integer dataLength;
  
  @Zvd(Zp = "encodedDataLength")
  public final Integer encodedDataLength;
  
  @Zvd(Zp = "data")
  @Zy
  @Zj
  public final String data;
  
  @Zox
  public DataReceived(@Zc5(Ze = "requestId") String paramString1, @Zc5(Ze = "timestamp") Double paramDouble, @Zc5(Ze = "dataLength") Integer paramInteger1, @Zc5(Ze = "encodedDataLength") Integer paramInteger2, @Zc5(Ze = "data", ZS = "null") String paramString2) {
    this.requestId = paramString1;
    this.timestamp = paramDouble;
    this.dataLength = paramInteger1;
    this.encodedDataLength = paramInteger2;
    this.data = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\network\DataReceived.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */