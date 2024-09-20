package burp;

public class Zlmm implements Zbh {
  public Zexx Ze(Zgh_ paramZgh_, Zbph paramZbph, int paramInt, boolean paramBoolean) {
    int i = Zrjd.ZG();
    if (paramZbph.Z_(paramZgh_.ZG(), paramZgh_.ZT(), paramZgh_.Zr()))
      return Zexx.VETOED_DUE_TO_PARAMETER_TYPE; 
    if (paramZbph.Z_(paramZgh_.ZX(), paramZgh_.ZT(), paramZgh_.Zr()))
      return Zexx.VETOED_DUE_TO_PARAMETER_TYPE; 
    if (paramZgh_ instanceof Zt4_) {
      Zt4_ zt4_ = (Zt4_)paramZgh_;
      Zgh_ zgh_ = zt4_.Zq();
      while (zgh_ instanceof Zt4_) {
        Zt4_ zt4_1 = (Zt4_)zgh_;
        if (paramZbph.Z_(zt4_1.ZG(), zt4_1.ZT(), zt4_1.Zr()))
          return Zexx.VETOED_DUE_TO_PARAMETER_TYPE; 
        zgh_ = zt4_1.Zq();
        if (i != 0)
          break; 
      } 
      if (paramZbph.Z_(zgh_.ZG(), zgh_.ZT(), zgh_.Zr()))
        return Zexx.VETOED_DUE_TO_PARAMETER_TYPE; 
    } 
    return Zexx.ALLOWED;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlmm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */