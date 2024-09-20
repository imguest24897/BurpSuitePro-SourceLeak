package burp;

class Zbtt extends Zbtk {
  private final Zedd ZQ = new Zedd();
  
  Zbtt(Zxwh paramZxwh) {
    super(paramZxwh);
    Zbqc[] arrayOfZbqc = Zbtk.Zl();
    String[] arrayOfString = Zb1a.ZM;
    int j = arrayOfString.length;
    byte b = 0;
    while (b < j) {
      String str = arrayOfString[b];
      this.ZQ.addItem(str);
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    int i = paramZxwh.ZWN();
    if (i >= 0 && i < Zb1a.ZM.length)
      this.ZQ.setSelectedIndex(i); 
    Z_(this.ZQ, 0, 0, 2);
  }
  
  void Zy() {
    int i = this.ZQ.getSelectedIndex();
    if (i < 0)
      i = 0; 
    this.ZX.ZWW(i);
    this.ZX.ZAC(Zb1a.ZM[i]);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbtt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */