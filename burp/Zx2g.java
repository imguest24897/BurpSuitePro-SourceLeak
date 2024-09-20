package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zx2g extends Zxsr {
  public final Ztdo ZP;
  
  Zx2g(Zkit paramZkit, long paramLong, Ztdo paramZtdo) {
    super(paramZkit, paramLong);
    this.ZP = paramZtdo;
  }
  
  public abstract int ZfE();
  
  public Integer ZX(Object paramObject) {
    return ZC(paramObject);
  }
  
  Integer ZC(Object paramObject) {
    Zx29<Zl5f> zx29 = ZJF();
    boolean bool = Zb1m.Zp();
    int i = Zt(paramObject);
    Zl5f zl5f = ZH(zx29, i);
    if (zl5f == null)
      return null; 
    for (Zs3e zs3e : zl5f) {
      if (Zr(zs3e, i, paramObject))
        return Integer.valueOf(Zk(zs3e)); 
      if (!bool)
        break; 
    } 
    return null;
  }
  
  boolean Zr(Zs3e paramZs3e, int paramInt, Object paramObject) {
    boolean bool = Zb1m.Zh();
    if (ZG(paramZs3e) != paramInt)
      return false; 
    long l = ZK(paramZs3e);
    if (paramObject == null)
      return (l == 0L); 
    switch (Zm_a.Zg[this.ZP.ordinal()]) {
      case 1:
        null = Ze(Zh(l), paramObject);
        if (bool);
        return null;
      case 2:
        null = ZH(Zh(l), paramObject);
        if (bool);
        return null;
      case 3:
        null = Ze(l, paramObject);
        if (bool)
          break; 
        return null;
    } 
    Zuh.Zb(false, Zqf.Zr);
    return false;
  }
  
  abstract Object Zh(long paramLong);
  
  private boolean Ze(Object paramObject1, Object paramObject2) {
    return (paramObject1 instanceof Zxsr && paramObject2 instanceof Zxsr) ? ((((Zxsr)paramObject1).ZPz() == ((Zxsr)paramObject2).ZPz() && ((Zxsr)paramObject1).ZXU() == ((Zxsr)paramObject2).ZXU())) : ((paramObject1 == paramObject2));
  }
  
  private boolean ZH(Object paramObject1, Object paramObject2) {
    return paramObject1.equals(paramObject2);
  }
  
  private boolean Ze(long paramLong, Object paramObject) {
    return (paramObject instanceof Long && ((Long)paramObject).longValue() == paramLong);
  }
  
  Integer ZL(Zl5f paramZl5f, int paramInt1, Object paramObject, int paramInt2) {
    // Byte code:
    //   0: invokestatic Zh : ()Z
    //   3: iconst_0
    //   4: istore #6
    //   6: istore #5
    //   8: iload #6
    //   10: aload_1
    //   11: invokeinterface size : ()I
    //   16: if_icmpge -> 119
    //   19: aload_1
    //   20: iload #6
    //   22: invokeinterface ZPI : (I)Lburp/Zs3e;
    //   27: astore #7
    //   29: aload_3
    //   30: ifnonnull -> 65
    //   33: aload_0
    //   34: aload #7
    //   36: invokevirtual ZG : (Lburp/Zs3e;)I
    //   39: ifne -> 57
    //   42: aload_0
    //   43: aload #7
    //   45: invokevirtual ZK : (Lburp/Zs3e;)J
    //   48: lconst_0
    //   49: lcmp
    //   50: ifne -> 57
    //   53: iconst_1
    //   54: goto -> 58
    //   57: iconst_0
    //   58: istore #8
    //   60: iload #5
    //   62: ifeq -> 75
    //   65: aload_0
    //   66: aload #7
    //   68: iload_2
    //   69: aload_3
    //   70: invokevirtual Zr : (Lburp/Zs3e;ILjava/lang/Object;)Z
    //   73: istore #8
    //   75: iload #8
    //   77: ifeq -> 111
    //   80: aload_0
    //   81: aload #7
    //   83: invokevirtual Zk : (Lburp/Zs3e;)I
    //   86: istore #9
    //   88: aload_0
    //   89: aload #7
    //   91: iload #4
    //   93: invokevirtual Zy : (Lburp/Zs3e;I)V
    //   96: aload_0
    //   97: aload_1
    //   98: iload #6
    //   100: aload #7
    //   102: invokevirtual ZS : (Lburp/Zl5f;ILburp/Zs3e;)V
    //   105: iload #9
    //   107: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   110: areturn
    //   111: iinc #6, 1
    //   114: iload #5
    //   116: ifeq -> 8
    //   119: aconst_null
    //   120: areturn
  }
  
  void Zo(Zx29<Zl5f> paramZx29) {
    if (ZfE() >= ZJ4()) {
      int i = paramZx29.size();
      int j = i * 2;
      int k = paramZx29.Zmr(j);
      if (k - Integer.MAX_VALUE > 0)
        return; 
      ZF(paramZx29, i, j);
      ZV(j);
    } 
  }
  
  private void ZF(Zx29<Zl5f> paramZx29, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_1
    //   1: iload_3
    //   2: invokevirtual Zrq : (I)V
    //   5: new java/util/ArrayList
    //   8: dup
    //   9: iconst_2
    //   10: invokespecial <init> : (I)V
    //   13: astore #5
    //   15: invokestatic Zh : ()Z
    //   18: iconst_0
    //   19: istore #6
    //   21: istore #4
    //   23: iload #6
    //   25: iload_2
    //   26: if_icmpge -> 171
    //   29: aload_1
    //   30: iload #6
    //   32: invokevirtual ZGt : (I)Lburp/Zgpi;
    //   35: checkcast burp/Zl5f
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
    //   71: checkcast burp/Zs3e
    //   74: astore #9
    //   76: aload_0
    //   77: aload #9
    //   79: invokevirtual ZG : (Lburp/Zs3e;)I
    //   82: istore #10
    //   84: aload_0
    //   85: iload #10
    //   87: iload_3
    //   88: invokevirtual Zu : (II)I
    //   91: istore #11
    //   93: iload #11
    //   95: iload #6
    //   97: if_icmpne -> 115
    //   100: aload #5
    //   102: aload #9
    //   104: invokeinterface add : (Ljava/lang/Object;)Z
    //   109: pop
    //   110: iload #4
    //   112: ifeq -> 134
    //   115: aload_0
    //   116: aload_1
    //   117: iload #11
    //   119: invokevirtual Zj : (Lburp/Zx29;I)Lburp/Zl5f;
    //   122: astore #12
    //   124: aload #12
    //   126: aload #9
    //   128: invokeinterface add : (Ljava/lang/Object;)Z
    //   133: pop
    //   134: iload #4
    //   136: ifeq -> 54
    //   139: aload #7
    //   141: invokeinterface clear : ()V
    //   146: aload #7
    //   148: aload #5
    //   150: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   155: pop
    //   156: aload #5
    //   158: invokeinterface clear : ()V
    //   163: iinc #6, 1
    //   166: iload #4
    //   168: ifeq -> 23
    //   171: return
  }
  
  int Zt(Object paramObject) {
    if (paramObject == null)
      return 0; 
    int i = 0;
    i ^= paramObject.hashCode();
    i ^= i >>> 20 ^ i >>> 12;
    return i ^ i >>> 7 ^ i >>> 4;
  }
  
  Zl5f Zd(Zx29<Zl5f> paramZx29, int paramInt) {
    return Zj(paramZx29, Zu(paramInt, paramZx29.size()));
  }
  
  Zl5f Zj(Zx29<Zl5f> paramZx29, int paramInt) {
    Zl5f zl5f = paramZx29.ZGt(paramInt);
    if (zl5f == null) {
      zl5f = this.Za.<Zl5f>ZH(new Zt0y(2));
      paramZx29.Zo(paramInt, zl5f);
    } 
    return zl5f;
  }
  
  private Zl5f ZH(Zx29<Zl5f> paramZx29, int paramInt) {
    int i = Zu(paramInt, paramZx29.size());
    return paramZx29.ZGt(i);
  }
  
  int Zu(int paramInt1, int paramInt2) {
    return paramInt1 & paramInt2 - 1;
  }
  
  void ZR(Zl5f paramZl5f, int paramInt1, long paramLong, int paramInt2) {
    paramZl5f.add(new Zs3e(paramInt1, paramLong, paramInt2));
    Zo(ZfE() + 1);
  }
  
  abstract Zx29<Zl5f> ZJF();
  
  abstract int ZJ4();
  
  abstract void ZV(int paramInt);
  
  abstract void Zo(int paramInt);
  
  int ZG(Zs3e paramZs3e) {
    return paramZs3e.ZK();
  }
  
  long ZK(Zs3e paramZs3e) {
    return paramZs3e.ZD();
  }
  
  int Zk(Zs3e paramZs3e) {
    return paramZs3e.ZO();
  }
  
  private void Zy(Zs3e paramZs3e, int paramInt) {
    paramZs3e.Zy(paramInt);
  }
  
  private void ZS(Zl5f paramZl5f, int paramInt, Zs3e paramZs3e) {
    paramZl5f.ZX(paramInt, paramZs3e);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx2g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */