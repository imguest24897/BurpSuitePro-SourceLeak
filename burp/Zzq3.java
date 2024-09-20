package burp;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

class Zzq3 {
  private int ZM;
  
  private Zzq3 ZH = null;
  
  private static int ZB = 0;
  
  private final Zzq3[] Zv = new Zzq3[256];
  
  private boolean ZY = false;
  
  private Zzq3(Zzq3 paramZzq3) {
    this.ZM = ZB++;
    this.ZH = Objects.<Zzq3>requireNonNullElse(paramZzq3, this);
    Arrays.fill((Object[])Zd(), this.ZH);
  }
  
  static Zzq3 ZJ(Collection<Zzq3> paramCollection) {
    Zzq3 zzq3 = new Zzq3(null);
    paramCollection.add(zzq3);
    return zzq3;
  }
  
  static Zzq3 Zd(Collection<Zzq3> paramCollection, Zzq3 paramZzq3, boolean paramBoolean) {
    Zzq3 zzq3 = new Zzq3(paramZzq3);
    paramCollection.add(zzq3);
    zzq3.ZY = paramBoolean;
    return zzq3;
  }
  
  protected int Za(Zzq3 paramZzq3) {
    return Integer.compare(this.ZM, paramZzq3.ZM);
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject == this);
  }
  
  public int hashCode() {
    return this.ZM;
  }
  
  Zzq3 ZV(Collection<Zzq3> paramCollection, int paramInt) {
    return Zt(paramCollection, paramInt, false, null);
  }
  
  Zzq3 Zt(Collection<Zzq3> paramCollection, int paramInt, boolean paramBoolean, Zzq3 paramZzq3) {
    Zzq3 zzq3 = Zd()[paramInt];
    if (zzq3 == this.ZH) {
      if (paramZzq3 == null)
        paramZzq3 = Zd(paramCollection, this.ZH, paramBoolean); 
      Zo(paramInt, paramZzq3);
    } 
    return Zd()[paramInt];
  }
  
  void Zo(int paramInt, Zzq3 paramZzq3) {
    if (Zd()[paramInt] != paramZzq3)
      Zd()[paramInt] = paramZzq3; 
  }
  
  Zzq3 ZR(int paramInt, byte paramByte, Zk8t paramZk8t) {
    // Byte code:
    //   0: iload_2
    //   1: sipush #255
    //   4: iand
    //   5: istore #5
    //   7: invokestatic ZN : ()Ljava/lang/String;
    //   10: aload_0
    //   11: invokevirtual Zd : ()[Lburp/Zzq3;
    //   14: iload #5
    //   16: aaload
    //   17: astore #6
    //   19: astore #4
    //   21: aload #6
    //   23: aload_0
    //   24: getfield ZH : Lburp/Zzq3;
    //   27: if_acmpne -> 46
    //   30: aload_3
    //   31: invokevirtual ZJ : ()V
    //   34: aload #4
    //   36: ifnonnull -> 59
    //   39: iconst_1
    //   40: anewarray burp/Zbqc
    //   43: invokestatic Zr : ([Lburp/Zbqc;)V
    //   46: aload_0
    //   47: aload_0
    //   48: getfield ZH : Lburp/Zzq3;
    //   51: if_acmpne -> 59
    //   54: aload_3
    //   55: iload_1
    //   56: invokevirtual ZS : (I)V
    //   59: aload #6
    //   61: invokevirtual Zr : ()Z
    //   64: ifeq -> 74
    //   67: aload_3
    //   68: iload_1
    //   69: iconst_1
    //   70: iadd
    //   71: invokevirtual ZX : (I)V
    //   74: aload #6
    //   76: areturn
  }
  
  public boolean Zr() {
    return this.ZY;
  }
  
  Zzq3[] Zd() {
    return this.Zv;
  }
  
  public int Za() {
    return this.ZM;
  }
  
  Zzq3() {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzq3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */