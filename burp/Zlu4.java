package burp;

import java.util.ArrayList;
import java.util.List;

public class Zlu4 implements Zehc {
  private static final List<Short> Zq;
  
  private static final List<Short> ZC;
  
  private final Ze3n ZV;
  
  private String ZN = "";
  
  private String Zc;
  
  private static Zbqc[] ZL;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zlu4(Ze3n paramZe3n) {
    Zbqc[] arrayOfZbqc = ZQ();
    this.Zc = "";
    this.ZV = paramZe3n;
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public Ztk8 Zb() {
    Zbqc[] arrayOfZbqc = ZQ();
    Zs68 zs68 = this.ZV.Zp();
    if (Za() || Zw(zs68) || ZO(zs68))
      return Ztk8.ZD(); 
    ArrayList<int[]> arrayList = new ArrayList();
    ZU(zs68, (List<int[]>)arrayList);
    ZH(zs68, (List<int[]>)arrayList);
    if (Zbqc.Zwu() == null)
      Zf(new Zbqc[1]); 
    return Zg() ? Ztk8.ZY(ZV((List<int[]>)arrayList)) : Ztk8.ZD();
  }
  
  public Zlcm ZP() {
    return Zlcm.PPR_CacheableHttpsResponse;
  }
  
  private boolean Za() {
    return !this.ZV.Za().ZJZ();
  }
  
  private boolean Zw(Zs68 paramZs68) {
    return (paramZs68.Zb < 200 || paramZs68.Zb > 299);
  }
  
  private boolean ZO(Zs68 paramZs68) {
    Zk8m zk8m = paramZs68.ZH;
    return (!Zq.contains(Short.valueOf(zk8m.ZJ)) && !ZC.contains(Short.valueOf(zk8m.Zj)));
  }
  
  private void ZU(Zs68 paramZs68, List<int[]> paramList) {
    // Byte code:
    //   0: invokestatic ZQ : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_1
    //   5: getfield ZP : Ljava/util/List;
    //   8: invokeinterface iterator : ()Ljava/util/Iterator;
    //   13: astore #4
    //   15: aload #4
    //   17: invokeinterface hasNext : ()Z
    //   22: ifeq -> 211
    //   25: aload #4
    //   27: invokeinterface next : ()Ljava/lang/Object;
    //   32: checkcast java/lang/String
    //   35: astore #5
    //   37: aload #5
    //   39: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   42: sipush #12882
    //   45: sipush #-21656
    //   48: invokestatic a : (II)Ljava/lang/String;
    //   51: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   54: ifeq -> 124
    //   57: aload_0
    //   58: dup
    //   59: getfield ZN : Ljava/lang/String;
    //   62: aload #5
    //   64: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   69: putfield ZN : Ljava/lang/String;
    //   72: aload_0
    //   73: getfield ZV : Lburp/Ze3n;
    //   76: invokevirtual ZL : ()Lburp/Zb6q;
    //   79: invokeinterface Za : ()Lburp/Zstu;
    //   84: aload #5
    //   86: invokestatic Zy : (Ljava/lang/String;)[B
    //   89: invokestatic Zr : (Lburp/Zstu;[B)I
    //   92: istore #6
    //   94: aload_2
    //   95: iconst_2
    //   96: newarray int
    //   98: dup
    //   99: iconst_0
    //   100: iload #6
    //   102: iastore
    //   103: dup
    //   104: iconst_1
    //   105: iload #6
    //   107: aload #5
    //   109: invokevirtual length : ()I
    //   112: iadd
    //   113: iastore
    //   114: invokeinterface add : (Ljava/lang/Object;)Z
    //   119: pop
    //   120: aload_3
    //   121: ifnull -> 207
    //   124: aload #5
    //   126: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   129: sipush #12885
    //   132: sipush #10923
    //   135: invokestatic a : (II)Ljava/lang/String;
    //   138: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   141: ifeq -> 207
    //   144: aload_0
    //   145: dup
    //   146: getfield Zc : Ljava/lang/String;
    //   149: aload #5
    //   151: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   156: putfield Zc : Ljava/lang/String;
    //   159: aload_0
    //   160: getfield ZV : Lburp/Ze3n;
    //   163: invokevirtual ZL : ()Lburp/Zb6q;
    //   166: invokeinterface Za : ()Lburp/Zstu;
    //   171: aload #5
    //   173: invokestatic Zy : (Ljava/lang/String;)[B
    //   176: invokestatic Zr : (Lburp/Zstu;[B)I
    //   179: istore #6
    //   181: aload_2
    //   182: iconst_2
    //   183: newarray int
    //   185: dup
    //   186: iconst_0
    //   187: iload #6
    //   189: iastore
    //   190: dup
    //   191: iconst_1
    //   192: iload #6
    //   194: aload #5
    //   196: invokevirtual length : ()I
    //   199: iadd
    //   200: iastore
    //   201: invokeinterface add : (Ljava/lang/Object;)Z
    //   206: pop
    //   207: aload_3
    //   208: ifnull -> 15
    //   211: return
  }
  
  private void ZH(Zs68 paramZs68, List<int[]> paramList) {
    Zbqc[] arrayOfZbqc = ZQ();
    if (paramZs68.Zd == null)
      return; 
    for (Ztu8 ztu8 : paramZs68.Zd) {
      if (Zh(ztu8))
        break; 
      if (ZC(ztu8))
        continue; 
      ZY(paramList, ztu8);
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private boolean Zh(Ztu8 paramZtu8) {
    return (paramZtu8.ZlD() == 1 && a(12895, 21131).equalsIgnoreCase(paramZtu8.ZlP().ZJ3()));
  }
  
  private boolean ZC(Ztu8 paramZtu8) {
    return ((paramZtu8.ZlD() != 0 && paramZtu8.ZlD() != 4) || !a(12887, -23613).equalsIgnoreCase(paramZtu8.ZlP().ZJ3()));
  }
  
  private void ZY(List<int[]> paramList, Ztu8 paramZtu8) {
    Zbqc[] arrayOfZbqc = ZQ();
    String str = paramZtu8.ZlP().ZI2(a(12880, -20850));
    if (a(12881, -13160).equalsIgnoreCase(str)) {
      this.ZN += this.ZN;
      paramList.add(new int[] { paramZtu8.ZlK(), paramZtu8.Zli() });
      if (arrayOfZbqc != null) {
        if (a(12883, 18337).equalsIgnoreCase(str)) {
          this.Zc += this.Zc;
          paramList.add(new int[] { paramZtu8.ZlK(), paramZtu8.Zli() });
        } 
        return;
      } 
      return;
    } 
    if (a(12883, 18337).equalsIgnoreCase(str)) {
      this.Zc += this.Zc;
      paramList.add(new int[] { paramZtu8.ZlK(), paramZtu8.Zli() });
    } 
  }
  
  private boolean Zg() {
    return (!this.ZN.toLowerCase().contains(a(12893, 26078)) && !this.ZN.toLowerCase().contains(a(12892, 32206)) && !this.Zc.toLowerCase().contains(a(12884, -13451)));
  }
  
  private Zx_5 ZV(List<int[]> paramList) {
    Zvow zvow = this.ZV.Zt().Z_(Zrlp.Zc(paramList));
    return Zshj.Zk(this.ZV.Za(), this.ZV.ZN(), zvow);
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic Zf : ([Lburp/Zbqc;)V
    //   13: ldc ' ñÀè¿4JÃ="T2jS`§üéËâÐ\\nñDkêr¢¼\\rJvNêp¾r/£ÖÝ$ð »§u8\\fYqSX\\b6t6¡(¦¡\\bõ¢¤¯½'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: bipush #8
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #40
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc '¡4E\\nÆ2Y?%'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #7
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #121
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic burp/Zlu4.a : [Ljava/lang/String;
    //   136: bipush #12
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zlu4.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #73
    //   218: goto -> 248
    //   221: bipush #67
    //   223: goto -> 248
    //   226: bipush #111
    //   228: goto -> 248
    //   231: bipush #68
    //   233: goto -> 248
    //   236: bipush #19
    //   238: goto -> 248
    //   241: bipush #57
    //   243: goto -> 248
    //   246: bipush #85
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 103
    //   304: bipush #6
    //   306: anewarray java/lang/Short
    //   309: dup
    //   310: iconst_0
    //   311: sipush #256
    //   314: invokestatic valueOf : (S)Ljava/lang/Short;
    //   317: aastore
    //   318: dup
    //   319: iconst_1
    //   320: sipush #257
    //   323: invokestatic valueOf : (S)Ljava/lang/Short;
    //   326: aastore
    //   327: dup
    //   328: iconst_2
    //   329: sipush #260
    //   332: invokestatic valueOf : (S)Ljava/lang/Short;
    //   335: aastore
    //   336: dup
    //   337: iconst_3
    //   338: sipush #262
    //   341: invokestatic valueOf : (S)Ljava/lang/Short;
    //   344: aastore
    //   345: dup
    //   346: iconst_4
    //   347: iconst_1
    //   348: invokestatic valueOf : (S)Ljava/lang/Short;
    //   351: aastore
    //   352: dup
    //   353: iconst_5
    //   354: sipush #1025
    //   357: invokestatic valueOf : (S)Ljava/lang/Short;
    //   360: aastore
    //   361: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   364: putstatic burp/Zlu4.Zq : Ljava/util/List;
    //   367: iconst_4
    //   368: anewarray java/lang/Short
    //   371: dup
    //   372: iconst_0
    //   373: sipush #256
    //   376: invokestatic valueOf : (S)Ljava/lang/Short;
    //   379: aastore
    //   380: dup
    //   381: iconst_1
    //   382: sipush #257
    //   385: invokestatic valueOf : (S)Ljava/lang/Short;
    //   388: aastore
    //   389: dup
    //   390: iconst_2
    //   391: sipush #260
    //   394: invokestatic valueOf : (S)Ljava/lang/Short;
    //   397: aastore
    //   398: dup
    //   399: iconst_3
    //   400: sipush #262
    //   403: invokestatic valueOf : (S)Ljava/lang/Short;
    //   406: aastore
    //   407: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   410: putstatic burp/Zlu4.ZC : Ljava/util/List;
    //   413: return
  }
  
  public static void Zf(Zbqc[] paramArrayOfZbqc) {
    ZL = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZQ() {
    return ZL;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3254) & 0xFFFF;
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
      byte b1 = 4;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlu4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */