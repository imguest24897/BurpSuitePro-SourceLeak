package burp;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public abstract class Zt2r {
  protected Ztdi Z_;
  
  protected Zskh Zi;
  
  protected Ztdn Zn;
  
  protected Zsbg ZY;
  
  protected Zgk5 ZR;
  
  private static String[] Zu;
  
  public void ZK() {
    this.ZR.ZY();
    this.ZY.Zb();
  }
  
  public abstract void ZK(Zez3 paramZez3);
  
  public abstract byte Zc(Zlit paramZlit, Zs68 paramZs68, Zstu paramZstu);
  
  public abstract boolean Zi();
  
  public abstract boolean Zt();
  
  public Zsbg Zq() {
    return this.ZY;
  }
  
  public Zskh Zp() {
    return this.Zi;
  }
  
  public abstract Zstu Zi(byte paramByte1, Zlit paramZlit1, Zlit paramZlit2, List<Zt8g> paramList, byte paramByte2, AtomicReference<Zstu> paramAtomicReference);
  
  public static void ZI(String[] paramArrayOfString) {
    Zu = paramArrayOfString;
  }
  
  public static String[] Zw() {
    return Zu;
  }
  
  static {
    if (Zw() == null)
      ZI(new String[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt2r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */