package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zx2k extends Zxsr {
  public final Ztdo Zp;
  
  Zx2k(Zkit paramZkit, long paramLong, Ztdo paramZtdo) {
    super(paramZkit, paramLong);
    this.Zp = paramZtdo;
  }
  
  public abstract int ZpR();
  
  public boolean ZH(Object paramObject) {
    return (Zr(paramObject) != null);
  }
  
  public Byte Zx(Object paramObject) {
    return Zr(paramObject);
  }
  
  private Byte Zr(Object paramObject) {
    Zx29<Zkc3> zx29 = ZqY();
    int i = ZB(paramObject);
    Zbqc[] arrayOfZbqc = Ze6s.ZL();
    Zkc3 zkc3 = ZA(zx29, i);
    if (zkc3 == null)
      return null; 
    for (Ztp0 ztp0 : zkc3) {
      if (Zd(ztp0, i, paramObject))
        return Byte.valueOf(ZE(ztp0)); 
      if (arrayOfZbqc == null)
        break; 
    } 
    return null;
  }
  
  boolean Zd(Ztp0 paramZtp0, int paramInt, Object paramObject) {
    Zbqc[] arrayOfZbqc = Ze6s.ZL();
    if (ZI(paramZtp0) != paramInt)
      return false; 
    long l = Zc(paramZtp0);
    if (paramObject == null)
      return (l == 0L); 
    switch (Zsur.Zq[this.Zp.ordinal()]) {
      case 1:
        null = ZT(ZG(l), paramObject);
        if (arrayOfZbqc == null);
        return null;
      case 2:
        null = Zj(ZG(l), paramObject);
        if (arrayOfZbqc == null);
        return null;
      case 3:
        null = ZD(l, paramObject);
        if (arrayOfZbqc == null)
          break; 
        return null;
    } 
    Zuh.Zb(false, Zqf.Zr);
    return false;
  }
  
  abstract Object ZG(long paramLong);
  
  private boolean ZT(Object paramObject1, Object paramObject2) {
    return (paramObject1 instanceof Zxsr && paramObject2 instanceof Zxsr) ? ((((Zxsr)paramObject1).ZPz() == ((Zxsr)paramObject2).ZPz() && ((Zxsr)paramObject1).ZXU() == ((Zxsr)paramObject2).ZXU())) : ((paramObject1 == paramObject2));
  }
  
  private boolean Zj(Object paramObject1, Object paramObject2) {
    return paramObject1.equals(paramObject2);
  }
  
  private boolean ZD(long paramLong, Object paramObject) {
    return (paramObject instanceof Long && ((Long)paramObject).longValue() == paramLong);
  }
  
  Byte Zq(Zkc3 paramZkc3, int paramInt, Object paramObject, byte paramByte) {
    // Byte code:
    //   0: invokestatic ZL : ()[Lburp/Zbqc;
    //   3: iconst_0
    //   4: istore #6
    //   6: astore #5
    //   8: iload #6
    //   10: aload_1
    //   11: invokeinterface size : ()I
    //   16: if_icmpge -> 119
    //   19: aload_1
    //   20: iload #6
    //   22: invokeinterface ZXq : (I)Lburp/Ztp0;
    //   27: astore #7
    //   29: aload_3
    //   30: ifnonnull -> 65
    //   33: aload_0
    //   34: aload #7
    //   36: invokevirtual ZI : (Lburp/Ztp0;)I
    //   39: ifne -> 57
    //   42: aload_0
    //   43: aload #7
    //   45: invokevirtual Zc : (Lburp/Ztp0;)J
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
    //   70: invokevirtual Zd : (Lburp/Ztp0;ILjava/lang/Object;)Z
    //   73: istore #8
    //   75: iload #8
    //   77: ifeq -> 111
    //   80: aload_0
    //   81: aload #7
    //   83: invokevirtual ZE : (Lburp/Ztp0;)B
    //   86: istore #9
    //   88: aload_0
    //   89: aload #7
    //   91: iload #4
    //   93: invokevirtual ZZ : (Lburp/Ztp0;B)V
    //   96: aload_0
    //   97: aload_1
    //   98: iload #6
    //   100: aload #7
    //   102: invokevirtual Zz : (Lburp/Zkc3;ILburp/Ztp0;)V
    //   105: iload #9
    //   107: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   110: areturn
    //   111: iinc #6, 1
    //   114: aload #5
    //   116: ifnonnull -> 8
    //   119: aconst_null
    //   120: areturn
  }
  
  void ZJ(Zx29<Zkc3> paramZx29) {
    if (ZpR() >= Zq6()) {
      int i = paramZx29.size();
      int j = i * 2;
      int k = paramZx29.Zmr(j);
      if (k - Integer.MAX_VALUE > 0)
        return; 
      Zq(paramZx29, i, j);
      ZW(j);
    } 
  }
  
  private void Zq(Zx29<Zkc3> paramZx29, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZL : ()[Lburp/Zbqc;
    //   3: aload_1
    //   4: iload_3
    //   5: invokevirtual Zrq : (I)V
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
    //   35: checkcast burp/Zkc3
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
    //   71: checkcast burp/Ztp0
    //   74: astore #9
    //   76: aload_0
    //   77: aload #9
    //   79: invokevirtual ZI : (Lburp/Ztp0;)I
    //   82: istore #10
    //   84: aload_0
    //   85: iload #10
    //   87: iload_3
    //   88: invokevirtual Zr : (II)I
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
    //   119: invokevirtual ZV : (Lburp/Zx29;I)Lburp/Zkc3;
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
  
  int ZB(Object paramObject) {
    if (paramObject == null)
      return 0; 
    int i = 0;
    i ^= paramObject.hashCode();
    i ^= i >>> 20 ^ i >>> 12;
    return i ^ i >>> 7 ^ i >>> 4;
  }
  
  Zkc3 ZY(Zx29<Zkc3> paramZx29, int paramInt) {
    return ZV(paramZx29, Zr(paramInt, paramZx29.size()));
  }
  
  Zkc3 ZV(Zx29<Zkc3> paramZx29, int paramInt) {
    Zkc3 zkc3 = paramZx29.ZGt(paramInt);
    if (zkc3 == null) {
      zkc3 = this.Za.<Zkc3>ZH(new Zmrg(2));
      paramZx29.Zo(paramInt, zkc3);
    } 
    return zkc3;
  }
  
  private Zkc3 ZA(Zx29<Zkc3> paramZx29, int paramInt) {
    int i = Zr(paramInt, paramZx29.size());
    return paramZx29.ZGt(i);
  }
  
  int Zr(int paramInt1, int paramInt2) {
    return paramInt1 & paramInt2 - 1;
  }
  
  void Zq(Zkc3 paramZkc3, int paramInt, long paramLong, byte paramByte) {
    paramZkc3.add(new Ztp0(paramInt, paramLong, paramByte));
    Zo(ZpR() + 1);
  }
  
  abstract Zx29<Zkc3> ZqY();
  
  abstract int Zq6();
  
  abstract void ZW(int paramInt);
  
  abstract void Zo(int paramInt);
  
  int ZI(Ztp0 paramZtp0) {
    return paramZtp0.Za();
  }
  
  long Zc(Ztp0 paramZtp0) {
    return paramZtp0.Zv();
  }
  
  byte ZE(Ztp0 paramZtp0) {
    return paramZtp0.Z_();
  }
  
  private void ZZ(Ztp0 paramZtp0, byte paramByte) {
    paramZtp0.ZX(paramByte);
  }
  
  private void Zz(Zkc3 paramZkc3, int paramInt, Ztp0 paramZtp0) {
    paramZkc3.ZK(paramInt, paramZtp0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx2k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */