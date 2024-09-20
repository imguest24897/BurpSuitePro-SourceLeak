package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zx4q<K extends Zgpi, V extends Zgpi> implements Zeu4<Zzwo<K, V>> {
  private final Zllo<Zzwo<K, V>> Zl;
  
  public final Zekb<Zmwp<K>> Zf;
  
  private final Zm31[] ZK;
  
  private static String Zu;
  
  Zx4q(Zeu4<Zmwp<K>> paramZeu4, Zeu4<K> paramZeu41, Zeu4<V> paramZeu42) {
    this.Zl = new Zggc<>(this, paramZeu41, paramZeu42);
    this.Zf = new Zekb<>(0, paramZeu4);
    String str = ZQ();
    try {
      this.ZK = new Zm31[] { this.Zf };
      if (Zbqc.Zwu() == null)
        Zn("JA6jwc"); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public Zm31[] Zc() {
    return this.ZK;
  }
  
  public Zllo<Zzwo<K, V>> ZI() {
    return this.Zl;
  }
  
  public Zeu4<? extends Zzwo<K, V>> Z_(byte paramByte) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public byte Z_() {
    return 0;
  }
  
  public boolean Zs() {
    return false;
  }
  
  public static void Zn(String paramString) {
    Zu = paramString;
  }
  
  public static String ZQ() {
    return Zu;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    if (ZQ() == null)
      Zn("VMFuvb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx4q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */