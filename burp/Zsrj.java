package burp;

class Zsrj extends Zsg5 {
  Zsrj(Zldn paramZldn, Zxgn paramZxgn, Zmf8 paramZmf8) {
    super(paramZldn, paramZxgn, paramZmf8);
  }
  
  public Zlnz Zq(char paramChar) {
    if (this.Zn.ZR && paramChar == '>') {
      this.Zn.ZE(29);
      return this.ZL.Zq;
    } 
    if (this.Zn.Zq()) {
      if (this.Zn.ZM(paramChar)) {
        this.Zn.ZE(29);
        return this.ZL.Zd;
      } 
      if (Zekt.Zy(paramChar)) {
        this.Zn.ZE(29);
        return this.ZL.Zi;
      } 
    } else if (paramChar == '>' || Zekt.Zy(paramChar) || this.Zn.ZZ()) {
      this.Zn.ZE(29);
      if (this.Zn.ZZ()) {
        this.Zn.Zm();
        return this.ZL.Zq;
      } 
      return (paramChar == '>') ? this.ZL.Zq : this.ZL.Z_;
    } 
    return this;
  }
  
  public int Zl() {
    return 29;
  }
  
  public int Zq(Character paramCharacter) {
    return Ztj6.Zp(paramCharacter);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsrj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */