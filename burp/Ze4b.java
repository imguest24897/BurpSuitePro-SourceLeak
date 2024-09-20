package burp;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import net.portswigger.Zkb;

public class Ze4b implements Zehc {
  private static final List<String> ZP;
  
  private final Zz_9 ZM;
  
  private final Ze3n ZC;
  
  private boolean ZY;
  
  private boolean Zu;
  
  private boolean Zr;
  
  private boolean Zw;
  
  private boolean Zs;
  
  private EnumSet<Zklf> ZD = EnumSet.noneOf(Zklf.class);
  
  private EnumSet<Zklf> Zg = EnumSet.noneOf(Zklf.class);
  
  private static int[] Zf;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ze4b(Zz_9 paramZz_9, Ze3n paramZe3n) {
    this.ZM = paramZz_9;
    int[] arrayOfInt = Zw();
    this.ZC = paramZe3n;
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public Ztk8 Zb() {
    // Byte code:
    //   0: invokestatic Zw : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: invokevirtual Za : ()Z
    //   8: ifeq -> 15
    //   11: invokestatic ZD : ()Lburp/Ztk8;
    //   14: areturn
    //   15: aload_0
    //   16: getfield ZC : Lburp/Ze3n;
    //   19: invokevirtual Zp : ()Lburp/Zs68;
    //   22: getfield ZH : Lburp/Zk8m;
    //   25: astore_2
    //   26: aload_0
    //   27: aload_2
    //   28: invokevirtual Zx : (Lburp/Zk8m;)V
    //   31: aload_2
    //   32: invokestatic Zf : (Lburp/Zk8m;)Z
    //   35: ifeq -> 67
    //   38: aload_2
    //   39: invokestatic ZA : (Lburp/Zk8m;)Z
    //   42: ifeq -> 139
    //   45: aload_0
    //   46: getfield ZM : Lburp/Zz_9;
    //   49: getstatic burp/Zzu2.CONTENT_TYPE_NOT_SPECIFIED : Lburp/Zzu2;
    //   52: invokevirtual Zr : (Lburp/Zvs;)Z
    //   55: ifeq -> 139
    //   58: aload_0
    //   59: iconst_1
    //   60: putfield ZY : Z
    //   63: aload_1
    //   64: ifnonnull -> 139
    //   67: aload_2
    //   68: invokestatic Zy : (Lburp/Zk8m;)Z
    //   71: ifeq -> 96
    //   74: aload_0
    //   75: getfield ZM : Lburp/Zz_9;
    //   78: getstatic burp/Zzu2.MULTIPLE_CONTENT_TYPES_SPECIFIED : Lburp/Zzu2;
    //   81: invokevirtual Zr : (Lburp/Zvs;)Z
    //   84: ifeq -> 139
    //   87: aload_0
    //   88: iconst_1
    //   89: putfield Zu : Z
    //   92: aload_1
    //   93: ifnonnull -> 139
    //   96: aload_2
    //   97: getfield Zj : S
    //   100: invokestatic Zu : (S)Z
    //   103: ifne -> 139
    //   106: aload_0
    //   107: aload_2
    //   108: invokevirtual ZZ : (Lburp/Zk8m;)Z
    //   111: ifne -> 139
    //   114: aload_2
    //   115: invokestatic ZR : (Lburp/Zk8m;)Z
    //   118: ifeq -> 139
    //   121: aload_0
    //   122: getfield ZM : Lburp/Zz_9;
    //   125: getstatic burp/Zzu2.CONTENT_TYPE_INCORRECTLY_STATED : Lburp/Zzu2;
    //   128: invokevirtual Zr : (Lburp/Zvs;)Z
    //   131: ifeq -> 139
    //   134: aload_0
    //   135: iconst_1
    //   136: putfield Zr : Z
    //   139: aload_0
    //   140: aload_2
    //   141: invokevirtual ZL : (Lburp/Zk8m;)Lburp/Ztk8;
    //   144: areturn
  }
  
  public Zlcm ZP() {
    return Zlcm.PPR_MisstatedMimeType;
  }
  
  private boolean ZZ(Zk8m paramZk8m) {
    Zlg0 zlg0 = new Zlg0(paramZk8m.ZJ(), paramZk8m.ZD, paramZk8m.Zl);
    this.ZD = zlg0.ZK(this.ZC.ZN());
    this.Zg = zlg0.ZN();
    return (this.Zg.isEmpty() && this.ZD.isEmpty());
  }
  
  private boolean Za() {
    return (this.ZC.ZL().Ze() >= 300 && this.ZC.ZL().Ze() < 400);
  }
  
  private void Zx(Zk8m paramZk8m) {
    // Byte code:
    //   0: invokestatic Zw : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: getfield ZJ : S
    //   8: sipush #256
    //   11: if_icmpne -> 75
    //   14: aload_1
    //   15: invokestatic ZK : (Lburp/Zk8m;)Z
    //   18: ifeq -> 50
    //   21: aload_0
    //   22: getfield ZM : Lburp/Zz_9;
    //   25: getstatic burp/Zzu2.HTML_DOES_NOT_SPECIFY_CHARSET : Lburp/Zzu2;
    //   28: invokevirtual Zr : (Lburp/Zvs;)Z
    //   31: ifeq -> 75
    //   34: aload_1
    //   35: getfield Zj : S
    //   38: ifeq -> 75
    //   41: aload_0
    //   42: iconst_1
    //   43: putfield Zw : Z
    //   46: aload_2
    //   47: ifnonnull -> 75
    //   50: aload_0
    //   51: getfield ZM : Lburp/Zz_9;
    //   54: getstatic burp/Zzu2.HTML_USES_UNRECOGNIZED_CHARSET : Lburp/Zzu2;
    //   57: invokevirtual Zr : (Lburp/Zvs;)Z
    //   60: ifeq -> 75
    //   63: aload_1
    //   64: invokestatic Zr : (Lburp/Zk8m;)Z
    //   67: ifeq -> 75
    //   70: aload_0
    //   71: iconst_1
    //   72: putfield Zs : Z
    //   75: return
  }
  
  private static boolean ZK(Zk8m paramZk8m) {
    return paramZk8m.Zb.isEmpty();
  }
  
  private static boolean Zr(Zk8m paramZk8m) {
    int[] arrayOfInt = Zw();
    for (String str : paramZk8m.Zb) {
      if (str == null)
        continue; 
      if (str.length() > 2 && str.startsWith("\"") && str.endsWith("\""))
        str = str.substring(1, str.length() - 1); 
      if (!ZP.contains(str.toLowerCase(Locale.ENGLISH)))
        return true; 
      if (arrayOfInt == null)
        break; 
    } 
    return false;
  }
  
  private static boolean Zf(Zk8m paramZk8m) {
    return (paramZk8m.ZJ == 0);
  }
  
  private static boolean ZA(Zk8m paramZk8m) {
    return (paramZk8m.Zj != 0);
  }
  
  private static boolean ZR(Zk8m paramZk8m) {
    return (paramZk8m.Zj != paramZk8m.ZJ && paramZk8m.Zj != 1);
  }
  
  private static boolean Zy(Zk8m paramZk8m) {
    return (paramZk8m.ZJ == 2 || paramZk8m.ZB().size() > 1);
  }
  
  private Ztk8 ZL(Zk8m paramZk8m) {
    int[] arrayOfInt = Zw();
    Zgq<Zgpi> zgq = new Zgq<>();
    if (this.ZY || this.Zu || this.Zr || this.Zw || this.Zs) {
      Zvow zvow = this.ZC.Zt().Z_(ZC());
      if (this.ZY)
        zgq.Zu((Zsqx)Zx4i.Zs(this.ZC.Za(), this.ZC.ZN(), zvow)); 
      if (this.Zu)
        zgq.Zu((Zsqx)Ztgz.Ze(this.ZC.Za(), this.ZC.ZN(), zvow, paramZk8m.ZB())); 
      if (this.Zr)
        zgq.Zu((Zsqx)Zx45.Zr(this.ZC.Za(), this.ZC.ZN(), zvow, paramZk8m, this.ZD, this.Zg)); 
      if (this.Zw)
        zgq.Zu((Zsqx)Ztob.ZZ(this.ZC.Za(), this.ZC.ZN(), zvow)); 
      if (this.Zs)
        for (String str : paramZk8m.Zb) {
          zvow = this.ZC.Zt().Z_(ZC());
          zgq.Zu((Zsqx)Zlqa.Zh(this.ZC.Za(), this.ZC.ZN(), zvow, str));
          if (arrayOfInt == null)
            break; 
        }  
    } 
    return Ztk8.Zy((Zgq)zgq);
  }
  
  private List<Zl1r> ZC() {
    ArrayList<Zl1r> arrayList = new ArrayList();
    Zf(arrayList);
    Zy(arrayList);
    return arrayList;
  }
  
  private void Zf(List<Zl1r> paramList) {
    int i = 0;
    Iterator<String> iterator = this.ZC.ZL().Zm().iterator();
    int[] arrayOfInt = Zw();
    while (iterator.hasNext()) {
      String str = iterator.next();
      if (str.toLowerCase(Locale.ENGLISH).startsWith(a(-14290, 18417))) {
        int j = Zlt_.Zd(this.ZC.ZL().Za(), Zkb.Zy(str + str), true, i, (this.ZC.Zp()).Zk);
        paramList.add(Zrlp.Zj(j, j + str.length()));
        i = j + str.length();
      } 
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  private void Zy(List<Zl1r> paramList) {
    int[] arrayOfInt = Zw();
    if ((this.ZC.Zp()).Zd != null)
      for (Ztu8 ztu8 : (this.ZC.Zp()).Zd) {
        if (Zl(ztu8))
          break; 
        if (ZI(ztu8))
          continue; 
        String str1 = ztu8.ZlP().ZI2(a(-14302, -10392));
        String str2 = ztu8.ZlP().ZI2(a(-14294, -20092));
        if (a(-14296, -31921).equalsIgnoreCase(str1) || a(-14293, 5053).equalsIgnoreCase(str1) || str2 != null)
          paramList.add(Zrlp.Zj(ztu8.ZlK(), ztu8.Zli())); 
        if (arrayOfInt == null)
          break; 
      }  
  }
  
  private boolean Zl(Ztu8 paramZtu8) {
    return (paramZtu8.ZlD() == 1 && a(-14301, 29283).equalsIgnoreCase(paramZtu8.ZlP().ZJ3()));
  }
  
  private boolean ZI(Ztu8 paramZtu8) {
    return ((paramZtu8.ZlD() != 0 && paramZtu8.ZlD() != 4) || !a(-14299, 27871).equalsIgnoreCase(paramZtu8.ZlP().ZJ3()));
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_5
    //   8: newarray int
    //   10: iconst_0
    //   11: istore_3
    //   12: invokestatic Zx : ([I)V
    //   15: ldc 'Z0wó9é\\fdb\\tÚ;¡ù9l%\\n×ç w\\rùæðÆà\\fÈM?2~/²m=4VZô=YÆ\\f»ÇoÞÁ³sò¨çªPÜô¿\\nÄ\\b\\fuÆaÂÑÕøá5Æ-Õ²ý¥Í²\\b3Ad;µÈØU~¹\\n#"ø4j1|Z\\tþº%É©~åG\\no,ï(¶r]"'
    //   17: dup
    //   18: astore_2
    //   19: invokevirtual length : ()I
    //   22: istore #4
    //   24: bipush #13
    //   26: istore_1
    //   27: iconst_m1
    //   28: istore_0
    //   29: bipush #90
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 149
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: ldc '»\\f°û¦ÌHðfbmo `À'
    //   76: dup
    //   77: astore_2
    //   78: invokevirtual length : ()I
    //   81: istore #4
    //   83: bipush #12
    //   85: istore_1
    //   86: iconst_m1
    //   87: istore_0
    //   88: bipush #54
    //   90: iinc #0, 1
    //   93: aload_2
    //   94: iload_0
    //   95: dup
    //   96: iload_1
    //   97: iadd
    //   98: invokevirtual substring : (II)Ljava/lang/String;
    //   101: iconst_0
    //   102: goto -> 149
    //   105: aload #5
    //   107: swap
    //   108: iload_3
    //   109: iinc #3, 1
    //   112: swap
    //   113: aastore
    //   114: iload_0
    //   115: iload_1
    //   116: iadd
    //   117: dup
    //   118: istore_0
    //   119: iload #4
    //   121: if_icmpge -> 133
    //   124: aload_2
    //   125: iload_0
    //   126: invokevirtual charAt : (I)C
    //   129: istore_1
    //   130: goto -> 88
    //   133: aload #5
    //   135: putstatic burp/Ze4b.a : [Ljava/lang/String;
    //   138: bipush #18
    //   140: anewarray java/lang/String
    //   143: putstatic burp/Ze4b.b : [Ljava/lang/String;
    //   146: goto -> 308
    //   149: dup_x2
    //   150: pop
    //   151: invokevirtual toCharArray : ()[C
    //   154: dup_x1
    //   155: arraylength
    //   156: dup_x2
    //   157: pop
    //   158: iconst_0
    //   159: istore #6
    //   161: dup2_x1
    //   162: pop2
    //   163: dup_x2
    //   164: iconst_1
    //   165: if_icmpgt -> 268
    //   168: dup2
    //   169: swap
    //   170: iload #6
    //   172: dup2_x1
    //   173: caload
    //   174: swap
    //   175: iload #6
    //   177: bipush #7
    //   179: irem
    //   180: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #63
    //   222: goto -> 252
    //   225: bipush #55
    //   227: goto -> 252
    //   230: bipush #39
    //   232: goto -> 252
    //   235: bipush #76
    //   237: goto -> 252
    //   240: bipush #66
    //   242: goto -> 252
    //   245: bipush #63
    //   247: goto -> 252
    //   250: bipush #20
    //   252: ixor
    //   253: ixor
    //   254: i2c
    //   255: castore
    //   256: iinc #6, 1
    //   259: dup
    //   260: ifne -> 268
    //   263: dup2
    //   264: dup_x1
    //   265: goto -> 172
    //   268: dup2_x1
    //   269: pop2
    //   270: dup_x2
    //   271: iload #6
    //   273: if_icmpgt -> 168
    //   276: pop
    //   277: new java/lang/String
    //   280: dup_x1
    //   281: swap
    //   282: invokespecial <init> : ([C)V
    //   285: invokevirtual intern : ()Ljava/lang/String;
    //   288: swap
    //   289: pop
    //   290: swap
    //   291: tableswitch default -> 46, 0 -> 105
    //   308: bipush #10
    //   310: anewarray java/lang/String
    //   313: dup
    //   314: iconst_0
    //   315: sipush #-14273
    //   318: sipush #3589
    //   321: invokestatic a : (II)Ljava/lang/String;
    //   324: aastore
    //   325: dup
    //   326: iconst_1
    //   327: sipush #-14300
    //   330: sipush #26622
    //   333: invokestatic a : (II)Ljava/lang/String;
    //   336: aastore
    //   337: dup
    //   338: iconst_2
    //   339: sipush #-14289
    //   342: sipush #1719
    //   345: invokestatic a : (II)Ljava/lang/String;
    //   348: aastore
    //   349: dup
    //   350: iconst_3
    //   351: sipush #-14304
    //   354: sipush #2648
    //   357: invokestatic a : (II)Ljava/lang/String;
    //   360: aastore
    //   361: dup
    //   362: iconst_4
    //   363: sipush #-14303
    //   366: sipush #-32423
    //   369: invokestatic a : (II)Ljava/lang/String;
    //   372: aastore
    //   373: dup
    //   374: iconst_5
    //   375: sipush #-14292
    //   378: sipush #-29586
    //   381: invokestatic a : (II)Ljava/lang/String;
    //   384: aastore
    //   385: dup
    //   386: bipush #6
    //   388: sipush #-14295
    //   391: sipush #29749
    //   394: invokestatic a : (II)Ljava/lang/String;
    //   397: aastore
    //   398: dup
    //   399: bipush #7
    //   401: sipush #-14297
    //   404: sipush #19727
    //   407: invokestatic a : (II)Ljava/lang/String;
    //   410: aastore
    //   411: dup
    //   412: bipush #8
    //   414: sipush #-14274
    //   417: sipush #-2216
    //   420: invokestatic a : (II)Ljava/lang/String;
    //   423: aastore
    //   424: dup
    //   425: bipush #9
    //   427: sipush #-14291
    //   430: sipush #17107
    //   433: invokestatic a : (II)Ljava/lang/String;
    //   436: aastore
    //   437: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   440: putstatic burp/Ze4b.ZP : Ljava/util/List;
    //   443: return
  }
  
  public static void Zx(int[] paramArrayOfint) {
    Zf = paramArrayOfint;
  }
  
  public static int[] Zw() {
    return Zf;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC82E) & 0xFFFF;
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
      char c = '³';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze4b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */