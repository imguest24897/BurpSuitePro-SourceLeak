package net.portswigger.devtools.client;

import java.time.Duration;

public final class Zk<T> extends Record {
  private final Zs<T> zm0;
  
  private final Duration zmh;
  
  public Zk(Zs<T> paramZs, Duration paramDuration) {
    this.zm0 = paramZs;
    this.zmh = paramDuration;
  }
  
  public static <T> Zx<T> ZW(Zs<T> paramZs) {
    return new Zx<>(paramZs);
  }
  
  public static <T> Zk<T> ZA(Zs<T> paramZs) {
    return (new Zx<>(paramZs)).Zj();
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/devtools/client/Zk;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/devtools/client/Zk;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/devtools/client/Zk;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zs<T> Zm0() {
    return this.zm0;
  }
  
  public Duration Zmh() {
    return this.zmh;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\Zk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */