package burp;

import java.util.Collections;
import java.util.List;

public class Zx9k extends Zxsr implements Ztic {
  Zx9k(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public int ZrT() {
    return this.Za.Zx(this, Zknp.Zf);
  }
  
  public void Zd(int paramInt) {
    this.Za.ZM(this, Zknp.Zf, paramInt);
  }
  
  public boolean Zrb() {
    return this.Za.Zi(this, Zknp.ZY);
  }
  
  public void Zrz() {
    this.Za.ZH(this, Zknp.ZY, false);
  }
  
  public String ZrL() {
    return this.Za.Zf(this, Zknp.Zw);
  }
  
  public void Zr(String paramString) {
    this.Za.Zi(this, Zknp.Zw, paramString);
  }
  
  public boolean ZrF() {
    return this.Za.Zi(this, Zknp.Zz);
  }
  
  public void ZE(boolean paramBoolean) {
    this.Za.ZH(this, Zknp.Zz, paramBoolean);
  }
  
  public int ZrV() {
    return this.Za.Zx(this, Zknp.Zb);
  }
  
  public void Zn(int paramInt) {
    this.Za.ZM(this, Zknp.Zb, paramInt);
  }
  
  public boolean Zrt() {
    return this.Za.Zi(this, Zknp.Zy);
  }
  
  public void ZQ(boolean paramBoolean) {
    this.Za.ZH(this, Zknp.Zy, paramBoolean);
  }
  
  public int ZrW() {
    return this.Za.Zx(this, Zknp.Zv);
  }
  
  public void Z_(int paramInt) {
    this.Za.ZM(this, Zknp.Zv, paramInt);
  }
  
  public boolean ZrR() {
    return this.Za.Zi(this, Zknp.ZU);
  }
  
  public void ZY(boolean paramBoolean) {
    this.Za.ZH(this, Zknp.ZU, paramBoolean);
  }
  
  public boolean ZrI() {
    return this.Za.Zi(this, Zknp.ZL);
  }
  
  public void ZX(boolean paramBoolean) {
    this.Za.ZH(this, Zknp.ZL, paramBoolean);
  }
  
  public int Zrx() {
    return this.Za.Zx(this, Zknp.Zo);
  }
  
  public void Zl(int paramInt) {
    this.Za.ZM(this, Zknp.Zo, paramInt);
  }
  
  public int Zrn() {
    return this.Za.Zx(this, Zknp.ZC);
  }
  
  public void Zf(int paramInt) {
    this.Za.ZM(this, Zknp.ZC, paramInt);
  }
  
  public boolean Zra() {
    return this.Za.Zi(this, Zknp.Zn);
  }
  
  public void Zh(boolean paramBoolean) {
    this.Za.ZH(this, Zknp.Zn, paramBoolean);
  }
  
  public boolean ZrD() {
    return this.Za.Zi(this, Zknp.Zl);
  }
  
  public void ZZ(boolean paramBoolean) {
    this.Za.ZH(this, Zknp.Zl, paramBoolean);
  }
  
  public boolean Zr5() {
    return this.Za.Zi(this, Zknp.Zx);
  }
  
  public void Zl(boolean paramBoolean) {
    this.Za.ZH(this, Zknp.Zx, paramBoolean);
  }
  
  public List<Integer> Zrj() {
    Zmg zmg = this.Za.<Zmg>ZJ(this, Zknp.ZO);
    return (zmg != null) ? Collections.<Integer>unmodifiableList(zmg) : Collections.<Integer>emptyList();
  }
  
  public void Zd(List<Integer> paramList) {
    // Byte code:
    //   0: invokestatic ZO : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Za : Lburp/Zkit;
    //   8: aload_0
    //   9: getstatic burp/Zknp.ZO : Lburp/Zekb;
    //   12: invokevirtual ZJ : (Lburp/Zgpi;Lburp/Zekb;)Lburp/Zgpi;
    //   15: checkcast burp/Zmg
    //   18: astore_3
    //   19: aload_1
    //   20: invokestatic ZE : (Ljava/util/Collection;)Z
    //   23: ifeq -> 88
    //   26: aload_3
    //   27: ifnonnull -> 70
    //   30: aload_0
    //   31: getfield Za : Lburp/Zkit;
    //   34: new burp/Zkbp
    //   37: dup
    //   38: aload_1
    //   39: invokeinterface size : ()I
    //   44: invokespecial <init> : (I)V
    //   47: invokevirtual ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   50: checkcast burp/Zmg
    //   53: astore_3
    //   54: aload_0
    //   55: getfield Za : Lburp/Zkit;
    //   58: aload_0
    //   59: getstatic burp/Zknp.ZO : Lburp/Zekb;
    //   62: aload_3
    //   63: invokevirtual Zq : (Lburp/Zgpi;Lburp/Zekb;Lburp/Zgpi;)V
    //   66: aload_2
    //   67: ifnull -> 76
    //   70: aload_3
    //   71: invokeinterface clear : ()V
    //   76: aload_3
    //   77: aload_1
    //   78: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   83: pop
    //   84: aload_2
    //   85: ifnull -> 98
    //   88: aload_3
    //   89: ifnull -> 98
    //   92: aload_3
    //   93: invokeinterface clear : ()V
    //   98: invokestatic Zwu : ()[Lburp/Zbqc;
    //   101: ifnonnull -> 111
    //   104: iconst_2
    //   105: anewarray burp/Zbqc
    //   108: invokestatic ZS : ([Lburp/Zbqc;)V
    //   111: return
  }
  
  public boolean Zr3() {
    return this.Za.Zi(this, Zknp.Z_);
  }
  
  public void Zu(boolean paramBoolean) {
    this.Za.ZH(this, Zknp.Z_, paramBoolean);
  }
  
  public Zeu4<? extends Ztic> ZF() {
    return Zc;
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof Ztic && Ztic.Zr(this, (Ztic)paramObject));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx9k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */