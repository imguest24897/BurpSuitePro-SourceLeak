package burp;

import net.portswigger.browser.Zc6;
import net.portswigger.browser.Zzc;

final class Zx_p extends Record implements Zzc {
  private final Zs8h ZZ;
  
  private Zx_p(Zs8h paramZs8h) {
    this.ZZ = paramZs8h;
  }
  
  public void ZA(Zc6 paramZc6, String paramString) {
    String[] arrayOfString = Zb8z.Zi();
    try {
      switch (Zmi0.ZA[paramZc6.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    Zk53 zk53 = Zk53.ERROR;
    try {
      this.ZZ.ZN(zk53, paramString);
      if (Zbqc.Zwu() == null)
        Zb8z.Zh(new String[1]); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
  }
  
  public void Zj(int paramInt) {
    this.ZZ.ZU(paramInt);
  }
  
  public void Zm(String paramString) {
    this.ZZ.ZI(paramString);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zx_p;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zx_p;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zx_p;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx_p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */