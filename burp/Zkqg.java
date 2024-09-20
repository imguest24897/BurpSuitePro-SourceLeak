package burp;

class Zkqg implements Zg3 {
  private final Zkit Zw;
  
  Zkqg(Zkit paramZkit) {
    this.Zw = paramZkit;
  }
  
  public boolean ZQ(Zgpi paramZgpi, Zm31 paramZm31) {
    return Zr(paramZgpi, paramZgpi, paramZm31, null);
  }
  
  private boolean Zr(Zgpi paramZgpi1, Zgpi paramZgpi2, Zm31 paramZm311, Zm31 paramZm312) {
    Zbqc[] arrayOfZbqc = Zxsr.ZXP();
    if (paramZgpi1 == null)
      return true; 
    if (paramZgpi1 instanceof Ze34) {
      Ze34 ze34 = (Ze34)paramZgpi1;
      if (ze34.Zpu() > 0) {
        Zs1w zs1w = new Zs1w(ze34, paramZgpi2, paramZm311, paramZm312);
        ze34.ZC(zs1w);
        return zs1w.Zs;
      } 
      return true;
    } 
    Ztky ztky = new Ztky(this.Zw, paramZgpi1, paramZgpi2, paramZm311, paramZm312);
    Zm31[] arrayOfZm31 = paramZgpi1.ZF().Zc();
    int i = arrayOfZm31.length;
    byte b = 0;
    while (b < i) {
      Zm31 zm31 = arrayOfZm31[b];
      zm31.ZK(ztky);
      if (!ztky.ZM)
        return false; 
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return true;
  }
  
  private static String ZK(Object paramObject) {
    return paramObject.getClass().getSimpleName();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkqg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */