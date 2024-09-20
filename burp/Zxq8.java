package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zxq8 extends Zxsr {
  public final Ztdo Zz;
  
  Zxq8(Zkit paramZkit, long paramLong, Ztdo paramZtdo) {
    super(paramZkit, paramLong);
    this.Zz = paramZtdo;
  }
  
  public abstract int Zit();
  
  public Short Zi(Object paramObject) {
    return ZR(paramObject);
  }
  
  Short ZR(Object paramObject) {
    Zx29<Zm0z> zx29 = ZSt();
    int i = Zs(paramObject);
    String[] arrayOfString = Zb67.Zr();
    Zm0z zm0z = Zs(zx29, i);
    if (zm0z == null)
      return null; 
    for (Zgn1 zgn1 : zm0z) {
      if (Zd(zgn1, i, paramObject))
        return Short.valueOf(ZT(zgn1)); 
      if (arrayOfString == null)
        break; 
    } 
    return null;
  }
  
  boolean Zd(Zgn1 paramZgn1, int paramInt, Object paramObject) {
    String[] arrayOfString = Zb67.Zr();
    if (ZR(paramZgn1) != paramInt)
      return false; 
    long l = Zx(paramZgn1);
    if (paramObject == null)
      return (l == 0L); 
    switch (Zz6y.ZN[this.Zz.ordinal()]) {
      case 1:
        null = ZD(ZU(l), paramObject);
        if (arrayOfString == null);
        return null;
      case 2:
        null = Zn(ZU(l), paramObject);
        if (arrayOfString == null);
        return null;
      case 3:
        null = ZD(l, paramObject);
        if (arrayOfString == null)
          break; 
        return null;
    } 
    Zuh.Zb(false, Zqf.Zr);
    return false;
  }
  
  abstract Object ZU(long paramLong);
  
  private boolean ZD(Object paramObject1, Object paramObject2) {
    return (paramObject1 instanceof Zxsr && paramObject2 instanceof Zxsr) ? ((((Zxsr)paramObject1).ZPz() == ((Zxsr)paramObject2).ZPz() && ((Zxsr)paramObject1).ZXU() == ((Zxsr)paramObject2).ZXU())) : ((paramObject1 == paramObject2));
  }
  
  private boolean Zn(Object paramObject1, Object paramObject2) {
    return paramObject1.equals(paramObject2);
  }
  
  private boolean ZD(long paramLong, Object paramObject) {
    return (paramObject instanceof Long && ((Long)paramObject).longValue() == paramLong);
  }
  
  Short ZL(Zm0z paramZm0z, int paramInt, Object paramObject, short paramShort) {
    // Byte code:
    //   0: invokestatic Zr : ()[Ljava/lang/String;
    //   3: iconst_0
    //   4: istore #6
    //   6: astore #5
    //   8: iload #6
    //   10: aload_1
    //   11: invokeinterface size : ()I
    //   16: if_icmpge -> 119
    //   19: aload_1
    //   20: iload #6
    //   22: invokeinterface Zi1 : (I)Lburp/Zgn1;
    //   27: astore #7
    //   29: aload_3
    //   30: ifnonnull -> 65
    //   33: aload_0
    //   34: aload #7
    //   36: invokevirtual ZR : (Lburp/Zgn1;)I
    //   39: ifne -> 57
    //   42: aload_0
    //   43: aload #7
    //   45: invokevirtual Zx : (Lburp/Zgn1;)J
    //   48: lconst_0
    //   49: lcmp
    //   50: ifne -> 57
    //   53: iconst_1
    //   54: goto -> 58
    //   57: iconst_0
    //   58: istore #8
    //   60: aload #5
    //   62: ifnonnull -> 75
    //   65: aload_0
    //   66: aload #7
    //   68: iload_2
    //   69: aload_3
    //   70: invokevirtual Zd : (Lburp/Zgn1;ILjava/lang/Object;)Z
    //   73: istore #8
    //   75: iload #8
    //   77: ifeq -> 111
    //   80: aload_0
    //   81: aload #7
    //   83: invokevirtual ZT : (Lburp/Zgn1;)S
    //   86: istore #9
    //   88: aload_0
    //   89: aload #7
    //   91: iload #4
    //   93: invokevirtual ZX : (Lburp/Zgn1;S)V
    //   96: aload_0
    //   97: aload_1
    //   98: iload #6
    //   100: aload #7
    //   102: invokevirtual ZE : (Lburp/Zm0z;ILburp/Zgn1;)V
    //   105: iload #9
    //   107: invokestatic valueOf : (S)Ljava/lang/Short;
    //   110: areturn
    //   111: iinc #6, 1
    //   114: aload #5
    //   116: ifnonnull -> 8
    //   119: aconst_null
    //   120: areturn
  }
  
  void ZB(Zx29<Zm0z> paramZx29) {
    if (Zit() >= ZSz()) {
      int i = paramZx29.size();
      int j = i * 2;
      int k = paramZx29.Zmr(j);
      if (k - Integer.MAX_VALUE > 0)
        return; 
      ZV(paramZx29, i, j);
      ZE(j);
    } 
  }
  
  private void ZV(Zx29<Zm0z> paramZx29, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic Zr : ()[Ljava/lang/String;
    //   3: aload_1
    //   4: iload_3
    //   5: invokevirtual Zrq : (I)V
    //   8: astore #4
    //   10: new java/util/ArrayList
    //   13: dup
    //   14: iconst_2
    //   15: invokespecial <init> : (I)V
    //   18: astore #5
    //   20: iconst_0
    //   21: istore #6
    //   23: iload #6
    //   25: iload_2
    //   26: if_icmpge -> 171
    //   29: aload_1
    //   30: iload #6
    //   32: invokevirtual ZGt : (I)Lburp/Zgpi;
    //   35: checkcast burp/Zm0z
    //   38: astore #7
    //   40: aload #7
    //   42: ifnull -> 163
    //   45: aload #7
    //   47: invokeinterface iterator : ()Ljava/util/Iterator;
    //   52: astore #8
    //   54: aload #8
    //   56: invokeinterface hasNext : ()Z
    //   61: ifeq -> 139
    //   64: aload #8
    //   66: invokeinterface next : ()Ljava/lang/Object;
    //   71: checkcast burp/Zgn1
    //   74: astore #9
    //   76: aload_0
    //   77: aload #9
    //   79: invokevirtual ZR : (Lburp/Zgn1;)I
    //   82: istore #10
    //   84: aload_0
    //   85: iload #10
    //   87: iload_3
    //   88: invokevirtual Zv : (II)I
    //   91: istore #11
    //   93: iload #11
    //   95: iload #6
    //   97: if_icmpne -> 115
    //   100: aload #5
    //   102: aload #9
    //   104: invokeinterface add : (Ljava/lang/Object;)Z
    //   109: pop
    //   110: aload #4
    //   112: ifnonnull -> 134
    //   115: aload_0
    //   116: aload_1
    //   117: iload #11
    //   119: invokevirtual ZW : (Lburp/Zx29;I)Lburp/Zm0z;
    //   122: astore #12
    //   124: aload #12
    //   126: aload #9
    //   128: invokeinterface add : (Ljava/lang/Object;)Z
    //   133: pop
    //   134: aload #4
    //   136: ifnonnull -> 54
    //   139: aload #7
    //   141: invokeinterface clear : ()V
    //   146: aload #7
    //   148: aload #5
    //   150: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   155: pop
    //   156: aload #5
    //   158: invokeinterface clear : ()V
    //   163: iinc #6, 1
    //   166: aload #4
    //   168: ifnonnull -> 23
    //   171: return
  }
  
  int Zs(Object paramObject) {
    if (paramObject == null)
      return 0; 
    int i = 0;
    i ^= paramObject.hashCode();
    i ^= i >>> 20 ^ i >>> 12;
    return i ^ i >>> 7 ^ i >>> 4;
  }
  
  Zm0z Zy(Zx29<Zm0z> paramZx29, int paramInt) {
    return ZW(paramZx29, Zv(paramInt, paramZx29.size()));
  }
  
  Zm0z ZW(Zx29<Zm0z> paramZx29, int paramInt) {
    Zm0z zm0z = paramZx29.ZGt(paramInt);
    if (zm0z == null) {
      zm0z = this.Za.<Zm0z>ZH(new Zgbz(2));
      paramZx29.Zo(paramInt, zm0z);
    } 
    return zm0z;
  }
  
  private Zm0z Zs(Zx29<Zm0z> paramZx29, int paramInt) {
    int i = Zv(paramInt, paramZx29.size());
    return paramZx29.ZGt(i);
  }
  
  int Zv(int paramInt1, int paramInt2) {
    return paramInt1 & paramInt2 - 1;
  }
  
  void Zy(Zm0z paramZm0z, int paramInt, long paramLong, short paramShort) {
    paramZm0z.add(new Zgn1(paramInt, paramLong, paramShort));
    ZI(Zit() + 1);
  }
  
  abstract Zx29<Zm0z> ZSt();
  
  abstract int ZSz();
  
  abstract void ZE(int paramInt);
  
  abstract void ZI(int paramInt);
  
  int ZR(Zgn1 paramZgn1) {
    return paramZgn1.Zn();
  }
  
  long Zx(Zgn1 paramZgn1) {
    return paramZgn1.ZC();
  }
  
  short ZT(Zgn1 paramZgn1) {
    return paramZgn1.ZK();
  }
  
  private void ZX(Zgn1 paramZgn1, short paramShort) {
    paramZgn1.Zt(paramShort);
  }
  
  private void ZE(Zm0z paramZm0z, int paramInt, Zgn1 paramZgn1) {
    paramZm0z.ZK(paramInt, paramZgn1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxq8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */