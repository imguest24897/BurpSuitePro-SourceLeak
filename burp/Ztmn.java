package burp;

public class Ztmn implements Zta_ {
  private Zsvc ZX;
  
  private boolean ZF;
  
  private boolean Zi;
  
  public void ZQ(Zxr9 paramZxr9, Zkr1 paramZkr1, Ztm5 paramZtm5, Zsvc paramZsvc) {
    if (ZL(paramZsvc, paramZtm5)) {
      if (ZB(paramZsvc))
        return; 
      Zo(paramZtm5);
      this.Zi = true;
      this.ZX = paramZsvc;
      this.ZF = true;
    } 
  }
  
  public Zsvc Zd(Zxr9 paramZxr9, Zkr1 paramZkr1, Ztm5 paramZtm5, Zsvc paramZsvc) {
    if (this.Zi) {
      paramZtm5.Zq();
      paramZsvc = this.ZX;
      this.ZF = false;
      this.Zi = false;
    } 
    return paramZsvc;
  }
  
  public void Zz(Ztm5 paramZtm5) {
    this.Zi = false;
  }
  
  private boolean ZL(Zsvc paramZsvc, Ztm5 paramZtm5) {
    return (paramZsvc == null || paramZsvc.ZE == Zgho.CLOSING_BRACE || ZU(paramZtm5));
  }
  
  private boolean ZB(Zsvc paramZsvc) {
    return (this.ZF && this.ZX == paramZsvc);
  }
  
  private boolean ZU(Ztm5 paramZtm5) {
    byte b = 1;
    while (true) {
      Zsvc zsvc = paramZtm5.Zv(b++);
      if (zsvc != null) {
        if (zsvc.ZE == Zgho.LINE_TERMINATOR)
          return true; 
        if (zsvc.ZE != Zgho.COMMENT)
          return false; 
      } 
      if (zsvc == null)
        return false; 
    } 
  }
  
  private void Zo(Ztm5 paramZtm5) {
    int i = 0;
    Zsvc zsvc1 = paramZtm5.Zk();
    if (zsvc1 == null)
      zsvc1 = paramZtm5.Zv(1); 
    Zgfi zgfi = zsvc1.ZY;
    Zsvc zsvc2 = paramZtm5.ZK();
    if (zsvc2 != null) {
      zgfi = zsvc2.ZY;
      i = zsvc2.ZJ;
    } 
    paramZtm5.ZJ(new Zsvc(Zgho.SEMICOLON, null, zgfi, i, i));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztmn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */