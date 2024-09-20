package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.core.ByteArray;
import burp.api.montoya.proxy.websocket.InterceptedBinaryMessage;
import burp.api.montoya.websocket.Direction;

public final class Ztct extends Record implements InterceptedBinaryMessage {
  private final ByteArray payload;
  
  private final Direction direction;
  
  private final Annotations annotations;
  
  public Ztct(ByteArray paramByteArray, Direction paramDirection, Annotations paramAnnotations) {
    this.payload = paramByteArray;
    this.direction = paramDirection;
    this.annotations = paramAnnotations;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Ztct;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Ztct;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Ztct;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public ByteArray payload() {
    return this.payload;
  }
  
  public Direction direction() {
    return this.direction;
  }
  
  public Annotations annotations() {
    return this.annotations;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztct.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */