package net.portswigger.browser;

import java.time.Duration;

public final class Zdw extends Record {
  private final Zj2 ZQH;
  
  private final Duration ZQL;
  
  public Zdw(Zj2 paramZj2, Duration paramDuration) {
    this.ZQH = paramZj2;
    this.ZQL = paramDuration;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/browser/Zdw;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/browser/Zdw;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/browser/Zdw;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zj2 ZQH() {
    return this.ZQH;
  }
  
  public Duration ZQL() {
    return this.ZQL;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zdw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */