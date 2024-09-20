package com.fasterxml.Zy;

import burp.Zbqc;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class Zr<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
  static final int ZP;
  
  static final int ZU;
  
  static final int Zb;
  
  final ConcurrentMap<K, Zc<K, V>> Zi;
  
  final int Za;
  
  final long[] Zw;
  
  final Zd<Zc<K, V>> Zl;
  
  final AtomicLong Zf;
  
  final AtomicLong Zp;
  
  final Lock ZG;
  
  final Queue<Runnable> Zy;
  
  final AtomicLongArray ZK;
  
  final AtomicLongArray Zq;
  
  final AtomicReferenceArray<Zc<K, V>> ZS;
  
  final AtomicReference<Zz> ZJ;
  
  transient Set<K> ZC;
  
  transient Collection<V> ZD;
  
  transient Set<Map.Entry<K, V>> Zn;
  
  static final long serialVersionUID = 1L;
  
  private static Zbqc[] Zv;
  
  private static final String a;
  
  static int Z_(int paramInt) {
    return 1 << 32 - Integer.numberOfLeadingZeros(paramInt - 1);
  }
  
  private static int Zd(int paramInt1, int paramInt2) {
    return 16 * paramInt1 + paramInt2;
  }
  
  Zr(Zi<K, V> paramZi) {
    this.Za = paramZi.ZE;
    this.Zp = new AtomicLong(Math.min(paramZi.Zn, 9223372034707292160L));
    this.Zi = new ConcurrentHashMap<>(paramZi.ZU, 0.75F, this.Za);
    this.ZG = new ReentrantLock();
    this.Zf = new AtomicLong();
    this.Zl = new Zd<>();
    this.Zy = new ConcurrentLinkedQueue<>();
    this.ZJ = new AtomicReference<>(Zz.IDLE);
    this.Zw = new long[ZU];
    this.ZK = new AtomicLongArray(ZU);
    this.Zq = new AtomicLongArray(ZU);
    this.ZS = new AtomicReferenceArray<>(ZU * 16);
  }
  
  static void Z_(Object paramObject) {
    try {
      if (paramObject == null)
        throw new NullPointerException(); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  static void ZV(boolean paramBoolean) {
    try {
      if (!paramBoolean)
        throw new IllegalArgumentException(); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  static void Zw(boolean paramBoolean) {
    try {
      if (!paramBoolean)
        throw new IllegalStateException(); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  boolean Zz() {
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return (this.Zf.get() > this.Zp.get());
  }
  
  void ZT() {
    Zbqc[] arrayOfZbqc = ZE();
    while (Zz()) {
      Zc<K, V> zc = this.Zl.ZS();
      try {
        if (zc == null)
          return; 
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      } 
      this.Zi.remove(zc.ZT, zc);
      Zg(zc);
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  void Ze(Zc<K, V> paramZc) {
    int i = Zl();
    long l = ZS(i, paramZc);
    ZQ(i, l);
  }
  
  static int Zl() {
    return (int)Thread.currentThread().getId() & Zb;
  }
  
  long ZS(int paramInt, Zc<K, V> paramZc) {
    long l = this.ZK.get(paramInt);
    this.ZK.lazySet(paramInt, l + 1L);
    int i = (int)(l & 0xFL);
    this.ZS.lazySet(Zd(paramInt, i), paramZc);
    return l;
  }
  
  void ZQ(int paramInt, long paramLong) {
    long l = paramLong - this.Zq.get(paramInt);
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    boolean bool = (l < 4L) ? true : false;
    Zz zz = this.ZJ.get();
    try {
      if (zz.ZB(bool))
        Zt(); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  void ZH(Runnable paramRunnable) {
    this.Zy.add(paramRunnable);
    this.ZJ.lazySet(Zz.REQUIRED);
    Zt();
  }
  
  void Zt() {
    if (this.ZG.tryLock())
      try {
        this.ZJ.lazySet(Zz.PROCESSING);
        ZM();
      } finally {
        this.ZJ.compareAndSet(Zz.PROCESSING, Zz.IDLE);
        this.ZG.unlock();
      }  
  }
  
  void ZM() {
    ZC();
    Zu();
  }
  
  void ZC() {
    int i = (int)Thread.currentThread().getId();
    int j = i + ZU;
    Zbqc[] arrayOfZbqc = ZE();
    int k = i;
    while (k < j) {
      Ze(k & Zb);
      k++;
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  void Ze(int paramInt) {
    // Byte code:
    //   0: invokestatic ZE : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: getfield ZK : Ljava/util/concurrent/atomic/AtomicLongArray;
    //   7: iload_1
    //   8: invokevirtual get : (I)J
    //   11: lstore_3
    //   12: astore_2
    //   13: iconst_0
    //   14: istore #5
    //   16: iload #5
    //   18: bipush #8
    //   20: if_icmpge -> 114
    //   23: aload_0
    //   24: getfield Zw : [J
    //   27: iload_1
    //   28: laload
    //   29: ldc2_w 15
    //   32: land
    //   33: l2i
    //   34: istore #6
    //   36: iload_1
    //   37: iload #6
    //   39: invokestatic Zd : (II)I
    //   42: istore #7
    //   44: aload_0
    //   45: getfield ZS : Ljava/util/concurrent/atomic/AtomicReferenceArray;
    //   48: iload #7
    //   50: invokevirtual get : (I)Ljava/lang/Object;
    //   53: checkcast com/fasterxml/Zy/Zc
    //   56: astore #8
    //   58: aload #8
    //   60: ifnonnull -> 74
    //   63: aload_2
    //   64: ifnonnull -> 114
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   73: athrow
    //   74: aload_0
    //   75: getfield ZS : Ljava/util/concurrent/atomic/AtomicReferenceArray;
    //   78: iload #7
    //   80: aconst_null
    //   81: invokevirtual lazySet : (ILjava/lang/Object;)V
    //   84: aload_0
    //   85: aload #8
    //   87: invokevirtual ZX : (Lcom/fasterxml/Zy/Zc;)V
    //   90: aload_0
    //   91: getfield Zw : [J
    //   94: iload_1
    //   95: dup2
    //   96: laload
    //   97: lconst_1
    //   98: ladd
    //   99: lastore
    //   100: iinc #5, 1
    //   103: aload_2
    //   104: ifnonnull -> 16
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   113: athrow
    //   114: aload_0
    //   115: getfield Zq : Ljava/util/concurrent/atomic/AtomicLongArray;
    //   118: iload_1
    //   119: lload_3
    //   120: invokevirtual lazySet : (IJ)V
    //   123: return
    // Exception table:
    //   from	to	target	type
    //   58	67	70	java/lang/NullPointerException
    //   63	107	110	java/lang/NullPointerException
  }
  
  void ZX(Zc<K, V> paramZc) {
    try {
      if (this.Zl.ZL(paramZc))
        this.Zl.ZP(paramZc); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  void Zu() {
    // Byte code:
    //   0: invokestatic ZE : ()[Lburp/Zbqc;
    //   3: iconst_0
    //   4: istore_2
    //   5: astore_1
    //   6: iload_2
    //   7: bipush #16
    //   9: if_icmpge -> 60
    //   12: aload_0
    //   13: getfield Zy : Ljava/util/Queue;
    //   16: invokeinterface poll : ()Ljava/lang/Object;
    //   21: checkcast java/lang/Runnable
    //   24: astore_3
    //   25: aload_3
    //   26: ifnonnull -> 40
    //   29: aload_1
    //   30: ifnonnull -> 60
    //   33: goto -> 40
    //   36: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   39: athrow
    //   40: aload_3
    //   41: invokeinterface run : ()V
    //   46: iinc #2, 1
    //   49: aload_1
    //   50: ifnonnull -> 6
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   59: athrow
    //   60: return
    // Exception table:
    //   from	to	target	type
    //   25	33	36	java/lang/NullPointerException
    //   29	53	56	java/lang/NullPointerException
  }
  
  boolean Zj(Zc<K, V> paramZc, Z_<V> paramZ_) {
    if (paramZ_.ZX()) {
      Z_<V> z_ = new Z_<>(paramZ_.Zv, -paramZ_.ZK);
      return paramZc.compareAndSet(paramZ_, z_);
    } 
    return false;
  }
  
  void Zi(Zc<K, V> paramZc) {
    while (true) {
      Z_<V> z_1 = paramZc.get();
      try {
        if (!z_1.ZX())
          return; 
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      } 
      Z_<V> z_2 = new Z_<>(z_1.Zv, -z_1.ZK);
      try {
        if (paramZc.compareAndSet(z_1, z_2))
          return; 
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      } 
    } 
  }
  
  void Zg(Zc<K, V> paramZc) {
    while (true) {
      Z_<V> z_1 = paramZc.get();
      Z_<V> z_2 = new Z_<>(z_1.Zv, 0);
      try {
        if (paramZc.compareAndSet(z_1, z_2)) {
          this.Zf.lazySet(this.Zf.get() - Math.abs(z_1.ZK));
          return;
        } 
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      } 
    } 
  }
  
  public boolean isEmpty() {
    return this.Zi.isEmpty();
  }
  
  public int size() {
    return this.Zi.size();
  }
  
  public void clear() {
    this.ZG.lock();
    Zbqc[] arrayOfZbqc = ZE();
    try {
      Zc<K, V> zc;
      while ((zc = this.Zl.ZS()) != null) {
        this.Zi.remove(zc.ZT, zc);
        Zg(zc);
        if (arrayOfZbqc == null)
          break; 
      } 
      byte b = 0;
      while (b < this.ZS.length()) {
        this.ZS.lazySet(b, null);
        b++;
        if (arrayOfZbqc == null)
          break; 
      } 
      Runnable runnable;
      while ((runnable = this.Zy.poll()) != null) {
        runnable.run();
        if (arrayOfZbqc == null)
          break; 
      } 
    } finally {
      this.ZG.unlock();
    } 
    try {
      if (Zbqc.Zwu() == null)
        ZC(new Zbqc[4]); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  public boolean containsKey(Object paramObject) {
    return this.Zi.containsKey(paramObject);
  }
  
  public boolean containsValue(Object paramObject) {
    Z_(paramObject);
    Iterator<Zc> iterator = this.Zi.values().iterator();
    Zbqc[] arrayOfZbqc = ZE();
    while (iterator.hasNext()) {
      Zc zc = iterator.next();
      try {
        if (zc.ZF().equals(paramObject))
          return true; 
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      } 
      if (arrayOfZbqc == null)
        break; 
    } 
    return false;
  }
  
  public V get(Object paramObject) {
    Zc<K, V> zc = this.Zi.get(paramObject);
    try {
      if (zc == null)
        return null; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    Ze(zc);
    return zc.ZF();
  }
  
  public V put(K paramK, V paramV) {
    return ZO(paramK, paramV, false);
  }
  
  public V putIfAbsent(K paramK, V paramV) {
    return ZO(paramK, paramV, true);
  }
  
  V ZO(K paramK, V paramV, boolean paramBoolean) {
    Z_(paramK);
    Z_(paramV);
    boolean bool = true;
    Z_<V> z_ = new Z_<>(paramV, 1);
    Zbqc[] arrayOfZbqc = ZE();
    Zc<K, V> zc = new Zc<>(paramK, z_);
    label36: while (true) {
      Zc<K, V> zc1 = this.Zi.putIfAbsent(zc.ZT, zc);
      try {
        if (zc1 == null) {
          ZH(new Zb(this, zc, 1));
          return null;
        } 
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      } 
      try {
        if (paramBoolean) {
          Ze(zc1);
          return zc1.ZF();
        } 
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      } 
      while (true) {
        int i;
        Z_<V> z_1 = zc1.get();
        if (!z_1.ZX())
          try {
            if (arrayOfZbqc == null) {
              Zbqc.Zr(new Zbqc[5]);
            } else {
              continue label36;
            } 
          } catch (NullPointerException nullPointerException) {
            throw a(null);
          }  
        if (zc1.compareAndSet(z_1, z_)) {
          i = 1 - z_1.ZK;
          try {
            if (i == 0) {
              try {
                Ze(zc1);
                if (arrayOfZbqc == null) {
                  ZH(new Zl(this, zc1, i));
                  return z_1.Zv;
                } 
              } catch (NullPointerException nullPointerException) {
                throw a(null);
              } 
              return z_1.Zv;
            } 
          } catch (NullPointerException nullPointerException) {
            throw a(null);
          } 
        } else {
          if (arrayOfZbqc == null)
            continue label36; 
          continue;
        } 
        ZH(new Zl(this, zc1, i));
        return z_1.Zv;
      } 
      break;
    } 
  }
  
  public V remove(Object paramObject) {
    Zc<K, V> zc = this.Zi.remove(paramObject);
    try {
      if (zc == null)
        return null; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    Zi(zc);
    ZH(new Zo(this, zc));
    return zc.ZF();
  }
  
  public boolean remove(Object paramObject1, Object paramObject2) {
    Zc<K, V> zc = this.Zi.get(paramObject1);
    Zbqc[] arrayOfZbqc = ZE();
    try {
      if (zc != null)
        try {
          if (paramObject2 != null) {
            Z_<V> z_ = zc.get();
            while (z_.ZX(paramObject2)) {
              try {
                if (Zj(zc, z_)) {
                  try {
                    if (this.Zi.remove(paramObject1, zc)) {
                      ZH(new Zo(this, zc));
                      return true;
                    } 
                  } catch (NullPointerException nullPointerException) {
                    throw a(null);
                  } 
                  break;
                } 
              } catch (NullPointerException nullPointerException) {
                throw a(null);
              } 
              z_ = zc.get();
              try {
                if (!z_.ZX() || arrayOfZbqc == null)
                  break; 
              } catch (NullPointerException nullPointerException) {
                throw a(null);
              } 
            } 
            return false;
          } 
          return false;
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        }  
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  public V replace(K paramK, V paramV) {
    // Byte code:
    //   0: invokestatic ZE : ()[Lburp/Zbqc;
    //   3: aload_1
    //   4: invokestatic Z_ : (Ljava/lang/Object;)V
    //   7: aload_2
    //   8: invokestatic Z_ : (Ljava/lang/Object;)V
    //   11: iconst_1
    //   12: istore #4
    //   14: astore_3
    //   15: new com/fasterxml/Zy/Z_
    //   18: dup
    //   19: aload_2
    //   20: iconst_1
    //   21: invokespecial <init> : (Ljava/lang/Object;I)V
    //   24: astore #5
    //   26: aload_0
    //   27: getfield Zi : Ljava/util/concurrent/ConcurrentMap;
    //   30: aload_1
    //   31: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   36: checkcast com/fasterxml/Zy/Zc
    //   39: astore #6
    //   41: aload #6
    //   43: ifnonnull -> 52
    //   46: aconst_null
    //   47: areturn
    //   48: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   51: athrow
    //   52: aload #6
    //   54: invokevirtual get : ()Ljava/lang/Object;
    //   57: checkcast com/fasterxml/Zy/Z_
    //   60: astore #7
    //   62: aload #7
    //   64: invokevirtual ZX : ()Z
    //   67: ifne -> 76
    //   70: aconst_null
    //   71: areturn
    //   72: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   75: athrow
    //   76: aload #6
    //   78: aload #7
    //   80: aload #5
    //   82: invokevirtual compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   85: ifeq -> 148
    //   88: iconst_1
    //   89: aload #7
    //   91: getfield ZK : I
    //   94: isub
    //   95: istore #8
    //   97: iload #8
    //   99: ifne -> 119
    //   102: aload_0
    //   103: aload #6
    //   105: invokevirtual Ze : (Lcom/fasterxml/Zy/Zc;)V
    //   108: aload_3
    //   109: ifnonnull -> 142
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   118: athrow
    //   119: aload_0
    //   120: new com/fasterxml/Zy/Zl
    //   123: dup
    //   124: aload_0
    //   125: aload #6
    //   127: iload #8
    //   129: invokespecial <init> : (Lcom/fasterxml/Zy/Zr;Lcom/fasterxml/Zy/Zc;I)V
    //   132: invokevirtual ZH : (Ljava/lang/Runnable;)V
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   141: athrow
    //   142: aload #7
    //   144: getfield Zv : Ljava/lang/Object;
    //   147: areturn
    //   148: goto -> 52
    // Exception table:
    //   from	to	target	type
    //   41	48	48	java/lang/NullPointerException
    //   62	72	72	java/lang/NullPointerException
    //   97	112	115	java/lang/NullPointerException
    //   102	135	138	java/lang/NullPointerException
  }
  
  public boolean replace(K paramK, V paramV1, V paramV2) {
    // Byte code:
    //   0: invokestatic ZE : ()[Lburp/Zbqc;
    //   3: aload_1
    //   4: invokestatic Z_ : (Ljava/lang/Object;)V
    //   7: astore #4
    //   9: aload_2
    //   10: invokestatic Z_ : (Ljava/lang/Object;)V
    //   13: aload_3
    //   14: invokestatic Z_ : (Ljava/lang/Object;)V
    //   17: iconst_1
    //   18: istore #5
    //   20: new com/fasterxml/Zy/Z_
    //   23: dup
    //   24: aload_3
    //   25: iconst_1
    //   26: invokespecial <init> : (Ljava/lang/Object;I)V
    //   29: astore #6
    //   31: aload_0
    //   32: getfield Zi : Ljava/util/concurrent/ConcurrentMap;
    //   35: aload_1
    //   36: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   41: checkcast com/fasterxml/Zy/Zc
    //   44: astore #7
    //   46: aload #7
    //   48: ifnonnull -> 57
    //   51: iconst_0
    //   52: ireturn
    //   53: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   56: athrow
    //   57: aload #7
    //   59: invokevirtual get : ()Ljava/lang/Object;
    //   62: checkcast com/fasterxml/Zy/Z_
    //   65: astore #8
    //   67: aload #8
    //   69: invokevirtual ZX : ()Z
    //   72: ifeq -> 91
    //   75: aload #8
    //   77: aload_2
    //   78: invokevirtual ZX : (Ljava/lang/Object;)Z
    //   81: ifne -> 97
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   90: athrow
    //   91: iconst_0
    //   92: ireturn
    //   93: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   96: athrow
    //   97: aload #7
    //   99: aload #8
    //   101: aload #6
    //   103: invokevirtual compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   106: ifeq -> 166
    //   109: iconst_1
    //   110: aload #8
    //   112: getfield ZK : I
    //   115: isub
    //   116: istore #9
    //   118: iload #9
    //   120: ifne -> 141
    //   123: aload_0
    //   124: aload #7
    //   126: invokevirtual Ze : (Lcom/fasterxml/Zy/Zc;)V
    //   129: aload #4
    //   131: ifnonnull -> 164
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   140: athrow
    //   141: aload_0
    //   142: new com/fasterxml/Zy/Zl
    //   145: dup
    //   146: aload_0
    //   147: aload #7
    //   149: iload #9
    //   151: invokespecial <init> : (Lcom/fasterxml/Zy/Zr;Lcom/fasterxml/Zy/Zc;I)V
    //   154: invokevirtual ZH : (Ljava/lang/Runnable;)V
    //   157: goto -> 164
    //   160: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   163: athrow
    //   164: iconst_1
    //   165: ireturn
    //   166: goto -> 57
    // Exception table:
    //   from	to	target	type
    //   46	53	53	java/lang/NullPointerException
    //   67	84	87	java/lang/NullPointerException
    //   75	93	93	java/lang/NullPointerException
    //   118	134	137	java/lang/NullPointerException
    //   123	157	160	java/lang/NullPointerException
  }
  
  public Set<K> keySet() {
    Set<K> set = this.ZC;
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return (set == null) ? (this.ZC = new Zh(this)) : set;
  }
  
  public Collection<V> values() {
    Collection<V> collection = this.ZD;
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return (collection == null) ? (this.ZD = new Zm(this)) : collection;
  }
  
  public Set<Map.Entry<K, V>> entrySet() {
    Set<Map.Entry<K, V>> set = this.Zn;
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return (set == null) ? (this.Zn = new Zp(this)) : set;
  }
  
  Object writeReplace() {
    return new Zg<>(this);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) throws InvalidObjectException {
    throw new InvalidObjectException(a);
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZE : ()[Lburp/Zbqc;
    //   3: ifnonnull -> 13
    //   6: iconst_3
    //   7: anewarray burp/Zbqc
    //   10: invokestatic ZC : ([Lburp/Zbqc;)V
    //   13: bipush #70
    //   15: ldc '\\b#h|6y= ywso'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic com/fasterxml/Zy/Zr.a : Ljava/lang/String;
    //   24: goto -> 166
    //   27: dup_x2
    //   28: pop
    //   29: invokevirtual toCharArray : ()[C
    //   32: dup_x1
    //   33: arraylength
    //   34: dup_x2
    //   35: pop
    //   36: iconst_0
    //   37: istore_0
    //   38: dup2_x1
    //   39: pop2
    //   40: dup_x2
    //   41: iconst_1
    //   42: if_icmpgt -> 140
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #30
    //   94: goto -> 124
    //   97: bipush #23
    //   99: goto -> 124
    //   102: bipush #43
    //   104: goto -> 124
    //   107: bipush #86
    //   109: goto -> 124
    //   112: bipush #67
    //   114: goto -> 124
    //   117: bipush #80
    //   119: goto -> 124
    //   122: bipush #77
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 48
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 45
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 21
    //   166: invokestatic getRuntime : ()Ljava/lang/Runtime;
    //   169: invokevirtual availableProcessors : ()I
    //   172: putstatic com/fasterxml/Zy/Zr.ZP : I
    //   175: iconst_4
    //   176: getstatic com/fasterxml/Zy/Zr.ZP : I
    //   179: invokestatic Z_ : (I)I
    //   182: invokestatic min : (II)I
    //   185: putstatic com/fasterxml/Zy/Zr.ZU : I
    //   188: getstatic com/fasterxml/Zy/Zr.ZU : I
    //   191: iconst_1
    //   192: isub
    //   193: putstatic com/fasterxml/Zy/Zr.Zb : I
    //   196: return
  }
  
  public static void ZC(Zbqc[] paramArrayOfZbqc) {
    Zv = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZE() {
    return Zv;
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zy\Zr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */