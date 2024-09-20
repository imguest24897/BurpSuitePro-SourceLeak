package net.portswigger.browser;

import burp.Zbqc;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;

public final class Zjq extends Record {
  private final Optional<Zdb> Zz;
  
  private final Map<Zt, Zdw> Zs;
  
  Zjq(Zdb paramZdb, Map<Zt, Zdw> paramMap) {
    this(Optional.ofNullable(paramZdb), Collections.unmodifiableMap(paramMap));
  }
  
  public Zjq(Optional<Zdb> paramOptional, Map<Zt, Zdw> paramMap) {
    this.Zz = paramOptional;
    this.Zs = paramMap;
  }
  
  public boolean ZH() {
    return this.Zs.values().stream().allMatch(Zjq::lambda$wasSuccessful$0);
  }
  
  public Zdw ZS(Class<? extends Zt> paramClass) {
    String[] arrayOfString = Ze7.Zm();
    if (Zbqc.Zwu() == null)
      Ze7.Zr(new String[3]); 
    return this.Zs.entrySet().stream().filter(paramClass::lambda$getResultFor$1).findFirst().map(Map.Entry::getValue).orElse(null);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/browser/Zjq;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/browser/Zjq;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/browser/Zjq;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  private static boolean lambda$getResultFor$1(Class<?> paramClass, Map.Entry paramEntry) {
    return (((Zt)paramEntry.getKey()).getClass() == paramClass);
  }
  
  private static boolean lambda$wasSuccessful$0(Zdw paramZdw) {
    return paramZdw.ZQH().equals(Zj2.SUCCESSFUL);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zjq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */