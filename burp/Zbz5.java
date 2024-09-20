package burp;

public class Zbz5 {
  private final Zmwp<Zez3> Zc;
  
  private final Object ZI;
  
  public Zbz5(Zskz paramZskz) {
    this.Zc = paramZskz.Zwe();
    this.ZI = this.Zc.Zz6();
  }
  
  public Zbz5(Zmwp<Zez3> paramZmwp) {
    this.Zc = paramZmwp;
    this.ZI = paramZmwp.Zz6();
  }
  
  public boolean ZW(Zez3 paramZez3, byte paramByte) {
    return Zgzm.Zc(ZN(paramZez3), paramByte);
  }
  
  public void ZP(Zez3 paramZez3, byte... paramVarArgs) {
    synchronized (this.ZI) {
      Zd(paramZez3, Zgzm.Zd(ZN(paramZez3), paramVarArgs));
    } 
  }
  
  public void Zy(Zez3 paramZez3, byte... paramVarArgs) {
    synchronized (this.ZI) {
      Zd(paramZez3, Zgzm.ZS(ZN(paramZez3), paramVarArgs));
    } 
  }
  
  public byte ZN(Zez3 paramZez3) {
    synchronized (this.ZI) {
      return (byte)(int)this.Zc.Zz(paramZez3);
    } 
  }
  
  public void Zd(Zez3 paramZez3, byte paramByte) {
    synchronized (this.ZI) {
      this.Zc.ZB(paramZez3, paramByte);
    } 
  }
  
  public void ZG(Zez3 paramZez3) {
    synchronized (this.ZI) {
      this.Zc.ZN(paramZez3);
    } 
  }
  
  public void Zn() {
    synchronized (this.ZI) {
      this.Zc.Zx0();
    } 
  }
  
  public Zbz5 Zs() {
    synchronized (this.ZI) {
      return new Zbz5(Zwo.Zy(this.Zc));
    } 
  }
  
  public boolean ZD(Zez3 paramZez3) {
    synchronized (this.ZI) {
      return this.Zc.Zk(paramZez3);
    } 
  }
  
  public void ZB(Zez3 paramZez3, byte paramByte1, byte paramByte2) {
    synchronized (this.ZI) {
      Zd(paramZez3, Zs3g.ZA(ZN(paramZez3), paramByte1, paramByte2));
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbz5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */