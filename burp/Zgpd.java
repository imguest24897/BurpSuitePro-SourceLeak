package burp;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import net.portswigger.Zkb;

public class Zgpd {
  private static String[] ZW;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public static Zsqx<Zrdb> ZL(Zmzk paramZmzk, String paramString1, byte paramByte, Zlvf paramZlvf, byte[] paramArrayOfbyte, String paramString2, String paramString3, String paramString4, List<Zl1r> paramList1, List<Zl1r> paramList2, Zxs7 paramZxs7) {
    Map<Long, String> map = Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.HTML_TAG, paramString3), Zriz.ZG(Ztz3.HTML_ATTRIBUTE, paramString4), Zriz.ZG(Ztz3.MATCH, paramString2) });
    byte b = 1;
    String[] arrayOfString = ZU();
    if (a(-16600, -10379).equalsIgnoreCase(paramString3) && a(-16595, -13850).equalsIgnoreCase(paramString4))
      b = 3; 
    if (Zbqc.Zwu() == null)
      Zv(new String[2]); 
    return Zi(paramZmzk, paramString1, paramByte, paramZlvf, paramArrayOfbyte, paramList1, paramList2, paramZxs7, map, b);
  }
  
  public static Zsqx<Zrdb> Zp(Zmzk paramZmzk, String paramString1, byte paramByte, Zlvf paramZlvf, byte[] paramArrayOfbyte, String paramString2, String paramString3, List<Zl1r> paramList1, List<Zl1r> paramList2, Zxs7 paramZxs7) {
    Map<Long, String> map = Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.HEADER_NAME, paramString3), Zriz.ZG(Ztz3.MATCH, paramString2) });
    return Zi(paramZmzk, paramString1, paramByte, paramZlvf, paramArrayOfbyte, paramList1, paramList2, paramZxs7, map, (byte)1);
  }
  
  public static Zsqx<Zrdb> Zr(Zmzk paramZmzk, String paramString1, byte paramByte, Zlvf paramZlvf, byte[] paramArrayOfbyte, String paramString2, List<Zl1r> paramList1, List<Zl1r> paramList2, Zxs7 paramZxs7) {
    Map<Long, String> map = Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.MATCH, paramString2) });
    return Zi(paramZmzk, paramString1, paramByte, paramZlvf, paramArrayOfbyte, paramList1, paramList2, paramZxs7, map, (byte)1);
  }
  
  private static Zsqx<Zrdb> Zi(Zmzk paramZmzk, String paramString, byte paramByte1, Zlvf paramZlvf, byte[] paramArrayOfbyte, List<Zl1r> paramList1, List<Zl1r> paramList2, Zxs7 paramZxs7, Map<Long, String> paramMap, byte paramByte2) {
    return new Zx_5(paramZlvf.<Zvs>Za(Zzu2.LINK_MANIPULATION_REFLECTED, Zzu2.LINK_MANIPULATION_STORED), paramByte1, 0, paramMap, (List)Collections.singletonList(paramZlvf.Zq(new Zz25(paramArrayOfbyte, 0), paramList1, paramList2)), (byte)2, paramByte2, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static void ZS(Ztlj paramZtlj, StringBuilder paramStringBuilder) {
    // Byte code:
    //   0: invokestatic ZU : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getstatic burp/Ztz3.HTML_TAG : Lburp/Ztz3;
    //   8: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   11: ifnull -> 101
    //   14: aload_1
    //   15: sipush #-16597
    //   18: sipush #18730
    //   21: invokestatic a : (II)Ljava/lang/String;
    //   24: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: aload_0
    //   28: getstatic burp/Ztz3.HTML_ATTRIBUTE : Lburp/Ztz3;
    //   31: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   34: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: sipush #-16594
    //   40: sipush #-14232
    //   43: invokestatic a : (II)Ljava/lang/String;
    //   46: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: aload_0
    //   50: getstatic burp/Ztz3.HTML_TAG : Lburp/Ztz3;
    //   53: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   56: invokestatic Zu : (Ljava/lang/String;)Ljava/lang/String;
    //   59: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: sipush #-16604
    //   65: sipush #-21801
    //   68: invokestatic a : (II)Ljava/lang/String;
    //   71: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: aload_0
    //   75: getstatic burp/Ztz3.HTML_TAG : Lburp/Ztz3;
    //   78: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   81: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: sipush #-16593
    //   87: sipush #5410
    //   90: invokestatic a : (II)Ljava/lang/String;
    //   93: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: aload_2
    //   98: ifnonnull -> 165
    //   101: aload_0
    //   102: getstatic burp/Ztz3.HEADER_NAME : Lburp/Ztz3;
    //   105: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   108: ifnull -> 151
    //   111: aload_1
    //   112: sipush #-16596
    //   115: sipush #16417
    //   118: invokestatic a : (II)Ljava/lang/String;
    //   121: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: aload_0
    //   125: getstatic burp/Ztz3.HEADER_NAME : Lburp/Ztz3;
    //   128: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   131: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: sipush #-16599
    //   137: sipush #6323
    //   140: invokestatic a : (II)Ljava/lang/String;
    //   143: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: pop
    //   147: aload_2
    //   148: ifnonnull -> 165
    //   151: aload_1
    //   152: sipush #-16598
    //   155: sipush #-18562
    //   158: invokestatic a : (II)Ljava/lang/String;
    //   161: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: pop
    //   165: return
  }
  
  public static void Zv(String[] paramArrayOfString) {
    ZW = paramArrayOfString;
  }
  
  public static String[] ZU() {
    return ZW;
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_3
    //   8: anewarray java/lang/String
    //   11: iconst_0
    //   12: istore_3
    //   13: ldc 'ôÓç¶Zâ$mKCä£ý2=BVmSææ~mçE<\\r´Ð%Çû"*MZ,mZmçºÊÎ °\\ríïhw;>s¾¢qé²'fÂx`æs¨Îiµ¬¦áGVÁ\\b½Oåõ\\nºbPt¥Ó­)tFû¦LóU´f'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: invokestatic Zv : ([Ljava/lang/String;)V
    //   25: bipush #31
    //   27: istore_1
    //   28: iconst_m1
    //   29: istore_0
    //   30: bipush #42
    //   32: iinc #0, 1
    //   35: aload_2
    //   36: iload_0
    //   37: dup
    //   38: iload_1
    //   39: iadd
    //   40: invokevirtual substring : (II)Ljava/lang/String;
    //   43: iconst_m1
    //   44: goto -> 150
    //   47: aload #5
    //   49: swap
    //   50: iload_3
    //   51: iinc #3, 1
    //   54: swap
    //   55: aastore
    //   56: iload_0
    //   57: iload_1
    //   58: iadd
    //   59: dup
    //   60: istore_0
    //   61: iload #4
    //   63: if_icmpge -> 75
    //   66: aload_2
    //   67: iload_0
    //   68: invokevirtual charAt : (I)C
    //   71: istore_1
    //   72: goto -> 30
    //   75: ldc 'þÒÁ¢¬///Os'
    //   77: dup
    //   78: astore_2
    //   79: invokevirtual length : ()I
    //   82: istore #4
    //   84: bipush #13
    //   86: istore_1
    //   87: iconst_m1
    //   88: istore_0
    //   89: bipush #24
    //   91: iinc #0, 1
    //   94: aload_2
    //   95: iload_0
    //   96: dup
    //   97: iload_1
    //   98: iadd
    //   99: invokevirtual substring : (II)Ljava/lang/String;
    //   102: iconst_0
    //   103: goto -> 150
    //   106: aload #5
    //   108: swap
    //   109: iload_3
    //   110: iinc #3, 1
    //   113: swap
    //   114: aastore
    //   115: iload_0
    //   116: iload_1
    //   117: iadd
    //   118: dup
    //   119: istore_0
    //   120: iload #4
    //   122: if_icmpge -> 134
    //   125: aload_2
    //   126: iload_0
    //   127: invokevirtual charAt : (I)C
    //   130: istore_1
    //   131: goto -> 89
    //   134: aload #5
    //   136: putstatic burp/Zgpd.b : [Ljava/lang/String;
    //   139: bipush #9
    //   141: anewarray java/lang/String
    //   144: putstatic burp/Zgpd.c : [Ljava/lang/String;
    //   147: goto -> 308
    //   150: dup_x2
    //   151: pop
    //   152: invokevirtual toCharArray : ()[C
    //   155: dup_x1
    //   156: arraylength
    //   157: dup_x2
    //   158: pop
    //   159: iconst_0
    //   160: istore #6
    //   162: dup2_x1
    //   163: pop2
    //   164: dup_x2
    //   165: iconst_1
    //   166: if_icmpgt -> 268
    //   169: dup2
    //   170: swap
    //   171: iload #6
    //   173: dup2_x1
    //   174: caload
    //   175: swap
    //   176: iload #6
    //   178: bipush #7
    //   180: irem
    //   181: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #40
    //   222: goto -> 252
    //   225: bipush #123
    //   227: goto -> 252
    //   230: bipush #94
    //   232: goto -> 252
    //   235: bipush #33
    //   237: goto -> 252
    //   240: bipush #46
    //   242: goto -> 252
    //   245: bipush #30
    //   247: goto -> 252
    //   250: bipush #102
    //   252: ixor
    //   253: ixor
    //   254: i2c
    //   255: castore
    //   256: iinc #6, 1
    //   259: dup
    //   260: ifne -> 268
    //   263: dup2
    //   264: dup_x1
    //   265: goto -> 173
    //   268: dup2_x1
    //   269: pop2
    //   270: dup_x2
    //   271: iload #6
    //   273: if_icmpgt -> 169
    //   276: pop
    //   277: new java/lang/String
    //   280: dup_x1
    //   281: swap
    //   282: invokespecial <init> : ([C)V
    //   285: invokevirtual intern : ()Ljava/lang/String;
    //   288: swap
    //   289: pop
    //   290: swap
    //   291: tableswitch default -> 47, 0 -> 106
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFBF2C) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      char c = 'Ý';
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgpd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */