package net.portswigger;

import burp.Zbqc;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.function.Function;

public class Zvo implements Runnable {
  private static final Zgt Zm;
  
  private final byte[] Zd;
  
  private final Zva ZY;
  
  private Socket Zp;
  
  private final Zb3 Zz;
  
  private final Zus Zv;
  
  private volatile boolean Zf = false;
  
  private volatile Zti ZP = null;
  
  private volatile IOException ZQ;
  
  private volatile Throwable Zg;
  
  private volatile boolean ZW = false;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zvo(byte[] paramArrayOfbyte, Zva paramZva, Zb3 paramZb3, Zus paramZus) {
    this.Zd = paramArrayOfbyte;
    this.ZY = paramZva;
    this.Zz = paramZb3;
    this.Zv = paramZus;
  }
  
  public void run() {
    Integer integer = null;
    Zbqc[] arrayOfZbqc = Zj.Zk();
    try {
      this.Zp = this.ZY.Zf();
      integer = Integer.valueOf(System.identityHashCode(this.Zp));
      try {
        Z_();
        this.Zf = true;
        if (this.Zv != null)
          try {
            this.ZP = Zm(this.Zp, this.Zv);
          } catch (Zuy zuy) {
            try {
              Zah.Zl(zuy, Zk_.RETHROWN);
              Zm.ZX(String.format(a(22875, -18885), new Object[] { integer }), zuy);
              if (!this.ZW) {
                try {
                  if (this.Zz != null) {
                    try {
                      Zw();
                      this.Zp = this.Zz.Zl();
                      Z_();
                      this.ZP = Zm(this.Zp, this.Zv);
                      Zm.ZP(a(22857, -23704) + a(22857, -23704), new Object[0]);
                      if (arrayOfZbqc != null)
                        throw zuy; 
                    } catch (Zuy zuy1) {
                      throw a(null);
                    } 
                  } else {
                    throw zuy;
                  } 
                } catch (Zuy zuy1) {
                  throw a(null);
                } 
              } else {
                throw zuy;
              } 
            } catch (Zuy zuy1) {
              throw a(null);
            } 
          }  
      } catch (Zib zib) {
        throw a(null);
      } 
      this.Zp = null;
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.PROCESSED_LATER);
      Zm.ZX(a(22871, 8830) + a(22871, 8830), iOException);
      this.ZQ = iOException;
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
      Zm.ZX(a(22849, -1482) + a(22849, -1482), throwable);
      this.Zg = throwable;
    } finally {
      try {
        if (this.ZQ == null)
          try {
            if (this.Zg == null)
              try {
                if (this.Zf) {
                  try {
                    if (this.Zv != null)
                      try {
                        if (this.ZP == null) {
                          Zw();
                          throw null;
                        } 
                      } catch (Zuy zuy) {
                        throw a(null);
                      }  
                  } catch (Zuy zuy) {
                    throw a(null);
                  } 
                  throw null;
                } 
              } catch (Zuy zuy) {
                throw a(null);
              }  
          } catch (Zuy zuy) {
            throw a(null);
          }  
      } catch (Zuy zuy) {
        throw a(null);
      } 
      Zw();
    } 
  }
  
  private static Zti Zm(Socket paramSocket, Zus paramZus) throws IOException {
    Zti zti1;
    int i = System.identityHashCode(paramSocket);
    Zm.ZP(String.format(a(22866, 21379), new Object[] { Integer.valueOf(i) }), new Object[0]);
    InputStream inputStream = paramSocket.getInputStream();
    try {
      Zom zom = paramZus.Zp(inputStream);
      Zvw zvw = paramZus.Zn(inputStream);
      byte[] arrayOfByte = paramZus.ZO(zvw, inputStream);
      zti1 = new Zti(zom.Zi, zvw, arrayOfByte);
    } catch (Zib zib) {
      Zah.Zl(zib, Zk_.RETHROWN);
      throw new IOException(zib.getMessage(), zib);
    } 
    Zti zti2 = zti1;
    Zm.ZP(a(22874, -10132) + a(22874, -10132), new Object[0]);
    return zti2;
  }
  
  private void Z_() throws IOException {
    int i = System.identityHashCode(this.Zp);
    Zbqc[] arrayOfZbqc = Zj.Zk();
    try {
      Zm.ZP(String.format(a(22872, 17965), new Object[] { Integer.valueOf(i) }), new Object[0]);
      this.Zp.getOutputStream().write(this.Zd);
      Zm.ZP(a(22853, -20533) + a(22853, -20533), new Object[0]);
    } catch (SocketException socketException) {
      try {
        Zah.Zl(socketException, Zk_.RETHROWN);
        Zm.ZX(String.format(a(22867, 13994), new Object[] { Integer.valueOf(i) }), socketException);
        if (!this.ZW) {
          try {
            if (this.Zz != null) {
              try {
                Zw();
                this.Zp = this.Zz.Zl();
                this.Zp.getOutputStream().write(this.Zd);
                Zm.ZP(a(22879, -19071) + a(22879, -19071), new Object[0]);
                if (arrayOfZbqc != null)
                  throw socketException; 
              } catch (SocketException socketException1) {
                throw a(null);
              } 
            } else {
              throw socketException;
            } 
          } catch (SocketException socketException1) {
            throw a(null);
          } 
        } else {
          throw socketException;
        } 
      } catch (SocketException socketException1) {
        throw a(null);
      } 
    } 
  }
  
  private void ZD() {
    try {
      if (this.Zp == null) {
        Zm.Zg(a(22851, -30861), new Object[0]);
        return;
      } 
    } catch (Zib zib) {
      throw a(null);
    } 
    int i = System.identityHashCode(this.Zp);
    this.ZW = true;
    Zm.Zg(a(22878, -2795) + a(22878, -2795), new Object[0]);
    Zw();
  }
  
  private void Zw() {
    int i = System.identityHashCode(this.Zp);
    try {
      Zm.Zg(a(22850, -12042) + a(22850, -12042), new Object[0]);
      if (this.Zp != null)
        try {
          if (!this.Zp.isClosed())
            try {
              this.Zp.close();
              Zm.Zg(a(22876, -15944) + a(22876, -15944), new Object[0]);
            } catch (IOException iOException) {
              Zah.Zl(iOException, Zk_.IGNORED);
              Zm.Zt(a(22877, 26025) + a(22877, 26025), iOException);
            }  
        } catch (Zib zib) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private void ZO() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Ljava/io/IOException;
    //   4: ifnull -> 68
    //   7: aload_0
    //   8: getfield ZW : Z
    //   11: ifeq -> 49
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   20: athrow
    //   21: new java/net/SocketTimeoutException
    //   24: dup
    //   25: sipush #22870
    //   28: sipush #-19419
    //   31: invokestatic a : (II)Ljava/lang/String;
    //   34: invokespecial <init> : (Ljava/lang/String;)V
    //   37: astore_1
    //   38: aload_1
    //   39: aload_0
    //   40: getfield ZQ : Ljava/io/IOException;
    //   43: invokevirtual initCause : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   46: pop
    //   47: aload_1
    //   48: athrow
    //   49: new java/io/IOException
    //   52: dup
    //   53: aload_0
    //   54: getfield ZQ : Ljava/io/IOException;
    //   57: invokevirtual getMessage : ()Ljava/lang/String;
    //   60: aload_0
    //   61: getfield ZQ : Ljava/io/IOException;
    //   64: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   67: athrow
    //   68: aload_0
    //   69: getfield Zg : Ljava/lang/Throwable;
    //   72: ifnull -> 91
    //   75: new java/lang/RuntimeException
    //   78: dup
    //   79: aload_0
    //   80: getfield Zg : Ljava/lang/Throwable;
    //   83: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   86: athrow
    //   87: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   90: athrow
    //   91: aload_0
    //   92: getfield Zv : Lnet/portswigger/Zus;
    //   95: ifnull -> 120
    //   98: aload_0
    //   99: getfield ZP : Lnet/portswigger/Zti;
    //   102: ifnonnull -> 120
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   111: athrow
    //   112: iconst_1
    //   113: goto -> 121
    //   116: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   119: athrow
    //   120: iconst_0
    //   121: istore_1
    //   122: aload_0
    //   123: getfield Zf : Z
    //   126: ifeq -> 154
    //   129: iload_1
    //   130: ifne -> 154
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   139: athrow
    //   140: aload_0
    //   141: getfield ZW : Z
    //   144: ifeq -> 209
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   153: athrow
    //   154: new java/net/SocketTimeoutException
    //   157: dup
    //   158: sipush #22856
    //   161: sipush #-15523
    //   164: invokestatic a : (II)Ljava/lang/String;
    //   167: iconst_3
    //   168: anewarray java/lang/Object
    //   171: dup
    //   172: iconst_0
    //   173: aload_0
    //   174: getfield Zf : Z
    //   177: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   180: aastore
    //   181: dup
    //   182: iconst_1
    //   183: iload_1
    //   184: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   187: aastore
    //   188: dup
    //   189: iconst_2
    //   190: aload_0
    //   191: getfield ZW : Z
    //   194: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   197: aastore
    //   198: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   201: invokespecial <init> : (Ljava/lang/String;)V
    //   204: athrow
    //   205: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   208: athrow
    //   209: return
    // Exception table:
    //   from	to	target	type
    //   0	14	17	java/io/IOException
    //   68	87	87	java/io/IOException
    //   91	105	108	java/io/IOException
    //   98	116	116	java/io/IOException
    //   122	133	136	java/io/IOException
    //   129	147	150	java/io/IOException
    //   140	205	205	java/io/IOException
  }
  
  public static void ZL(Zva paramZva, byte[] paramArrayOfbyte, long paramLong, Zb3 paramZb3) throws IOException {
    a(22873, -12546);
    Zm.ZP(a(22873, -12546) + a(22873, -12546), new Object[0]);
    Zvo zvo = new Zvo(paramArrayOfbyte, paramZva, paramZb3, null);
    Zu(paramLong, zvo, Zvo::lambda$send$0);
  }
  
  public static Zti Zv(Zva paramZva, byte[] paramArrayOfbyte, long paramLong, Zb3 paramZb3, Zus paramZus) throws IOException {
    a(22868, 16205);
    Zm.ZP(a(22868, 16205) + a(22868, 16205), new Object[0]);
    Zvo zvo = new Zvo(paramArrayOfbyte, paramZva, paramZb3, paramZus);
    Zu(paramLong, zvo, Zvo::lambda$sendAndReceive$1);
    return zvo.ZP;
  }
  
  private static void Zu(long paramLong, Zvo paramZvo, Function<Zvo, Boolean> paramFunction) throws IOException {
    try {
      if (paramLong <= 0L)
        throw new IllegalArgumentException(a(22865, -24631)); 
    } catch (InterruptedException interruptedException) {
      throw a(null);
    } 
    Zm.ZP(a(22854, -14331), new Object[0]);
    Thread thread = new Thread(paramZvo);
    a(22855, 131);
    thread.setName(a(22855, 131) + a(22855, 131) + paramLong);
    thread.setDaemon(true);
    thread.start();
    Zm.ZP(a(22869, -27840), new Object[0]);
    long l = System.currentTimeMillis() + paramLong;
    while (true) {
      try {
        if (paramZvo.ZQ == null)
          try {
            if (paramZvo.Zg == null)
              try {
                if (!paramZvo.ZW)
                  try {
                    if (!((Boolean)paramFunction.apply(paramZvo)).booleanValue())
                      try {
                        if (System.currentTimeMillis() <= l) {
                          try {
                            Thread.sleep(1L);
                          } catch (InterruptedException interruptedException) {
                            Zah.Zl(interruptedException, Zk_.RETHROWN);
                            throw new RuntimeException(interruptedException.getMessage(), interruptedException);
                          } 
                          continue;
                        } 
                      } catch (IOException iOException) {
                        throw a(null);
                      }  
                  } catch (InterruptedException interruptedException) {
                    throw a(null);
                  }  
              } catch (InterruptedException interruptedException) {
                throw a(null);
              }  
          } catch (InterruptedException interruptedException) {
            throw a(null);
          }  
      } catch (InterruptedException interruptedException) {
        throw a(null);
      } 
      break;
    } 
    try {
      if (paramZvo.ZQ == null)
        try {
          if (paramZvo.Zg == null)
            try {
              if (thread.isAlive())
                try {
                  if (!((Boolean)paramFunction.apply(paramZvo)).booleanValue()) {
                    Zm.ZP(a(22848, 13959), new Object[0]);
                    paramZvo.ZD();
                  } 
                } catch (InterruptedException interruptedException) {
                  throw a(null);
                }  
            } catch (InterruptedException interruptedException) {
              throw a(null);
            }  
        } catch (InterruptedException interruptedException) {
          throw a(null);
        }  
    } catch (InterruptedException interruptedException) {
      throw a(null);
    } 
    try {
      Zm.ZP(a(22852, 18355), new Object[0]);
      thread.join(1L);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.COMMON_RUNTIME_FAILURE);
    } 
    paramZvo.ZO();
  }
  
  private static Boolean lambda$sendAndReceive$1(Zvo paramZvo) {
    try {
    
    } catch (Zib zib) {
      throw a(null);
    } 
    return Boolean.valueOf((paramZvo.ZP != null));
  }
  
  private static Boolean lambda$send$0(Zvo paramZvo) {
    return Boolean.valueOf(paramZvo.Zf);
  }
  
  static {
    // Byte code:
    //   0: bipush #26
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Î!q¢ã¯Â©º{d\\b2ÜÊo\\rÈ^­Sw|âÚIÊFP¶Íôz<î&Æ½BH"ÍÅ&Q·á\\\fÄ)Û¨9wj<b¥^"R¤!¹P\\fÓ¤ÖlÍ¢{èE>¹y¿ÙÝÆAX\\f8ú¸Ý¡À#~q×Áô3æÄwò²ÿ~ÖbÔ2éëÐ>yD ÄÏ+î8ÚlÔ×¢LÝ\\rh8î~!OÜcýSáv\\tjoë2Â[I,7~p(ðÝëzó|¤>öÇ×c6rt¡¬=Ò1 XôcO©¤ä©Z:Û0`\\bHG(r{°M>®ÅåuG´àØ.xº*0CsVyÁ0=@LøÜÛ!ÉQðæ[º7÷ VºÍ\Æ*í08:ý´yÀ ÖûÆ{ú¡¢Á¶?F^ä5e´ü°ø§}ô¦/ú·í[ùmÓÇ)Ja\Møg[fB»Ö_$=Ó3ïú­ëÔþíQÔR1ÛIrWÒ±Øg.xéÖ½ÂOÉò¼ã×ºç.¥9ë¡þS&\\tãNÁãê'£QÇ@½å<CßÌÃ®ËoÎÖ ÿgù$+ßQðMá³­¼]P\1d¼(o|±ZoöN<á%èÁ|»ôw%EÒï=¼è*c¸^vÁ65(Ôé²ã"Ì'*Äi+Ì¡úØ¡®e¥øPY«L/³¼ªâøJê&.fß÷"Û#}59¹\\f£jCÐÚ-m¼voDÔ#ÜÎKÞb¤í¡È\\n\\tFøy¼jº]?p ò`@K$ qÄ¾«AÄÊÖÖÑgâÍ´`´V\\b7Þ_ÖñÙ\\fXmõ\\r³ÂeS\\nÂXø iSJ+Øàæ¹hè*jR)ÜÔýÍ×­Óm2ÓÞaëÛãêÏí×Ò\\t~Î»zW~$ KôÚ3çKÿeã;,í½}w´Y\\tíë¯Ù×în]%×ïó¹1øºáGÛÚÇ.Æ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #52
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #84
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc ';êÞá­\\fÈÜbîË¾;tà¤Þ ´ÝË57SvåG6±ïÂMdÆA#Ç±\\rü(fJÚ{5DÈ)AB Eß}ZNå:4¼túoÁ%ìÂm±CMvHgú.9c=+[]Fô´'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #37
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #77
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic net/portswigger/Zvo.a : [Ljava/lang/String;
    //   132: bipush #26
    //   134: anewarray java/lang/String
    //   137: putstatic net/portswigger/Zvo.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 258
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 240, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 235
    //   212: bipush #123
    //   214: goto -> 242
    //   217: bipush #35
    //   219: goto -> 242
    //   222: iconst_4
    //   223: goto -> 242
    //   226: bipush #113
    //   228: goto -> 242
    //   231: iconst_4
    //   232: goto -> 242
    //   235: bipush #42
    //   237: goto -> 242
    //   240: bipush #79
    //   242: ixor
    //   243: ixor
    //   244: i2c
    //   245: castore
    //   246: iinc #6, 1
    //   249: dup
    //   250: ifne -> 258
    //   253: dup2
    //   254: dup_x1
    //   255: goto -> 166
    //   258: dup2_x1
    //   259: pop2
    //   260: dup_x2
    //   261: iload #6
    //   263: if_icmpgt -> 162
    //   266: pop
    //   267: new java/lang/String
    //   270: dup_x1
    //   271: swap
    //   272: invokespecial <init> : ([C)V
    //   275: invokevirtual intern : ()Ljava/lang/String;
    //   278: swap
    //   279: pop
    //   280: swap
    //   281: tableswitch default -> 40, 0 -> 99
    //   300: getstatic net/portswigger/Zn3.Zf : Lnet/portswigger/Zg5;
    //   303: ldc net/portswigger/Zvo
    //   305: invokevirtual ZQ : (Ljava/lang/Class;)Lnet/portswigger/Zgt;
    //   308: putstatic net/portswigger/Zvo.Zm : Lnet/portswigger/Zgt;
    //   311: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5951) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      byte b1 = 105;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zvo.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */