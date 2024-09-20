package net.portswigger;

import java.util.List;

public final class Zzz extends Record implements Zv2<Number> {
  private final boolean required;
  
  private final Number min;
  
  private final Number max;
  
  private final Number ZE;
  
  private final List<Number> examples;
  
  private final String description;
  
  private static final Zzz Zx = new Zzz((new Zl3()).Zw(true));
  
  private static final Zzz ZU = new Zzz((new Zl3()).Zw(false));
  
  private Zzz(Zl3 paramZl3) {
    this(paramZl3.ZK, paramZl3.Zq, paramZl3.ZC, paramZl3.ZZ, paramZl3.ZS, paramZl3.Zy);
  }
  
  public Zzz(boolean paramBoolean, Number paramNumber1, Number paramNumber2, Number paramNumber3, List<Number> paramList, String paramString) {
    this.required = paramBoolean;
    this.min = paramNumber1;
    this.max = paramNumber2;
    this.ZE = paramNumber3;
    this.examples = paramList;
    this.description = paramString;
  }
  
  public void ZF(Zuo paramZuo) {
    paramZuo.Zz(this);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/Zzz;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/Zzz;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/Zzz;Ljava/lang/Object;)Z
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
  
  public List<Number> examples() {
    return this.examples;
  }
  
  public String description() {
    return this.description;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zzz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */