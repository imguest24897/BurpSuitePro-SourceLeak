package burp;

class Zbf5 extends Zbfr {
  private final Zbd8 ZX;
  
  public Zbf5(Zth5 paramZth5, Zbd8 paramZbd8, Zzmn... paramVarArgs) {
    super(paramZth5, paramVarArgs);
    this.ZX = paramZbd8;
  }
  
  boolean ZA(Zsmh paramZsmh) {
    if (paramZsmh == null)
      return false; 
    Zrp8 zrp8 = new Zrp8();
    paramZsmh.Zh(zrp8);
    byte[] arrayOfByte = zrp8.Zb();
    Zsba zsba = Zmyf.Zy(arrayOfByte, 0, arrayOfByte.length);
    return (zsba == Zsba.JSON || zsba == Zsba.XML);
  }
  
  void ZY(Zren paramZren) {
    this.ZX.ZA(paramZren);
  }
  
  public boolean ZB(Zge7 paramZge7, Zsmh paramZsmh, boolean paramBoolean) {
    return paramZge7.ZT(paramZsmh, Zgu3.WS_MESSAGE, null, paramBoolean);
  }
  
  public void ZS(Zge7 paramZge7, Zsmh paramZsmh, boolean paramBoolean) {
    paramZge7.Za(paramZsmh, paramBoolean);
  }
  
  void ZH(Zge7 paramZge7, Zsmh paramZsmh, boolean paramBoolean1, boolean paramBoolean2) {
    ZS(paramZge7, paramZsmh, false);
  }
  
  Zgu3 ZQ() {
    return Zgu3.WS_MESSAGE;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbf5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */