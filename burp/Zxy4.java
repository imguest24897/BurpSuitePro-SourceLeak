package burp;

class Zxy4 implements Zcd {
  private final Zln_ Zs;
  
  private final Zku Zj;
  
  private final Zeom ZQ;
  
  private final Zmvm ZF;
  
  private final Ztg8 Zk;
  
  private final Zzzt ZC;
  
  private final Zzzt ZM;
  
  Zxy4(Zln_ paramZln_, Zku paramZku, Zeom paramZeom, Zmvm paramZmvm, Ztg8 paramZtg8, Zzzt paramZzzt1, Zzzt paramZzzt2) {
    this.Zs = paramZln_;
    this.Zj = paramZku;
    this.ZQ = paramZeom;
    this.ZF = paramZmvm;
    this.Zk = paramZtg8;
    this.ZC = paramZzzt1;
    this.ZM = paramZzzt2;
  }
  
  public void ZU(Zs0m paramZs0m) {
    Zs0m zs0m = this.Zk.<Zs0m>Zw(paramZs0m);
    Ztpl ztpl = this.Zs.ZI(zs0m);
    this.ZF.ZM(ztpl);
  }
  
  public void Zf(Zl47 paramZl47) {
    Zl47 zl47 = this.Zk.<Zl47>Zw(paramZl47);
    zl47.Zw7().forEach(this::lambda$visit$0);
    int i = Zq(paramZl47.Zwy());
    zl47.Zhk(i);
    Zzyu zzyu = this.Zj.ZF(zl47);
    this.ZF.ZM(zzyu);
  }
  
  private int Zq(int paramInt) {
    int i = this.ZQ.Zt(paramInt);
    if (i == 0) {
      Zmo7 zmo7 = this.ZC.Zy(paramInt);
      i = this.ZM.ZR(this.Zk.<Zlit>Zw(zmo7.Zk()), zmo7.ZL(), zmo7.Zr(), zmo7.ZO(), zmo7.ZT());
      this.ZQ.Zq(paramInt, i);
    } 
    return i;
  }
  
  private void lambda$visit$0(Zeeg paramZeeg) {
    paramZeeg.ZnM(Zq(paramZeeg.ZaW()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxy4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */