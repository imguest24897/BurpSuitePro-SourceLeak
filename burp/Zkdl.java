package burp;

class Zkdl implements Zzgp {
  private final Zzgp Zc;
  
  public boolean Zh;
  
  public boolean ZM;
  
  private boolean Zr;
  
  private Zkdl(Zzgp paramZzgp) {
    this.Zc = paramZzgp;
  }
  
  public void ZT(int paramInt) {
    if (this.Zr) {
      this.Zh = true;
      return;
    } 
    this.Zr = true;
    this.Zc.ZT(paramInt);
  }
  
  public void ZR(int paramInt) {
    this.Zc.ZR(paramInt);
  }
  
  public void Zh(int paramInt) {
    this.Zc.Zh(paramInt);
  }
  
  public void Zf() {
    this.Zc.Zf();
  }
  
  public void Ze() {
    String str = Zs5v.Zf();
    if (this.Zr) {
      this.Zh = true;
      if (str != null) {
        this.ZM = true;
        return;
      } 
      return;
    } 
    this.ZM = true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkdl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */