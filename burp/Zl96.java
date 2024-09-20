package burp;

class Zl96 extends Zl9l {
  final Zm82 ZE;
  
  Zl96(Zm82 paramZm82) {}
  
  public boolean Zy(Zzhb paramZzhb) {
    return true;
  }
  
  public boolean Ze(Zrtx paramZrtx) {
    this.ZE.Zt(paramZrtx.Zkb());
    return true;
  }
  
  public boolean Zt(Zmxt paramZmxt) {
    String str = paramZmxt.Zkb();
    int i = str.lastIndexOf('.');
    Zbqc[] arrayOfZbqc = Zm82.Zb();
    if (i == -1) {
      this.ZE.Zt(str);
      if (arrayOfZbqc == null) {
        this.ZE.Zt(str.substring(0, i));
        this.ZE.Zg(str.substring(i + 1));
        return false;
      } 
      return false;
    } 
    this.ZE.Zt(str.substring(0, i));
    this.ZE.Zg(str.substring(i + 1));
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl96.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */