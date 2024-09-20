package burp;

import java.util.List;

abstract class Ztdy {
  final List<Zzm4> Zh;
  
  Ztdy(List<Zzm4> paramList) {
    this.Zh = paramList;
  }
  
  abstract int Zr(int paramInt);
  
  abstract int Zw(int paramInt);
  
  abstract int Zu(int paramInt, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5);
  
  private int ZX() {
    return this.Zh.size();
  }
  
  private void ZV(int paramInt1, int paramInt2) {
    ((Zzm4)this.Zh.get(paramInt2)).ZUS().setWidth(paramInt1);
    ((Zzm4)this.Zh.get(paramInt2)).ZUS().setPreferredWidth(paramInt1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztdy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */