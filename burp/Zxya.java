package burp;

import java.util.List;

public class Zxya implements Zlpg, Zsmr {
  public final Zez3 ZX;
  
  public final byte Zp;
  
  public final String ZK;
  
  public final boolean ZH;
  
  public final short ZD;
  
  public final int Zs;
  
  public final short ZY;
  
  public final String Zl;
  
  public final long ZM;
  
  public final boolean ZV;
  
  public final boolean Zx;
  
  public final boolean ZA;
  
  public final boolean Zd;
  
  public final boolean Zy;
  
  public final byte Zf;
  
  public final byte ZW;
  
  private final Zz8k ZS;
  
  private final List<Zrdb> Zt;
  
  public final String Zr;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zxya(Zez3 paramZez3, byte paramByte) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield ZX : Lburp/Zez3;
    //   9: aload_0
    //   10: iload_2
    //   11: putfield Zp : B
    //   14: aload_0
    //   15: aload_1
    //   16: invokeinterface Zk2 : ()Ljava/lang/String;
    //   21: putfield ZK : Ljava/lang/String;
    //   24: invokestatic ZG : ()Ljava/lang/String;
    //   27: aload_0
    //   28: aload_1
    //   29: invokeinterface Zky : ()Z
    //   34: putfield Zy : Z
    //   37: astore_3
    //   38: aload_0
    //   39: iload_2
    //   40: invokestatic ZE : (B)B
    //   43: putfield Zf : B
    //   46: aload_0
    //   47: iload_2
    //   48: invokestatic ZS : (B)B
    //   51: putfield ZW : B
    //   54: aload_0
    //   55: new burp/Zz8k
    //   58: dup
    //   59: aload_1
    //   60: invokespecial <init> : (Lburp/Zez3;)V
    //   63: putfield ZS : Lburp/Zz8k;
    //   66: new burp/Zz19
    //   69: dup
    //   70: aload_1
    //   71: invokespecial <init> : (Lburp/Zez3;)V
    //   74: invokevirtual ZN : ()Lburp/Zs73;
    //   77: astore #4
    //   79: new burp/Zgb3
    //   82: dup
    //   83: aload_1
    //   84: invokespecial <init> : (Lburp/Zez3;)V
    //   87: invokevirtual ZM : ()Lburp/Zrf_;
    //   90: astore #5
    //   92: new burp/Zt2z
    //   95: dup
    //   96: aload_1
    //   97: invokespecial <init> : (Lburp/Zez3;)V
    //   100: invokevirtual Zf : ()Lburp/Zbfs;
    //   103: astore #6
    //   105: aload #4
    //   107: ifnull -> 150
    //   110: aload_0
    //   111: aload #4
    //   113: invokeinterface ZTI : ()B
    //   118: iconst_2
    //   119: if_icmpeq -> 133
    //   122: aload #4
    //   124: invokeinterface ZTU : ()B
    //   129: iconst_3
    //   130: if_icmpne -> 137
    //   133: iconst_1
    //   134: goto -> 138
    //   137: iconst_0
    //   138: putfield ZH : Z
    //   141: aload_0
    //   142: iconst_1
    //   143: putfield ZA : Z
    //   146: aload_3
    //   147: ifnonnull -> 160
    //   150: aload_0
    //   151: iconst_0
    //   152: putfield ZH : Z
    //   155: aload_0
    //   156: iconst_0
    //   157: putfield ZA : Z
    //   160: aload #5
    //   162: ifnull -> 281
    //   165: aload_0
    //   166: iconst_1
    //   167: putfield Zx : Z
    //   170: aload_0
    //   171: aload #5
    //   173: invokeinterface Z_V : ()S
    //   178: putfield ZD : S
    //   181: aload_0
    //   182: aload #5
    //   184: invokeinterface Z_z : ()I
    //   189: putfield Zs : I
    //   192: aload_0
    //   193: aload #5
    //   195: invokeinterface Z_F : ()S
    //   200: putfield ZY : S
    //   203: aload_0
    //   204: aload #5
    //   206: invokeinterface Z_I : ()Ljava/lang/String;
    //   211: putfield Zl : Ljava/lang/String;
    //   214: aload_0
    //   215: aload #5
    //   217: invokeinterface Z_a : ()J
    //   222: putfield ZM : J
    //   225: aload_0
    //   226: aload #5
    //   228: invokeinterface Z_B : ()Lburp/Zstu;
    //   233: ifnull -> 240
    //   236: iconst_1
    //   237: goto -> 241
    //   240: iconst_0
    //   241: putfield ZV : Z
    //   244: aload_0
    //   245: aload #5
    //   247: invokeinterface Z_O : ()Ljava/lang/String;
    //   252: ifnonnull -> 267
    //   255: sipush #23798
    //   258: sipush #17070
    //   261: invokestatic a : (II)Ljava/lang/String;
    //   264: goto -> 274
    //   267: aload #5
    //   269: invokeinterface Z_O : ()Ljava/lang/String;
    //   274: putfield Zr : Ljava/lang/String;
    //   277: aload_3
    //   278: ifnonnull -> 329
    //   281: aload_0
    //   282: iconst_0
    //   283: putfield Zx : Z
    //   286: aload_0
    //   287: iconst_0
    //   288: putfield ZD : S
    //   291: aload_0
    //   292: iconst_0
    //   293: putfield Zs : I
    //   296: aload_0
    //   297: iconst_0
    //   298: putfield ZY : S
    //   301: aload_0
    //   302: aconst_null
    //   303: putfield Zl : Ljava/lang/String;
    //   306: aload_0
    //   307: lconst_0
    //   308: putfield ZM : J
    //   311: aload_0
    //   312: iconst_0
    //   313: putfield ZV : Z
    //   316: aload_0
    //   317: sipush #23799
    //   320: sipush #9093
    //   323: invokestatic a : (II)Ljava/lang/String;
    //   326: putfield Zr : Ljava/lang/String;
    //   329: aload #6
    //   331: ifnull -> 356
    //   334: aload_0
    //   335: new java/util/ArrayList
    //   338: dup
    //   339: aload #6
    //   341: invokeinterface ZRn : ()Lburp/Zefg;
    //   346: invokespecial <init> : (Ljava/util/Collection;)V
    //   349: putfield Zt : Ljava/util/List;
    //   352: aload_3
    //   353: ifnonnull -> 361
    //   356: aload_0
    //   357: aconst_null
    //   358: putfield Zt : Ljava/util/List;
    //   361: aload_0
    //   362: aload_0
    //   363: getfield ZS : Lburp/Zz8k;
    //   366: invokevirtual Zf : ()Lburp/Zrss;
    //   369: ifnull -> 376
    //   372: iconst_1
    //   373: goto -> 377
    //   376: iconst_0
    //   377: putfield Zd : Z
    //   380: return
  }
  
  public boolean ZX() {
    return Zk8c.ZK(this.ZX);
  }
  
  public boolean Zv() {
    return Zk8c.Zq(this.ZX);
  }
  
  public boolean Zt() {
    return Zk8c.Zh(this.ZX);
  }
  
  public boolean ZF() {
    return Zk8c.ZX(this.ZX);
  }
  
  public Zlit Zq() {
    return this.ZX.ZlL();
  }
  
  public String ZZ() {
    return this.ZX.Zkb();
  }
  
  public Zmzk Zy() {
    return this.ZX.Zod();
  }
  
  public boolean ZD() {
    return this.ZX.ZoZ();
  }
  
  public Zbr ZY() {
    return this.ZX.Zo3();
  }
  
  public Zstu Zh() {
    return this.ZX.Zos();
  }
  
  public Zstu Zm() {
    return this.ZX.ZoO();
  }
  
  public byte ZL() {
    return this.ZS.Za();
  }
  
  public String ZAs() {
    return this.ZS.ZAs();
  }
  
  public void ZWK(String paramString) {
    this.ZS.ZWK(paramString);
  }
  
  public byte ZaP() {
    return this.ZS.Za();
  }
  
  public void ZB(byte paramByte) {
    this.ZS.Zp(paramByte);
  }
  
  public List<Zrdb> ZK() {
    return this.Zt;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'åL=äñ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_3
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #103
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
    //   68: putstatic burp/Zxya.a : [Ljava/lang/String;
    //   71: iconst_2
    //   72: anewarray java/lang/String
    //   75: putstatic burp/Zxya.b : [Ljava/lang/String;
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
    //   152: bipush #79
    //   154: goto -> 184
    //   157: bipush #70
    //   159: goto -> 184
    //   162: bipush #24
    //   164: goto -> 184
    //   167: bipush #19
    //   169: goto -> 184
    //   172: bipush #39
    //   174: goto -> 184
    //   177: bipush #87
    //   179: goto -> 184
    //   182: bipush #34
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
    int i = (paramInt1 ^ 0x5CF7) & 0xFFFF;
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
      byte b1 = 84;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxya.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */