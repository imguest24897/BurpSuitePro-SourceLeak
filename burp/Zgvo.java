package burp;

import burp.api.montoya.MontoyaApi;
import burp.api.montoya.internal.MontoyaObjectFactory;

final class Zgvo extends Record {
  private final MontoyaApi za3;
  
  private final MontoyaObjectFactory zaH;
  
  Zgvo(MontoyaApi paramMontoyaApi, MontoyaObjectFactory paramMontoyaObjectFactory) {
    this.za3 = paramMontoyaApi;
    this.zaH = paramMontoyaObjectFactory;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zgvo;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zgvo;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zgvo;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public MontoyaApi Za3() {
    return this.za3;
  }
  
  public MontoyaObjectFactory ZaH() {
    return this.zaH;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgvo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */