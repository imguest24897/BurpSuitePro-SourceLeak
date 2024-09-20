package burp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zgz9 implements Zz3m {
  private final Object Zg = new Object();
  
  private final Zefg<Zvo1> ZA;
  
  private final Map<Zvo1, Zswn> Zj = new HashMap<>();
  
  private final Zlx1 ZY;
  
  private static final String a;
  
  public Zgz9(Zs0m paramZs0m) {
    try {
      Zuh.Zv((paramZs0m != null), Zqf.Zv, 2L);
      this.ZY = paramZs0m;
      this.ZA = paramZs0m.Zqd();
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Zuh.Zb((this.ZA != null), Zqf.Zx);
  }
  
  public void ZC(Zvo1 paramZvo1) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zg : Ljava/lang/Object;
    //   4: dup
    //   5: astore_2
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield ZY : Lburp/Zlx1;
    //   11: invokeinterface ZGS : ()I
    //   16: istore_3
    //   17: iinc #3, 1
    //   20: aload_0
    //   21: getfield ZY : Lburp/Zlx1;
    //   24: iload_3
    //   25: invokeinterface ZXs : (I)V
    //   30: aload_0
    //   31: getfield ZA : Lburp/Zefg;
    //   34: invokeinterface size : ()I
    //   39: istore #4
    //   41: iload_3
    //   42: iflt -> 66
    //   45: iload_3
    //   46: iload #4
    //   48: if_icmpgt -> 66
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   57: athrow
    //   58: iconst_1
    //   59: goto -> 67
    //   62: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   65: athrow
    //   66: iconst_0
    //   67: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   70: iload_3
    //   71: i2l
    //   72: iload #4
    //   74: i2l
    //   75: invokestatic ZC : (ZLnet/portswigger/Zqf;JJ)V
    //   78: aload_0
    //   79: getfield ZA : Lburp/Zefg;
    //   82: iload_3
    //   83: aload_1
    //   84: invokeinterface add : (ILjava/lang/Object;)V
    //   89: aload_2
    //   90: monitorexit
    //   91: goto -> 101
    //   94: astore #5
    //   96: aload_2
    //   97: monitorexit
    //   98: aload #5
    //   100: athrow
    //   101: return
    // Exception table:
    //   from	to	target	type
    //   7	91	94	finally
    //   41	51	54	java/lang/IllegalStateException
    //   45	62	62	java/lang/IllegalStateException
    //   94	98	94	finally
  }
  
  public Zvo1 Zs() {
    synchronized (this.Zg) {
      int i = this.ZY.ZGS();
      if (i == -1)
        return null; 
      int j = this.ZA.size();
      try {
        if (i >= 0)
          try {
            if (i < j);
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          }  
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      Zuh.ZC(false, Zqf.Zr, i, j);
      return this.ZA.get(i);
    } 
  }
  
  public boolean Zz() {
    synchronized (this.Zg) {
      return (this.ZY.ZGS() > 0);
    } 
  }
  
  public boolean ZH() {
    synchronized (this.Zg) {
      return (this.ZY.ZGS() + 1 < this.ZA.size());
    } 
  }
  
  public Zvo1 ZE(int paramInt) {
    synchronized (this.Zg) {
      int i = this.ZY.ZGS();
      try {
        if (i <= paramInt - 1)
          throw new IllegalStateException(); 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      this.ZY.ZXs(i - paramInt);
      return Zs();
    } 
  }
  
  public Zvo1 ZK(int paramInt) {
    synchronized (this.Zg) {
      int i = this.ZY.ZGS();
      try {
        if (i + paramInt >= this.ZA.size())
          throw new IllegalStateException(); 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      this.ZY.ZXs(i + paramInt);
      return Zs();
    } 
  }
  
  public void Zv(Zvo1 paramZvo1) {
    synchronized (this.Zg) {
      int i = Arrays.<Zvo1>asList(ZP()).indexOf(paramZvo1);
      try {
        if (i < this.ZA.size())
          try {
            if (i != -1) {
              this.ZY.ZXs(i);
              return;
            } 
            throw new IllegalStateException();
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          }  
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      throw new IllegalStateException();
    } 
  }
  
  public int Z_() {
    synchronized (this.Zg) {
      return this.ZA.size();
    } 
  }
  
  public Zvo1[] ZP() {
    Zvo1[] arrayOfZvo1;
    synchronized (this.Zg) {
      arrayOfZvo1 = new Zvo1[this.ZA.size()];
      this.ZA.toArray((Object[])arrayOfZvo1);
    } 
    return arrayOfZvo1;
  }
  
  public void Zk(Zg9m paramZg9m, Zswn paramZswn) {
    synchronized (this.Zj) {
      this.Zj.put(paramZg9m, paramZswn);
    } 
  }
  
  public boolean Zp(Zvo1 paramZvo1) {
    try {
      if (!paramZvo1.ZoZ())
        return false; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    synchronized (this.Zj) {
      return (this.Zj.get(paramZvo1) != null);
    } 
  }
  
  public Zswn Zr(Zg9m paramZg9m) {
    synchronized (this.Zj) {
      return this.Zj.get(paramZg9m);
    } 
  }
  
  public void Ze(Zg9m paramZg9m) {
    Zswn zswn = Zr(paramZg9m);
    try {
      if (zswn == null)
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    zswn.Ze();
    synchronized (this.Zj) {
      this.Zj.remove(paramZg9m);
    } 
  }
  
  public List<String> Zb() {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic ZC : ()[Lburp/Zbqc;
    //   11: aload_0
    //   12: getfield Zg : Ljava/lang/Object;
    //   15: dup
    //   16: astore_3
    //   17: monitorenter
    //   18: astore_1
    //   19: aload_0
    //   20: getfield ZY : Lburp/Zlx1;
    //   23: invokeinterface ZGS : ()I
    //   28: istore #4
    //   30: iconst_0
    //   31: iload #4
    //   33: bipush #20
    //   35: isub
    //   36: invokestatic max : (II)I
    //   39: istore #5
    //   41: iload #4
    //   43: iconst_1
    //   44: isub
    //   45: istore #6
    //   47: iload #6
    //   49: iload #5
    //   51: if_icmplt -> 74
    //   54: aload_2
    //   55: aload_0
    //   56: iload #6
    //   58: invokevirtual Zd : (I)Ljava/lang/String;
    //   61: invokeinterface add : (Ljava/lang/Object;)Z
    //   66: pop
    //   67: iinc #6, -1
    //   70: aload_1
    //   71: ifnonnull -> 47
    //   74: aload_3
    //   75: monitorexit
    //   76: goto -> 86
    //   79: astore #7
    //   81: aload_3
    //   82: monitorexit
    //   83: aload #7
    //   85: athrow
    //   86: aload_2
    //   87: areturn
    // Exception table:
    //   from	to	target	type
    //   19	76	79	finally
    //   79	83	79	finally
  }
  
  public List<String> ZX() {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic ZC : ()[Lburp/Zbqc;
    //   11: aload_0
    //   12: getfield Zg : Ljava/lang/Object;
    //   15: dup
    //   16: astore_3
    //   17: monitorenter
    //   18: astore_1
    //   19: aload_0
    //   20: getfield ZY : Lburp/Zlx1;
    //   23: invokeinterface ZGS : ()I
    //   28: istore #4
    //   30: aload_0
    //   31: getfield ZA : Lburp/Zefg;
    //   34: invokeinterface size : ()I
    //   39: iload #4
    //   41: iconst_1
    //   42: iadd
    //   43: bipush #20
    //   45: iadd
    //   46: invokestatic min : (II)I
    //   49: istore #5
    //   51: iload #4
    //   53: iconst_1
    //   54: iadd
    //   55: istore #6
    //   57: iload #6
    //   59: iload #5
    //   61: if_icmpge -> 84
    //   64: aload_2
    //   65: aload_0
    //   66: iload #6
    //   68: invokevirtual Zd : (I)Ljava/lang/String;
    //   71: invokeinterface add : (Ljava/lang/Object;)Z
    //   76: pop
    //   77: iinc #6, 1
    //   80: aload_1
    //   81: ifnonnull -> 57
    //   84: aload_3
    //   85: monitorexit
    //   86: goto -> 96
    //   89: astore #7
    //   91: aload_3
    //   92: monitorexit
    //   93: aload #7
    //   95: athrow
    //   96: aload_2
    //   97: areturn
    // Exception table:
    //   from	to	target	type
    //   19	86	89	finally
    //   89	93	89	finally
  }
  
  private String Zd(int paramInt) {
    synchronized (this.Zg) {
      return String.format(a, new Object[] { Integer.valueOf(paramInt + 1), ((Zvo1)this.ZA.get(paramInt)).ZlL().toString() });
    } 
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: bipush #125
    //   2: ldc 'hW(,s>'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zgz9.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #48
    //   82: goto -> 112
    //   85: bipush #78
    //   87: goto -> 112
    //   90: bipush #123
    //   92: goto -> 112
    //   95: bipush #113
    //   97: goto -> 112
    //   100: bipush #43
    //   102: goto -> 112
    //   105: bipush #48
    //   107: goto -> 112
    //   110: bipush #55
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgz9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */