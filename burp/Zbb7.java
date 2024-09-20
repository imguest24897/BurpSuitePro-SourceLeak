package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zbb7 extends Zbv5 implements Zmp0 {
  protected Ze9k Zg;
  
  protected Zbyw Zw;
  
  protected Zr_4 ZY;
  
  private static String[] ZQ;
  
  Zbb7(Zbyw paramZbyw, Zr_4 paramZr_4) {
    this.Zw = paramZbyw;
    this.ZY = paramZr_4;
  }
  
  public static Zmp0 ZR(Zzvm paramZzvm, Zbyw paramZbyw, boolean paramBoolean, Zz0n paramZz0n, Zt4u paramZt4u, Zerg paramZerg, Zr_4 paramZr_4) {
    switch (Zm0.ZO[paramZzvm.ordinal()]) {
      case 1:
        return new Zbbc(paramZz0n, paramZt4u, paramZbyw, paramZr_4);
      case 2:
        return new Zbex(paramZt4u, paramZbyw, paramZr_4, paramBoolean);
      case 3:
        return new Zbe8(paramZz0n, paramZt4u, paramZbyw, paramZr_4);
      case 4:
        return new Zbbr(paramZbyw, paramZr_4);
      case 5:
        return new Zbbb(paramZz0n, paramZt4u, paramZbyw, paramZr_4);
      case 6:
        return new Zbbm(paramZz0n, paramZt4u, paramZbyw, paramZr_4);
      case 7:
        return new Zbbk(paramZz0n, paramZt4u, paramZbyw, paramZr_4, paramBoolean);
      case 8:
        return new Zbbt(paramZbyw, paramZr_4);
      case 9:
        return new Zbe6(paramZbyw, paramBoolean, paramZr_4);
      case 10:
        return new Zbef(paramZbyw, paramZr_4);
      case 11:
        return new Zbel(paramZbyw, paramZr_4);
      case 12:
        return new Zbez(paramZbyw, paramBoolean, paramZr_4);
      case 13:
        return new Zbby(paramZbyw, paramZr_4);
      case 14:
        return new Zbbg(paramZbyw, paramZr_4);
      case 15:
        return new Zbbd(paramZz0n, paramZt4u, paramZbyw, paramZr_4);
      case 16:
        return new Zbba(paramZz0n, paramZt4u, paramZbyw, paramZr_4, paramBoolean);
      case 17:
        return new Zbej(paramZbyw, paramZerg, paramZr_4);
      case 18:
        return new Zbeo(paramZbyw, paramZr_4);
      case 19:
        return new Zbb5(paramZbyw, paramZr_4);
    } 
    Zuh.Zv(false, Zqf.Zk, paramZzvm.id);
    return null;
  }
  
  public Zbqc Zz() {
    return this;
  }
  
  public Ze9k ZP() {
    return this.Zg;
  }
  
  public static void ZD(String[] paramArrayOfString) {
    ZQ = paramArrayOfString;
  }
  
  public static String[] ZS() {
    return ZQ;
  }
  
  static {
    if (ZS() == null)
      ZD(new String[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbb7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */