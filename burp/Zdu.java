package burp;

import net.portswigger.Zkb;
import net.portswigger.Zli;
import net.portswigger.Zmw;

public class Zdu implements Zrcs {
  private final Zey9 ZT;
  
  private final String Zh;
  
  private Zefx ZI;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zdu(Zey9 paramZey9, String paramString) {
    this.ZT = paramZey9;
    this.Zh = paramString;
  }
  
  public void Zs(Zr6q paramZr6q) {
    byte[] arrayOfByte1 = paramZr6q.ZD();
    int[] arrayOfInt = Zruf.ZP(arrayOfByte1);
    if (arrayOfInt == null) {
      int[] arrayOfInt1 = Zruf.Zg(arrayOfByte1);
      if (arrayOfInt1 == null) {
        this.ZI = paramZr6q;
        return;
      } 
      int i = Zli.ZU(arrayOfByte1, (byte)35, arrayOfInt1[0], arrayOfInt1[1]);
      (new int[2])[0] = arrayOfInt1[1];
      (new int[2])[1] = arrayOfInt1[1];
      (new int[2])[0] = i;
      (new int[2])[1] = i;
      arrayOfInt = (i == -1) ? new int[2] : new int[2];
    } 
    String str = this.Zh.isEmpty() ? "" : ("?" + this.Zh);
    byte[] arrayOfByte2 = Zmw.Zq(new byte[][] { Zmw.Zz(arrayOfByte1, 0, arrayOfInt[0]), Zkb.Zy(str), Zmw.Zz(arrayOfByte1, arrayOfInt[1], arrayOfByte1.length) });
    Zmzk zmzk = paramZr6q.ZT();
    this.ZI = this.ZT.ZY(zmzk, arrayOfByte2);
  }
  
  public void ZS(Zr6h paramZr6h) {
    // Byte code:
    //   0: invokestatic ZC : ()Z
    //   3: istore_2
    //   4: aload_1
    //   5: invokevirtual ZK : ()Ljava/util/List;
    //   8: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   13: invokestatic ZX : (Ljava/util/List;Ljava/util/function/Predicate;)I
    //   16: istore_3
    //   17: iload_3
    //   18: iconst_m1
    //   19: if_icmpne -> 102
    //   22: new burp/Ztnz
    //   25: dup
    //   26: sipush #30028
    //   29: sipush #24731
    //   32: invokestatic a : (II)Ljava/lang/String;
    //   35: aload_0
    //   36: getfield Zh : Ljava/lang/String;
    //   39: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   44: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   47: astore #4
    //   49: new java/util/ArrayList
    //   52: dup
    //   53: aload_1
    //   54: invokevirtual ZK : ()Ljava/util/List;
    //   57: invokespecial <init> : (Ljava/util/Collection;)V
    //   60: astore #5
    //   62: aload #5
    //   64: aload #4
    //   66: invokeinterface add : (Ljava/lang/Object;)Z
    //   71: pop
    //   72: aload_1
    //   73: invokevirtual ZT : ()Lburp/Zmzk;
    //   76: astore #6
    //   78: aload_1
    //   79: invokevirtual Zw : ()[B
    //   82: astore #7
    //   84: aload_0
    //   85: aload_0
    //   86: getfield ZT : Lburp/Zey9;
    //   89: aload #6
    //   91: aload #5
    //   93: aload #7
    //   95: invokevirtual ZR : (Lburp/Zmzk;Ljava/util/List;[B)Lburp/Zefx;
    //   98: putfield ZI : Lburp/Zefx;
    //   101: return
    //   102: aload_1
    //   103: invokevirtual ZK : ()Ljava/util/List;
    //   106: iload_3
    //   107: invokeinterface get : (I)Ljava/lang/Object;
    //   112: checkcast burp/Ztnz
    //   115: astore #5
    //   117: aload #5
    //   119: getfield ZM : [B
    //   122: invokestatic ZG : ([B)Ljava/lang/String;
    //   125: astore #6
    //   127: aload_0
    //   128: getfield Zh : Ljava/lang/String;
    //   131: invokevirtual isEmpty : ()Z
    //   134: ifeq -> 142
    //   137: ldc ''
    //   139: goto -> 151
    //   142: aload_0
    //   143: getfield Zh : Ljava/lang/String;
    //   146: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   151: astore #7
    //   153: aload #6
    //   155: ifnull -> 273
    //   158: aload #6
    //   160: invokestatic ZO : (Ljava/lang/String;)I
    //   163: istore #8
    //   165: aload #6
    //   167: bipush #35
    //   169: invokevirtual indexOf : (I)I
    //   172: istore #9
    //   174: iload #9
    //   176: iconst_m1
    //   177: if_icmpeq -> 191
    //   180: aload #6
    //   182: iconst_0
    //   183: iload #9
    //   185: invokevirtual substring : (II)Ljava/lang/String;
    //   188: goto -> 193
    //   191: aload #6
    //   193: astore #10
    //   195: iload #8
    //   197: iconst_m1
    //   198: if_icmpne -> 206
    //   201: aload #10
    //   203: goto -> 214
    //   206: aload #10
    //   208: iconst_0
    //   209: iload #8
    //   211: invokevirtual substring : (II)Ljava/lang/String;
    //   214: astore #10
    //   216: iload #9
    //   218: iconst_m1
    //   219: if_icmpeq -> 232
    //   222: aload #6
    //   224: iload #9
    //   226: invokevirtual substring : (I)Ljava/lang/String;
    //   229: goto -> 234
    //   232: ldc ''
    //   234: astore #11
    //   236: aload #10
    //   238: aload #7
    //   240: aload #11
    //   242: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   247: astore #12
    //   249: new burp/Ztnz
    //   252: dup
    //   253: sipush #30028
    //   256: sipush #24731
    //   259: invokestatic a : (II)Ljava/lang/String;
    //   262: aload #12
    //   264: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   267: astore #4
    //   269: iload_2
    //   270: ifeq -> 293
    //   273: new burp/Ztnz
    //   276: dup
    //   277: sipush #30028
    //   280: sipush #24731
    //   283: invokestatic a : (II)Ljava/lang/String;
    //   286: aload #7
    //   288: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   291: astore #4
    //   293: new java/util/ArrayList
    //   296: dup
    //   297: aload_1
    //   298: invokevirtual ZK : ()Ljava/util/List;
    //   301: invokespecial <init> : (Ljava/util/Collection;)V
    //   304: astore #5
    //   306: aload #5
    //   308: iload_3
    //   309: aload #4
    //   311: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   316: pop
    //   317: aload_1
    //   318: invokevirtual ZT : ()Lburp/Zmzk;
    //   321: astore #6
    //   323: aload_1
    //   324: invokevirtual Zw : ()[B
    //   327: astore #7
    //   329: aload_0
    //   330: aload_0
    //   331: getfield ZT : Lburp/Zey9;
    //   334: aload #6
    //   336: aload #5
    //   338: aload #7
    //   340: invokevirtual ZR : (Lburp/Zmzk;Ljava/util/List;[B)Lburp/Zefx;
    //   343: putfield ZI : Lburp/Zefx;
    //   346: return
  }
  
  public Zefx ZK() {
    return this.ZI;
  }
  
  private static boolean lambda$visit$0(Ztnz paramZtnz) {
    return Ztnz.ZM(paramZtnz.Ze).equals(a(30029, -31791));
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ð{jàtEEÜ'¢'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_5
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #127
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
    //   68: putstatic burp/Zdu.a : [Ljava/lang/String;
    //   71: iconst_2
    //   72: anewarray java/lang/String
    //   75: putstatic burp/Zdu.b : [Ljava/lang/String;
    //   78: goto -> 227
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
    //   97: if_icmpgt -> 200
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #62
    //   154: goto -> 184
    //   157: bipush #73
    //   159: goto -> 184
    //   162: bipush #63
    //   164: goto -> 184
    //   167: bipush #60
    //   169: goto -> 184
    //   172: bipush #107
    //   174: goto -> 184
    //   177: bipush #68
    //   179: goto -> 184
    //   182: bipush #32
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 104
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 100
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 38
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x754D) & 0xFFFF;
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
      byte b1 = 79;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zdu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */