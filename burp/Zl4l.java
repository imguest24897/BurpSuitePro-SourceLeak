package burp;

import java.util.List;
import java.util.Objects;

public class Zl4l extends Zl4o implements Zleo {
  private final Zbj9 ZK;
  
  private final Zgo8 Zb;
  
  private final Zgol ZM;
  
  private final Ze2h ZC;
  
  private final Zb5u ZQ;
  
  private Ze1y Zm = Ze1y.CANCEL_CONTINUE;
  
  private static final String[] c;
  
  private static final String[] d;
  
  public Zl4l(boolean paramBoolean, String paramString, Ztwv paramZtwv, Zbj9 paramZbj9, Zgo8 paramZgo8, Zzov paramZzov) {
    super(paramString, Zk97.DESKTOP_SCANNING_API_SCAN_LAUNCHER, paramZbj9, true);
    this.ZK = paramZbj9;
    this.Zb = paramZgo8;
    this.ZM = new Zgol(paramZbj9, Zz6x.SCAN_LAUNCHER);
    this.ZC = new Ze2h();
    int[] arrayOfInt = Zt3i.Zu();
    setName(b(27379, 4099));
    if (paramBoolean) {
      Zb59 zb59 = new Zb59(paramZbj9, paramZtwv, paramZzov);
      Objects.requireNonNull(paramZbj9);
      this.ZQ = new Zb5u(this, paramZbj9.ZX(), paramZbj9.Ze(), paramZbj9.ZF(), paramZbj9::ZY);
      Zd(new Zx8l[] { zb59, this.ZQ, paramZgo8, this.ZM });
      if (arrayOfInt != null) {
        this.ZQ = null;
        Zd(new Zx8l[] { paramZgo8, this.ZM });
        return;
      } 
      return;
    } 
    this.ZQ = null;
    Zd(new Zx8l[] { paramZgo8, this.ZM });
  }
  
  public void ZJ(List<Zkbn> paramList) {
    this.Zb.Zq(paramList);
  }
  
  public void Zq(Zmln... paramVarArgs) {
    this.Zb.ZR(paramVarArgs);
  }
  
  public void ZV(Zmln paramZmln) {
    this.Zb.Zl(paramZmln, this.ZC);
  }
  
  public void ZB(Zkbn paramZkbn, int paramInt) {
    this.Zb.Zb(paramInt, paramZkbn);
  }
  
  public void Zv(int paramInt) {
    this.Zb.ZX(paramInt);
  }
  
  public void Zz(int paramInt, Zkbn paramZkbn) {
    this.Zb.Zu(paramInt, paramZkbn);
  }
  
  public void Zw(Zmln... paramVarArgs) {
    this.Zb.ZX(paramVarArgs);
  }
  
  public void Zt(Zmln... paramVarArgs) {
    this.Zb.ZK(paramVarArgs);
  }
  
  public void Zu() {
    this.Zb.Zu();
  }
  
  public void ZJ() {
    this.Zb.ZJ();
  }
  
  public void ZT() {
    this.Zb.ZT();
  }
  
  public Zs3h Zd() {
    return this.Zb.Zd();
  }
  
  public void ZM(List<Zbf8> paramList) {
    this.ZM.Zu(paramList);
  }
  
  public void Zt() {
    this.ZM.ZV();
  }
  
  public void ZO() {
    this.ZM.Zd();
  }
  
  public void ZY() {
    this.ZM.ZE();
  }
  
  public void Zv() {
    this.ZM.Zf();
  }
  
  public void ZM() {
    this.ZM.ZD();
  }
  
  public void Zs(Ztwh paramZtwh) {
    this.ZM.Zq(paramZtwh);
  }
  
  protected void Zhi() {
    // Byte code:
    //   0: invokestatic Zu : ()[I
    //   3: astore_1
    //   4: getstatic burp/Zko2.Zf : [I
    //   7: aload_0
    //   8: getfield Zm : Lburp/Ze1y;
    //   11: invokevirtual ordinal : ()I
    //   14: iaload
    //   15: tableswitch default -> 85, 1 -> 44, 2 -> 44, 3 -> 55, 4 -> 73
    //   44: aload_0
    //   45: getfield ZK : Lburp/Zbj9;
    //   48: invokevirtual ZO : ()V
    //   51: aload_1
    //   52: ifnull -> 85
    //   55: aload_0
    //   56: getfield ZK : Lburp/Zbj9;
    //   59: invokevirtual Zv : ()Z
    //   62: ifeq -> 85
    //   65: aload_0
    //   66: invokevirtual Zq : ()V
    //   69: aload_1
    //   70: ifnull -> 85
    //   73: aload_0
    //   74: getfield ZK : Lburp/Zbj9;
    //   77: invokevirtual Zd : ()Z
    //   80: pop
    //   81: aload_0
    //   82: invokevirtual Zq : ()V
    //   85: return
  }
  
  protected void ZhY() {
    // Byte code:
    //   0: invokestatic Zu : ()[I
    //   3: astore_1
    //   4: getstatic burp/Zko2.Zf : [I
    //   7: aload_0
    //   8: getfield Zm : Lburp/Ze1y;
    //   11: invokevirtual ordinal : ()I
    //   14: iaload
    //   15: tableswitch default -> 59, 1 -> 44, 2 -> 52, 3 -> 52, 4 -> 44
    //   44: aload_0
    //   45: invokevirtual Zq : ()V
    //   48: aload_1
    //   49: ifnull -> 59
    //   52: aload_0
    //   53: getfield ZK : Lburp/Zbj9;
    //   56: invokevirtual ZY : ()V
    //   59: return
  }
  
  public void ZY(Ze1y paramZe1y) {
    // Byte code:
    //   0: invokestatic Zu : ()[I
    //   3: astore_2
    //   4: getstatic burp/Zko2.Zf : [I
    //   7: aload_1
    //   8: invokevirtual ordinal : ()I
    //   11: iaload
    //   12: tableswitch default -> 184, 1 -> 44, 2 -> 80, 3 -> 116, 4 -> 152
    //   44: aload_0
    //   45: getfield Zl : Lburp/Ze01;
    //   48: sipush #27388
    //   51: sipush #26657
    //   54: invokestatic b : (II)Ljava/lang/String;
    //   57: invokevirtual setText : (Ljava/lang/String;)V
    //   60: aload_0
    //   61: getfield Zs : Lburp/Ze01;
    //   64: sipush #27377
    //   67: sipush #-32460
    //   70: invokestatic b : (II)Ljava/lang/String;
    //   73: invokevirtual setText : (Ljava/lang/String;)V
    //   76: aload_2
    //   77: ifnull -> 184
    //   80: aload_0
    //   81: getfield Zl : Lburp/Ze01;
    //   84: sipush #27378
    //   87: sipush #-12111
    //   90: invokestatic b : (II)Ljava/lang/String;
    //   93: invokevirtual setText : (Ljava/lang/String;)V
    //   96: aload_0
    //   97: getfield Zs : Lburp/Ze01;
    //   100: sipush #27376
    //   103: sipush #13979
    //   106: invokestatic b : (II)Ljava/lang/String;
    //   109: invokevirtual setText : (Ljava/lang/String;)V
    //   112: aload_2
    //   113: ifnull -> 184
    //   116: aload_0
    //   117: getfield Zl : Lburp/Ze01;
    //   120: sipush #27383
    //   123: sipush #-11598
    //   126: invokestatic b : (II)Ljava/lang/String;
    //   129: invokevirtual setText : (Ljava/lang/String;)V
    //   132: aload_0
    //   133: getfield Zs : Lburp/Ze01;
    //   136: sipush #27380
    //   139: sipush #-10454
    //   142: invokestatic b : (II)Ljava/lang/String;
    //   145: invokevirtual setText : (Ljava/lang/String;)V
    //   148: aload_2
    //   149: ifnull -> 184
    //   152: aload_0
    //   153: getfield Zl : Lburp/Ze01;
    //   156: sipush #27381
    //   159: sipush #-29758
    //   162: invokestatic b : (II)Ljava/lang/String;
    //   165: invokevirtual setText : (Ljava/lang/String;)V
    //   168: aload_0
    //   169: getfield Zs : Lburp/Ze01;
    //   172: sipush #27382
    //   175: sipush #-2373
    //   178: invokestatic b : (II)Ljava/lang/String;
    //   181: invokevirtual setText : (Ljava/lang/String;)V
    //   184: aload_0
    //   185: aload_1
    //   186: putfield Zm : Lburp/Ze1y;
    //   189: return
  }
  
  public void Zw() {
    if (this.ZQ != null)
      this.ZQ.Zs(); 
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'sq´B ÞÓø­,H¥\\bìI nµuÁD\\b÷Ó9üËè¤\\b×A=Ó|øí\\bÂ åS\\rÒÖ°'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #113
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
    //   67: ldc 'N+8\\tM{ÖÁn,¸R~¸´ãØAÌNÒsÄñ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #24
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #75
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
    //   128: putstatic burp/Zl4l.c : [Ljava/lang/String;
    //   131: bipush #9
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zl4l.d : [Ljava/lang/String;
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
    //   212: bipush #47
    //   214: goto -> 244
    //   217: bipush #72
    //   219: goto -> 244
    //   222: bipush #56
    //   224: goto -> 244
    //   227: bipush #91
    //   229: goto -> 244
    //   232: bipush #73
    //   234: goto -> 244
    //   237: bipush #91
    //   239: goto -> 244
    //   242: bipush #48
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
    //   300: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6AF4) & 0xFFFF;
    if (d[i] == null) {
      char[] arrayOfChar = c[i].toCharArray();
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
      char c = '';
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl4l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */