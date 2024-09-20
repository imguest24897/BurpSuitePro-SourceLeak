package burp;

public interface Zmfi extends Zk5_, Zgpi<Zmfi> {
  public static final Zeu4<Zmfi> ZC;
  
  public static final String[] Zl;
  
  Zt8g Zla();
  
  byte ZlJ();
  
  void ZR(byte paramByte);
  
  String ZlX();
  
  void ZVe(String paramString);
  
  int ZlN();
  
  void Zur(int paramInt);
  
  void Zw(int paramInt1, int paramInt2);
  
  Zlwx ZlS();
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'lDF^8'JRW^>.LR}RQ>b_ELh0PXQ^:1IXM\\r-'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #16
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #122
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
    //   101: tableswitch default -> 169, 0 -> 140, 1 -> 145, 2 -> 150, 3 -> 155, 4 -> 159, 5 -> 164
    //   140: bipush #67
    //   142: goto -> 171
    //   145: bipush #77
    //   147: goto -> 171
    //   150: bipush #89
    //   152: goto -> 171
    //   155: iconst_4
    //   156: goto -> 171
    //   159: bipush #50
    //   161: goto -> 171
    //   164: bipush #9
    //   166: goto -> 171
    //   169: bipush #56
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
    //   214: new burp/Zk48
    //   217: dup
    //   218: invokespecial <init> : ()V
    //   221: putstatic burp/Zmfi.ZC : Lburp/Zeu4;
    //   224: iconst_2
    //   225: anewarray java/lang/String
    //   228: dup
    //   229: iconst_0
    //   230: aload_0
    //   231: iconst_1
    //   232: aaload
    //   233: aastore
    //   234: dup
    //   235: iconst_1
    //   236: aload_0
    //   237: iconst_0
    //   238: aaload
    //   239: aastore
    //   240: putstatic burp/Zmfi.Zl : [Ljava/lang/String;
    //   243: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmfi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */