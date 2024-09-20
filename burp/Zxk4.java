package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.core.ByteArray;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.proxy.ProxyWebSocketMessage;
import burp.api.montoya.websocket.Direction;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.regex.Pattern;
import net.portswigger.Zkb;
import net.portswigger.Zli;

public class Zxk4 implements ProxyWebSocketMessage {
  private final Zrzh Zb;
  
  private final Zskl ZF;
  
  public Zxk4(Zrzh paramZrzh, Zskl paramZskl) {
    this.Zb = paramZrzh;
    this.ZF = paramZskl;
  }
  
  public Annotations annotations() {
    return new Zl_r(this.ZF, this.Zb);
  }
  
  public Direction direction() {
    return (this.Zb.Zd() == Ze3o.CLIENT_TO_SERVER) ? Direction.CLIENT_TO_SERVER : Direction.SERVER_TO_CLIENT;
  }
  
  public ByteArray payload() {
    return this.ZF.ZI(this.Zb.ZI());
  }
  
  public HttpRequest upgradeRequest() {
    return this.ZF.ZN(this.Zb.Ze());
  }
  
  public int webSocketId() {
    return this.Zb.ZO();
  }
  
  public ZonedDateTime time() {
    Instant instant = Instant.ofEpochMilli(this.Zb.ZE());
    return ZonedDateTime.ofInstant(instant, ZoneId.systemDefault());
  }
  
  public ByteArray editedPayload() {
    Zstu zstu = this.Zb.Z_();
    return (zstu == null) ? null : this.ZF.ZI(zstu.ZiD());
  }
  
  public int listenerPort() {
    return this.Zb.ZB();
  }
  
  public boolean contains(String paramString, boolean paramBoolean) {
    String str = this.Zb.Zv();
    if (str != null && !str.isEmpty()) {
      boolean bool = paramBoolean ? Zsw8.ZY(str, paramString) : Zsw8.ZK(str, paramString);
      if (bool)
        return true; 
    } 
    byte[] arrayOfByte = this.Zb.ZI();
    return (arrayOfByte != null && arrayOfByte.length > 0) ? ((Zli.ZL(arrayOfByte, paramString.getBytes(), paramBoolean) != -1)) : false;
  }
  
  public boolean contains(Pattern paramPattern) {
    String str = this.Zb.Zv();
    if (str != null && !str.isEmpty()) {
      boolean bool = Zsw8.ZC(str, paramPattern);
      if (bool)
        return true; 
    } 
    byte[] arrayOfByte = this.Zb.ZI();
    if (arrayOfByte != null && arrayOfByte.length > 0) {
      String str1 = Zkb.ZG(arrayOfByte);
      return Zsw8.ZC(str1, paramPattern);
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxk4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */