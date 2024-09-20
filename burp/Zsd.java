package burp;

import java.util.Map;

class Zsd {
  private static final Map<Zs66, Zzin> ZG = new Zxo3();
  
  private static final Map<Zs66, Zzin> ZL = new Zznn();
  
  private final Map<Zs66, Zzin> Zx;
  
  private Zsd(Map<Zs66, Zzin> paramMap) {
    this.Zx = paramMap;
  }
  
  static Zsd Zv(Zbfi paramZbfi) {
    return paramZbfi.ZqT().ZO(Zlk4.NORMAL) ? new Zsd(ZG) : new Zsd(ZL);
  }
  
  boolean ZJ(Zs66 paramZs66) {
    return !this.Zx.containsKey(paramZs66);
  }
  
  int ZT(Zs66 paramZs66) {
    return ((Zzin)this.Zx.get(paramZs66)).Zo;
  }
  
  int ZU(Zs66 paramZs66) {
    return ((Zzin)this.Zx.get(paramZs66)).ZK;
  }
  
  boolean Zv(Zs66 paramZs66) {
    return ((Zzin)this.Zx.get(paramZs66)).Zi;
  }
  
  boolean Za(Zs66 paramZs66) {
    return ((Zzin)this.Zx.get(paramZs66)).ZV;
  }
  
  boolean Zb(Zs66 paramZs66) {
    return ((Zzin)this.Zx.get(paramZs66)).ZN;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */