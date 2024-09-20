package burp;

public class Zzb6 implements Zk8x {
  private final Zrzd ZQ;
  
  private final Zgx1[] ZH;
  
  Zzb6(Zrzd paramZrzd, Zgx1... paramVarArgs) {
    this.ZQ = paramZrzd;
    this.ZH = paramVarArgs;
  }
  
  public Short ZT(Zstu paramZstu, Zm7o paramZm7o) {
    int i = Zgxv.ZN();
    int j = paramZm7o.Zz();
    if (Ze(paramZstu, j)) {
      Zm7o zm7o = ZM(paramZstu, j);
      while (zm7o.Zz() < paramZstu.Zpu()) {
        Short short_ = Zu(paramZstu, zm7o);
        if (short_.shortValue() != 2)
          return short_; 
        if (i == 0)
          break; 
      } 
    } 
    if (Zbqc.Zwu() == null)
      Zgxv.Zg(++i); 
    return Short.valueOf((short)1);
  }
  
  private Short Zu(Zstu paramZstu, Zm7o paramZm7o) {
    int j = paramZm7o.Zz();
    Zgx1[] arrayOfZgx1 = this.ZH;
    int k = arrayOfZgx1.length;
    int i = Zgxv.ZN();
    byte b = 0;
    while (b < k) {
      Zgx1 zgx1 = arrayOfZgx1[b];
      zgx1.Zc(paramZstu, paramZm7o);
      if (!ZJ(paramZstu, paramZm7o.Zz()))
        return Short.valueOf((short)1); 
      b++;
      if (i == 0)
        break; 
    } 
    return Za(paramZm7o, j) ? (Zf(paramZstu, paramZm7o.Zz()) ? Short.valueOf((short)260) : Short.valueOf((short)1)) : Short.valueOf((short)2);
  }
  
  private boolean Ze(Zstu paramZstu, int paramInt) {
    int i = ZZ(paramZstu, paramInt);
    return (paramZstu.Zp(i) == 91);
  }
  
  private boolean Zf(Zstu paramZstu, int paramInt) {
    int i = ZZ(paramZstu, paramInt);
    return (paramZstu.Zp(i) == 93);
  }
  
  private Zm7o ZM(Zstu paramZstu, int paramInt) {
    int i = ZZ(paramZstu, paramInt + 1);
    return new Zm7o(i);
  }
  
  private boolean Za(Zm7o paramZm7o, int paramInt) {
    return (paramInt == paramZm7o.Zz());
  }
  
  private int ZZ(Zstu paramZstu, int paramInt) {
    return paramInt + this.ZQ.Zo(paramZstu, paramInt);
  }
  
  private boolean ZJ(Zstu paramZstu, int paramInt) {
    return (ZZ(paramZstu, paramInt) < paramZstu.Zpu());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzb6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */