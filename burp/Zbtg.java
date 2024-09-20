package burp;

class Zbtg extends Zbtk {
  private final Zedd ZV = new Zedd();
  
  Zbtg(Zxwh paramZxwh) {
    super(paramZxwh);
    String[] arrayOfString = Zt75.ZA;
    Zbqc[] arrayOfZbqc = Zbtk.Zl();
    int j = arrayOfString.length;
    byte b = 0;
    while (b < j) {
      String str = arrayOfString[b];
      this.ZV.addItem(str);
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    int i = paramZxwh.ZWN();
    if (i >= 0 && i < Zt75.ZA.length)
      this.ZV.setSelectedIndex(i); 
    Z_(this.ZV, 0, 0, 2);
  }
  
  void Zy() {
    int i = this.ZV.getSelectedIndex();
    if (i < 0)
      i = 0; 
    this.ZX.ZWW(i);
    this.ZX.ZAC(Zt75.ZA[i]);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbtg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */