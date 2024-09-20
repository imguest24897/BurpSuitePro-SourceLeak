package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zx5x<K extends Zgpi, V extends Zgpi> implements Zeu4<Zzwo<K, V>> {
  private final Zllo<Zzwo<K, V>> Zc;
  
  public final Zekb<Zmwp<K>> ZG;
  
  private final Zm31[] ZA;
  
  Zx5x(Zeu4<Zmwp<K>> paramZeu4, Zeu4<K> paramZeu41, Zeu4<V> paramZeu42) {
    this.Zc = new Zbpd<>(this, paramZeu41, paramZeu42);
    this.ZG = new Zekb<>(0, paramZeu4);
    this.ZA = new Zm31[] { this.ZG };
  }
  
  public Zm31[] Zc() {
    return this.ZA;
  }
  
  public Zllo<Zzwo<K, V>> ZI() {
    return this.Zc;
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
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx5x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */