package burp;

import java.util.concurrent.atomic.AtomicReference;

public class Zwc extends Zni implements Zmz1 {
  private final AtomicReference<Zsh8> Z_;
  
  private final AtomicReference<Zkgn> ZR;
  
  private final AtomicReference<Ze5c> ZZ;
  
  private final AtomicReference<Zxxx> Zt;
  
  public Zwc(Zsh8 paramZsh8, Zkgn paramZkgn, Ze5c paramZe5c, Zxxx paramZxxx) {
    this.Zt = new AtomicReference<>(paramZxxx);
    this.Z_ = new AtomicReference<>(paramZsh8);
    Zbqc[] arrayOfZbqc = Zxqk.ZN3();
    this.ZR = new AtomicReference<>(paramZkgn);
    this.ZZ = new AtomicReference<>(paramZe5c);
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  @Zzvo(1)
  public Zsh8 ZeY() {
    return this.Z_.get();
  }
  
  @Zzvo(2)
  public Zkgn ZeF() {
    return this.ZR.get();
  }
  
  @Zzvo(3)
  public Ze5c Zeg() {
    return this.ZZ.get();
  }
  
  @Zzvo(4)
  public Zxxx Zek() {
    return this.Zt.get();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zwc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */