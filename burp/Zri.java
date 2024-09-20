package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

final class Zri extends Record implements Runnable {
  private final Runnable ZS;
  
  private Zri(Runnable paramRunnable) {
    this.ZS = paramRunnable;
  }
  
  public void run() {
    try {
      this.ZS.run();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
    } 
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zri;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zri;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zri;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zri.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */