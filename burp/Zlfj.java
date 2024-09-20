package burp;

class Zlfj {
  final Zbdf ZN;
  
  Zlfj(Zbdf paramZbdf) {}
  
  void ZN(Zefx paramZefx, Zgsq paramZgsq) {
    this.ZN.ZW(paramZefx, paramZgsq, false);
  }
  
  void ZP(byte[] paramArrayOfbyte, Zgu3 paramZgu3) {
    this.ZN.ZY(Zsmh.Zh(paramArrayOfbyte), paramZgu3, Zgsq.AUTO, true);
  }
  
  void Zh(String paramString) {
    if (!this.ZN.ZW || paramString.isEmpty())
      return; 
    int[] arrayOfInt = this.ZN.ZG();
    this.ZN.Zs(arrayOfInt[0], arrayOfInt[1], paramString);
  }
  
  byte[] Zr() {
    return Zt6s.Zb(this.ZN.Zo.ZjZ());
  }
  
  int ZY() {
    return this.ZN.ZG()[0];
  }
  
  int ZW() {
    return this.ZN.ZG()[1];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlfj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */