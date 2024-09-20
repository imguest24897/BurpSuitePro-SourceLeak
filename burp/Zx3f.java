package burp;

class Zx3f extends Zxsr implements Zmx {
  Zx3f(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public int Z_() {
    return this.Za.Zx(this, Zkl0.ZW);
  }
  
  public void ZU(int paramInt) {
    this.Za.ZM(this, Zkl0.ZW, paramInt);
  }
  
  public String Zc() {
    return this.Za.Zf(this, Zkl0.Zn);
  }
  
  public void Zt(String paramString) {
    this.Za.Zi(this, Zkl0.Zn, paramString);
  }
  
  public boolean ZC() {
    return this.Za.Zi(this, Zkl0.ZZ);
  }
  
  public void ZD(boolean paramBoolean) {
    this.Za.ZH(this, Zkl0.ZZ, paramBoolean);
  }
  
  public int ZT() {
    int i = this.Za.Zx(this, Zkl0.Zc);
    this.Za.ZM(this, Zkl0.Zc, ++i);
    return i;
  }
  
  public int ZZ() {
    String str = Znv.ZQC();
    synchronized (Zz6()) {
      int i = this.Za.Zx(this, Zkl0.Zt);
      this.Za.ZM(this, Zkl0.Zt, i + 1);
      if (Zbqc.Zwu() == null)
        Znv.ZK("aiNaub"); 
      return i;
    } 
  }
  
  public Zefg<Zzem> Zp() {
    return (Zefg<Zzem>)this.Za.ZJ(this, Zkl0.ZF);
  }
  
  public Zeu4<? extends Zmx> ZF() {
    return Zmx.ZT;
  }
  
  public void ZHG() {
    this.Za.ZM(this, Zkl0.Zp, 0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx3f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */