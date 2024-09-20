package burp;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Zgyq {
  private final Zzxp Zv;
  
  private final Zet2 Zz;
  
  private final int ZB;
  
  private int ZQ;
  
  private Zsmh ZG;
  
  public Zgyq(Zsmh paramZsmh, Zzxp paramZzxp, Zs68 paramZs68) {
    this.ZG = paramZsmh;
    int[] arrayOfInt = Zb6u.ZI();
    this.Zv = paramZzxp;
    if (paramZs68 != null) {
      this.ZQ = paramZs68.Zk;
      this.ZB = paramZs68.ZH.ZJ;
      this.Zz = new Zet2(paramZs68.ZP, paramZs68.ZR, paramZs68.Zh());
      if (arrayOfInt != null) {
        this.ZQ = -1;
        this.ZB = -1;
        this.Zz = null;
        return;
      } 
      return;
    } 
    this.ZQ = -1;
    this.ZB = -1;
    this.Zz = null;
  }
  
  Zsmh Zp() {
    return this.ZG;
  }
  
  List<Ztnj> ZV() {
    return this.Zz.ZK();
  }
  
  void ZD(String paramString1, String paramString2) {
    Zga7 zga7 = this.Zz.ZW(paramString1, paramString2);
    zga7.Zu(this.Zv);
    this.ZG = this.Zv.Za();
    this.ZQ += zga7.Zy();
  }
  
  void ZS(int paramInt, String paramString1, String paramString2) {
    Zrif zrif = this.Zz.Za(paramInt, paramString1, paramString2);
    zrif.Zu(this.Zv);
    this.ZG = this.Zv.Za();
    this.ZQ += zrif.Zy();
  }
  
  void ZP(List<Integer> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zz : Lburp/Zet2;
    //   4: aload_1
    //   5: invokevirtual ZJ : (Ljava/util/List;)Ljava/util/List;
    //   8: astore_2
    //   9: new java/util/concurrent/atomic/AtomicInteger
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: astore_3
    //   17: aload_2
    //   18: aload_0
    //   19: aload_3
    //   20: <illegal opcode> accept : (Lburp/Zgyq;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/function/Consumer;
    //   25: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   30: aload_0
    //   31: aload_0
    //   32: getfield Zv : Lburp/Zzxp;
    //   35: invokeinterface Za : ()Lburp/Zsmh;
    //   40: putfield ZG : Lburp/Zsmh;
    //   43: aload_0
    //   44: dup
    //   45: getfield ZQ : I
    //   48: aload_3
    //   49: invokevirtual get : ()I
    //   52: iadd
    //   53: putfield ZQ : I
    //   56: return
  }
  
  void ZS(int paramInt1, int paramInt2) {
    int i = Math.min(paramInt1, paramInt2);
    int j = Math.max(paramInt1, paramInt2);
    Ztnj ztnj1 = this.Zz.Zo(i);
    Ztnj ztnj2 = this.Zz.Zo(j);
    byte[] arrayOfByte = new byte[ztnj1.Zb() + ztnj2.Zb()];
    System.arraycopy(ztnj2.ZU(), 0, arrayOfByte, 0, ztnj2.Zb());
    System.arraycopy(ztnj1.ZU(), 0, arrayOfByte, ztnj2.Zb(), ztnj1.Zb());
    this.Zv.ZY(ztnj1.Zn, ztnj2.ZB, arrayOfByte);
    this.ZG = this.Zv.Za();
    this.Zz.Za(i, j);
  }
  
  public boolean Zx(int paramInt) {
    return (paramInt >= this.ZQ && (this.ZB == 256 || this.ZB == 262));
  }
  
  private void lambda$removeHeaders$0(AtomicInteger paramAtomicInteger, Zmg4 paramZmg4) {
    paramZmg4.Zu(this.Zv);
    paramAtomicInteger.addAndGet(paramZmg4.Zy());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgyq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */