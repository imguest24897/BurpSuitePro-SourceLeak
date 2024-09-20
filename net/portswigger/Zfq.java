package net.portswigger;

import burp.Zbqc;
import java.util.Objects;

public final class Zfq extends Record implements Zrm9 {
  private final String Zn;
  
  public Zfq(String paramString) {
    this.Zn = paramString;
  }
  
  public boolean equals(Object paramObject) {
    Zbqc[] arrayOfZbqc = Zk0.Zu();
    if (this == paramObject)
      return true; 
    if (paramObject instanceof Zfq) {
      Zfq zfq = (Zfq)paramObject;
      if (arrayOfZbqc == null)
        return Objects.equals(this.Zn, zfq.Zn); 
    } 
    return false;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/Zfq;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/Zfq;)I
    //   6: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zfq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */