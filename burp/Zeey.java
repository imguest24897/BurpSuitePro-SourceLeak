package burp;

import java.util.Iterator;
import java.util.List;

class Zeey {
  private final Zkit Zr;
  
  private final Zzqa Zv;
  
  private final boolean Zu;
  
  private boolean Zw;
  
  Zeey(Zkit paramZkit, Zzqa paramZzqa, boolean paramBoolean) {
    this.Zr = paramZkit;
    this.Zv = paramZzqa;
    this.Zu = paramBoolean;
  }
  
  void Zu(Zm1x paramZm1x, Zr5g paramZr5g) {
    // Byte code:
    //   0: invokestatic ZXP : ()[Lburp/Zbqc;
    //   3: aload_1
    //   4: invokeinterface ZY : ()[I
    //   9: astore #4
    //   11: astore_3
    //   12: aload #4
    //   14: arraylength
    //   15: ifne -> 23
    //   18: return
    //   19: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   22: athrow
    //   23: aload #4
    //   25: arraylength
    //   26: newarray byte
    //   28: astore #5
    //   30: iconst_0
    //   31: istore #6
    //   33: iload #6
    //   35: aload #5
    //   37: arraylength
    //   38: if_icmpge -> 62
    //   41: aload #5
    //   43: iload #6
    //   45: aload #4
    //   47: iload #6
    //   49: iaload
    //   50: bipush #24
    //   52: iushr
    //   53: i2b
    //   54: bastore
    //   55: iinc #6, 1
    //   58: aload_3
    //   59: ifnull -> 33
    //   62: aload_0
    //   63: getfield Zv : Lburp/Zzqa;
    //   66: invokevirtual Zy : ()Ljava/io/File;
    //   69: invokevirtual length : ()J
    //   72: ldc2_w 4
    //   75: lsub
    //   76: lstore #6
    //   78: lload #6
    //   80: ldc2_w 100
    //   83: ldiv
    //   84: lstore #8
    //   86: iconst_0
    //   87: istore #10
    //   89: aload_1
    //   90: iload #10
    //   92: invokeinterface Zw : (I)V
    //   97: lconst_0
    //   98: lstore #11
    //   100: lload #11
    //   102: lload #6
    //   104: lcmp
    //   105: ifge -> 349
    //   108: aload_1
    //   109: invokeinterface ZF : ()Z
    //   114: ifeq -> 122
    //   117: return
    //   118: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   121: athrow
    //   122: lload #11
    //   124: lload #8
    //   126: ldiv
    //   127: l2i
    //   128: istore #13
    //   130: iload #13
    //   132: iload #10
    //   134: if_icmple -> 149
    //   137: aload_1
    //   138: iload #13
    //   140: invokeinterface Zw : (I)V
    //   145: iload #13
    //   147: istore #10
    //   149: aload_0
    //   150: getfield Zv : Lburp/Zzqa;
    //   153: lload #11
    //   155: invokevirtual Zk : (J)B
    //   158: istore #14
    //   160: iconst_0
    //   161: istore #15
    //   163: iconst_0
    //   164: istore #16
    //   166: iload #15
    //   168: ifne -> 339
    //   171: iload #16
    //   173: aload #5
    //   175: arraylength
    //   176: if_icmpge -> 339
    //   179: iload #14
    //   181: aload #5
    //   183: iload #16
    //   185: baload
    //   186: if_icmpne -> 332
    //   189: goto -> 196
    //   192: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   195: athrow
    //   196: aload_0
    //   197: getfield Zv : Lburp/Zzqa;
    //   200: lload #11
    //   202: invokevirtual ZO : (J)I
    //   205: istore #17
    //   207: iload #17
    //   209: ifeq -> 332
    //   212: aload #4
    //   214: astore #18
    //   216: aload #18
    //   218: arraylength
    //   219: istore #19
    //   221: iconst_0
    //   222: istore #20
    //   224: iload #20
    //   226: iload #19
    //   228: if_icmpge -> 332
    //   231: aload #18
    //   233: iload #20
    //   235: iaload
    //   236: istore #21
    //   238: iload #17
    //   240: iload #21
    //   242: if_icmpne -> 318
    //   245: aload_0
    //   246: aload_1
    //   247: iload #21
    //   249: invokeinterface ZY : (I)Ljava/util/List;
    //   254: lload #11
    //   256: aload_1
    //   257: iload #21
    //   259: invokeinterface ZN : (I)Lburp/Zx1;
    //   264: invokevirtual ZZ : (Ljava/util/List;JLburp/Zx1;)Lburp/Zb3w;
    //   267: astore #22
    //   269: aload #22
    //   271: ifnull -> 332
    //   274: aload_2
    //   275: iload #21
    //   277: aload #22
    //   279: getfield ZU : J
    //   282: invokeinterface Zx : (IJ)V
    //   287: goto -> 300
    //   290: astore #23
    //   292: aload #23
    //   294: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   297: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   300: lload #11
    //   302: aload #22
    //   304: getfield ZV : I
    //   307: i2l
    //   308: ladd
    //   309: lstore #11
    //   311: iconst_1
    //   312: istore #15
    //   314: aload_3
    //   315: ifnull -> 332
    //   318: iinc #20, 1
    //   321: aload_3
    //   322: ifnull -> 224
    //   325: goto -> 332
    //   328: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   331: athrow
    //   332: iinc #16, 1
    //   335: aload_3
    //   336: ifnull -> 166
    //   339: lload #11
    //   341: lconst_1
    //   342: ladd
    //   343: lstore #11
    //   345: aload_3
    //   346: ifnull -> 100
    //   349: return
    // Exception table:
    //   from	to	target	type
    //   12	19	19	java/lang/Exception
    //   108	118	118	java/lang/Exception
    //   171	189	192	java/lang/Exception
    //   274	287	290	java/lang/Exception
    //   314	325	328	java/lang/Exception
  }
  
  private Zb3w ZZ(List<Ztac> paramList, long paramLong, Zx1 paramZx1) {
    Iterator<Ztac> iterator = paramList.iterator();
    Zbqc[] arrayOfZbqc = Zxsr.ZXP();
    while (iterator.hasNext()) {
      Ztac ztac = iterator.next();
      int i = ztac.Zk;
      long l = paramLong - (i * 3) - paramZx1.Ze;
      if (l >= 0L || arrayOfZbqc != null) {
        byte b = this.Zv.Zk(l + paramZx1.ZI);
        if ((b & 0x1) != 1 || arrayOfZbqc != null) {
          byte b1 = this.Zv.Zk(l + paramZx1.ZS);
          if (b1 == i || arrayOfZbqc != null) {
            if (Zb(l, paramLong, i, ztac.ZK, paramZx1.Ze)) {
              if (this.Zu && !this.Zw) {
                this.Zr.Zd(paramZx1);
                this.Zw = true;
              } 
              return new Zb3w(l, (int)(paramLong - l) + ztac.ZK);
            } 
            if (arrayOfZbqc != null)
              break; 
          } 
        } 
      } 
    } 
    return null;
  }
  
  private boolean Zb(long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: invokestatic ZXP : ()[Lburp/Zbqc;
    //   3: lload_1
    //   4: iload #7
    //   6: i2l
    //   7: ladd
    //   8: lstore #9
    //   10: new java/util/HashSet
    //   13: dup
    //   14: iload #5
    //   16: invokespecial <init> : (I)V
    //   19: astore #11
    //   21: iconst_1
    //   22: istore #12
    //   24: astore #8
    //   26: iconst_0
    //   27: istore #13
    //   29: iload #12
    //   31: ifeq -> 127
    //   34: iload #13
    //   36: iload #5
    //   38: if_icmpge -> 127
    //   41: lload #9
    //   43: iconst_3
    //   44: iload #13
    //   46: imul
    //   47: i2l
    //   48: ladd
    //   49: lstore #14
    //   51: aload_0
    //   52: getfield Zv : Lburp/Zzqa;
    //   55: lload #14
    //   57: invokevirtual Zk : (J)B
    //   60: istore #16
    //   62: aload #11
    //   64: iload #16
    //   66: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   69: invokeinterface add : (Ljava/lang/Object;)Z
    //   74: ifeq -> 116
    //   77: lload_3
    //   78: iload #6
    //   80: i2l
    //   81: ladd
    //   82: lconst_1
    //   83: lsub
    //   84: lstore #17
    //   86: aload_0
    //   87: getfield Zv : Lburp/Zzqa;
    //   90: lload #14
    //   92: lconst_1
    //   93: ladd
    //   94: invokevirtual ZB : (J)S
    //   97: istore #19
    //   99: iload #19
    //   101: i2l
    //   102: lload #17
    //   104: lcmp
    //   105: ifle -> 111
    //   108: iconst_0
    //   109: istore #12
    //   111: aload #8
    //   113: ifnull -> 119
    //   116: iconst_0
    //   117: istore #12
    //   119: iinc #13, 1
    //   122: aload #8
    //   124: ifnull -> 29
    //   127: iload #12
    //   129: ireturn
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeey.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */