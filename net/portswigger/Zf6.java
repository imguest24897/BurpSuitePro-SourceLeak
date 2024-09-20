package net.portswigger;

import java.util.List;
import java.util.Map;

public final class Zf6 extends Record implements Zms {
  private final Map<String, Zms> znW;
  
  private final List<Zf6> zn1;
  
  private static final Zf6 Zv = new Zf6(new Ziz());
  
  private Zf6(Ziz paramZiz) {
    this(paramZiz.ZW, paramZiz.ZY);
  }
  
  public Zf6(Map<String, Zms> paramMap, List<Zf6> paramList) {
    this.znW = paramMap;
    this.zn1 = paramList;
  }
  
  public void ZF(Zuo paramZuo) {
    paramZuo.Zh(this);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/Zf6;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/Zf6;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/Zf6;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Map<String, Zms> ZnW() {
    return this.znW;
  }
  
  public List<Zf6> Zn1() {
    return this.zn1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zf6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */