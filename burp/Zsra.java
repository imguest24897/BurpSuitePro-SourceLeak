package burp;

class Zsra extends Zsg5 {
  Zsra(Zldn paramZldn, Zxgn paramZxgn, Zmf8 paramZmf8) {
    super(paramZldn, paramZxgn, paramZmf8);
  }
  
  public Zlnz Zq(char paramChar) {
    if (paramChar == '>' || Zekt.Zy(paramChar) || this.Zn.ZZ()) {
      this.Zn.Zc = (!this.Zn.ZR && this.Zn.Zt());
      this.Zn.ZB = (!this.Zn.ZR && this.Zn.Zd());
      this.Zn.ZE(27);
      if (this.Zn.ZZ()) {
        this.Zn.Zm();
        return this.ZL.Zq;
      } 
      return (paramChar == '>') ? this.ZL.Zq : this.ZL.Z_;
    } 
    return this;
  }
  
  public void ZR() {
    if (!this.Zn.ZR) {
      this.Zn.Zc = this.Zn.Zt();
      this.Zn.ZB = this.Zn.Zd();
    } 
  }
  
  public int Zl() {
    return 27;
  }
  
  public int Zq(Character paramCharacter) {
    return -1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsra.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */