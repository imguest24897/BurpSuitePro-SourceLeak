package burp;

import net.portswigger.Zah;
import net.portswigger.Zi7;
import net.portswigger.Zk_;
import net.portswigger.Zlh;
import net.portswigger.Zrmq;
import net.portswigger.Zv3;

public class Zea1 implements Zrup {
  private static Zbqc[] ZY;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrtu Zp(Zefx paramZefx) {
    try {
      if (paramZefx.Zr().equals(a(8035, 22088)))
        try {
          if (paramZefx.Zv() == Zsba.JSON) {
            try {
              Zrmq zrmq = Zv3.Zz(paramZefx.Zw());
              if (zrmq.Za()) {
                Zi7 zi7 = zrmq.Zu();
                Zrmq zrmq1 = zi7.Zo(a(8037, -4954));
                try {
                
                } catch (Zlh zlh) {
                  throw a(null);
                } 
                return zrmq1.Zr() ? new Zx6q(zi7, zrmq1.ZN()) : null;
              } 
            } catch (Zlh zlh) {
              Zah.Zl((Throwable)zlh, Zk_.COMMON_RUNTIME_FAILURE);
            } 
            return null;
          } 
          return null;
        } catch (Zlh zlh) {
          throw a(null);
        }  
    } catch (Zlh zlh) {
      throw a(null);
    } 
    return null;
  }
  
  public Zefx Zl(Zefx paramZefx, String paramString1, String paramString2, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZM : ()[Lburp/Zbqc;
    //   3: astore #5
    //   5: aload_1
    //   6: invokeinterface Zw : ()[B
    //   11: invokestatic Zz : ([B)Lnet/portswigger/Zrmq;
    //   14: astore #6
    //   16: aload #6
    //   18: invokeinterface Za : ()Z
    //   23: ifeq -> 213
    //   26: aload #6
    //   28: invokeinterface Zu : ()Lnet/portswigger/Zi7;
    //   33: astore #7
    //   35: aload #7
    //   37: sipush #8039
    //   40: sipush #-13205
    //   43: invokestatic a : (II)Ljava/lang/String;
    //   46: aload_2
    //   47: invokeinterface Zg : (Ljava/lang/String;Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   52: pop
    //   53: aload_3
    //   54: ifnull -> 100
    //   57: aload_3
    //   58: invokevirtual isBlank : ()Z
    //   61: ifeq -> 100
    //   64: goto -> 71
    //   67: invokestatic a : (Lnet/portswigger/Zlh;)Lnet/portswigger/Zlh;
    //   70: athrow
    //   71: aload #7
    //   73: sipush #8033
    //   76: sipush #-4323
    //   79: invokestatic a : (II)Ljava/lang/String;
    //   82: invokeinterface ZQ : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   87: pop
    //   88: aload #5
    //   90: ifnull -> 139
    //   93: goto -> 100
    //   96: invokestatic a : (Lnet/portswigger/Zlh;)Lnet/portswigger/Zlh;
    //   99: athrow
    //   100: aload_3
    //   101: ifnull -> 139
    //   104: goto -> 111
    //   107: invokestatic a : (Lnet/portswigger/Zlh;)Lnet/portswigger/Zlh;
    //   110: athrow
    //   111: aload #7
    //   113: sipush #8036
    //   116: sipush #889
    //   119: invokestatic a : (II)Ljava/lang/String;
    //   122: aload_3
    //   123: invokestatic Zp : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   126: invokeinterface ZN : (Ljava/lang/String;Lnet/portswigger/Zd4;)Lnet/portswigger/Zrmq;
    //   131: pop
    //   132: goto -> 139
    //   135: invokestatic a : (Lnet/portswigger/Zlh;)Lnet/portswigger/Zlh;
    //   138: athrow
    //   139: iload #4
    //   141: ifeq -> 168
    //   144: aload #7
    //   146: sipush #8034
    //   149: sipush #-17107
    //   152: invokestatic a : (II)Ljava/lang/String;
    //   155: invokeinterface ZQ : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   160: pop
    //   161: goto -> 168
    //   164: invokestatic a : (Lnet/portswigger/Zlh;)Lnet/portswigger/Zlh;
    //   167: athrow
    //   168: aload #7
    //   170: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   175: invokeinterface ZU : ()[B
    //   180: astore #8
    //   182: aload_1
    //   183: aload #8
    //   185: invokeinterface ZZ : ([B)Lburp/Zefx;
    //   190: sipush #8032
    //   193: sipush #3686
    //   196: invokestatic a : (II)Ljava/lang/String;
    //   199: aload #8
    //   201: arraylength
    //   202: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
    //   207: invokeinterface Zx : (Ljava/lang/String;Ljava/lang/String;)Lburp/Zefx;
    //   212: areturn
    //   213: goto -> 226
    //   216: astore #6
    //   218: aload #6
    //   220: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   223: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   226: aload_1
    //   227: areturn
    // Exception table:
    //   from	to	target	type
    //   5	212	216	net/portswigger/Zlh
    //   35	64	67	net/portswigger/Zlh
    //   57	93	96	net/portswigger/Zlh
    //   71	104	107	net/portswigger/Zlh
    //   100	132	135	net/portswigger/Zlh
    //   139	161	164	net/portswigger/Zlh
  }
  
  public static void ZS(Zbqc[] paramArrayOfZbqc) {
    ZY = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZM() {
    return ZY;
  }
  
  private static Zlh a(Zlh paramZlh) {
    return paramZlh;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic ZS : ([Lburp/Zbqc;)V
    //   13: ldc '-³µ6»(Îµ¬dÑaÇ÷\\r¾vÌ«äðBsxêI§'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: bipush #9
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #115
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
    //   72: ldc 'â\\b¢^"=gÞë¡'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #9
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #46
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
    //   133: putstatic burp/Zea1.a : [Ljava/lang/String;
    //   136: bipush #7
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zea1.b : [Ljava/lang/String;
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
    //   216: bipush #55
    //   218: goto -> 248
    //   221: bipush #80
    //   223: goto -> 248
    //   226: bipush #7
    //   228: goto -> 248
    //   231: bipush #81
    //   233: goto -> 248
    //   236: bipush #103
    //   238: goto -> 248
    //   241: bipush #11
    //   243: goto -> 248
    //   246: bipush #80
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
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1F61) & 0xFFFF;
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
      char c = 'ª';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zea1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */