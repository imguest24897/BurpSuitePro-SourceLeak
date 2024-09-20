package burp;

import java.io.IOException;
import java.net.Socket;

public class Zb0b implements Zea5 {
  private final Ztbb Zq;
  
  private final Zz0s ZI;
  
  private final Zr1u Zl;
  
  private final Zxtv ZU;
  
  private final Zzen Zd;
  
  private final Zei5 ZQ;
  
  private final Zmgk ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zb0b(Ztbb paramZtbb, Zxdt paramZxdt, Zz95 paramZz95, Zb_d paramZb_d, Zrps paramZrps, Zgzx paramZgzx, Zxtv paramZxtv, Zzen paramZzen, Zsil paramZsil, Zthe paramZthe, Ztxn paramZtxn, Zg6h paramZg6h) {
    this.Zq = paramZtbb;
    this.ZU = paramZxtv;
    this.Zd = paramZzen;
    this.Zl = new Zl7u(paramZtbb, paramZgzx, paramZxtv, paramZxdt, paramZrps);
    this.ZI = new Zz0s(paramZz95, paramZrps, paramZxtv, paramZthe, paramZtxn, paramZsil, paramZzen);
    boolean bool = Zmjb.ZG();
    this.ZQ = new Zei5(paramZxdt, paramZgzx, paramZg6h);
    this.ZW = new Zmgk(paramZb_d, paramZxdt, paramZxtv);
    if (!bool)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public Zlvr Zw(Zmzk paramZmzk) throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zl : Lburp/Zr1u;
    //   4: aload_1
    //   5: invokeinterface Zm : (Lburp/Zmzk;)Lburp/Zlvr;
    //   10: astore_2
    //   11: aload_2
    //   12: ifnull -> 21
    //   15: aload_2
    //   16: areturn
    //   17: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   20: athrow
    //   21: aload_0
    //   22: getfield ZI : Lburp/Zz0s;
    //   25: aload_1
    //   26: invokevirtual Zf : (Lburp/Zmzk;)Ljava/net/Socket;
    //   29: astore_3
    //   30: aload_3
    //   31: ifnonnull -> 40
    //   34: aconst_null
    //   35: areturn
    //   36: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   39: athrow
    //   40: aload_0
    //   41: aload_3
    //   42: aload_1
    //   43: invokevirtual Zj : (Ljava/net/Socket;Lburp/Zmzk;)Z
    //   46: ifeq -> 185
    //   49: aload_0
    //   50: getfield ZU : Lburp/Zxtv;
    //   53: invokevirtual ZE : ()Z
    //   56: ifne -> 185
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   65: athrow
    //   66: aload_3
    //   67: invokestatic Zq : (Ljava/net/Socket;)Z
    //   70: ifeq -> 95
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   79: athrow
    //   80: aload_0
    //   81: getfield Zq : Lburp/Ztbb;
    //   84: aload_1
    //   85: invokevirtual Z_ : (Lburp/Zmzk;)V
    //   88: goto -> 95
    //   91: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   94: athrow
    //   95: aload_0
    //   96: getfield ZU : Lburp/Zxtv;
    //   99: invokevirtual Zy : ()Lburp/Ze45;
    //   102: getstatic burp/Ze45.ONLY_HTTP2 : Lburp/Ze45;
    //   105: if_acmpeq -> 128
    //   108: aload_0
    //   109: getfield ZU : Lburp/Zxtv;
    //   112: invokevirtual Zy : ()Lburp/Ze45;
    //   115: getstatic burp/Ze45.ONLY_HTTP2_NON_POOLED : Lburp/Ze45;
    //   118: if_acmpne -> 175
    //   121: goto -> 128
    //   124: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   127: athrow
    //   128: aload_1
    //   129: invokeinterface ZJZ : ()Z
    //   134: ifeq -> 158
    //   137: goto -> 144
    //   140: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   143: athrow
    //   144: new burp/Zls6
    //   147: dup
    //   148: invokespecial <init> : ()V
    //   151: goto -> 174
    //   154: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   157: athrow
    //   158: new java/io/IOException
    //   161: dup
    //   162: sipush #30494
    //   165: sipush #-4841
    //   168: invokestatic a : (II)Ljava/lang/String;
    //   171: invokespecial <init> : (Ljava/lang/String;)V
    //   174: athrow
    //   175: aload_0
    //   176: getfield ZQ : Lburp/Zei5;
    //   179: aload_3
    //   180: aload_1
    //   181: invokevirtual Zs : (Ljava/net/Socket;Lburp/Zmzk;)Lburp/Zb43;
    //   184: areturn
    //   185: aload_0
    //   186: getfield ZU : Lburp/Zxtv;
    //   189: invokevirtual ZE : ()Z
    //   192: ifne -> 220
    //   195: aload_0
    //   196: getfield Zd : Lburp/Zzen;
    //   199: aload_1
    //   200: invokeinterface Zc : (Lburp/Zmzk;)V
    //   205: aload_0
    //   206: getfield Zq : Lburp/Ztbb;
    //   209: aload_1
    //   210: invokevirtual Zo : (Lburp/Zmzk;)V
    //   213: goto -> 220
    //   216: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   219: athrow
    //   220: aload_0
    //   221: getfield ZW : Lburp/Zmgk;
    //   224: aload_3
    //   225: aload_1
    //   226: invokevirtual Zc : (Ljava/net/Socket;Lburp/Zmzk;)Lburp/Zgke;
    //   229: astore #4
    //   231: new burp/Zttk
    //   234: dup
    //   235: aload #4
    //   237: aload_0
    //   238: getfield ZU : Lburp/Zxtv;
    //   241: invokevirtual ZK : ()Z
    //   244: invokespecial <init> : (Lburp/Zgke;Z)V
    //   247: areturn
    // Exception table:
    //   from	to	target	type
    //   11	17	17	java/io/IOException
    //   30	36	36	java/io/IOException
    //   40	59	62	java/io/IOException
    //   49	73	76	java/io/IOException
    //   66	88	91	java/io/IOException
    //   95	121	124	java/io/IOException
    //   108	137	140	java/io/IOException
    //   128	154	154	java/io/IOException
    //   185	213	216	java/io/IOException
  }
  
  private boolean Zj(Socket paramSocket, Zmzk paramZmzk) {
    return (!Z_(paramSocket) || this.Zq.ZQ(paramZmzk));
  }
  
  private static boolean Z_(Socket paramSocket) {
    return a(30493, 8837).equals(Zsdz.ZO(paramSocket));
  }
  
  private static boolean Zq(Socket paramSocket) {
    return (ZK(paramSocket) && !Z_(paramSocket));
  }
  
  private static boolean ZK(Socket paramSocket) {
    return Zsdz.ZH(paramSocket).contains(a(30495, 1936));
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '©t++äÕc9Ï£¾ÕsÑ {µ>ø?ÊT $K8F¤<çtåW´Û'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_2
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #21
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 81
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
    //   63: goto -> 21
    //   66: aload #5
    //   68: putstatic burp/Zb0b.a : [Ljava/lang/String;
    //   71: iconst_3
    //   72: anewarray java/lang/String
    //   75: putstatic burp/Zb0b.b : [Ljava/lang/String;
    //   78: goto -> 226
    //   81: dup_x2
    //   82: pop
    //   83: invokevirtual toCharArray : ()[C
    //   86: dup_x1
    //   87: arraylength
    //   88: dup_x2
    //   89: pop
    //   90: iconst_0
    //   91: istore #6
    //   93: dup2_x1
    //   94: pop2
    //   95: dup_x2
    //   96: iconst_1
    //   97: if_icmpgt -> 199
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 166, 4 -> 171, 5 -> 176
    //   152: bipush #17
    //   154: goto -> 183
    //   157: bipush #111
    //   159: goto -> 183
    //   162: iconst_1
    //   163: goto -> 183
    //   166: bipush #99
    //   168: goto -> 183
    //   171: bipush #103
    //   173: goto -> 183
    //   176: bipush #106
    //   178: goto -> 183
    //   181: bipush #59
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 104
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 100
    //   207: pop
    //   208: new java/lang/String
    //   211: dup_x1
    //   212: swap
    //   213: invokespecial <init> : ([C)V
    //   216: invokevirtual intern : ()Ljava/lang/String;
    //   219: swap
    //   220: pop
    //   221: swap
    //   222: pop
    //   223: goto -> 38
    //   226: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x771F) & 0xFFFF;
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
      byte b1 = 10;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb0b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */