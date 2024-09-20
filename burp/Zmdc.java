package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.proxy.websocket.InterceptedTextMessage;
import burp.api.montoya.websocket.Direction;

public final class Zmdc extends Record implements InterceptedTextMessage {
  private final String payload;
  
  private final Direction direction;
  
  private final Annotations annotations;
  
  public Zmdc(String paramString, Direction paramDirection, Annotations paramAnnotations) {
    this.payload = paramString;
    this.direction = paramDirection;
    this.annotations = paramAnnotations;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zmdc;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zmdc;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zmdc;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String payload() {
    return this.payload;
  }
  
  public Direction direction() {
    return this.direction;
  }
  
  public Annotations annotations() {
    return this.annotations;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmdc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */