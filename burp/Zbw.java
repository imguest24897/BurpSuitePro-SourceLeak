package burp;

import net.portswigger.Zqf;
import net.portswigger.Ztu;
import net.portswigger.Zuh;

public class Zbw implements Zmrh {
  private static final String[] Za;
  
  private final Zxwh ZY;
  
  public Zbw(Zxwh paramZxwh) {
    this.ZY = paramZxwh;
  }
  
  public Zbtk Zi() {
    return new Zbty(this.ZY);
  }
  
  public byte[] ZT(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    switch (this.ZY.ZWN()) {
      case 0:
        return Ztu.Z_(paramArrayOfbyte1);
      case 1:
        return Ztu.Zw(paramArrayOfbyte1);
      case 2:
        return Ztu.Zd(paramArrayOfbyte1);
      case 3:
        return Ztu.Zs(paramArrayOfbyte1);
      case 4:
        return Ztu.ZZ(paramArrayOfbyte1);
      case 5:
        return Ztu.Zz(paramArrayOfbyte1);
      case 6:
        return Ztu.ZI(paramArrayOfbyte1);
      case 7:
        return Ztu.Zt(paramArrayOfbyte1);
      case 8:
        return Ztu.ZN(paramArrayOfbyte1);
      case 9:
        return Ztu.ZJ(paramArrayOfbyte1);
      case 10:
        return Ztu.ZL(paramArrayOfbyte1);
      case 11:
        return Ztu.ZR(paramArrayOfbyte1);
      case 12:
        return Ztu.ZK(paramArrayOfbyte1);
    } 
    Zuh.Zv(false, Zqf.Zk, this.ZY.ZWN());
    return paramArrayOfbyte1;
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'sIu+LXr\>&NW=[3gCXi])u#xrV-cViW{KqjQ8iQOoM8rFnL)oEsIu+LXr\>&GB=[3gCXi])u\\ry|K>0H^s[4bnOtvcATy]{m[~P:tAOxJ()sIu+LXr\>&NW=[3gCXi])u\\\nSx@{cVRiQ>uU-sIu+LXr\>&NW=[3gCXi])u\\\nUhU>tAxV/o\\bK^n$xrV-cViW{ICXq]{eLHiJ.e\\bG_=K/tL\nOtvcATy]{gN~P:tAOxJ(2xrV-cViW{KAIrK4`\\bhLt{UPMxJ{eLHiJ.e\\bG_=K/tL\~s[4bZnU?kr=P>~'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #26
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #78
    //   25: iinc #1, 1
    //   28: aload_3
    //   29: iload_1
    //   30: dup
    //   31: iload_2
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 130
    //   40: aload_0
    //   41: swap
    //   42: iload #4
    //   44: iinc #4, 1
    //   47: swap
    //   48: aastore
    //   49: iload_1
    //   50: iload_2
    //   51: iadd
    //   52: dup
    //   53: istore_1
    //   54: iload #5
    //   56: if_icmpge -> 68
    //   59: aload_3
    //   60: iload_1
    //   61: invokevirtual charAt : (I)C
    //   64: istore_2
    //   65: goto -> 23
    //   68: ldc '3\\b\\nn=(!l2g,F\\ba=36TZ()\\b'Hew(*Qr*g+0a(&2'Up*g+I\\tt,20B -3-I'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #35
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #50
    //   84: iinc #1, 1
    //   87: aload_3
    //   88: iload_1
    //   89: dup
    //   90: iload_2
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 130
    //   99: aload_0
    //   100: swap
    //   101: iload #4
    //   103: iinc #4, 1
    //   106: swap
    //   107: aastore
    //   108: iload_1
    //   109: iload_2
    //   110: iadd
    //   111: dup
    //   112: istore_1
    //   113: iload #5
    //   115: if_icmpge -> 127
    //   118: aload_3
    //   119: iload_1
    //   120: invokevirtual charAt : (I)C
    //   123: istore_2
    //   124: goto -> 82
    //   127: goto -> 288
    //   130: dup_x2
    //   131: pop
    //   132: invokevirtual toCharArray : ()[C
    //   135: dup_x1
    //   136: arraylength
    //   137: dup_x2
    //   138: pop
    //   139: iconst_0
    //   140: istore #6
    //   142: dup2_x1
    //   143: pop2
    //   144: dup_x2
    //   145: iconst_1
    //   146: if_icmpgt -> 248
    //   149: dup2
    //   150: swap
    //   151: iload #6
    //   153: dup2_x1
    //   154: caload
    //   155: swap
    //   156: iload #6
    //   158: bipush #7
    //   160: irem
    //   161: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #117
    //   202: goto -> 232
    //   205: bipush #83
    //   207: goto -> 232
    //   210: bipush #118
    //   212: goto -> 232
    //   215: bipush #21
    //   217: goto -> 232
    //   220: bipush #72
    //   222: goto -> 232
    //   225: bipush #50
    //   227: goto -> 232
    //   230: bipush #108
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 153
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 149
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 40, 0 -> 99
    //   288: bipush #13
    //   290: anewarray java/lang/String
    //   293: dup
    //   294: iconst_0
    //   295: aload_0
    //   296: iconst_4
    //   297: aaload
    //   298: aastore
    //   299: dup
    //   300: iconst_1
    //   301: aload_0
    //   302: bipush #8
    //   304: aaload
    //   305: aastore
    //   306: dup
    //   307: iconst_2
    //   308: aload_0
    //   309: bipush #11
    //   311: aaload
    //   312: aastore
    //   313: dup
    //   314: iconst_3
    //   315: aload_0
    //   316: iconst_2
    //   317: aaload
    //   318: aastore
    //   319: dup
    //   320: iconst_4
    //   321: aload_0
    //   322: iconst_0
    //   323: aaload
    //   324: aastore
    //   325: dup
    //   326: iconst_5
    //   327: aload_0
    //   328: bipush #6
    //   330: aaload
    //   331: aastore
    //   332: dup
    //   333: bipush #6
    //   335: aload_0
    //   336: iconst_5
    //   337: aaload
    //   338: aastore
    //   339: dup
    //   340: bipush #7
    //   342: aload_0
    //   343: iconst_3
    //   344: aaload
    //   345: aastore
    //   346: dup
    //   347: bipush #8
    //   349: aload_0
    //   350: bipush #10
    //   352: aaload
    //   353: aastore
    //   354: dup
    //   355: bipush #9
    //   357: aload_0
    //   358: bipush #12
    //   360: aaload
    //   361: aastore
    //   362: dup
    //   363: bipush #10
    //   365: aload_0
    //   366: bipush #9
    //   368: aaload
    //   369: aastore
    //   370: dup
    //   371: bipush #11
    //   373: aload_0
    //   374: bipush #7
    //   376: aaload
    //   377: aastore
    //   378: dup
    //   379: bipush #12
    //   381: aload_0
    //   382: iconst_1
    //   383: aaload
    //   384: aastore
    //   385: putstatic burp/Zbw.Za : [Ljava/lang/String;
    //   388: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */