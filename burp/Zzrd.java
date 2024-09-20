package burp;

import java.util.Collection;
import net.portswigger.Zkb;

public abstract class Zzrd {
  protected static final Zbu4 Zq = new Zbu4(-1, -1, false);
  
  protected static final Zzrg Zr = new Zzrg();
  
  public final Zbu4 Zi(Zstu paramZstu, int paramInt1, int paramInt2) {
    return (paramZstu == null) ? Zq : Zk(paramZstu.ZiD(), paramInt1, paramInt2);
  }
  
  public Zbu4 ZG(Zstu paramZstu) {
    return (paramZstu == null) ? Zq : Zi(paramZstu, 0, paramZstu.Zpu());
  }
  
  public Zbu4 ZL(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte == null) ? Zq : Zk(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public abstract Zbu4 Zk(byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
  
  public static final Zzrd Zv(Collection<byte[]> paramCollection, boolean paramBoolean1, boolean paramBoolean2) {
    return (new Zs7h(paramCollection, paramBoolean1, paramBoolean2)).ZB();
  }
  
  public static final Zzrd ZJ(byte[] paramArrayOfbyte, boolean paramBoolean1, boolean paramBoolean2) {
    return (paramArrayOfbyte == null) ? Zr : (paramBoolean2 ? (new Zs7h(paramArrayOfbyte, paramBoolean1, true)).ZB() : Zzrt.ZL(paramArrayOfbyte, paramBoolean1));
  }
  
  public static Zzrd Za(String paramString) {
    return ZJ(Zkb.Zy(paramString), true, true);
  }
  
  public static Zzrd ZG(String paramString) {
    return ZJ(Zkb.Zy(paramString), true, false);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzrd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */