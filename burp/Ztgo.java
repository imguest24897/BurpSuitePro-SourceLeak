package burp;

import java.util.List;

class Ztgo extends Ztdy {
  Ztgo(List<Zzm4> paramList) {
    super(paramList);
  }
  
  int Zr(int paramInt) {
    return ((Zzm4)this.Zh.get(paramInt)).ZUP();
  }
  
  int Zw(int paramInt) {
    return ((Zzm4)this.Zh.get(paramInt)).ZUS().getWidth();
  }
  
  int Zu(int paramInt, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5) {
    double d = (paramLong2 - paramLong4) / (paramLong5 - paramLong4);
    String str = Zsn5.ZW();
    if (str != null)
      Zbqc.Zr(new Zbqc[5]); 
    return (int)Math.round(Zr(paramInt) + d * (Zw(paramInt) - Zr(paramInt)));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztgo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */