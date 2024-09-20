package burp;

import java.util.Iterator;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zx2t extends Zxsr {
  public final Ztdo ZS;
  
  Zx2t(Zkit paramZkit, long paramLong, Ztdo paramZtdo) {
    super(paramZkit, paramLong);
    this.ZS = paramZtdo;
  }
  
  public abstract int Zqw();
  
  public boolean Zq1() {
    return (Zqw() == 0);
  }
  
  public boolean Ze(Object paramObject) {
    return (ZY(paramObject) != null);
  }
  
  public Long ZI(Object paramObject) {
    return ZY(paramObject);
  }
  
  public Long Zu(Object paramObject) {
    return ZG(paramObject);
  }
  
  public void Zqq() {
    Iterator<Zif> iterator = ZRj().iterator();
    int[] arrayOfInt = Zl4d.Zl();
    while (iterator.hasNext()) {
      Zif zif = iterator.next();
      if (zif != null)
        zif.clear(); 
      if (arrayOfInt != null)
        break; 
    } 
    ZF(0);
  }
  
  Long ZY(Object paramObject) {
    Zx29<Zif> zx29 = ZRj();
    int i = ZT(paramObject);
    int[] arrayOfInt = Zl4d.Zl();
    Zif zif = Zb(zx29, i);
    if (zif == null)
      return null; 
    for (Zgl_ zgl_ : zif) {
      if (ZF(zgl_, i, paramObject))
        return Long.valueOf(Zp(zgl_)); 
      if (arrayOfInt != null)
        break; 
    } 
    return null;
  }
  
  boolean ZF(Zgl_ paramZgl_, int paramInt, Object paramObject) {
    int[] arrayOfInt = Zl4d.Zl();
    if (ZG(paramZgl_) != paramInt)
      return false; 
    long l = Za(paramZgl_);
    if (paramObject == null)
      return (l == 0L); 
    switch (Zznl.ZD[this.ZS.ordinal()]) {
      case 1:
        null = ZA(ZG(l), paramObject);
        if (arrayOfInt != null);
        return null;
      case 2:
        null = Zi(ZG(l), paramObject);
        if (arrayOfInt != null);
        return null;
      case 3:
        null = Zc(l, paramObject);
        if (arrayOfInt != null)
          break; 
        return null;
    } 
    Zuh.Zb(false, Zqf.Zr);
    return false;
  }
  
  abstract Object ZG(long paramLong);
  
  private boolean ZA(Object paramObject1, Object paramObject2) {
    return (paramObject1 instanceof Zxsr && paramObject2 instanceof Zxsr) ? ((((Zxsr)paramObject1).ZPz() == ((Zxsr)paramObject2).ZPz() && ((Zxsr)paramObject1).ZXU() == ((Zxsr)paramObject2).ZXU())) : ((paramObject1 == paramObject2));
  }
  
  private boolean Zi(Object paramObject1, Object paramObject2) {
    return paramObject1.equals(paramObject2);
  }
  
  private boolean Zc(long paramLong, Object paramObject) {
    return (paramObject instanceof Long && ((Long)paramObject).longValue() == paramLong);
  }
  
  Long Za(Zif paramZif, int paramInt, Object paramObject, long paramLong) {
    // Byte code:
    //   0: invokestatic Zl : ()[I
    //   3: iconst_0
    //   4: istore #7
    //   6: astore #6
    //   8: iload #7
    //   10: aload_1
    //   11: invokeinterface size : ()I
    //   16: if_icmpge -> 119
    //   19: aload_1
    //   20: iload #7
    //   22: invokeinterface ZBY : (I)Lburp/Zgl_;
    //   27: astore #8
    //   29: aload_3
    //   30: ifnonnull -> 65
    //   33: aload_0
    //   34: aload #8
    //   36: invokevirtual ZG : (Lburp/Zgl_;)I
    //   39: ifne -> 57
    //   42: aload_0
    //   43: aload #8
    //   45: invokevirtual Za : (Lburp/Zgl_;)J
    //   48: lconst_0
    //   49: lcmp
    //   50: ifne -> 57
    //   53: iconst_1
    //   54: goto -> 58
    //   57: iconst_0
    //   58: istore #9
    //   60: aload #6
    //   62: ifnull -> 75
    //   65: aload_0
    //   66: aload #8
    //   68: iload_2
    //   69: aload_3
    //   70: invokevirtual ZF : (Lburp/Zgl_;ILjava/lang/Object;)Z
    //   73: istore #9
    //   75: iload #9
    //   77: ifeq -> 111
    //   80: aload_0
    //   81: aload #8
    //   83: invokevirtual Zp : (Lburp/Zgl_;)J
    //   86: lstore #10
    //   88: aload_0
    //   89: aload #8
    //   91: lload #4
    //   93: invokevirtual Zc : (Lburp/Zgl_;J)V
    //   96: aload_0
    //   97: aload_1
    //   98: iload #7
    //   100: aload #8
    //   102: invokevirtual ZC : (Lburp/Zif;ILburp/Zgl_;)V
    //   105: lload #10
    //   107: invokestatic valueOf : (J)Ljava/lang/Long;
    //   110: areturn
    //   111: iinc #7, 1
    //   114: aload #6
    //   116: ifnull -> 8
    //   119: aconst_null
    //   120: areturn
  }
  
  private Long ZG(Object paramObject) {
    return (paramObject == null) ? ZRR() : ZC(paramObject);
  }
  
  private Long ZRR() {
    Zx29<Zif> zx29 = ZRj();
    Zif zif = zx29.ZGt(0);
    return (zif == null) ? null : ZU(zif, 0, null);
  }
  
  private Long ZC(Object paramObject) {
    Zx29<Zif> zx29 = ZRj();
    int i = ZT(paramObject);
    Zif zif = Zb(zx29, i);
    return (zif == null) ? null : ZU(zif, i, paramObject);
  }
  
  private Long ZU(Zif paramZif, int paramInt, Object paramObject) {
    // Byte code:
    //   0: invokestatic Zl : ()[I
    //   3: aload_1
    //   4: invokeinterface iterator : ()Ljava/util/Iterator;
    //   9: astore #5
    //   11: astore #4
    //   13: aload #5
    //   15: invokeinterface hasNext : ()Z
    //   20: ifeq -> 118
    //   23: aload #5
    //   25: invokeinterface next : ()Ljava/lang/Object;
    //   30: checkcast burp/Zgl_
    //   33: astore #6
    //   35: aload_3
    //   36: ifnonnull -> 71
    //   39: aload_0
    //   40: aload #6
    //   42: invokevirtual ZG : (Lburp/Zgl_;)I
    //   45: ifne -> 63
    //   48: aload_0
    //   49: aload #6
    //   51: invokevirtual Za : (Lburp/Zgl_;)J
    //   54: lconst_0
    //   55: lcmp
    //   56: ifne -> 63
    //   59: iconst_1
    //   60: goto -> 64
    //   63: iconst_0
    //   64: istore #7
    //   66: aload #4
    //   68: ifnull -> 81
    //   71: aload_0
    //   72: aload #6
    //   74: iload_2
    //   75: aload_3
    //   76: invokevirtual ZF : (Lburp/Zgl_;ILjava/lang/Object;)Z
    //   79: istore #7
    //   81: iload #7
    //   83: ifeq -> 113
    //   86: aload #5
    //   88: invokeinterface remove : ()V
    //   93: aload_0
    //   94: aload_0
    //   95: invokevirtual Zqw : ()I
    //   98: iconst_1
    //   99: isub
    //   100: invokevirtual ZF : (I)V
    //   103: aload_0
    //   104: aload #6
    //   106: invokevirtual Zp : (Lburp/Zgl_;)J
    //   109: invokestatic valueOf : (J)Ljava/lang/Long;
    //   112: areturn
    //   113: aload #4
    //   115: ifnull -> 13
    //   118: aconst_null
    //   119: areturn
  }
  
  void Zw(Zx29<Zif> paramZx29) {
    if (Zqw() >= ZR5()) {
      int i = paramZx29.size();
      int j = i * 2;
      int k = paramZx29.Zmr(j);
      if (k - Integer.MAX_VALUE > 0)
        return; 
      Zk(paramZx29, i, j);
      Zb(j);
    } 
  }
  
  private void Zk(Zx29<Zif> paramZx29, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_1
    //   1: iload_3
    //   2: invokevirtual Zrq : (I)V
    //   5: invokestatic Zl : ()[I
    //   8: new java/util/ArrayList
    //   11: dup
    //   12: iconst_2
    //   13: invokespecial <init> : (I)V
    //   16: astore #5
    //   18: iconst_0
    //   19: istore #6
    //   21: astore #4
    //   23: iload #6
    //   25: iload_2
    //   26: if_icmpge -> 171
    //   29: aload_1
    //   30: iload #6
    //   32: invokevirtual ZGt : (I)Lburp/Zgpi;
    //   35: checkcast burp/Zif
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
    //   71: checkcast burp/Zgl_
    //   74: astore #9
    //   76: aload_0
    //   77: aload #9
    //   79: invokevirtual ZG : (Lburp/Zgl_;)I
    //   82: istore #10
    //   84: aload_0
    //   85: iload #10
    //   87: iload_3
    //   88: invokevirtual ZB : (II)I
    //   91: istore #11
    //   93: iload #11
    //   95: iload #6
    //   97: if_icmpne -> 115
    //   100: aload #5
    //   102: aload #9
    //   104: invokeinterface add : (Ljava/lang/Object;)Z
    //   109: pop
    //   110: aload #4
    //   112: ifnull -> 134
    //   115: aload_0
    //   116: aload_1
    //   117: iload #11
    //   119: invokevirtual Za : (Lburp/Zx29;I)Lburp/Zif;
    //   122: astore #12
    //   124: aload #12
    //   126: aload #9
    //   128: invokeinterface add : (Ljava/lang/Object;)Z
    //   133: pop
    //   134: aload #4
    //   136: ifnull -> 54
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
    //   168: ifnull -> 23
    //   171: return
  }
  
  int ZT(Object paramObject) {
    if (paramObject == null)
      return 0; 
    int i = 0;
    i ^= paramObject.hashCode();
    i ^= i >>> 20 ^ i >>> 12;
    return i ^ i >>> 7 ^ i >>> 4;
  }
  
  Zif Ze(Zx29<Zif> paramZx29, int paramInt) {
    return Za(paramZx29, ZB(paramInt, paramZx29.size()));
  }
  
  Zif Za(Zx29<Zif> paramZx29, int paramInt) {
    Zif zif = paramZx29.ZGt(paramInt);
    if (zif == null) {
      zif = this.Za.<Zif>ZH(new Zr5e(2));
      paramZx29.Zo(paramInt, zif);
    } 
    return zif;
  }
  
  private Zif Zb(Zx29<Zif> paramZx29, int paramInt) {
    int i = ZB(paramInt, paramZx29.size());
    return paramZx29.ZGt(i);
  }
  
  int ZB(int paramInt1, int paramInt2) {
    return paramInt1 & paramInt2 - 1;
  }
  
  void ZC(Zif paramZif, int paramInt, long paramLong1, long paramLong2) {
    paramZif.add(new Zgl_(paramInt, paramLong1, paramLong2));
    ZF(Zqw() + 1);
  }
  
  abstract Zx29<Zif> ZRj();
  
  abstract int ZR5();
  
  abstract void Zb(int paramInt);
  
  abstract void ZF(int paramInt);
  
  int ZG(Zgl_ paramZgl_) {
    return paramZgl_.ZW();
  }
  
  long Za(Zgl_ paramZgl_) {
    return paramZgl_.Zr();
  }
  
  long Zp(Zgl_ paramZgl_) {
    return paramZgl_.Zq();
  }
  
  private void Zc(Zgl_ paramZgl_, long paramLong) {
    paramZgl_.Zq(paramLong);
  }
  
  private void ZC(Zif paramZif, int paramInt, Zgl_ paramZgl_) {
    paramZif.Zk(paramInt, paramZgl_);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx2t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */