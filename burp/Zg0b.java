package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zg0b implements Zeu4<Zmg> {
  public final Zekv Zq;
  
  final Zekv ZE;
  
  public final Zekk<Zmyi> Za;
  
  final Zekv Zn;
  
  private final Zm31[] ZM;
  
  private final Zllo<Zmg> ZA;
  
  private final Zsqx<Zmg> ZV;
  
  private static boolean Zf;
  
  public Zg0b() {
    this.Zq = new Zekv(0);
    this.ZE = new Zekv(1);
    this.Za = new Zekk<>(2, Zmyi.Zp);
    this.Zn = new Zekv(3);
    this.ZM = new Zm31[] { this.Zq, this.ZE, this.Za, this.Zn };
    this.ZA = new Zro3(this);
    boolean bool = Zq();
    try {
      this.ZV = new Zk7y(this, 10);
      if (bool)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  Zg0b(Zk7y paramZk7y) {
    boolean bool = ZC();
    try {
      this.Zq = new Zekv(0);
      this.ZE = new Zekv(1);
      this.Za = new Zekk<>(2, Zmyi.Zp);
      this.Zn = new Zekv(3);
      this.ZM = new Zm31[] { this.Zq, this.ZE, this.Za, this.Zn };
      this.ZA = new Zro3(this);
      this.ZV = paramZk7y;
      if (Zbqc.Zwu() == null) {
        try {
        
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        Zu(!bool);
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public Zm31[] Zc() {
    return this.ZM;
  }
  
  public Zllo<Zmg> ZI() {
    return this.ZA;
  }
  
  public Zeu4<? extends Zmg> Z_(byte paramByte) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public byte Z_() {
    return 0;
  }
  
  public boolean Zs() {
    return false;
  }
  
  public byte ZD() {
    return 0;
  }
  
  public static void Zu(boolean paramBoolean) {
    Zf = paramBoolean;
  }
  
  public static boolean Zq() {
    return Zf;
  }
  
  public static boolean ZC() {
    boolean bool = Zq();
    try {
      if (!bool)
        return true; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return false;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    if (Zq())
      Zu(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg0b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */