package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.intruder.IntruderInsertionPoint;
import burp.api.montoya.intruder.PayloadData;

public final class Zsjj extends Record implements PayloadData {
  private final ByteArray currentPayload;
  
  private final ByteArray originalPayload;
  
  private final IntruderInsertionPoint insertionPoint;
  
  public Zsjj(ByteArray paramByteArray1, ByteArray paramByteArray2, IntruderInsertionPoint paramIntruderInsertionPoint) {
    this.currentPayload = paramByteArray1;
    this.originalPayload = paramByteArray2;
    this.insertionPoint = paramIntruderInsertionPoint;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zsjj;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zsjj;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zsjj;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public ByteArray currentPayload() {
    return this.currentPayload;
  }
  
  public ByteArray originalPayload() {
    return this.originalPayload;
  }
  
  public IntruderInsertionPoint insertionPoint() {
    return this.insertionPoint;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsjj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */