package burp;

class Zsrc extends Zsg5 {
  Zsrc(Zldn paramZldn, Zxgn paramZxgn, Zmf8 paramZmf8) {
    super(paramZldn, paramZxgn, paramZmf8);
  }
  
  public Zlnz Zq(char paramChar) {
    if (!Zekt.Zy(paramChar)) {
      this.Zn.ZE(22);
      if (this.Zn.ZZ()) {
        this.Zn.Zm();
        return this.ZL.Zq;
      } 
      switch (paramChar) {
        case '=':
          return this.ZL.ZG;
        case '>':
          return this.ZL.Zq;
        case '?':
          return this.ZL.ZK;
      } 
      return this.ZL.ZB;
    } 
    return this;
  }
  
  public int Zl() {
    return 22;
  }
  
  public int Zq(Character paramCharacter) {
    return -3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsrc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */