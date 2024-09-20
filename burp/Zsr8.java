package burp;

class Zsr8 extends Zsg5 {
  Zsr8(Zldn paramZldn, Zxgn paramZxgn, Zmf8 paramZmf8) {
    super(paramZldn, paramZxgn, paramZmf8);
  }
  
  public Zlnz Zq(char paramChar) {
    if (this.Zn.ZR) {
      if (paramChar == '>' || Zekt.Zy(paramChar)) {
        this.Zn.ZE(28);
        return (paramChar == '>') ? this.ZL.Zq : this.ZL.Z_;
      } 
    } else {
      if (Zekt.Zy(paramChar) && this.Zn.ZC('?')) {
        this.Zn.ZE(21);
        return this.ZL.Z_;
      } 
      if (paramChar == '=' || paramChar == '>' || Zekt.Zy(paramChar) || this.Zn.ZZ()) {
        if (this.Zn.Zc && this.Zn.ZH())
          this.Zn.Zc = false; 
        this.Zn.ZE(28);
        if (this.Zn.ZZ()) {
          this.Zn.Zm();
          return this.ZL.Zq;
        } 
        switch (paramChar) {
          case '=':
            return this.ZL.ZG;
          case '>':
            return this.ZL.Zq;
        } 
        return this.ZL.ZO;
      } 
    } 
    return this;
  }
  
  public int Zl() {
    return 28;
  }
  
  public int Zq(Character paramCharacter) {
    return this.Zn.ZR ? -1 : -3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsr8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */