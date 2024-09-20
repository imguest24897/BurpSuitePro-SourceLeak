package burp;

import net.portswigger.javatooling.api.Range;

public final class Zm5y extends Record {
  private final String ZQ;
  
  private final int ZC;
  
  private final int Zo;
  
  public Zm5y(String paramString, Range paramRange) {
    this(paramString, paramRange.startIndex(), paramRange.endIndex() + 1);
  }
  
  public Zm5y(String paramString, int paramInt1, int paramInt2) {
    this.ZQ = paramString;
    this.ZC = paramInt1;
    this.Zo = paramInt2;
  }
  
  boolean Zk(int paramInt) {
    return (this.ZC <= paramInt && paramInt < this.Zo);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zm5y;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zm5y;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zm5y;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String ZQ() {
    return this.ZQ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm5y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */