package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public interface Zz1i extends Zgpi<Zz1i> {
  public static final Zeu4<Zz1i> ZK = new Zkpr();
  
  Zefg<Zbza> ZHU();
  
  default List<Zbza> ZHv() {
    return (List<Zbza>)(new ArrayList(ZHU())).stream().filter(Zz1i::lambda$getUnfinishedAuditItems$0).collect(Collectors.toList());
  }
  
  Ze93<Zrte<Zs37>> ZH8();
  
  Zt7v<Zmg> ZHj();
  
  Object ZH0();
  
  Zzuq ZDT(String paramString);
  
  Zb97 ZH1();
  
  Zkmo ZHd();
  
  Zxz8 ZHl();
  
  Zz8z ZHE();
  
  Zkcw ZHK();
  
  Zb_b Zpm();
  
  Zx56 ZH3();
  
  Zmj1 ZHB();
  
  Zefk ZHD();
  
  void ZV(long paramLong);
  
  long ZHo();
  
  Zltc ZHL();
  
  void Zc(long paramLong);
  
  boolean ZZ(long paramLong);
  
  void Zf(long paramLong);
  
  boolean ZH(long paramLong);
  
  default void ZHH() {
    synchronized (Zz6()) {
      ZV(0L);
    } 
  }
  
  void Zz(Zl5x paramZl5x);
  
  void ZZ(Zl5x paramZl5x);
  
  default long Zd(Zl5x paramZl5x) {
    synchronized (Zz6()) {
      return Zgfc.Ze(paramZl5x, ZHo(), Zgfc.Zu(paramZl5x));
    } 
  }
  
  default long Zl(Zl5x paramZl5x) {
    synchronized (Zz6()) {
      long l1 = ZHo();
      long l2 = Zgfc.Zu(paramZl5x);
      long l3 = Zgfc.Zy(paramZl5x, l1, l2);
      l1 &= l2 ^ 0xFFFFFFFFFFFFFFFFL;
      l1 |= l3;
      ZV(l1);
      return Zd(paramZl5x);
    } 
  }
  
  default int ZHW() {
    return ZHD().ZQ6();
  }
  
  default int ZHg() {
    return ZHD().ZQE();
  }
  
  default int ZHf() {
    return ZHD().ZQ_();
  }
  
  default int ZHz() {
    return ZHD().ZQZ();
  }
  
  default int ZHt() {
    return ZHD().ZQX();
  }
  
  default int ZHO() {
    return ZHD().ZQ2();
  }
  
  default void ZN(Zl5x paramZl5x, int paramInt) {
    ZHL().ZN(paramZl5x.Zn(), Long.valueOf(paramInt));
  }
  
  default int ZT(Zl5x paramZl5x) {
    Long long_ = ZHL().Zg(paramZl5x.Zn());
    return (long_ == null) ? 0 : long_.intValue();
  }
  
  int ZH_();
  
  void Zq9(int paramInt);
  
  int ZH9();
  
  void Zqo(int paramInt);
  
  default int ZHS() {
    return ZH_() - ZH9();
  }
  
  Zbom Zc(Zmzk paramZmzk);
  
  private static boolean lambda$getUnfinishedAuditItems$0(Zbza paramZbza) {
    return !paramZbza.Zg1();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz1i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */