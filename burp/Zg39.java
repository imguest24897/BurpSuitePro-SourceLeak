package burp;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zg39 {
  private static final Map<Zeko, Integer> ZR = Map.of(Zeko.MINIMIZE_FALSE_NEGATIVES, Integer.valueOf(4), Zeko.NORMAL, Integer.valueOf(8), Zeko.MINIMIZE_FALSE_POSITIVES, Integer.valueOf(10));
  
  private final Zbnt Zk;
  
  private final Zmhe Z_;
  
  private final Zkq4 ZK;
  
  private final Ze3n ZI;
  
  private final Zxs7 ZQ;
  
  private final Zxrc ZT;
  
  private final Zxrc Zi;
  
  private final Zstu Zs;
  
  Zg39(Zbnt paramZbnt, Zmhe paramZmhe, Zkq4 paramZkq4, Ze3n paramZe3n, Zxs7 paramZxs7, Zxrc paramZxrc1, Zxrc paramZxrc2, Zstu paramZstu) {
    this.Zk = paramZbnt;
    this.Z_ = paramZmhe;
    this.ZK = paramZkq4;
    this.ZI = paramZe3n;
    this.ZQ = paramZxs7;
    this.ZT = paramZxrc1;
    this.Zi = paramZxrc2;
    this.Zs = paramZstu;
  }
  
  Zx_5 Z_(Zzu2 paramZzu2) {
    boolean bool = Zzrf.Zo();
    for (String str : Zxc9.Zm(paramZzu2, this.ZT)) {
      Zsb8 zsb8 = new Zsb8(this.ZI.ZA().ZF(), this.ZI.ZL().Za(), this.Zs, this.Zk);
      Zg0r zg0r = new Zg0r(new Zso1(List.of(str, this.ZQ.ZI()), Collections.singletonList(this.Zi.ZP())), this.Z_);
      if (ZY(zsb8, zg0r)) {
        Zs2i zs2i = this.ZQ.<Zs2i>Zk(new Zrrb(this.ZQ.ZI().getBytes(), (byte)0));
        Zkvd zkvd = zsb8.Zp();
        return Zzhp.ZW(paramZzu2, this.ZI.Za(), this.ZI.ZN(), this.ZI.Zt().ZK(zs2i.ZO()), zg0r.Zz(this.ZI, zkvd), zg0r.Zk(this.ZI, zkvd), this.ZQ, (byte)1, Zkb.Zy(zg0r.ZU), Zkb.Zy(zg0r.ZR));
      } 
      if (!bool)
        break; 
    } 
    return null;
  }
  
  private boolean ZY(Zsb8 paramZsb8, Zg0r paramZg0r) {
    int i = Z_();
    byte b = 0;
    boolean bool = Zzrf.Zo();
    while (b < i) {
      Zstu zstu1 = paramZg0r.Zi();
      paramZsb8.ZQ(zstu1);
      if (!paramZsb8.Zy())
        return false; 
      Zstu zstu2 = paramZg0r.ZQ();
      paramZsb8.Zr(zstu2);
      if (!paramZsb8.Zy())
        return false; 
      b++;
      if (!bool)
        break; 
    } 
    return true;
  }
  
  private int Z_() {
    Integer integer = ZR.get(this.ZK.ZqM());
    if (integer == null) {
      Zuh.ZT(false, Zqf.Zk, this.ZK.ZqM().name());
      integer = ZR.get(Zeko.NORMAL);
    } 
    return integer.intValue();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg39.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */