package net.portswigger.browser;

import burp.Zbqc;
import burp.Zxr8;
import java.util.concurrent.CompletableFuture;

public final class Zdo extends Record {
  private final Zjt ZZz;
  
  private final CompletableFuture<?> ZZV;
  
  private static int ZD;
  
  public Zdo(Zjt paramZjt, CompletableFuture<?> paramCompletableFuture) {
    int i = ZZ3();
    this.ZZz = paramZjt;
    this.ZZV = paramCompletableFuture;
    if (Zbqc.Zwu() == null)
      ZY(++i); 
  }
  
  public static Zxr8<Zdo> ZQ(Zjt paramZjt, CompletableFuture<?> paramCompletableFuture) {
    int i = ZZ3();
    if (i != 0)
      Zbqc.Zr(new Zbqc[1]); 
    return new Zxr8(Zcq.ZL, new Zdo(paramZjt, paramCompletableFuture));
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/browser/Zdo;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/browser/Zdo;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/browser/Zdo;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zjt ZZz() {
    return this.ZZz;
  }
  
  public CompletableFuture<?> ZZV() {
    return this.ZZV;
  }
  
  public static void ZY(int paramInt) {
    ZD = paramInt;
  }
  
  public static int ZZ() {
    return ZD;
  }
  
  public static int ZZ3() {
    int i = ZZ();
    return (i == 0) ? 83 : 0;
  }
  
  static {
    if (ZZ3() != 0)
      ZY(24); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zdo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */