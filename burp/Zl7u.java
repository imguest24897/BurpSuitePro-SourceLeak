package burp;

import java.io.IOException;

class Zl7u implements Zr1u {
  private final Ztbb ZI;
  
  private final Zgzx Zg;
  
  private final Zxtv Z_;
  
  private final Zmjb ZJ;
  
  private final Zmoe Zn;
  
  private static final String a;
  
  Zl7u(Ztbb paramZtbb, Zgzx paramZgzx, Zxtv paramZxtv, Zxdt paramZxdt, Zrps paramZrps) {
    this.ZI = paramZtbb;
    this.Zg = paramZgzx;
    this.Z_ = paramZxtv;
    this.ZJ = new Zmjb(paramZxdt, paramZgzx);
    boolean bool = Zmjb.ZG();
    try {
      this.Zn = new Zmoe(paramZxdt, paramZrps, paramZxtv.ZL());
      if (Zbqc.Zwu() == null) {
        try {
        
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        Zmjb.Zb(!bool);
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public Zlvr Zm(Zmzk paramZmzk) throws IOException {
    try {
      if (this.Z_.ZE())
        try {
          if (!this.Z_.ZK())
            return null; 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (Zr(paramZmzk)) {
      Zlvr zlvr = this.Zn.Zm(paramZmzk);
      try {
        if (zlvr != null)
          return zlvr; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (!ZL())
          try {
            if (this.Z_.ZL().ZZ())
              try {
                if (!this.Z_.ZL().Zk())
                  throw new Zx0m(); 
              } catch (IOException iOException) {
                throw a(null);
              }  
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    if (ZL()) {
      Zlvr zlvr = this.ZJ.Zm(paramZmzk);
      try {
        if (zlvr == null)
          try {
            if (this.Zg.ZL())
              try {
                if (!this.Zg.ZW())
                  throw new Zx0m(); 
              } catch (IOException iOException) {
                throw a(null);
              }  
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
      return zlvr;
    } 
    return null;
  }
  
  private boolean ZL() {
    try {
      if (this.Z_.ZH())
        try {
          if (this.Zg.Zi());
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  private boolean Zr(Zmzk paramZmzk) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface ZJZ : ()Z
    //   6: ifeq -> 52
    //   9: aload_0
    //   10: getfield Z_ : Lburp/Zxtv;
    //   13: invokevirtual Zh : ()Z
    //   16: ifeq -> 52
    //   19: goto -> 26
    //   22: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   25: athrow
    //   26: aload_0
    //   27: getfield ZI : Lburp/Ztbb;
    //   30: aload_1
    //   31: invokevirtual ZQ : (Lburp/Zmzk;)Z
    //   34: ifne -> 52
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   43: athrow
    //   44: iconst_1
    //   45: goto -> 53
    //   48: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   51: athrow
    //   52: iconst_0
    //   53: istore_2
    //   54: aload_0
    //   55: getfield Z_ : Lburp/Zxtv;
    //   58: invokevirtual ZE : ()Z
    //   61: ifeq -> 118
    //   64: aload_0
    //   65: getfield Z_ : Lburp/Zxtv;
    //   68: invokevirtual ZK : ()Z
    //   71: ifeq -> 118
    //   74: goto -> 81
    //   77: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   80: athrow
    //   81: aload_0
    //   82: getfield Z_ : Lburp/Zxtv;
    //   85: invokevirtual ZL : ()Lburp/Zly6;
    //   88: invokeinterface ZZ : ()Z
    //   93: ifne -> 118
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   102: athrow
    //   103: new java/lang/IllegalStateException
    //   106: dup
    //   107: getstatic burp/Zl7u.a : Ljava/lang/String;
    //   110: invokespecial <init> : (Ljava/lang/String;)V
    //   113: athrow
    //   114: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   117: athrow
    //   118: iload_2
    //   119: ifeq -> 147
    //   122: aload_0
    //   123: getfield Z_ : Lburp/Zxtv;
    //   126: invokevirtual ZK : ()Z
    //   129: ifeq -> 147
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   138: athrow
    //   139: iconst_1
    //   140: goto -> 148
    //   143: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   146: athrow
    //   147: iconst_0
    //   148: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	19	22	java/lang/IllegalStateException
    //   9	37	40	java/lang/IllegalStateException
    //   26	48	48	java/lang/IllegalStateException
    //   54	74	77	java/lang/IllegalStateException
    //   64	96	99	java/lang/IllegalStateException
    //   81	114	114	java/lang/IllegalStateException
    //   118	132	135	java/lang/IllegalStateException
    //   122	143	143	java/lang/IllegalStateException
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #113
    //   2: ldc 's1&t(jE#hk3%\5h}38S5hS\\b`Xhx3$^5\\t<r3$'<s3?Dp=k,&I9/;=jS?&~?>Y?hr8/^$.r98'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zl7u.a : Ljava/lang/String;
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
    //   80: bipush #65
    //   82: goto -> 112
    //   85: bipush #33
    //   87: goto -> 112
    //   90: bipush #27
    //   92: goto -> 112
    //   95: bipush #57
    //   97: goto -> 112
    //   100: bipush #106
    //   102: goto -> 112
    //   105: bipush #45
    //   107: goto -> 112
    //   110: bipush #59
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl7u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */