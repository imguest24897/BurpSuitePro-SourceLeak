package burp;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class Zsob implements Iterable<Zggb> {
  private final List<Boolean> Zl;
  
  private final Zefg<Zlx1> Ze;
  
  private static int Zp;
  
  public Zsob(Zefg<Zlx1> paramZefg) {
    this.Zl = ZC(paramZefg);
    this.Ze = paramZefg;
  }
  
  private List<Boolean> ZC(Zefg<Zlx1> paramZefg) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic ZI : ()I
    //   11: aconst_null
    //   12: astore #4
    //   14: aload_1
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore #5
    //   22: istore_2
    //   23: aload #5
    //   25: invokeinterface hasNext : ()Z
    //   30: ifeq -> 133
    //   33: aload #5
    //   35: invokeinterface next : ()Ljava/lang/Object;
    //   40: checkcast burp/Zlx1
    //   43: astore #6
    //   45: aload #6
    //   47: invokeinterface ZGr : ()Lburp/Zzb7;
    //   52: astore #7
    //   54: aload #7
    //   56: ifnull -> 98
    //   59: aload #7
    //   61: aload #4
    //   63: invokeinterface ZF : (Ljava/lang/Object;)Z
    //   68: ifne -> 98
    //   71: aload_3
    //   72: iconst_1
    //   73: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   76: invokeinterface add : (Ljava/lang/Object;)Z
    //   81: pop
    //   82: aload #7
    //   84: astore #4
    //   86: aload #4
    //   88: iconst_0
    //   89: invokeinterface ZY0 : (I)V
    //   94: iload_2
    //   95: ifeq -> 106
    //   98: aload #7
    //   100: ifnonnull -> 106
    //   103: aconst_null
    //   104: astore #4
    //   106: aload_3
    //   107: iconst_0
    //   108: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   111: invokeinterface add : (Ljava/lang/Object;)Z
    //   116: pop
    //   117: aload #4
    //   119: ifnull -> 129
    //   122: aload #4
    //   124: invokeinterface ZyB : ()V
    //   129: iload_2
    //   130: ifeq -> 23
    //   133: aload_3
    //   134: areturn
  }
  
  public Zggb ZE(int paramInt) {
    return Zf(paramInt);
  }
  
  public void ZQ() {
    this.Zl.add(Boolean.valueOf(false));
  }
  
  public int Zv(int paramInt) {
    int i = ZR(paramInt);
    this.Zl.add(paramInt, Boolean.valueOf(false));
    return i;
  }
  
  public int Zt(int paramInt) {
    int i = Zh(paramInt);
    this.Zl.add(paramInt, Boolean.valueOf(true));
    return i;
  }
  
  public void ZY(int paramInt) {
    this.Zl.remove(paramInt);
  }
  
  public int ZV(int paramInt1, int paramInt2) {
    boolean bool = ((Boolean)this.Zl.remove(paramInt1)).booleanValue();
    this.Zl.add(paramInt2, Boolean.valueOf(bool));
    return Zf(paramInt2).Zc();
  }
  
  private Zggb Zf(int paramInt) {
    boolean bool = ((Boolean)this.Zl.get(paramInt)).booleanValue();
    byte b1 = 0;
    int i = Zl();
    byte b2 = 0;
    while (b2 < paramInt) {
      if (((Boolean)this.Zl.get(b2)).booleanValue() == bool)
        b1++; 
      b2++;
      if (i == 0)
        break; 
    } 
    return new Zggb(bool, b1);
  }
  
  private int ZR(int paramInt) {
    Objects.requireNonNull(this.Zl);
    return (int)IntStream.range(0, paramInt).mapToObj(this.Zl::get).filter(Zsob::lambda$countRequesters$0).count();
  }
  
  private int Zh(int paramInt) {
    Objects.requireNonNull(this.Zl);
    return (int)IntStream.range(0, paramInt).mapToObj(this.Zl::get).filter(Zsob::lambda$countGroups$1).count();
  }
  
  public int Zh() {
    return this.Zl.size();
  }
  
  public void Zb() {
    this.Zl.clear();
  }
  
  public Iterator<Zggb> iterator() {
    return new Zrks(this);
  }
  
  public int ZC(Zzyu paramZzyu) {
    int j = this.Ze.indexOf(paramZzyu.Zv());
    byte b1 = 0;
    byte b2 = 0;
    int i = Zl();
    while (b2 < this.Zl.size()) {
      if (!((Boolean)this.Zl.get(b2)).booleanValue() && b1++ == j)
        return b2; 
      b2++;
      if (i == 0)
        break; 
    } 
    return -1;
  }
  
  private static boolean lambda$countGroups$1(Boolean paramBoolean) {
    return paramBoolean.booleanValue();
  }
  
  private static boolean lambda$countRequesters$0(Boolean paramBoolean) {
    return !paramBoolean.booleanValue();
  }
  
  public static void Zx(int paramInt) {
    Zp = paramInt;
  }
  
  public static int ZI() {
    return Zp;
  }
  
  public static int Zl() {
    int i = ZI();
    return (i == 0) ? 39 : 0;
  }
  
  static {
    if (ZI() != 0)
      Zx(76); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsob.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */