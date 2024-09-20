package burp;

class Zbty extends Zbtk {
  private final Zedd ZR = new Zedd();
  
  Zbty(Zxwh paramZxwh) {
    super(paramZxwh);
    String[] arrayOfString = Zbw.Za;
    int j = arrayOfString.length;
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zbtk.Zl();
    while (b < j) {
      String str = arrayOfString[b];
      this.ZR.addItem(str);
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    int i = paramZxwh.ZWN();
    if (i >= 0 && i < Zbw.Za.length)
      this.ZR.setSelectedIndex(i); 
    Z_(this.ZR, 0, 0, 2);
  }
  
  void Zy() {
    int i = this.ZR.getSelectedIndex();
    if (i < 0)
      i = 0; 
    this.ZX.ZWW(i);
    this.ZX.ZAC(Zbw.Za[i]);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbty.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */