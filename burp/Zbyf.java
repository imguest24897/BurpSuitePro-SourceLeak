package burp;

class Zbyf extends Zbtk {
  private final Zedd ZI = new Zedd();
  
  Zbyf(Zxwh paramZxwh) {
    super(paramZxwh);
    String[] arrayOfString = Ztyz.ZM;
    int j = arrayOfString.length;
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zbtk.Zl();
    while (b < j) {
      String str = arrayOfString[b];
      this.ZI.addItem(str);
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    int i = paramZxwh.ZWN();
    if (i >= 0 && i < Ztyz.ZM.length)
      this.ZI.setSelectedIndex(i); 
    Z_(this.ZI, 0, 0, 2);
  }
  
  void Zy() {
    int i = this.ZI.getSelectedIndex();
    if (i < 0)
      i = 0; 
    this.ZX.ZWW(i);
    this.ZX.ZAC(Ztyz.ZM[i]);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbyf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */