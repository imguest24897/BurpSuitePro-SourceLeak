package burp;

class Ztym implements Ztmr {
  private final Zkit ZH;
  
  private final Ztg8 Zr;
  
  private final Zzir ZF;
  
  Ztym(Zkit paramZkit, Ztg8 paramZtg8, Zzir paramZzir) {
    this.ZH = paramZkit;
    this.Zr = paramZtg8;
    this.ZF = paramZzir;
  }
  
  public void Zk(long paramLong) {
    Zt6 zt61 = this.ZH.<Zt6>Zo(paramLong, Zt6.ZK);
    Zt6 zt62 = this.Zr.<Zt6>Zw(zt61);
    int i = Zlbi.ZO();
    if (zt62 != null) {
      Zefg<Zt6> zefg = this.ZF.Zvx();
      int j = zt62.Z_3();
      if (j > 0) {
        int k = zefg.size();
        while (k < j) {
          zefg.add(null);
          k++;
          if (i != 0)
            break; 
        } 
        zefg.set(j - 1, zt62);
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztym.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */