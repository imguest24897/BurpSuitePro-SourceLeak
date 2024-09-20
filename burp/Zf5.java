package burp;

import java.util.Collections;
import java.util.List;

public class Zf5 extends Zni implements Ztic {
  @Zzvo(1)
  private int Zd;
  
  @Zzvo(2)
  private boolean Z_;
  
  @Zzvo(3)
  private String ZB;
  
  @Zzvo(4)
  private boolean Zp;
  
  @Zzvo(5)
  private int Zu;
  
  @Zzvo(6)
  private boolean ZX;
  
  @Zzvo(7)
  private int Za;
  
  @Zzvo(8)
  private boolean ZE;
  
  @Zzvo(9)
  private boolean Zj;
  
  @Zzvo(10)
  private int Zl;
  
  @Zzvo(11)
  private int ZH;
  
  @Zzvo(12)
  private boolean ZL;
  
  @Zzvo(13)
  private boolean ZT;
  
  @Zzvo(14)
  private boolean ZA;
  
  @Zzvo(15)
  private boolean ZC;
  
  @Zzvo(16)
  private Zmg ZK;
  
  Zf5(boolean paramBoolean) {
    this.Z_ = paramBoolean;
  }
  
  public int ZrT() {
    return this.Zd;
  }
  
  public void Zd(int paramInt) {
    this.Zd = paramInt;
  }
  
  public boolean Zrb() {
    return this.Z_;
  }
  
  public void Zrz() {
    this.Z_ = false;
  }
  
  public String ZrL() {
    return this.ZB;
  }
  
  public void Zr(String paramString) {
    this.ZB = paramString;
  }
  
  public boolean ZrF() {
    return this.Zp;
  }
  
  public void ZE(boolean paramBoolean) {
    this.Zp = paramBoolean;
  }
  
  public int ZrV() {
    return this.Zu;
  }
  
  public void Zn(int paramInt) {
    this.Zu = paramInt;
  }
  
  public boolean Zrt() {
    return this.ZX;
  }
  
  public void ZQ(boolean paramBoolean) {
    this.ZX = paramBoolean;
  }
  
  public int ZrW() {
    return this.Za;
  }
  
  public void Z_(int paramInt) {
    this.Za = paramInt;
  }
  
  public boolean ZrR() {
    return this.ZE;
  }
  
  public void ZY(boolean paramBoolean) {
    this.ZE = paramBoolean;
  }
  
  public boolean ZrI() {
    return this.Zj;
  }
  
  public void ZX(boolean paramBoolean) {
    this.Zj = paramBoolean;
  }
  
  public int Zrx() {
    return this.Zl;
  }
  
  public void Zl(int paramInt) {
    this.Zl = paramInt;
  }
  
  public int Zrn() {
    return this.ZH;
  }
  
  public void Zf(int paramInt) {
    this.ZH = paramInt;
  }
  
  public boolean Zra() {
    return this.ZL;
  }
  
  public void Zh(boolean paramBoolean) {
    this.ZL = paramBoolean;
  }
  
  public boolean ZrD() {
    return this.ZT;
  }
  
  public void ZZ(boolean paramBoolean) {
    this.ZT = paramBoolean;
  }
  
  public boolean Zr5() {
    return this.ZA;
  }
  
  public void Zl(boolean paramBoolean) {
    this.ZA = paramBoolean;
  }
  
  public boolean Zr3() {
    return this.ZC;
  }
  
  public void Zu(boolean paramBoolean) {
    this.ZC = paramBoolean;
  }
  
  public List<Integer> Zrj() {
    return (this.ZK == null) ? Collections.<Integer>emptyList() : this.ZK;
  }
  
  public void Zd(List<Integer> paramList) {
    Zbqc[] arrayOfZbqc = Zx81.ZO();
    if (Zepo.ZE(paramList)) {
      this.ZK = new Zy2(paramList.size());
      this.ZK.addAll(paramList);
      if (arrayOfZbqc != null) {
        this.ZK = null;
        return;
      } 
      return;
    } 
    this.ZK = null;
  }
  
  public Zeu4<? extends Ztic> ZF() {
    return Zc;
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof Ztic && Ztic.Zr(this, (Ztic)paramObject));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zf5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */