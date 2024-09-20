package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zlsn {
  private static final List<byte[]> Zr;
  
  private static final Zzrd ZT;
  
  private final Ze3n Zk;
  
  private int ZY;
  
  private int ZJ;
  
  private int Zh;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zlsn(Ze3n paramZe3n) {
    this.Zk = paramZe3n;
  }
  
  void Zd(int paramInt, Zgq<Zrdb> paramZgq) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
    int j = 0;
    this.Zh = 0;
    int i = Zrqp.Ze();
    while (j < paramInt - 20) {
      int m = ZS(j, paramInt);
      if (m >= paramInt)
        break; 
      j = m;
      Zstu zstu = this.Zk.ZL().Za();
      int k = j;
      while (k < paramInt) {
        byte b = zstu.Zp(k);
        if (ZH(b))
          break; 
        k++;
        if (i == 0)
          break; 
      } 
      while (k > j && zstu.Zp(k - 1) <= 32) {
        k--;
        if (i == 0)
          break; 
      } 
      this.ZY = j;
      while (this.ZY < k && zstu.Zp(this.ZY) != 59) {
        this.ZY++;
        if (i == 0)
          break; 
      } 
      this.ZY++;
      this.ZJ = 0;
      ZC(k);
      if (this.ZJ > 0) {
        String str = ZL(Zruv.ZO(zstu, j, k - j));
        linkedHashSet.add(str);
        Collection<Zl1r> collection = (Collection)hashMap.computeIfAbsent(str, Zlsn::lambda$checkForDbConnectionString$0);
        collection.add(Zrlp.Zj(j, k));
      } 
      j = k;
      if (i == 0)
        break; 
    } 
    Zuh.Zb((linkedHashSet.size() == hashMap.size()), Zqf.Zr);
    for (String str : linkedHashSet) {
      Zvow zvow = this.Zk.Zt().Z_((Collection<Zl1r>)hashMap.get(str));
      paramZgq.Zu(Zt45.Zu(this.Zk.Za(), this.Zk.ZN(), zvow, str, this.Zh));
      if (i == 0)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zrqp.Zn(++i); 
  }
  
  private void ZC(int paramInt) {
    // Byte code:
    //   0: invokestatic Ze : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield Zk : Lburp/Ze3n;
    //   8: invokevirtual ZL : ()Lburp/Zb6q;
    //   11: invokeinterface Za : ()Lburp/Zstu;
    //   16: astore_3
    //   17: aload_0
    //   18: getfield ZY : I
    //   21: iload_1
    //   22: if_icmpge -> 200
    //   25: aload_3
    //   26: bipush #61
    //   28: aload_0
    //   29: getfield ZY : I
    //   32: iload_1
    //   33: invokestatic ZT : (Lburp/Zstu;BII)I
    //   36: istore #4
    //   38: iload #4
    //   40: iconst_m1
    //   41: if_icmpne -> 47
    //   44: goto -> 200
    //   47: aload_0
    //   48: aload_3
    //   49: aload_0
    //   50: getfield ZY : I
    //   53: iload #4
    //   55: aload_0
    //   56: getfield ZY : I
    //   59: isub
    //   60: invokestatic ZO : (Lburp/Zstu;II)Ljava/lang/String;
    //   63: invokevirtual ZL : (Ljava/lang/String;)Ljava/lang/String;
    //   66: astore #5
    //   68: aload_0
    //   69: iload #4
    //   71: iconst_1
    //   72: iadd
    //   73: putfield ZY : I
    //   76: aload_0
    //   77: iload_1
    //   78: invokevirtual Zo : (I)Z
    //   81: istore #6
    //   83: aload_0
    //   84: aload #5
    //   86: invokevirtual Zr : (Ljava/lang/String;)Z
    //   89: ifeq -> 103
    //   92: aload_0
    //   93: iload #6
    //   95: iconst_1
    //   96: invokevirtual ZD : (ZI)V
    //   99: iload_2
    //   100: ifne -> 186
    //   103: aload_0
    //   104: aload #5
    //   106: invokevirtual ZC : (Ljava/lang/String;)Z
    //   109: ifeq -> 123
    //   112: aload_0
    //   113: iload #6
    //   115: iconst_2
    //   116: invokevirtual ZD : (ZI)V
    //   119: iload_2
    //   120: ifne -> 186
    //   123: aload_0
    //   124: aload #5
    //   126: invokevirtual Zy : (Ljava/lang/String;)Z
    //   129: ifeq -> 144
    //   132: aload_0
    //   133: iload #6
    //   135: bipush #8
    //   137: invokevirtual ZD : (ZI)V
    //   140: iload_2
    //   141: ifne -> 186
    //   144: aload_0
    //   145: aload #5
    //   147: invokevirtual ZG : (Ljava/lang/String;)Z
    //   150: ifeq -> 164
    //   153: aload_0
    //   154: iload #6
    //   156: iconst_4
    //   157: invokevirtual ZD : (ZI)V
    //   160: iload_2
    //   161: ifne -> 186
    //   164: aload_0
    //   165: getfield ZJ : I
    //   168: ifne -> 186
    //   171: aload_0
    //   172: aload #5
    //   174: invokevirtual ZA : (Ljava/lang/String;)Z
    //   177: ifeq -> 186
    //   180: aload_0
    //   181: iconst_0
    //   182: iconst_0
    //   183: invokevirtual ZD : (ZI)V
    //   186: aload_0
    //   187: dup
    //   188: getfield ZY : I
    //   191: iconst_1
    //   192: iadd
    //   193: putfield ZY : I
    //   196: iload_2
    //   197: ifne -> 17
    //   200: return
  }
  
  private void ZD(boolean paramBoolean, int paramInt) {
    this.ZJ++;
    if (paramBoolean)
      this.Zh |= paramInt; 
  }
  
  private boolean Zo(int paramInt) {
    int i = Zrqp.Ze();
    boolean bool = false;
    while (this.ZY < paramInt) {
      byte b = this.Zk.ZL().Za().Zp(this.ZY);
      if (b == 59)
        break; 
      if (!bool && Character.isLetterOrDigit(b))
        bool = true; 
      this.ZY++;
      if (i == 0)
        break; 
    } 
    return bool;
  }
  
  private boolean ZH(byte paramByte) {
    return (paramByte == 39 || paramByte == 34 || paramByte == 60 || paramByte == 62 || (paramByte < 32 && paramByte != 13 && paramByte != 10 && paramByte != 9) || paramByte > Byte.MAX_VALUE);
  }
  
  private String ZL(String paramString) {
    return paramString.trim().replaceAll(a(-25304, -1159), "").toLowerCase(Locale.ENGLISH);
  }
  
  private boolean ZA(String paramString) {
    return (a(-25312, -4699).equals(paramString) || a(-25302, -24068).equals(paramString) || a(-25295, 26223).equals(paramString) || a(-25286, 20023).equals(paramString) || a(-25293, 27445).equals(paramString) || a(-25303, -3164).equals(paramString) || a(-25287, -2322).equals(paramString) || a(-25299, -28495).equals(paramString) || a(-25300, 19809).equals(paramString));
  }
  
  private boolean ZG(String paramString) {
    return (a(-25297, 12234).equals(paramString) || a(-25305, 23937).equals(paramString) || a(-25283, -7146).equals(paramString));
  }
  
  private boolean Zy(String paramString) {
    return (a(-25310, -3709).equals(paramString) || a(-25294, 3268).equals(paramString));
  }
  
  private boolean ZC(String paramString) {
    return (a(-25285, -7837).equals(paramString) || a(-25281, -18166).equals(paramString) || a(-25288, 8354).equals(paramString) || a(-25282, -24217).equals(paramString) || a(-25309, 25280).equals(paramString) || a(-25307, -27433).equals(paramString) || a(-25308, -19036).equals(paramString) || a(-25311, -31262).equals(paramString));
  }
  
  private boolean Zr(String paramString) {
    return (a(-25301, -5683).equals(paramString) || a(-25284, 4145).equals(paramString) || a(-25296, -8512).equals(paramString) || a(-25298, 27249).equals(paramString) || a(-25306, -30816).equals(paramString));
  }
  
  private int ZS(int paramInt1, int paramInt2) {
    Zbu4 zbu4 = ZT.Zi(this.Zk.ZL().Za(), paramInt1, paramInt2);
    return zbu4.ZP() ? zbu4.ZR() : paramInt2;
  }
  
  private static Collection lambda$checkForDbConnectionString$0(String paramString) {
    return new ArrayList();
  }
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '§\\t@Åm¯»ÔÜßq\\bÕÎ\\r7I\\b\\nÚ\\bÜèÙO´þeL\\nñ´_'ÎÎûºEÑ»¼y¥$\\nªÂu)ÅL¾¼½~\\n§Â¦mUbm\\bÛòft·EÉÂE4¬ÖÉuÈaª®-°ø£ãËsß\\bõ\\nº> Æß¬\\b; ±åÒ1jPmHÄ«lPT»¤$í9iE"\\b¢ÀLùÈòè\\nñ\\n«,aÔdøTO\\b¶ICDm×Ð@Y%÷ú ¹îÐË%Uç7{QA\\f?w¿\\tÞµrA§0£ãÎó×-¡µ&\\bçt[2ÒÆaíJCÑ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #40
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc '`QÆ^+ð\70³?ûÍÏ''
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #18
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #84
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zlsn.a : [Ljava/lang/String;
    //   131: bipush #28
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zlsn.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #81
    //   214: goto -> 244
    //   217: bipush #41
    //   219: goto -> 244
    //   222: bipush #14
    //   224: goto -> 244
    //   227: bipush #73
    //   229: goto -> 244
    //   232: bipush #113
    //   234: goto -> 244
    //   237: bipush #119
    //   239: goto -> 244
    //   242: bipush #35
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: bipush #7
    //   302: newarray byte
    //   304: dup
    //   305: iconst_0
    //   306: bipush #100
    //   308: bastore
    //   309: dup
    //   310: iconst_1
    //   311: bipush #114
    //   313: bastore
    //   314: dup
    //   315: iconst_2
    //   316: bipush #105
    //   318: bastore
    //   319: dup
    //   320: iconst_3
    //   321: bipush #118
    //   323: bastore
    //   324: dup
    //   325: iconst_4
    //   326: bipush #101
    //   328: bastore
    //   329: dup
    //   330: iconst_5
    //   331: bipush #114
    //   333: bastore
    //   334: dup
    //   335: bipush #6
    //   337: bipush #61
    //   339: bastore
    //   340: bipush #9
    //   342: newarray byte
    //   344: dup
    //   345: iconst_0
    //   346: bipush #112
    //   348: bastore
    //   349: dup
    //   350: iconst_1
    //   351: bipush #114
    //   353: bastore
    //   354: dup
    //   355: iconst_2
    //   356: bipush #111
    //   358: bastore
    //   359: dup
    //   360: iconst_3
    //   361: bipush #118
    //   363: bastore
    //   364: dup
    //   365: iconst_4
    //   366: bipush #105
    //   368: bastore
    //   369: dup
    //   370: iconst_5
    //   371: bipush #100
    //   373: bastore
    //   374: dup
    //   375: bipush #6
    //   377: bipush #101
    //   379: bastore
    //   380: dup
    //   381: bipush #7
    //   383: bipush #114
    //   385: bastore
    //   386: dup
    //   387: bipush #8
    //   389: bipush #61
    //   391: bastore
    //   392: bipush #7
    //   394: newarray byte
    //   396: dup
    //   397: iconst_0
    //   398: bipush #115
    //   400: bastore
    //   401: dup
    //   402: iconst_1
    //   403: bipush #101
    //   405: bastore
    //   406: dup
    //   407: iconst_2
    //   408: bipush #114
    //   410: bastore
    //   411: dup
    //   412: iconst_3
    //   413: bipush #118
    //   415: bastore
    //   416: dup
    //   417: iconst_4
    //   418: bipush #101
    //   420: bastore
    //   421: dup
    //   422: iconst_5
    //   423: bipush #114
    //   425: bastore
    //   426: dup
    //   427: bipush #6
    //   429: bipush #61
    //   431: bastore
    //   432: bipush #12
    //   434: newarray byte
    //   436: dup
    //   437: iconst_0
    //   438: bipush #100
    //   440: bastore
    //   441: dup
    //   442: iconst_1
    //   443: bipush #97
    //   445: bastore
    //   446: dup
    //   447: iconst_2
    //   448: bipush #116
    //   450: bastore
    //   451: dup
    //   452: iconst_3
    //   453: bipush #97
    //   455: bastore
    //   456: dup
    //   457: iconst_4
    //   458: bipush #32
    //   460: bastore
    //   461: dup
    //   462: iconst_5
    //   463: bipush #115
    //   465: bastore
    //   466: dup
    //   467: bipush #6
    //   469: bipush #111
    //   471: bastore
    //   472: dup
    //   473: bipush #7
    //   475: bipush #117
    //   477: bastore
    //   478: dup
    //   479: bipush #8
    //   481: bipush #114
    //   483: bastore
    //   484: dup
    //   485: bipush #9
    //   487: bipush #99
    //   489: bastore
    //   490: dup
    //   491: bipush #10
    //   493: bipush #101
    //   495: bastore
    //   496: dup
    //   497: bipush #11
    //   499: bipush #61
    //   501: bastore
    //   502: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   505: putstatic burp/Zlsn.Zr : Ljava/util/List;
    //   508: getstatic burp/Zlsn.Zr : Ljava/util/List;
    //   511: iconst_1
    //   512: iconst_1
    //   513: invokestatic Zv : (Ljava/util/Collection;ZZ)Lburp/Zzrd;
    //   516: putstatic burp/Zlsn.ZT : Lburp/Zzrd;
    //   519: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9D29) & 0xFFFF;
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
      byte b1 = 71;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlsn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */