package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zto;

class Zlt3 {
  private static final byte[][] Zi;
  
  private static final byte[][] Zf;
  
  private static final List<Zto<Integer, Zzrd>> Zj;
  
  private static final List<Zto<Integer, Zzrd>> Zt;
  
  private final Ze3n ZC;
  
  Zlt3(Ze3n paramZe3n) {
    this.ZC = paramZe3n;
  }
  
  Ztk8 Zp(int paramInt) {
    ArrayList<Zl1r> arrayList = new ArrayList();
    int j = 0;
    int i = Zrqp.ZZ();
    while (j < paramInt) {
      Zb8t zb8t1 = Zo(Zj, j, paramInt);
      if (zb8t1.Zi < 0)
        break; 
      Zb8t zb8t2 = Zo(Zt, j, paramInt);
      if (zb8t2.Zi < 0)
        break; 
      ZD(arrayList, zb8t1, zb8t2);
      j = zb8t2.ZK;
      if (i != 0)
        break; 
    } 
    if (!arrayList.isEmpty()) {
      Zvow zvow = this.ZC.Zt().Z_(arrayList);
      return Ztk8.ZY(Zscn.Zt(this.ZC.Za(), this.ZC.ZN(), zvow));
    } 
    return Ztk8.ZD();
  }
  
  private void ZD(List<Zl1r> paramList, Zb8t paramZb8t1, Zb8t paramZb8t2) {
    List<Zl1r> list = Zs(paramZb8t1.ZK, paramZb8t2.Zi);
    if (Zi(list)) {
      paramList.add(paramZb8t1.Zl());
      paramList.addAll(list);
      paramList.add(paramZb8t2.Zl());
    } 
  }
  
  private boolean Zi(List<Zl1r> paramList) {
    int j = 0;
    Iterator<Zl1r> iterator = paramList.iterator();
    int i = Zrqp.ZZ();
    while (iterator.hasNext()) {
      Zl1r zl1r = iterator.next();
      j += zl1r.ZG() - zl1r.ZR();
      if (i != 0)
        break; 
    } 
    return (j >= 200);
  }
  
  private List<Zl1r> Zs(int paramInt1, int paramInt2) {
    ArrayList<Zl1r> arrayList = new ArrayList();
    Zstu zstu = this.ZC.ZL().Za();
    int i = Zrqp.ZZ();
    while (paramInt1 < paramInt2 && !ZT(zstu.Zp(paramInt1))) {
      paramInt1++;
      if (i != 0)
        break; 
    } 
    if (paramInt1 >= paramInt2)
      return arrayList; 
    int j = paramInt1;
    while (j < paramInt2) {
      do {
      
      } while (++j < paramInt2 && Zlkq.ZS(zstu, paramInt1, j));
      if (j - paramInt1 > 20)
        arrayList.add(new Zl1r(paramInt1, j - 1)); 
      paramInt1 = j;
      if (i != 0)
        break; 
    } 
    return arrayList;
  }
  
  private Zb8t Zo(List<Zto<Integer, Zzrd>> paramList, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: new burp/Zb8t
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #5
    //   9: invokestatic Ze : ()I
    //   12: aload #5
    //   14: iload_2
    //   15: putfield ZK : I
    //   18: istore #4
    //   20: iconst_0
    //   21: istore #6
    //   23: iload #6
    //   25: aload_1
    //   26: invokeinterface size : ()I
    //   31: if_icmpge -> 168
    //   34: iload #6
    //   36: ifne -> 76
    //   39: aload #5
    //   41: aload_0
    //   42: aload_1
    //   43: iload #6
    //   45: invokeinterface get : (I)Ljava/lang/Object;
    //   50: checkcast net/portswigger/Zto
    //   53: getfield Zo : Ljava/lang/Object;
    //   56: checkcast burp/Zzrd
    //   59: aload #5
    //   61: getfield ZK : I
    //   64: iload_3
    //   65: invokevirtual Zl : (Lburp/Zzrd;II)I
    //   68: putfield ZK : I
    //   71: iload #4
    //   73: ifne -> 128
    //   76: aload #5
    //   78: aload_0
    //   79: aload_1
    //   80: iload #6
    //   82: invokeinterface get : (I)Ljava/lang/Object;
    //   87: checkcast net/portswigger/Zto
    //   90: getfield Zo : Ljava/lang/Object;
    //   93: checkcast burp/Zzrd
    //   96: aload_1
    //   97: iload #6
    //   99: invokeinterface get : (I)Ljava/lang/Object;
    //   104: checkcast net/portswigger/Zto
    //   107: getfield Zq : Ljava/lang/Object;
    //   110: checkcast java/lang/Integer
    //   113: invokevirtual intValue : ()I
    //   116: aload #5
    //   118: getfield ZK : I
    //   121: iload_3
    //   122: invokevirtual Ze : (Lburp/Zzrd;III)I
    //   125: putfield ZK : I
    //   128: aload #5
    //   130: getfield ZK : I
    //   133: ifge -> 145
    //   136: aload #5
    //   138: iconst_m1
    //   139: putfield Zi : I
    //   142: aload #5
    //   144: areturn
    //   145: iload #6
    //   147: ifne -> 160
    //   150: aload #5
    //   152: aload #5
    //   154: getfield ZK : I
    //   157: putfield Zi : I
    //   160: iinc #6, 1
    //   163: iload #4
    //   165: ifne -> 23
    //   168: aload #5
    //   170: aload #5
    //   172: getfield ZK : I
    //   175: aload_1
    //   176: aload_1
    //   177: invokeinterface size : ()I
    //   182: iconst_1
    //   183: isub
    //   184: invokeinterface get : (I)Ljava/lang/Object;
    //   189: checkcast net/portswigger/Zto
    //   192: getfield Zq : Ljava/lang/Object;
    //   195: checkcast java/lang/Integer
    //   198: invokevirtual intValue : ()I
    //   201: iadd
    //   202: putfield ZK : I
    //   205: aload #5
    //   207: areturn
  }
  
  private boolean ZT(byte paramByte) {
    return ((paramByte >= 65 && paramByte <= 90) || (paramByte >= 97 && paramByte <= 122) || paramByte == 47 || paramByte == 43);
  }
  
  private int Zl(Zzrd paramZzrd, int paramInt1, int paramInt2) {
    return paramZzrd.Zi(this.ZC.ZL().Za(), paramInt1, paramInt2).ZR();
  }
  
  private int Ze(Zzrd paramZzrd, int paramInt1, int paramInt2, int paramInt3) {
    return paramZzrd.Zi(this.ZC.ZL().Za(), paramInt2, Math.min(paramInt3, paramInt2 + 20 + paramInt1)).ZR();
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc '&N_Idt &N_Idt 3RR4YQVk'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #7
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #80
    //   25: iinc #1, 1
    //   28: aload_3
    //   29: iload_1
    //   30: dup
    //   31: iload_2
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 129
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
    //   68: ldc ';_I;_I'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: iconst_3
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: bipush #86
    //   83: iinc #1, 1
    //   86: aload_3
    //   87: iload_1
    //   88: dup
    //   89: iload_2
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 129
    //   98: aload_0
    //   99: swap
    //   100: iload #4
    //   102: iinc #4, 1
    //   105: swap
    //   106: aastore
    //   107: iload_1
    //   108: iload_2
    //   109: iadd
    //   110: dup
    //   111: istore_1
    //   112: iload #5
    //   114: if_icmpge -> 126
    //   117: aload_3
    //   118: iload_1
    //   119: invokevirtual charAt : (I)C
    //   122: istore_2
    //   123: goto -> 81
    //   126: goto -> 288
    //   129: dup_x2
    //   130: pop
    //   131: invokevirtual toCharArray : ()[C
    //   134: dup_x1
    //   135: arraylength
    //   136: dup_x2
    //   137: pop
    //   138: iconst_0
    //   139: istore #6
    //   141: dup2_x1
    //   142: pop2
    //   143: dup_x2
    //   144: iconst_1
    //   145: if_icmpgt -> 248
    //   148: dup2
    //   149: swap
    //   150: iload #6
    //   152: dup2_x1
    //   153: caload
    //   154: swap
    //   155: iload #6
    //   157: bipush #7
    //   159: irem
    //   160: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #38
    //   202: goto -> 232
    //   205: bipush #76
    //   207: goto -> 232
    //   210: bipush #70
    //   212: goto -> 232
    //   215: bipush #79
    //   217: goto -> 232
    //   220: bipush #117
    //   222: goto -> 232
    //   225: bipush #112
    //   227: goto -> 232
    //   230: bipush #21
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 152
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 148
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 40, 0 -> 98
    //   288: iconst_3
    //   289: anewarray [B
    //   292: dup
    //   293: iconst_0
    //   294: aload_0
    //   295: iconst_3
    //   296: aaload
    //   297: invokestatic Zy : (Ljava/lang/String;)[B
    //   300: aastore
    //   301: dup
    //   302: iconst_1
    //   303: aload_0
    //   304: iconst_1
    //   305: aaload
    //   306: invokestatic Zy : (Ljava/lang/String;)[B
    //   309: aastore
    //   310: dup
    //   311: iconst_2
    //   312: aload_0
    //   313: iconst_4
    //   314: aaload
    //   315: invokestatic Zy : (Ljava/lang/String;)[B
    //   318: aastore
    //   319: putstatic burp/Zlt3.Zi : [[B
    //   322: iconst_3
    //   323: anewarray [B
    //   326: dup
    //   327: iconst_0
    //   328: aload_0
    //   329: iconst_2
    //   330: aaload
    //   331: invokestatic Zy : (Ljava/lang/String;)[B
    //   334: aastore
    //   335: dup
    //   336: iconst_1
    //   337: aload_0
    //   338: iconst_0
    //   339: aaload
    //   340: invokestatic Zy : (Ljava/lang/String;)[B
    //   343: aastore
    //   344: dup
    //   345: iconst_2
    //   346: aload_0
    //   347: iconst_5
    //   348: aaload
    //   349: invokestatic Zy : (Ljava/lang/String;)[B
    //   352: aastore
    //   353: putstatic burp/Zlt3.Zf : [[B
    //   356: new java/util/LinkedList
    //   359: dup
    //   360: invokespecial <init> : ()V
    //   363: putstatic burp/Zlt3.Zj : Ljava/util/List;
    //   366: new java/util/LinkedList
    //   369: dup
    //   370: invokespecial <init> : ()V
    //   373: putstatic burp/Zlt3.Zt : Ljava/util/List;
    //   376: getstatic burp/Zlt3.Zi : [[B
    //   379: astore #7
    //   381: aload #7
    //   383: arraylength
    //   384: istore #8
    //   386: iconst_0
    //   387: istore #9
    //   389: iload #9
    //   391: iload #8
    //   393: if_icmpge -> 434
    //   396: aload #7
    //   398: iload #9
    //   400: aaload
    //   401: astore #10
    //   403: getstatic burp/Zlt3.Zj : Ljava/util/List;
    //   406: aload #10
    //   408: arraylength
    //   409: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   412: aload #10
    //   414: iconst_1
    //   415: iconst_0
    //   416: invokestatic ZJ : ([BZZ)Lburp/Zzrd;
    //   419: invokestatic ZM : (Ljava/lang/Object;Ljava/lang/Object;)Lnet/portswigger/Zto;
    //   422: invokeinterface add : (Ljava/lang/Object;)Z
    //   427: pop
    //   428: iinc #9, 1
    //   431: goto -> 389
    //   434: getstatic burp/Zlt3.Zf : [[B
    //   437: astore #7
    //   439: aload #7
    //   441: arraylength
    //   442: istore #8
    //   444: iconst_0
    //   445: istore #9
    //   447: iload #9
    //   449: iload #8
    //   451: if_icmpge -> 492
    //   454: aload #7
    //   456: iload #9
    //   458: aaload
    //   459: astore #10
    //   461: getstatic burp/Zlt3.Zt : Ljava/util/List;
    //   464: aload #10
    //   466: arraylength
    //   467: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   470: aload #10
    //   472: iconst_1
    //   473: iconst_0
    //   474: invokestatic ZJ : ([BZZ)Lburp/Zzrd;
    //   477: invokestatic ZM : (Ljava/lang/Object;Ljava/lang/Object;)Lnet/portswigger/Zto;
    //   480: invokeinterface add : (Ljava/lang/Object;)Z
    //   485: pop
    //   486: iinc #9, 1
    //   489: goto -> 447
    //   492: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlt3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */