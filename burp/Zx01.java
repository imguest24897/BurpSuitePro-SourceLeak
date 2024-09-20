package burp;

import java.util.HashMap;
import java.util.Map;
import net.portswigger.Zli;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zx01 implements Zzu5 {
  private final Zlnu ZB;
  
  private final Zbnt ZL;
  
  private final Zey9 ZG;
  
  private final boolean ZQ;
  
  private final Map<Zez3, Zzu6> ZD;
  
  private static final String a;
  
  Zx01(Zlnu paramZlnu, Zbnt paramZbnt, Zey9 paramZey9, boolean paramBoolean) {
    this.ZB = paramZlnu;
    this.ZL = paramZbnt;
    this.ZG = paramZey9;
    this.ZQ = paramBoolean;
    this.ZD = new HashMap<>();
  }
  
  public Zeav Zh(Zrdb paramZrdb) {
    boolean bool = false;
    Zax zax = new Zax(paramZrdb.ZaB(), paramZrdb.Zax());
    Zez3 zez3 = this.ZB.Zf(zax);
    if (zez3 == null) {
      zez3 = this.ZB.Zq(zax, (short)0);
      bool = true;
    } 
    zez3 = Zg(paramZrdb, zez3);
    if (bool)
      this.ZB.ZR(zez3); 
    return Zl(zez3);
  }
  
  private Zez3 Zg(Zrdb paramZrdb, Zez3 paramZez3) {
    if (Zk8c.ZX(paramZez3)) {
      boolean bool1 = (Zli.ZU(paramZrdb.Zax(), (byte)63, 0, (paramZrdb.Zax()).length) != -1) ? true : false;
      boolean bool2 = (Zli.ZU(paramZrdb.Zax(), (byte)59, 0, (paramZrdb.Zax()).length) != -1) ? true : false;
      Zuh.Zr(false, Zqf.Zk, String.format(a, new Object[] { paramZrdb.Za6() }), bool1, bool2);
      paramZez3 = paramZez3.ZkJ();
    } 
    return paramZez3;
  }
  
  public void ZW(Zrdb paramZrdb) {
    Zax zax = new Zax(paramZrdb.ZaB(), paramZrdb.Zax());
    Zmxt zmxt = this.ZB.Zf(zax);
    Zez3 zez3 = Zg(paramZrdb, zmxt);
    if ((new Ztwx(zez3, this.ZL, this.ZG)).ZN(paramZrdb))
      this.ZB.ZR(zez3); 
  }
  
  private Zeav Zl(Zez3 paramZez3) {
    Zzu6 zzu6 = this.ZD.get(paramZez3);
    if (zzu6 == null) {
      zzu6 = new Zzu6((Zmxt)paramZez3);
      this.ZD.put(paramZez3, zzu6);
    } 
    return zzu6;
  }
  
  public void ZM(Zeav paramZeav, Ztbg paramZtbg) {
    Zmxt zmxt = ((Zzu6)paramZeav).ZQ();
    if (!paramZtbg.Zw().isEmpty()) {
      paramZeav.Zf().removeAll(paramZtbg.Zw());
      this.ZB.Zj(zmxt, paramZtbg.Zw());
    } 
    if (!paramZtbg.Zq().isEmpty()) {
      paramZeav.Zf().addAll(paramZtbg.Zq());
      this.ZB.ZO(zmxt, paramZtbg.Zq(), this.ZQ);
    } 
    if (!paramZtbg.Z_().isEmpty())
      this.ZB.Zq(paramZtbg.Z_()); 
    if (!paramZtbg.ZB().isEmpty())
      this.ZB.Zq(paramZtbg.ZB()); 
    if (!paramZtbg.ZE().isEmpty())
      this.ZB.Zq(paramZtbg.ZE()); 
    if (!paramZtbg.Zz().isEmpty())
      this.ZB.Zq(paramZtbg.Zz()); 
  }
  
  static {
    // Byte code:
    //   0: bipush #66
    //   2: ldc 'Z8@+^Yj;VdV[^'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zx01.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #81
    //   82: goto -> 112
    //   85: bipush #9
    //   87: goto -> 112
    //   90: bipush #113
    //   92: goto -> 112
    //   95: bipush #28
    //   97: goto -> 112
    //   100: bipush #52
    //   102: goto -> 112
    //   105: bipush #60
    //   107: goto -> 112
    //   110: bipush #111
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx01.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */