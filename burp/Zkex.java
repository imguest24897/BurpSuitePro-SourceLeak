package burp;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import net.portswigger.Zah;
import net.portswigger.Zby;
import net.portswigger.Zc5;
import net.portswigger.Zcp;
import net.portswigger.Zct;
import net.portswigger.Zf9;
import net.portswigger.Zht;
import net.portswigger.Zk_;
import net.portswigger.Zoq;
import net.portswigger.Zq0;
import net.portswigger.Zq7;
import net.portswigger.Zqs;
import net.portswigger.Zsb;
import net.portswigger.Ztj;

public class Zkex extends Zkez {
  private final Zrdl<Zbfm> Zb;
  
  private final Supplier<Zker> ZL;
  
  private final Ztwv Zk;
  
  private final Zmx0 Zv;
  
  private final Zoq<Zex4> ZE;
  
  private static final String[] c;
  
  private static final String[] d;
  
  private Zkex(Zem0 paramZem0, Zct paramZct, Zr18 paramZr18, Zlrb paramZlrb, Ztwv paramZtwv, Zmx0 paramZmx0) {
    // Byte code:
    //   0: aload_0
    //   1: aload_3
    //   2: aload #4
    //   4: aload_2
    //   5: invokespecial <init> : (Lburp/Zr18;Lburp/Zlrb;Lnet/portswigger/Zct;)V
    //   8: aload_0
    //   9: aload #5
    //   11: putfield Zk : Lburp/Ztwv;
    //   14: aload_0
    //   15: getstatic burp/Zra1.EXECUTION_MODE_ENTERPRISE_AGENT : Lburp/Zra1;
    //   18: new burp/Zm6u
    //   21: dup
    //   22: aload_1
    //   23: invokespecial <init> : (Lburp/Zem0;)V
    //   26: invokestatic ZZ : (Lburp/Zra1;Lburp/Zm6u;)Lburp/Zrdl;
    //   29: putfield Zb : Lburp/Zrdl;
    //   32: aload_0
    //   33: aload_1
    //   34: <illegal opcode> get : (Lburp/Zem0;)Ljava/util/function/Supplier;
    //   39: putfield ZL : Ljava/util/function/Supplier;
    //   42: aload_0
    //   43: aload #6
    //   45: putfield Zv : Lburp/Zmx0;
    //   48: aload_0
    //   49: aload_0
    //   50: aload_1
    //   51: <illegal opcode> get : (Lburp/Zkex;Lburp/Zem0;)Ljava/util/function/Supplier;
    //   56: invokestatic ZZ : (Ljava/util/function/Supplier;)Lnet/portswigger/Zoq;
    //   59: putfield ZE : Lnet/portswigger/Zoq;
    //   62: return
  }
  
  public static Zby<Zkex> ZD(Zem0 paramZem0, String paramString, Zr18 paramZr18, Zt90 paramZt90, Zlnv paramZlnv, List<Zcp> paramList, Ztwv paramZtwv, Zmx0 paramZmx0) {
    // Byte code:
    //   0: new net/portswigger/Za6
    //   3: dup
    //   4: getstatic net/portswigger/Zrx7.PRO : Lnet/portswigger/Zrx7;
    //   7: aload_0
    //   8: aload_1
    //   9: aload_2
    //   10: aload_3
    //   11: aload #4
    //   13: aload #6
    //   15: aload #7
    //   17: <illegal opcode> apply : (Lburp/Zem0;Ljava/lang/String;Lburp/Zr18;Lburp/Zt90;Lburp/Zlnv;Lburp/Ztwv;Lburp/Zmx0;)Ljava/util/function/Function;
    //   22: ldc burp/Zkex
    //   24: invokespecial <init> : (Lnet/portswigger/Zrx7;Ljava/util/function/Function;Ljava/lang/Class;)V
    //   27: getstatic net/portswigger/Zd0.Za : Lnet/portswigger/Zd0;
    //   30: invokevirtual Zw : (Lnet/portswigger/Zd0;)Lnet/portswigger/Za6;
    //   33: getstatic net/portswigger/Zd0.Zj : Lnet/portswigger/Zd0;
    //   36: invokevirtual Zw : (Lnet/portswigger/Zd0;)Lnet/portswigger/Za6;
    //   39: new burp/Zt4a
    //   42: dup
    //   43: invokespecial <init> : ()V
    //   46: invokevirtual Zw : (Lnet/portswigger/Zd0;)Lnet/portswigger/Za6;
    //   49: astore #9
    //   51: invokestatic ZR : ()[Lburp/Zbqc;
    //   54: aload #5
    //   56: aload #9
    //   58: dup
    //   59: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   62: pop
    //   63: <illegal opcode> accept : (Lnet/portswigger/Za6;)Ljava/util/function/Consumer;
    //   68: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   73: getstatic burp/Zeuu.ZC : Ljava/util/List;
    //   76: aload #9
    //   78: dup
    //   79: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   82: pop
    //   83: <illegal opcode> accept : (Lnet/portswigger/Za6;)Ljava/util/function/Consumer;
    //   88: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   93: astore #8
    //   95: aload #9
    //   97: invokevirtual Zy : ()Lnet/portswigger/Zby;
    //   100: invokestatic Zwu : ()[Lburp/Zbqc;
    //   103: ifnonnull -> 113
    //   106: iconst_3
    //   107: anewarray burp/Zbqc
    //   110: invokestatic Zr : ([Lburp/Zbqc;)V
    //   113: areturn
  }
  
  @Zsb(ZH = "POST", ZL = "scan", Zp = Zxki.class)
  public Zht Zc(@Zc5(Ze = "scan") Zf9 paramZf9) {
    return ((Zbfm)this.Zb.ZO()).Z_(paramZf9);
  }
  
  @Zsb(ZH = "POST", ZL = "urlApiScan", Zp = Zs6m.class)
  public Zht ZN(@Zc5(Ze = "scan") Zq0 paramZq0) {
    return ((Zbfm)this.Zb.ZO()).Zr(paramZq0);
  }
  
  @Zsb(ZH = "POST", ZL = "fileUploadApiScan", Zp = Zs6m.class)
  public Zht ZD(@Zc5(Ze = "scan") Zq7 paramZq7) {
    return ((Zbfm)this.Zb.ZO()).ZQ(paramZq7);
  }
  
  @Zsb(ZL = "xml_reports", Zp = Zxki.class)
  public List<String> Zm() throws IOException {
    return List.of(((Zker)this.ZL.get()).Zq());
  }
  
  @Zsb(ZH = "POST", ZL = "connection_check", Zp = Zs6m.class)
  public Zht Zw(@Zc5(Ze = "scan") Zf9 paramZf9) {
    return ((Zbfm)this.Zb.ZO()).ZP(paramZf9);
  }
  
  @Zsb(ZL = "metrics", Zp = Zxki.class)
  public List<Zqs> ZF() throws IOException {
    return ((Zex4)this.ZE.Zz()).Zs();
  }
  
  @Zsb(ZH = "DELETE", ZL = "")
  public void Zt() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zv : Lburp/Zmx0;
    //   4: sipush #-9714
    //   7: sipush #-668
    //   10: invokestatic b : (II)Ljava/lang/String;
    //   13: invokevirtual ZH : (Ljava/lang/String;)V
    //   16: new java/util/concurrent/CountDownLatch
    //   19: dup
    //   20: iconst_1
    //   21: invokespecial <init> : (I)V
    //   24: astore_1
    //   25: aload_0
    //   26: getfield Zk : Lburp/Ztwv;
    //   29: aload_0
    //   30: aload_1
    //   31: <illegal opcode> run : (Lburp/Zkex;Ljava/util/concurrent/CountDownLatch;)Ljava/lang/Runnable;
    //   36: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   41: pop
    //   42: aload_0
    //   43: getfield Zk : Lburp/Ztwv;
    //   46: aload_0
    //   47: aload_1
    //   48: <illegal opcode> run : (Lburp/Zkex;Ljava/util/concurrent/CountDownLatch;)Ljava/lang/Runnable;
    //   53: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   58: pop
    //   59: return
  }
  
  private void lambda$deleteRoot$4(CountDownLatch paramCountDownLatch) {
    try {
      paramCountDownLatch.await(10L, TimeUnit.SECONDS);
    } catch (InterruptedException interruptedException) {
      Thread.currentThread().interrupt();
      Zah.Zl(interruptedException, Zk_.UNEXPECTED);
    } 
    super.Zt();
  }
  
  private void lambda$deleteRoot$3(CountDownLatch paramCountDownLatch) {
    this.Zb.Zz();
    paramCountDownLatch.countDown();
  }
  
  private static Zkex lambda$productionFactory$2(Zem0 paramZem0, String paramString, Zr18 paramZr18, Zt90 paramZt90, Zlnv paramZlnv, Ztwv paramZtwv, Zmx0 paramZmx0, Ztj paramZtj) {
    return new Zkex(paramZem0, new Zct(paramString, b(-9713, 1053), Integer.valueOf(Za())), paramZr18, new Zlrb(paramZt90, paramZlnv), paramZtwv, paramZmx0);
  }
  
  private Zex4 lambda$new$1(Zem0 paramZem0) {
    return new Zex4(paramZem0, this.Zb);
  }
  
  private static Zker lambda$new$0(Zem0 paramZem0) {
    return new Zker(paramZem0.<Ztdi>Zr(Ztdi.class), ((Zkl6)paramZem0.<Zkl6>Zr(Zkl6.class)).ZB());
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '5Ïòc§H(( n,¶Ø{HÖ´!eWÎ>:JÃïBKÆ@e,hpHÁ©N!áäæ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #8
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #73
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
    //   69: putstatic burp/Zkex.c : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zkex.d : [Ljava/lang/String;
    //   79: goto -> 225
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
    //   98: if_icmpgt -> 198
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 171, 5 -> 176
    //   152: bipush #89
    //   154: goto -> 182
    //   157: bipush #72
    //   159: goto -> 182
    //   162: bipush #89
    //   164: goto -> 182
    //   167: iconst_1
    //   168: goto -> 182
    //   171: bipush #44
    //   173: goto -> 182
    //   176: bipush #16
    //   178: goto -> 182
    //   181: iconst_4
    //   182: ixor
    //   183: ixor
    //   184: i2c
    //   185: castore
    //   186: iinc #6, 1
    //   189: dup
    //   190: ifne -> 198
    //   193: dup2
    //   194: dup_x1
    //   195: goto -> 105
    //   198: dup2_x1
    //   199: pop2
    //   200: dup_x2
    //   201: iload #6
    //   203: if_icmpgt -> 101
    //   206: pop
    //   207: new java/lang/String
    //   210: dup_x1
    //   211: swap
    //   212: invokespecial <init> : ([C)V
    //   215: invokevirtual intern : ()Ljava/lang/String;
    //   218: swap
    //   219: pop
    //   220: swap
    //   221: pop
    //   222: goto -> 39
    //   225: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFDA0F) & 0xFFFF;
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
      char c = 'ø';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkex.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */