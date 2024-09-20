package burp;

class Zmdw implements Zedt {
  private final Zgtp ZG;
  
  private Zgu3 Zv;
  
  Zmdw(Zgtp paramZgtp) {
    this.ZG = paramZgtp;
  }
  
  void Zp(Zgu3 paramZgu3) {
    this.Zv = paramZgu3;
  }
  
  public void Zy(int paramInt1, int paramInt2, String paramString) {
    int[] arrayOfInt = Zbdf.ZM();
    if (this.Zv == null)
      return; 
    switch (Zzmi.Zo[this.Zv.ordinal()]) {
      case 1:
        this.ZG.Zj(paramInt1, paramInt2, paramString);
        if (arrayOfInt != null);
        return;
      case 2:
        this.ZG.ZO(paramInt1, paramInt2, paramString);
        if (arrayOfInt != null)
          break; 
        return;
    } 
    this.ZG.Zz(paramInt1, paramInt2, paramString);
  }
  
  public void ZW() {
    Zy(-1, -1, "");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmdw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */