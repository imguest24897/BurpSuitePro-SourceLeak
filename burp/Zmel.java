package burp;

import java.util.EnumSet;

public class Zmel extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmel() {
    super(EnumSet.of(Zzqz.VARIANT));
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: invokestatic Zi : ()I
    //   3: istore #11
    //   5: aload #5
    //   7: invokevirtual Zt : ()Lburp/Zt38;
    //   10: invokeinterface ZCr : ()Lburp/Zefg;
    //   15: astore #12
    //   17: aload #12
    //   19: ifnonnull -> 31
    //   22: iconst_0
    //   23: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   26: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   29: aconst_null
    //   30: areturn
    //   31: new java/lang/StringBuilder
    //   34: dup
    //   35: invokespecial <init> : ()V
    //   38: astore #13
    //   40: aload #4
    //   42: getstatic burp/Ztz3.REQUEST_CONTAINS_TOKEN : Lburp/Ztz3;
    //   45: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   48: invokestatic parseBoolean : (Ljava/lang/String;)Z
    //   51: istore #14
    //   53: aload #4
    //   55: invokevirtual Zm : ()Lburp/Zlt9;
    //   58: getstatic burp/Zlt9.MERGE_MULTIPLE_IDENTIFIERS : Lburp/Zlt9;
    //   61: if_acmpne -> 84
    //   64: aload #13
    //   66: sipush #28247
    //   69: sipush #29539
    //   72: invokestatic a : (II)Ljava/lang/String;
    //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: pop
    //   79: iload #11
    //   81: ifeq -> 129
    //   84: iload #14
    //   86: ifne -> 94
    //   89: iload_2
    //   90: iconst_1
    //   91: if_icmpne -> 114
    //   94: aload #13
    //   96: sipush #28240
    //   99: sipush #25843
    //   102: invokestatic a : (II)Ljava/lang/String;
    //   105: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: iload #11
    //   111: ifeq -> 129
    //   114: aload #13
    //   116: sipush #28245
    //   119: sipush #18598
    //   122: invokestatic a : (II)Ljava/lang/String;
    //   125: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: pop
    //   129: aload #12
    //   131: invokeinterface iterator : ()Ljava/util/Iterator;
    //   136: astore #15
    //   138: aload #15
    //   140: invokeinterface hasNext : ()Z
    //   145: ifeq -> 207
    //   148: aload #15
    //   150: invokeinterface next : ()Ljava/lang/Object;
    //   155: checkcast burp/Zsdr
    //   158: astore #16
    //   160: aload #13
    //   162: sipush #28242
    //   165: sipush #-18930
    //   168: invokestatic a : (II)Ljava/lang/String;
    //   171: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: pop
    //   175: aload #13
    //   177: aload #16
    //   179: invokeinterface toString : ()Ljava/lang/String;
    //   184: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   187: aload #13
    //   189: sipush #28244
    //   192: sipush #-16097
    //   195: invokestatic a : (II)Ljava/lang/String;
    //   198: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: pop
    //   202: iload #11
    //   204: ifeq -> 138
    //   207: aload #13
    //   209: sipush #28246
    //   212: sipush #-2463
    //   215: invokestatic a : (II)Ljava/lang/String;
    //   218: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: pop
    //   222: aload #13
    //   224: aload #4
    //   226: aload #5
    //   228: sipush #28241
    //   231: sipush #-23538
    //   234: invokestatic a : (II)Ljava/lang/String;
    //   237: invokestatic ZE : (Ljava/lang/StringBuilder;Lburp/Ztlj;Lburp/Ztub;Ljava/lang/String;)V
    //   240: aload #13
    //   242: invokevirtual toString : ()Ljava/lang/String;
    //   245: invokestatic Zwu : ()[Lburp/Zbqc;
    //   248: ifnonnull -> 259
    //   251: iinc #11, 1
    //   254: iload #11
    //   256: invokestatic ZJ : (I)V
    //   259: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '9wÊúTÐ2ø6%=¡!)7;¥rÑÂb Ïä®M[}a\\b1Ù·W}yqîÊvË¯AýwÃôäÑcèùÅ»\âÈS¼«W´Ð Î*¶zî\\n>?¢»||ë¿'ÆØ,ã´ãôæÍÜg¾æøU\\fÁ©¶S¸(½Y_¼!gTfÂ^H'ÔuìÎL%Vç_ÔàÍ¾ËoNÆBá?}û6KÜûXÌAB@K¶\\fZÙë¨\\r¸®²ø.\\bEëûâä_º¼pÖÁÝõ\\t@öV:­ tyÜã'£u'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: iconst_4
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 141
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 22
    //   66: ldc '½)azú=\\rñojúÂ0ÈoÇ%BØÝÐ$ÞÏ¿Fç_z*l²z)8¿U¬º3fcÀhà±½4Êa{ñ×¼¿kÈs\\n=Ý>%x¹Àí7ã¯SHA\Æµ'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: bipush #91
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #67
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zmel.a : [Ljava/lang/String;
    //   130: bipush #7
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zmel.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 259
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 231, 5 -> 236
    //   212: bipush #99
    //   214: goto -> 243
    //   217: bipush #118
    //   219: goto -> 243
    //   222: bipush #123
    //   224: goto -> 243
    //   227: iconst_4
    //   228: goto -> 243
    //   231: bipush #32
    //   233: goto -> 243
    //   236: bipush #127
    //   238: goto -> 243
    //   241: bipush #52
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 164
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 160
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 38, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6E54) & 0xFFFF;
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
      byte b1 = 7;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmel.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */