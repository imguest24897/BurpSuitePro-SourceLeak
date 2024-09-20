package com.fasterxml.Zz;

class Zbq {
  private static final float[] Zl = new float[] { 
      1.0F, 10.0F, 100.0F, 1000.0F, 10000.0F, 100000.0F, 1000000.0F, 1.0E7F, 1.0E8F, 1.0E9F, 
      1.0E10F };
  
  static float Zv(boolean paramBoolean1, long paramLong, int paramInt1, boolean paramBoolean2, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZA : ()[Lburp/Zbqc;
    //   3: astore #6
    //   5: lload_1
    //   6: lconst_0
    //   7: lcmp
    //   8: ifne -> 22
    //   11: iload_0
    //   12: ifeq -> 20
    //   15: ldc -0.0
    //   17: goto -> 21
    //   20: fconst_0
    //   21: freturn
    //   22: iload #4
    //   24: ifeq -> 89
    //   27: bipush #-45
    //   29: iload #5
    //   31: if_icmpgt -> 80
    //   34: iload #5
    //   36: bipush #38
    //   38: if_icmpgt -> 80
    //   41: iload_0
    //   42: lload_1
    //   43: iload #5
    //   45: invokestatic ZL : (ZJI)F
    //   48: fstore #8
    //   50: iload_0
    //   51: lload_1
    //   52: lconst_1
    //   53: ladd
    //   54: iload #5
    //   56: invokestatic ZL : (ZJI)F
    //   59: fstore #9
    //   61: fload #8
    //   63: invokestatic isNaN : (F)Z
    //   66: ifne -> 80
    //   69: fload #9
    //   71: fload #8
    //   73: fcmpl
    //   74: ifne -> 80
    //   77: fload #8
    //   79: freturn
    //   80: ldc NaN
    //   82: fstore #7
    //   84: aload #6
    //   86: ifnull -> 118
    //   89: bipush #-45
    //   91: iload_3
    //   92: if_icmpgt -> 114
    //   95: iload_3
    //   96: bipush #38
    //   98: if_icmpgt -> 114
    //   101: iload_0
    //   102: lload_1
    //   103: iload_3
    //   104: invokestatic ZL : (ZJI)F
    //   107: fstore #7
    //   109: aload #6
    //   111: ifnull -> 118
    //   114: ldc NaN
    //   116: fstore #7
    //   118: fload #7
    //   120: freturn
  }
  
  static float ZZ(boolean paramBoolean1, long paramLong, int paramInt1, boolean paramBoolean2, int paramInt2) {
    int i = paramBoolean2 ? paramInt2 : paramInt1;
    if (-126 <= i && i <= 127) {
      float f = (float)paramLong + ((paramLong < 0L) ? 1.8446744E19F : 0.0F);
      f = Zr(f, i);
      return paramBoolean1 ? -f : f;
    } 
    return Float.NaN;
  }
  
  static float ZL(boolean paramBoolean, long paramLong, int paramInt) {
    // Byte code:
    //   0: invokestatic ZA : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: bipush #-10
    //   7: iload_3
    //   8: if_icmpgt -> 74
    //   11: iload_3
    //   12: bipush #10
    //   14: if_icmpgt -> 74
    //   17: lload_1
    //   18: ldc2_w 16777215
    //   21: invokestatic compareUnsigned : (JJ)I
    //   24: ifgt -> 74
    //   27: lload_1
    //   28: l2f
    //   29: fstore #5
    //   31: iload_3
    //   32: ifge -> 51
    //   35: fload #5
    //   37: getstatic com/fasterxml/Zz/Zbq.Zl : [F
    //   40: iload_3
    //   41: ineg
    //   42: faload
    //   43: fdiv
    //   44: fstore #5
    //   46: aload #4
    //   48: ifnull -> 61
    //   51: fload #5
    //   53: getstatic com/fasterxml/Zz/Zbq.Zl : [F
    //   56: iload_3
    //   57: faload
    //   58: fmul
    //   59: fstore #5
    //   61: iload_0
    //   62: ifeq -> 71
    //   65: fload #5
    //   67: fneg
    //   68: goto -> 73
    //   71: fload #5
    //   73: freturn
    //   74: getstatic com/fasterxml/Zz/Zq.Zm : [J
    //   77: iload_3
    //   78: sipush #-325
    //   81: isub
    //   82: laload
    //   83: lstore #5
    //   85: ldc2_w 217706
    //   88: iload_3
    //   89: i2l
    //   90: lmul
    //   91: bipush #16
    //   93: lshr
    //   94: ldc2_w 127
    //   97: ladd
    //   98: ldc2_w 64
    //   101: ladd
    //   102: lstore #7
    //   104: lload_1
    //   105: invokestatic numberOfLeadingZeros : (J)I
    //   108: istore #9
    //   110: lload_1
    //   111: iload #9
    //   113: lshl
    //   114: lstore #10
    //   116: lload #10
    //   118: lload #5
    //   120: invokestatic ZV : (JJ)J
    //   123: lstore #12
    //   125: lload #12
    //   127: bipush #63
    //   129: lushr
    //   130: lstore #14
    //   132: lload #12
    //   134: lload #14
    //   136: ldc2_w 38
    //   139: ladd
    //   140: l2i
    //   141: lushr
    //   142: lstore #16
    //   144: iload #9
    //   146: lconst_1
    //   147: lload #14
    //   149: lxor
    //   150: l2i
    //   151: iadd
    //   152: istore #9
    //   154: lload #12
    //   156: ldc2_w 274877906943
    //   159: land
    //   160: ldc2_w 274877906943
    //   163: lcmp
    //   164: ifeq -> 189
    //   167: lload #12
    //   169: ldc2_w 274877906943
    //   172: land
    //   173: lconst_0
    //   174: lcmp
    //   175: ifne -> 192
    //   178: lload #16
    //   180: ldc2_w 3
    //   183: land
    //   184: lconst_1
    //   185: lcmp
    //   186: ifne -> 192
    //   189: ldc NaN
    //   191: freturn
    //   192: lload #16
    //   194: lconst_1
    //   195: ladd
    //   196: lstore #16
    //   198: lload #16
    //   200: iconst_1
    //   201: lushr
    //   202: lstore #16
    //   204: lload #16
    //   206: ldc2_w 16777216
    //   209: lcmp
    //   210: iflt -> 221
    //   213: ldc2_w 8388608
    //   216: lstore #16
    //   218: iinc #9, -1
    //   221: lload #16
    //   223: ldc2_w -8388609
    //   226: land
    //   227: lstore #16
    //   229: lload #7
    //   231: iload #9
    //   233: i2l
    //   234: lsub
    //   235: lstore #18
    //   237: lload #18
    //   239: lconst_1
    //   240: lcmp
    //   241: iflt -> 253
    //   244: lload #18
    //   246: ldc2_w 254
    //   249: lcmp
    //   250: ifle -> 256
    //   253: ldc NaN
    //   255: freturn
    //   256: lload #16
    //   258: lload #18
    //   260: bipush #23
    //   262: lshl
    //   263: lor
    //   264: iload_0
    //   265: ifeq -> 274
    //   268: ldc2_w 2147483648
    //   271: goto -> 275
    //   274: lconst_0
    //   275: lor
    //   276: l2i
    //   277: istore #20
    //   279: iload #20
    //   281: invokestatic intBitsToFloat : (I)F
    //   284: freturn
  }
  
  static float Zr(float paramFloat, int paramInt) {
    return paramFloat * Float.intBitsToFloat(paramInt + 127 << 23);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zz\Zbq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */