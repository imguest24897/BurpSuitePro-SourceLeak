package burp;

import java.util.Optional;

class Zzcw implements Zxa2 {
  private Zm47 ZR;
  
  final Zezo Zz;
  
  private Zzcw(Zezo paramZezo) {}
  
  public Zm6s<? extends Zm75> Z_() {
    if (this.Zz.Zn() || this.Zz.Zg())
      return Zm6s.ZG(); 
    if (this.Zz.Zy.ZH())
      return Zm6s.ZQ(this::lambda$nextPhase$0); 
    if (!this.Zz.Zy.ZW())
      return Zm6s.ZQ(this::lambda$nextPhase$1); 
    if (this.ZR == null || this.ZR.ZP())
      return Zm6s.ZQ(this::lambda$nextPhase$2); 
    Zm6s<? extends Zm75> zm6s = this.ZR.Z_();
    return !zm6s.ZJ() ? zm6s : Zm6s.ZQ(this::lambda$nextPhase$2);
  }
  
  private void Zk() {
    Zbqc[] arrayOfZbqc = Zt1g.ZY();
    Optional<Zm47> optional = this.Zz.ZT();
    if (optional.isPresent()) {
      this.ZR = optional.get();
      if (arrayOfZbqc != null) {
        this.Zz.Zy.ZS();
        return;
      } 
      return;
    } 
    this.Zz.Zy.ZS();
  }
  
  private void lambda$nextPhase$2(Zrj paramZrj, Zlsy paramZlsy) {
    Zk();
  }
  
  private void lambda$nextPhase$1(Zrj paramZrj, Zlsy paramZlsy) {
    this.Zz.Zf();
  }
  
  private void lambda$nextPhase$0(Zrj paramZrj, Zlsy paramZlsy) {
    this.Zz.Zz();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzcw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */