package burp;

class Zbfy extends Zbfr {
  private final Zbd8 Z_;
  
  private final Zs18 Zy;
  
  public Zbfy(Zth5 paramZth5, Zbd8 paramZbd8, Zs18 paramZs18, Zzmn... paramVarArgs) {
    super(paramZth5, paramVarArgs);
    this.Z_ = paramZbd8;
    this.Zy = paramZs18;
  }
  
  boolean ZA(Zsmh paramZsmh) {
    return Zbfr.ZB.contains(Zzwy.ZQ((this.Zy.Zq(paramZsmh)).ZH).Za());
  }
  
  void ZY(Zren paramZren) {
    this.Z_.ZA(paramZren);
  }
  
  public boolean ZB(Zge7 paramZge7, Zsmh paramZsmh, boolean paramBoolean) {
    return paramZge7.ZT(paramZsmh, Zgu3.HTTP_RESPONSE, this.Zy.Zq(paramZsmh), paramBoolean);
  }
  
  public void ZS(Zge7 paramZge7, Zsmh paramZsmh, boolean paramBoolean) {
    paramZge7.Zy(paramZsmh, this.Zy.Zq(paramZsmh), paramBoolean);
  }
  
  void ZH(Zge7 paramZge7, Zsmh paramZsmh, boolean paramBoolean1, boolean paramBoolean2) {
    paramZge7.Za(paramZsmh, this.Zy.Zq(paramZsmh), paramBoolean1);
  }
  
  Zgu3 ZQ() {
    return Zgu3.HTTP_RESPONSE;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbfy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */