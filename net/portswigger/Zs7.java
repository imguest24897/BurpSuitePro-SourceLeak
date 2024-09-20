package net.portswigger;

import java.util.List;

public final class Zs7 extends Record implements Zv2<Integer> {
  private final boolean required;
  
  private final Number min;
  
  private final Number max;
  
  private final Number ZA;
  
  private final List<Integer> examples;
  
  private final String description;
  
  private static final Zs7 ZG = new Zs7((new Zlc()).Zw(true));
  
  private static final Zs7 Zv = new Zs7((new Zlc()).Zw(false));
  
  public Zs7() {
    this(new Zlc());
  }
  
  private Zs7(Zlc paramZlc) {
    this(paramZlc.ZK, paramZlc.Zq, paramZlc.ZC, paramZlc.ZZ, paramZlc.ZS, paramZlc.Zy);
  }
  
  public Zs7(boolean paramBoolean, Number paramNumber1, Number paramNumber2, Number paramNumber3, List<Integer> paramList, String paramString) {
    this.required = paramBoolean;
    this.min = paramNumber1;
    this.max = paramNumber2;
    this.ZA = paramNumber3;
    this.examples = paramList;
    this.description = paramString;
  }
  
  public static Zs7 ZK(boolean paramBoolean) {
    return paramBoolean ? ZG : Zv;
  }
  
  public void ZF(Zuo paramZuo) {
    paramZuo.ZY(this);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/Zs7;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/Zs7;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/Zs7;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public boolean required() {
    return this.required;
  }
  
  public Number min() {
    return this.min;
  }
  
  public Number max() {
    return this.max;
  }
  
  public List<Integer> examples() {
    return this.examples;
  }
  
  public String description() {
    return this.description;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zs7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */