package burp;

import java.net.URI;
import java.net.URISyntaxException;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zez9 {
  private final Zsq8 Zf;
  
  private final String ZE;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zez9(Zsq8 paramZsq8) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic Zm : ()[I
    //   7: aload_0
    //   8: aload_1
    //   9: putfield Zf : Lburp/Zsq8;
    //   12: astore_2
    //   13: aload_1
    //   14: getfield Zn : Lburp/Zs5n;
    //   17: ifnull -> 39
    //   20: aload_1
    //   21: getfield Zn : Lburp/Zs5n;
    //   24: invokeinterface ZQG : ()Ljava/lang/String;
    //   29: ifnonnull -> 56
    //   32: goto -> 39
    //   35: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   38: athrow
    //   39: aload_0
    //   40: ldc ''
    //   42: putfield ZE : Ljava/lang/String;
    //   45: aload_2
    //   46: ifnonnull -> 76
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   55: athrow
    //   56: aload_0
    //   57: aload_1
    //   58: getfield Zn : Lburp/Zs5n;
    //   61: invokeinterface ZQG : ()Ljava/lang/String;
    //   66: putfield ZE : Ljava/lang/String;
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   75: athrow
    //   76: return
    // Exception table:
    //   from	to	target	type
    //   13	32	35	java/lang/IllegalArgumentException
    //   20	49	52	java/lang/IllegalArgumentException
    //   39	69	72	java/lang/IllegalArgumentException
  }
  
  public boolean ZS(Zsq8 paramZsq8) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zf : Lburp/Zsq8;
    //   4: getfield ZZ : Lburp/Zlit;
    //   7: invokeinterface ZdH : ()[B
    //   12: invokestatic ZG : ([B)Ljava/lang/String;
    //   15: ldc '/'
    //   17: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   20: astore_3
    //   21: invokestatic Zm : ()[I
    //   24: aload_1
    //   25: getfield ZZ : Lburp/Zlit;
    //   28: invokeinterface ZdH : ()[B
    //   33: invokestatic ZG : ([B)Ljava/lang/String;
    //   36: ldc '/'
    //   38: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   41: astore #4
    //   43: astore_2
    //   44: aload_3
    //   45: aload_3
    //   46: arraylength
    //   47: iconst_1
    //   48: isub
    //   49: aaload
    //   50: aload #4
    //   52: aload #4
    //   54: arraylength
    //   55: iconst_1
    //   56: isub
    //   57: aaload
    //   58: invokevirtual equals : (Ljava/lang/Object;)Z
    //   61: ifeq -> 121
    //   64: aload_0
    //   65: getfield ZE : Ljava/lang/String;
    //   68: sipush #-2893
    //   71: sipush #25217
    //   74: invokestatic a : (II)Ljava/lang/String;
    //   77: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   80: arraylength
    //   81: aload_1
    //   82: getfield Zn : Lburp/Zs5n;
    //   85: invokeinterface ZQG : ()Ljava/lang/String;
    //   90: sipush #-2895
    //   93: sipush #22131
    //   96: invokestatic a : (II)Ljava/lang/String;
    //   99: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   102: arraylength
    //   103: if_icmpgt -> 121
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   112: athrow
    //   113: iconst_1
    //   114: goto -> 122
    //   117: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   120: athrow
    //   121: iconst_0
    //   122: aload_2
    //   123: ifnonnull -> 140
    //   126: iconst_4
    //   127: anewarray burp/Zbqc
    //   130: invokestatic Zr : ([Lburp/Zbqc;)V
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   139: athrow
    //   140: ireturn
    // Exception table:
    //   from	to	target	type
    //   44	106	109	java/lang/IllegalArgumentException
    //   64	117	117	java/lang/IllegalArgumentException
    //   122	133	136	java/lang/IllegalArgumentException
  }
  
  private String ZK(byte[] paramArrayOfbyte) {
    String str = this.Zf.Zn.ZQG().replace("%", a(-2889, -30439)).replace(" ", a(-2894, 23088));
    try {
      URI uRI = (new URI(a(-2896, -4569) + a(-2896, -4569))).resolve(str);
      return (uRI.getQuery() != null) ? (uRI.getPath() + "?" + uRI.getPath()) : uRI.getPath();
    } catch (URISyntaxException|IllegalArgumentException uRISyntaxException) {
      Zah.Zl(uRISyntaxException, Zk_.IGNORED);
      return "";
    } 
  }
  
  public Zl1r Zk() {
    return new Zl1r(this.Zf.ZJ, this.Zf.Zv);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '];y½ÒfêUò´'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_5
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #59
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 140
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
    //   66: ldc 'ë%9FÂ´í¹~î<'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: bipush #12
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #24
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 140
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
    //   127: putstatic burp/Zez9.a : [Ljava/lang/String;
    //   130: iconst_5
    //   131: anewarray java/lang/String
    //   134: putstatic burp/Zez9.b : [Ljava/lang/String;
    //   137: goto -> 296
    //   140: dup_x2
    //   141: pop
    //   142: invokevirtual toCharArray : ()[C
    //   145: dup_x1
    //   146: arraylength
    //   147: dup_x2
    //   148: pop
    //   149: iconst_0
    //   150: istore #6
    //   152: dup2_x1
    //   153: pop2
    //   154: dup_x2
    //   155: iconst_1
    //   156: if_icmpgt -> 255
    //   159: dup2
    //   160: swap
    //   161: iload #6
    //   163: dup2_x1
    //   164: caload
    //   165: swap
    //   166: iload #6
    //   168: bipush #7
    //   170: irem
    //   171: tableswitch default -> 237, 0 -> 208, 1 -> 213, 2 -> 217, 3 -> 222, 4 -> 227, 5 -> 232
    //   208: bipush #24
    //   210: goto -> 239
    //   213: iconst_3
    //   214: goto -> 239
    //   217: bipush #77
    //   219: goto -> 239
    //   222: bipush #86
    //   224: goto -> 239
    //   227: bipush #19
    //   229: goto -> 239
    //   232: bipush #122
    //   234: goto -> 239
    //   237: bipush #33
    //   239: ixor
    //   240: ixor
    //   241: i2c
    //   242: castore
    //   243: iinc #6, 1
    //   246: dup
    //   247: ifne -> 255
    //   250: dup2
    //   251: dup_x1
    //   252: goto -> 163
    //   255: dup2_x1
    //   256: pop2
    //   257: dup_x2
    //   258: iload #6
    //   260: if_icmpgt -> 159
    //   263: pop
    //   264: new java/lang/String
    //   267: dup_x1
    //   268: swap
    //   269: invokespecial <init> : ([C)V
    //   272: invokevirtual intern : ()Ljava/lang/String;
    //   275: swap
    //   276: pop
    //   277: swap
    //   278: tableswitch default -> 38, 0 -> 97
    //   296: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF4B3) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zez9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */