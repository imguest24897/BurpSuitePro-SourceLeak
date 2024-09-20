package burp;

import java.util.Iterator;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zx2m extends Zxsr {
  public final Ztdo ZX;
  
  protected Zx2m(Zkit paramZkit, long paramLong, Ztdo paramZtdo) {
    super(paramZkit, paramLong);
    this.ZX = paramZtdo;
  }
  
  public abstract int Zx1();
  
  public boolean Zk(Object paramObject) {
    return (ZL(paramObject) != null);
  }
  
  public long Zz(Object paramObject) {
    Long long_ = ZL(paramObject);
    return (long_ == null) ? 0L : long_.longValue();
  }
  
  public long ZN(Object paramObject) {
    Long long_ = Zc(paramObject);
    return (long_ == null) ? 0L : long_.longValue();
  }
  
  public void Zx0() {
    Iterator<Ztrr> iterator = Zqc().iterator();
    String str = Ztdo.ZX();
    while (iterator.hasNext()) {
      Ztrr ztrr = iterator.next();
      if (ztrr != null)
        ztrr.clear(); 
      if (str != null)
        break; 
    } 
    ZL(0);
  }
  
  protected Long ZL(Object paramObject) {
    Zx29<Ztrr> zx29 = Zqc();
    int i = ZO(paramObject);
    Ztrr ztrr = ZT(zx29, i);
    String str = Ztdo.ZX();
    if (ztrr == null)
      return null; 
    for (Zlva zlva : ztrr) {
      if (ZD(zlva, i, paramObject))
        return Long.valueOf(Zz(zlva)); 
      if (str != null)
        break; 
    } 
    return null;
  }
  
  protected boolean ZD(Zlva paramZlva, int paramInt, Object paramObject) {
    String str = Ztdo.ZX();
    if (ZW(paramZlva) != paramInt)
      return false; 
    long l = Zq(paramZlva);
    if (paramObject == null)
      return (l == 0L); 
    switch (Zxl9.Zb[this.ZX.ordinal()]) {
      case 1:
        null = ZA(Zr(l), paramObject);
        if (str != null);
        return null;
      case 2:
        null = ZR(Zr(l), paramObject);
        if (str != null);
        return null;
      case 3:
        null = Zq(l, paramObject);
        if (str != null)
          break; 
        return null;
    } 
    Zuh.Zb(false, Zqf.Zr);
    return false;
  }
  
  protected abstract Object Zr(long paramLong);
  
  private boolean ZA(Object paramObject1, Object paramObject2) {
    return (paramObject1 instanceof Zxsr && paramObject2 instanceof Zxsr) ? ((((Zxsr)paramObject1).ZPz() == ((Zxsr)paramObject2).ZPz() && ((Zxsr)paramObject1).ZXU() == ((Zxsr)paramObject2).ZXU())) : ((paramObject1 == paramObject2));
  }
  
  private boolean ZR(Object paramObject1, Object paramObject2) {
    return paramObject1.equals(paramObject2);
  }
  
  private boolean Zq(long paramLong, Object paramObject) {
    return (paramObject instanceof Long && ((Long)paramObject).longValue() == paramLong);
  }
  
  protected Long Zm(Ztrr paramZtrr, int paramInt, Object paramObject, long paramLong) {
    // Byte code:
    //   0: invokestatic ZX : ()Ljava/lang/String;
    //   3: iconst_0
    //   4: istore #7
    //   6: astore #6
    //   8: iload #7
    //   10: aload_1
    //   11: invokeinterface size : ()I
    //   16: if_icmpge -> 119
    //   19: aload_1
    //   20: iload #7
    //   22: invokeinterface ZTk : (I)Lburp/Zlva;
    //   27: astore #8
    //   29: aload_3
    //   30: ifnonnull -> 65
    //   33: aload_0
    //   34: aload #8
    //   36: invokevirtual ZW : (Lburp/Zlva;)I
    //   39: ifne -> 57
    //   42: aload_0
    //   43: aload #8
    //   45: invokevirtual Zq : (Lburp/Zlva;)J
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
    //   70: invokevirtual ZD : (Lburp/Zlva;ILjava/lang/Object;)Z
    //   73: istore #9
    //   75: iload #9
    //   77: ifeq -> 111
    //   80: aload_0
    //   81: aload #8
    //   83: invokevirtual Zz : (Lburp/Zlva;)J
    //   86: lstore #10
    //   88: aload_0
    //   89: aload #8
    //   91: lload #4
    //   93: invokevirtual Za : (Lburp/Zlva;J)V
    //   96: aload_0
    //   97: aload_1
    //   98: iload #7
    //   100: aload #8
    //   102: invokevirtual Zm : (Lburp/Ztrr;ILburp/Zlva;)V
    //   105: lload #10
    //   107: invokestatic valueOf : (J)Ljava/lang/Long;
    //   110: areturn
    //   111: iinc #7, 1
    //   114: aload #6
    //   116: ifnull -> 8
    //   119: aconst_null
    //   120: areturn
  }
  
  private Long Zc(Object paramObject) {
    return (paramObject == null) ? ZqU() : Zv(paramObject);
  }
  
  private Long ZqU() {
    Zx29<Ztrr> zx29 = Zqc();
    Ztrr ztrr = zx29.ZGt(0);
    return (ztrr == null) ? null : ZJ(ztrr, 0, null);
  }
  
  private Long Zv(Object paramObject) {
    Zx29<Ztrr> zx29 = Zqc();
    int i = ZO(paramObject);
    Ztrr ztrr = ZT(zx29, i);
    return (ztrr == null) ? null : ZJ(ztrr, i, paramObject);
  }
  
  private Long ZJ(Ztrr paramZtrr, int paramInt, Object paramObject) {
    // Byte code:
    //   0: invokestatic ZX : ()Ljava/lang/String;
    //   3: aload_1
    //   4: invokeinterface iterator : ()Ljava/util/Iterator;
    //   9: astore #5
    //   11: astore #4
    //   13: aload #5
    //   15: invokeinterface hasNext : ()Z
    //   20: ifeq -> 118
    //   23: aload #5
    //   25: invokeinterface next : ()Ljava/lang/Object;
    //   30: checkcast burp/Zlva
    //   33: astore #6
    //   35: aload_3
    //   36: ifnonnull -> 71
    //   39: aload_0
    //   40: aload #6
    //   42: invokevirtual ZW : (Lburp/Zlva;)I
    //   45: ifne -> 63
    //   48: aload_0
    //   49: aload #6
    //   51: invokevirtual Zq : (Lburp/Zlva;)J
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
    //   76: invokevirtual ZD : (Lburp/Zlva;ILjava/lang/Object;)Z
    //   79: istore #7
    //   81: iload #7
    //   83: ifeq -> 113
    //   86: aload #5
    //   88: invokeinterface remove : ()V
    //   93: aload_0
    //   94: aload_0
    //   95: invokevirtual Zx1 : ()I
    //   98: iconst_1
    //   99: isub
    //   100: invokevirtual ZL : (I)V
    //   103: aload_0
    //   104: aload #6
    //   106: invokevirtual Zz : (Lburp/Zlva;)J
    //   109: invokestatic valueOf : (J)Ljava/lang/Long;
    //   112: areturn
    //   113: aload #4
    //   115: ifnull -> 13
    //   118: aconst_null
    //   119: areturn
  }
  
  protected void ZN(Zx29<Ztrr> paramZx29) {
    if (Zx1() >= Zq9()) {
      int i = paramZx29.size();
      int j = i * 2;
      int k = paramZx29.Zmr(j);
      if (k - Integer.MAX_VALUE > 0)
        return; 
      Zc(paramZx29, i, j);
      Zf(j);
    } 
  }
  
  private void Zc(Zx29<Ztrr> paramZx29, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_1
    //   1: iload_3
    //   2: invokevirtual Zrq : (I)V
    //   5: invokestatic ZX : ()Ljava/lang/String;
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
    //   35: checkcast burp/Ztrr
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
    //   71: checkcast burp/Zlva
    //   74: astore #9
    //   76: aload_0
    //   77: aload #9
    //   79: invokevirtual ZW : (Lburp/Zlva;)I
    //   82: istore #10
    //   84: aload_0
    //   85: iload #10
    //   87: iload_3
    //   88: invokevirtual ZW : (II)I
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
    //   119: invokevirtual ZK : (Lburp/Zx29;I)Lburp/Ztrr;
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
  
  protected int ZO(Object paramObject) {
    if (paramObject == null)
      return 0; 
    int i = 0;
    i ^= paramObject.hashCode();
    i ^= i >>> 20 ^ i >>> 12;
    return i ^ i >>> 7 ^ i >>> 4;
  }
  
  protected Ztrr Zw(Zx29<Ztrr> paramZx29, int paramInt) {
    return ZK(paramZx29, ZW(paramInt, paramZx29.size()));
  }
  
  protected Ztrr ZK(Zx29<Ztrr> paramZx29, int paramInt) {
    Ztrr ztrr = paramZx29.ZGt(paramInt);
    if (ztrr == null) {
      ztrr = this.Za.<Ztrr>ZH(new Zzje(2));
      paramZx29.Zo(paramInt, ztrr);
    } 
    return ztrr;
  }
  
  private Ztrr ZT(Zx29<Ztrr> paramZx29, int paramInt) {
    int i = ZW(paramInt, paramZx29.size());
    return paramZx29.ZGt(i);
  }
  
  protected int ZW(int paramInt1, int paramInt2) {
    return paramInt1 & paramInt2 - 1;
  }
  
  protected void Zv(Ztrr paramZtrr, int paramInt, long paramLong1, long paramLong2) {
    paramZtrr.add(new Zlva(paramInt, paramLong1, paramLong2));
    ZL(Zx1() + 1);
  }
  
  protected abstract Zx29<Ztrr> Zqc();
  
  protected abstract int Zq9();
  
  protected abstract void Zf(int paramInt);
  
  protected abstract void ZL(int paramInt);
  
  private int ZW(Zlva paramZlva) {
    return (int)paramZlva.ZS();
  }
  
  protected long Zq(Zlva paramZlva) {
    return paramZlva.Za();
  }
  
  protected long Zz(Zlva paramZlva) {
    return paramZlva.Zx();
  }
  
  private void Za(Zlva paramZlva, long paramLong) {
    paramZlva.Zj(paramLong);
  }
  
  private void Zm(Ztrr paramZtrr, int paramInt, Zlva paramZlva) {
    paramZtrr.Zp(paramInt, paramZlva);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx2m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */