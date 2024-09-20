package burp;

abstract class Ztrl {
  protected final Zslu Zk;
  
  public Ztrl(Zslu paramZslu) {
    this.Zk = paramZslu;
  }
  
  public boolean Zt(Ze3h paramZe3h) {
    Ze3h ze3h = paramZe3h.Zd();
    Zlit[] arrayOfZlit = new Zlit[ze3h.Zw()];
    int[] arrayOfInt = Zgxf.ZV();
    byte b = 0;
    for (Zz_1 zz_1 : ze3h) {
      arrayOfZlit[b++] = ((Zxya)zz_1.Z_()).Zq();
      if (arrayOfInt != null)
        break; 
    } 
    Zk(arrayOfZlit);
    return true;
  }
  
  protected abstract void Zk(Zlit[] paramArrayOfZlit);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztrl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */