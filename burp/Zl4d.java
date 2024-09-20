package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zl4d<K extends Zgpi> implements Zeu4<Zxlv<K>> {
  private final Zllo<Zxlv<K>> Zl;
  
  final Zek7 Zw;
  
  final Zekv ZO;
  
  final Zekv ZM;
  
  public final Zeke<Zif> ZF;
  
  final Zekg Zu;
  
  private final Zm31[] Zm;
  
  private static int[] Zx;
  
  Zl4d(Zeu4<K> paramZeu4, Ztdo paramZtdo) {
    this.Zl = new Ztq0<>(this, paramZeu4, paramZtdo);
    this.Zw = new Zek7(0);
    this.ZO = new Zekv(1);
    this.ZM = new Zekv(2);
    this.ZF = new Zeke<>(3, Zif.Zc);
    this.Zu = new Zekg(4);
    this.Zm = new Zm31[] { this.Zw, this.ZM, this.ZO, this.ZF, this.Zu };
  }
  
  public Zm31[] Zc() {
    return this.Zm;
  }
  
  public Zllo<Zxlv<K>> ZI() {
    return this.Zl;
  }
  
  public Zeu4<? extends Zxlv<K>> Z_(byte paramByte) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public byte Z_() {
    return 0;
  }
  
  public boolean Zs() {
    return false;
  }
  
  public static void Zk(int[] paramArrayOfint) {
    Zx = paramArrayOfint;
  }
  
  public static int[] Zl() {
    return Zx;
  }
  
  static {
    if (Zl() != null)
      Zk(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl4d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */