package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.websocket.BinaryMessage;
import burp.api.montoya.websocket.Direction;

public final class Zgq3 extends Record implements BinaryMessage {
  private final ByteArray payload;
  
  private final Direction direction;
  
  public Zgq3(ByteArray paramByteArray, Direction paramDirection) {
    this.payload = paramByteArray;
    this.direction = paramDirection;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zgq3;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zgq3;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zgq3;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public ByteArray payload() {
    return this.payload;
  }
  
  public Direction direction() {
    return this.direction;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgq3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */