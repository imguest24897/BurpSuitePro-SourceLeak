package burp;

class Zsr1 extends Zsg5 {
  Zsr1(Zldn paramZldn, Zxgn paramZxgn, Zmf8 paramZmf8) {
    super(paramZldn, paramZxgn, paramZmf8);
  }
  
  public Zlnz Zq(char paramChar) {
    if (this.Zn.ZM(paramChar))
      return this.ZL.Zd; 
    if (this.Zn.Zq() && Zekt.Zy(paramChar))
      return this.ZL.Zi; 
    if (!this.Zn.Zq() && (paramChar == '>' || Zekt.Zy(paramChar) || this.Zn.ZZ())) {
      if (this.Zn.ZZ()) {
        this.Zn.Zm();
        return this.ZL.Zq;
      } 
      return (paramChar == '>') ? this.ZL.Zq : this.ZL.Z_;
    } 
    return Zekt.Zy(paramChar) ? this.ZL.Zi : this.ZL.Zw;
  }
  
  public boolean ZZ() {
    return true;
  }
  
  public int Zq(Character paramCharacter) {
    return Ztj6.Zp(paramCharacter);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsr1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */