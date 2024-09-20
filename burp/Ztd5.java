package burp;

import java.util.List;

class Ztd5 extends Ztdy {
  private final double Zz;
  
  Ztd5(List<Zzm4> paramList) {
    super(paramList);
    this.Zz = paramList.stream().mapToInt(Zzm4::ZUP).average().orElse(0.0D);
  }
  
  int Zr(int paramInt) {
    return ((Zzm4)this.Zh.get(paramInt)).ZUS().getWidth();
  }
  
  int Zw(int paramInt) {
    return ((Zzm4)this.Zh.get(paramInt)).ZUS().getMaxWidth();
  }
  
  int Zu(int paramInt, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5) {
    double d1 = ZX(paramInt);
    String str = Zsn5.ZW();
    if (d1 != 0.0D)
      return (int)Math.round(Zr(paramInt) + d1 * (paramLong1 - paramLong3) / this.Zh.size()); 
    double d2 = (paramLong2 - paramLong4) / (paramLong5 - paramLong4);
    if (Zbqc.Zwu() == null)
      Zsn5.ZU("nXpgyb"); 
    return (int)Math.round(Zr(paramInt) + d2 * (Zw(paramInt) - Zr(paramInt)));
  }
  
  private double ZX(int paramInt) {
    return (this.Zz != 0.0D) ? (((Zzm4)this.Zh.get(paramInt)).ZUP() / this.Zz) : 0.0D;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztd5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */