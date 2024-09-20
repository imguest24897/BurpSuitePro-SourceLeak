package com.fasterxml.Zz;

abstract class Ze {
  static final byte[] Zd;
  
  private static final String a;
  
  protected static char ZM(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramInt1 < paramInt2) ? paramArrayOfchar[paramInt1] : Character.MIN_VALUE;
  }
  
  protected static char Ze(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramInt1 < paramInt2) ? paramCharSequence.charAt(paramInt1) : Character.MIN_VALUE;
  }
  
  protected static int Ze(char paramChar) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramChar < '') ? Zd[paramChar] : -1;
  }
  
  protected static int ZP(int paramInt1, int paramInt2, int paramInt3) {
    try {
      if ((paramInt2 | paramInt3 | paramInt1 - paramInt3 - paramInt2) < 0)
        throw new IllegalArgumentException(a); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return paramInt3 + paramInt2;
  }
  
  static {
    // Byte code:
    //   0: bipush #77
    //   2: ldc '|C\\r@9 /[3&@T(<-G.z[vK\\fG4'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zz/Ze.a : Ljava/lang/String;
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
    //   80: bipush #94
    //   82: goto -> 112
    //   85: bipush #104
    //   87: goto -> 112
    //   90: bipush #38
    //   92: goto -> 112
    //   95: bipush #126
    //   97: goto -> 112
    //   100: bipush #17
    //   102: goto -> 112
    //   105: bipush #25
    //   107: goto -> 112
    //   110: bipush #122
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
    //   154: sipush #256
    //   157: newarray byte
    //   159: putstatic com/fasterxml/Zz/Ze.Zd : [B
    //   162: getstatic com/fasterxml/Zz/Ze.Zd : [B
    //   165: iconst_m1
    //   166: invokestatic fill : ([BB)V
    //   169: bipush #48
    //   171: istore_1
    //   172: iload_1
    //   173: bipush #57
    //   175: if_icmpgt -> 196
    //   178: getstatic com/fasterxml/Zz/Ze.Zd : [B
    //   181: iload_1
    //   182: iload_1
    //   183: bipush #48
    //   185: isub
    //   186: i2b
    //   187: bastore
    //   188: iload_1
    //   189: iconst_1
    //   190: iadd
    //   191: i2c
    //   192: istore_1
    //   193: goto -> 172
    //   196: bipush #65
    //   198: istore_1
    //   199: iload_1
    //   200: bipush #70
    //   202: if_icmpgt -> 226
    //   205: getstatic com/fasterxml/Zz/Ze.Zd : [B
    //   208: iload_1
    //   209: iload_1
    //   210: bipush #65
    //   212: isub
    //   213: bipush #10
    //   215: iadd
    //   216: i2b
    //   217: bastore
    //   218: iload_1
    //   219: iconst_1
    //   220: iadd
    //   221: i2c
    //   222: istore_1
    //   223: goto -> 199
    //   226: bipush #97
    //   228: istore_1
    //   229: iload_1
    //   230: bipush #102
    //   232: if_icmpgt -> 256
    //   235: getstatic com/fasterxml/Zz/Ze.Zd : [B
    //   238: iload_1
    //   239: iload_1
    //   240: bipush #97
    //   242: isub
    //   243: bipush #10
    //   245: iadd
    //   246: i2b
    //   247: bastore
    //   248: iload_1
    //   249: iconst_1
    //   250: iadd
    //   251: i2c
    //   252: istore_1
    //   253: goto -> 229
    //   256: getstatic com/fasterxml/Zz/Ze.Zd : [B
    //   259: bipush #46
    //   261: bipush #-4
    //   263: bastore
    //   264: return
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zz\Ze.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */