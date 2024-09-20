package net.portswigger;

import java.util.List;

public final class Zh2 extends Record implements Zms {
  private final List<Zms> zhO;
  
  private final String Zo;
  
  public Zh2(List<Zms> paramList, String paramString) {
    this.zhO = paramList;
    this.Zo = paramString;
  }
  
  public void ZF(Zuo paramZuo) {
    paramZuo.ZI(this);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/Zh2;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/Zh2;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/Zh2;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public List<Zms> ZhO() {
    return this.zhO;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zh2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */