package burp;

class Zg5m implements Zelp {
  private static final Zyf Zd;
  
  private static final Zyf ZF;
  
  private final Zk94 Zy;
  
  public Zg5m(Zk94 paramZk94) {
    this.Zy = paramZk94;
  }
  
  public Zstu ZJ() {
    return this.Zy.ZZX();
  }
  
  public Zstu ZR() {
    return this.Zy.ZZZ();
  }
  
  public boolean ZP() {
    return ZO(Zd);
  }
  
  public boolean ZS() {
    return ZO(ZF);
  }
  
  public String Zc() {
    return this.Zy.ZZ1();
  }
  
  private boolean ZO(Zstu paramZstu) {
    return (Zlt_.ZR(ZJ(), paramZstu, false) == 0);
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'K^p#|hpIt#K_o/w'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #12
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #16
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 70
    //   39: aload_0
    //   40: swap
    //   41: iload #4
    //   43: iinc #4, 1
    //   46: swap
    //   47: aastore
    //   48: iload_1
    //   49: iload_2
    //   50: iadd
    //   51: dup
    //   52: istore_1
    //   53: iload #5
    //   55: if_icmpge -> 67
    //   58: aload_3
    //   59: iload_1
    //   60: invokevirtual charAt : (I)C
    //   63: istore_2
    //   64: goto -> 22
    //   67: goto -> 214
    //   70: dup_x2
    //   71: pop
    //   72: invokevirtual toCharArray : ()[C
    //   75: dup_x1
    //   76: arraylength
    //   77: dup_x2
    //   78: pop
    //   79: iconst_0
    //   80: istore #6
    //   82: dup2_x1
    //   83: pop2
    //   84: dup_x2
    //   85: iconst_1
    //   86: if_icmpgt -> 187
    //   89: dup2
    //   90: swap
    //   91: iload #6
    //   93: dup2_x1
    //   94: caload
    //   95: swap
    //   96: iload #6
    //   98: bipush #7
    //   100: irem
    //   101: tableswitch default -> 169, 0 -> 140, 1 -> 145, 2 -> 150, 3 -> 155, 4 -> 160, 5 -> 165
    //   140: bipush #85
    //   142: goto -> 171
    //   145: bipush #52
    //   147: goto -> 171
    //   150: bipush #32
    //   152: goto -> 171
    //   155: bipush #20
    //   157: goto -> 171
    //   160: bipush #86
    //   162: goto -> 171
    //   165: iconst_2
    //   166: goto -> 171
    //   169: bipush #122
    //   171: ixor
    //   172: ixor
    //   173: i2c
    //   174: castore
    //   175: iinc #6, 1
    //   178: dup
    //   179: ifne -> 187
    //   182: dup2
    //   183: dup_x1
    //   184: goto -> 93
    //   187: dup2_x1
    //   188: pop2
    //   189: dup_x2
    //   190: iload #6
    //   192: if_icmpgt -> 89
    //   195: pop
    //   196: new java/lang/String
    //   199: dup_x1
    //   200: swap
    //   201: invokespecial <init> : ([C)V
    //   204: invokevirtual intern : ()Ljava/lang/String;
    //   207: swap
    //   208: pop
    //   209: swap
    //   210: pop
    //   211: goto -> 39
    //   214: aload_0
    //   215: iconst_1
    //   216: aaload
    //   217: invokestatic Za : (Ljava/lang/String;)Lburp/Zyf;
    //   220: putstatic burp/Zg5m.Zd : Lburp/Zyf;
    //   223: aload_0
    //   224: iconst_0
    //   225: aaload
    //   226: invokestatic Za : (Ljava/lang/String;)Lburp/Zyf;
    //   229: putstatic burp/Zg5m.ZF : Lburp/Zyf;
    //   232: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg5m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */