package burp;

import burp.api.montoya.websocket.Direction;
import burp.api.montoya.websocket.TextMessage;

public final class Zg3c extends Record implements TextMessage {
  private final String payload;
  
  private final Direction direction;
  
  public Zg3c(String paramString, Direction paramDirection) {
    this.payload = paramString;
    this.direction = paramDirection;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zg3c;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zg3c;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zg3c;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String payload() {
    return this.payload;
  }
  
  public Direction direction() {
    return this.direction;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg3c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */