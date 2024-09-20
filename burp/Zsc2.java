package burp;

import java.util.Collection;
import net.portswigger.Zm2;

public abstract class Zsc2 extends RuntimeException {
  private static Zbqc[] ZH;
  
  protected Zsc2() {
    Zg(Zj());
  }
  
  protected Zsc2(Throwable paramThrowable) {
    super(paramThrowable);
    Zg(Zj());
  }
  
  public abstract Collection<Zblb> Zj();
  
  private static void Zg(Collection<Zblb> paramCollection) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Zec3 zec3 = paramCollection.contains(Zblb.TOO_MANY_CONSECUTIVE) ? Zec3.SCANNER_AUDIT_CONSECUTIVE_ERROR : Zec3.SCANNER_AUDIT_ERROR;
    paramCollection.forEach(zec3::lambda$sendTelemetry$0);
  }
  
  private static void lambda$sendTelemetry$0(Zec3 paramZec3, Zblb paramZblb) {
    Zm2.ZB(paramZec3, String.valueOf(paramZblb.Z_()));
  }
  
  public static void ZS(Zbqc[] paramArrayOfZbqc) {
    ZH = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zc() {
    return ZH;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  static {
    if (Zc() != null)
      ZS(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsc2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */