package burp;

public class Zco extends Zni implements Zz3i {
  @Zzvo(1)
  private final Ze4r Zo;
  
  @Zzvo(2)
  private int ZJ;
  
  @Zzvo(3)
  private Zz3i Zc;
  
  public Zco(Ze4r paramZe4r) {
    this.Zo = paramZe4r;
  }
  
  public String ZTN() {
    return Zg67.Zc(this.Zo, this.ZJ);
  }
  
  public void ZkH(String paramString) {
    Zg67.Zx(this.Zo, paramString);
    this.ZJ = paramString.length();
  }
  
  public int ZT9() {
    return this.ZJ;
  }
  
  public void ZTm() {
    this.ZJ = 0;
  }
  
  public Zz3i ZT5() {
    return this.Zc;
  }
  
  public void Zn(Zz3i paramZz3i) {
    this.Zc = paramZz3i;
  }
  
  public Zeu4<Zz3i> ZF() {
    return Zs;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zco.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */