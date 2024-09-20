package burp;

import java.awt.EventQueue;

class Zsbu implements Zt7b {
  private final Zbdf Z_;
  
  private final Zgu3 Zk;
  
  private boolean Zb;
  
  final Zb5n Zi;
  
  Zsbu(Zb5n paramZb5n, Zbdf paramZbdf, Zgu3 paramZgu3) {
    this.Z_ = paramZbdf;
    this.Zk = paramZgu3;
  }
  
  public void Zj(Zgu3 paramZgu3) {
    if (!this.Zb) {
      Zk();
      Zz();
    } 
  }
  
  public void ZU() {
    if (!this.Zb)
      Zk(); 
  }
  
  public void Zn() {
    if (!this.Zb)
      Zz(); 
  }
  
  public boolean Zy() {
    return false;
  }
  
  private void Zk() {
    if (this.Z_ != null && this.Zk == Zgu3.HTTP_REQUEST)
      this.Zi.Zk.Zl(this.Z_.Zs()); 
  }
  
  private void Zz() {
    EventQueue.invokeLater(this::lambda$updateMessage$0);
  }
  
  private void lambda$updateMessage$0() {
    Ze7a ze7a = new Ze7a();
    this.Zb = true;
    this.Z_.Zi().Zh(ze7a);
    this.Zb = false;
    this.Zi.Zk.ZQ(ze7a.ZF());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsbu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */