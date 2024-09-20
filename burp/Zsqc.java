package burp;

public class Zsqc {
  private final Zmrj ZI;
  
  private final Zl42 ZT;
  
  private final Object ZJ = new Object();
  
  private final Zgrn ZG;
  
  private final Zgrn Zu;
  
  private int Zz = 0;
  
  public Zsqc(Zmrj paramZmrj, Zl42 paramZl42, Zlli<Zt10> paramZlli) {
    this.ZI = paramZmrj;
    this.ZT = paramZl42;
    this.ZG = paramZlli.ZE(Zt10.ZC, this::lambda$new$0);
    this.Zu = paramZlli.ZE(Zt10.ZY, this::lambda$new$1);
  }
  
  private void Zz() {
    synchronized (this.ZJ) {
      if (this.Zz++ == 0) {
        this.ZT.ZH();
        this.ZI.Z_();
      } 
    } 
  }
  
  private void Zy() {
    synchronized (this.ZJ) {
      if (--this.Zz == 0) {
        this.ZI.Zy();
        this.ZT.Zq();
      } 
    } 
  }
  
  public void Zg() {
    this.ZG.ZZ();
    this.Zu.ZZ();
  }
  
  private void lambda$new$1(Zxr8 paramZxr8) {
    Zy();
  }
  
  private void lambda$new$0(Zxr8 paramZxr8) {
    Zz();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsqc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */