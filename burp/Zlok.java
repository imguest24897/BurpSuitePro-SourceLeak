package burp;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

public class Zlok {
  private final Zzcq<Zgxp> ZB;
  
  private final Zttp Zi;
  
  private final ReentrantLock ZK;
  
  private final Ztos<Zt1l> ZR;
  
  private final Zb_x Zk;
  
  private final Zzyg ZD;
  
  private final AtomicReference<Zlj9> Zz;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zlok(Zzcq<Zgxp> paramZzcq, Ztos<Zt1l> paramZtos, Zb_x paramZb_x, Zzyg paramZzyg) {
    this.ZB = paramZzcq;
    this.ZR = paramZtos;
    this.Zk = paramZb_x;
    this.ZD = paramZzyg;
    this.Zi = Zttp.Zo();
    this.ZK = new ReentrantLock();
    this.Zz = new AtomicReference<>(Zlj9.Zp);
    paramZtos.ZE(Zt1l.Zd, this::lambda$new$0);
  }
  
  public void ZS(Zkgn paramZkgn) {
    Zgxp zgxp = paramZkgn.ZvD();
    if (zgxp != null)
      ZL(zgxp); 
  }
  
  public void ZL(Zgxp paramZgxp) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zlok;Lburp/Zgxp;)Ljava/lang/Runnable;
    //   7: aload_0
    //   8: getfield ZK : Ljava/util/concurrent/locks/ReentrantLock;
    //   11: invokestatic ZA : (Ljava/lang/Runnable;Ljava/util/concurrent/locks/ReentrantLock;)V
    //   14: return
  }
  
  public void Zy(String paramString) {
    Zlj9 zlj9 = Zlj9.ZP(paramString);
    Zr(zlj9);
  }
  
  public void Zr(Zlj9 paramZlj9) {
    this.Zz.set(paramZlj9);
    this.ZR.ZD(new Zxr8(Zt1l.Zp, paramZlj9));
  }
  
  private void Zp(boolean paramBoolean, int paramInt) {
    // Byte code:
    //   0: invokestatic Zp : ()I
    //   3: istore_3
    //   4: aload_0
    //   5: getfield ZD : Lburp/Zzyg;
    //   8: invokeinterface Zyq : ()Lburp/Zev0;
    //   13: getstatic burp/Zev0.PAUSED : Lburp/Zev0;
    //   16: if_acmpne -> 20
    //   19: return
    //   20: new burp/Zx_3
    //   23: dup
    //   24: invokespecial <init> : ()V
    //   27: astore #4
    //   29: aload_0
    //   30: getfield Zk : Lburp/Zb_x;
    //   33: invokevirtual ZV : ()Z
    //   36: ifeq -> 55
    //   39: iload_2
    //   40: invokestatic toString : (I)Ljava/lang/String;
    //   43: astore #5
    //   45: aload #4
    //   47: invokevirtual Zy : ()Lburp/Zx_3;
    //   50: pop
    //   51: iload_3
    //   52: ifne -> 106
    //   55: sipush #10136
    //   58: sipush #-22041
    //   61: invokestatic a : (II)Ljava/lang/String;
    //   64: iconst_2
    //   65: anewarray java/lang/Object
    //   68: dup
    //   69: iconst_0
    //   70: iload_2
    //   71: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   74: aastore
    //   75: dup
    //   76: iconst_1
    //   77: aload_0
    //   78: getfield Zk : Lburp/Zb_x;
    //   81: invokevirtual ZZ : ()I
    //   84: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   87: aastore
    //   88: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   91: astore #5
    //   93: aload #4
    //   95: aload_0
    //   96: getfield Zk : Lburp/Zb_x;
    //   99: invokevirtual ZX : ()I
    //   102: invokevirtual ZJ : (I)Lburp/Zx_3;
    //   105: pop
    //   106: aload_0
    //   107: getfield Zk : Lburp/Zb_x;
    //   110: invokevirtual Zl : ()Z
    //   113: ifeq -> 134
    //   116: aload_0
    //   117: getfield ZB : Lburp/Zzcq;
    //   120: invokevirtual ZN : ()Z
    //   123: ifne -> 130
    //   126: iconst_1
    //   127: goto -> 135
    //   130: iconst_0
    //   131: goto -> 135
    //   134: iload_1
    //   135: istore #6
    //   137: iload #6
    //   139: ifeq -> 176
    //   142: sipush #10138
    //   145: sipush #30312
    //   148: invokestatic a : (II)Ljava/lang/String;
    //   151: iconst_1
    //   152: anewarray java/lang/Object
    //   155: dup
    //   156: iconst_0
    //   157: aload_0
    //   158: getfield ZB : Lburp/Zzcq;
    //   161: invokevirtual Zu : ()I
    //   164: iconst_1
    //   165: iadd
    //   166: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   169: aastore
    //   170: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   173: goto -> 178
    //   176: ldc ''
    //   178: astore #7
    //   180: aload #4
    //   182: sipush #10137
    //   185: sipush #-17804
    //   188: invokestatic a : (II)Ljava/lang/String;
    //   191: iconst_2
    //   192: anewarray java/lang/Object
    //   195: dup
    //   196: iconst_0
    //   197: aload #5
    //   199: aastore
    //   200: dup
    //   201: iconst_1
    //   202: aload #7
    //   204: aastore
    //   205: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   208: invokevirtual Zb : (Ljava/lang/String;)Lburp/Zx_3;
    //   211: pop
    //   212: aload_0
    //   213: aload #4
    //   215: invokevirtual Zl : ()Lburp/Zlj9;
    //   218: invokevirtual Zr : (Lburp/Zlj9;)V
    //   221: aload_0
    //   222: getfield Zi : Lburp/Zttp;
    //   225: invokeinterface ZV : ()V
    //   230: return
  }
  
  public void ZY(Zlj9 paramZlj9) {
    this.Zz.set(paramZlj9);
  }
  
  public Zlj9 Zo() {
    return this.Zz.get();
  }
  
  private void lambda$updateAttackProgress$1(Zgxp paramZgxp) {
    Zp(paramZgxp.Zew(), this.Zk.Zv());
  }
  
  private void lambda$new$0(Zxr8 paramZxr8) {
    paramZxr8.ZF().ifPresent(this::ZL);
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ª/tz°a}µgÌ+wèj04zðØ\\rÇÝßfIÃ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #8
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #48
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic burp/Zlok.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zlok.b : [Ljava/lang/String;
    //   79: goto -> 227
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #105
    //   154: goto -> 184
    //   157: bipush #93
    //   159: goto -> 184
    //   162: bipush #38
    //   164: goto -> 184
    //   167: bipush #59
    //   169: goto -> 184
    //   172: bipush #42
    //   174: goto -> 184
    //   177: bipush #111
    //   179: goto -> 184
    //   182: bipush #105
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
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
    //   224: goto -> 39
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2798) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlok.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */