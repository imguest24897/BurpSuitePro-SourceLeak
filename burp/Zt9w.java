package burp;

import java.lang.reflect.Proxy;
import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Supplier;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zc1;
import net.portswigger.browser.Zc3;
import net.portswigger.browser.Zdy;
import net.portswigger.browser.Ze0;
import net.portswigger.browser.Zeu;
import net.portswigger.browser.Zt5;
import net.portswigger.browser.Zt8;
import net.portswigger.browser.Ztf;
import net.portswigger.browser.service.Zg;

public class Zt9w implements Zsi7 {
  private final Zg ZT;
  
  private final Supplier<Zzy9> Zu;
  
  private final Supplier<Integer> ZA;
  
  private final Zra1 Zj;
  
  private final ReadWriteLock ZV;
  
  private final AtomicInteger Zr;
  
  private final AtomicInteger Zy;
  
  private final AtomicInteger Zq;
  
  private volatile Zeu Zh;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zt9w(Zg paramZg, Supplier<Zzy9> paramSupplier, Supplier<Integer> paramSupplier1, Zra1 paramZra1) {
    this.ZT = Objects.<Zg>requireNonNull(paramZg);
    this.Zu = Objects.<Supplier<Zzy9>>requireNonNull(paramSupplier);
    this.ZA = paramSupplier1;
    this.Zj = paramZra1;
    this.ZV = new ReentrantReadWriteLock();
    this.Zr = new AtomicInteger();
    this.Zy = new AtomicInteger();
    this.Zq = new AtomicInteger();
  }
  
  public Zeu Zu() throws Ztf {
    Zeu zeu = Zi();
    ZR(zeu);
    return zeu;
  }
  
  private Zeu Zi() throws Ztf {
    this.ZV.readLock().lock();
    try {
      if (Zp())
        return ZE(); 
    } finally {
      this.ZV.readLock().unlock();
    } 
    this.ZV.writeLock().lock();
    try {
      if (Zp())
        return ZE(); 
      try {
      
      } catch (Ztf ztf) {
        throw a(null);
      } 
      Zc3 zc3 = (new Ze0()).ZB(Zt5.Zv()).ZI(((Zzy9)this.Zu.get()).ZK5()).ZY(((Zzy9)this.Zu.get()).ZKR() ? Zdy.SANDBOX_IF_POSSIBLE : Zdy.REQUIRE_SANDBOX).Zj(((Integer)this.ZA.get()).intValue()).ZB().Zx().ZK();
      this.Zh = this.ZT.ZP().Za(zc3);
      this.Zr.incrementAndGet();
      return ZE();
    } finally {
      this.ZV.writeLock().unlock();
    } 
  }
  
  private Zeu ZE() {
    return (Zeu)Proxy.newProxyInstance(getClass().getClassLoader(), new Class[] { Zeu.class }, new Zm76(this, this.Zh));
  }
  
  private boolean Zp() {
    return (this.Zh != null && !this.Zh.Zo());
  }
  
  public void Zl(Zz9t paramZz9t) {
    String str = a(-32361, -21586);
    paramZz9t.ZF(a(-32363, 7984), str.formatted(new Object[] { Objects.toString(this.Zh, a(-32356, -28359)), Integer.valueOf(this.Zr.get()) }));
    Zbqc[] arrayOfZbqc = Ze_f.ZP();
    boolean bool = Zp() ? (this.Zh.ZM().ZQ().size() - 1) : false;
    paramZz9t.ZF(a(-32353, -8210), str.formatted(new Object[] { Integer.valueOf(bool), Integer.valueOf(this.Zy.get()) }));
    long l = !Zp() ? 0L : ((Long)this.Zh.ZM().ZQ().stream().map(Zc1::Zj).map(Zt8::ZA).reduce(Long.valueOf(0L), Long::sum)).longValue();
    paramZz9t.ZF(a(-32368, 8296), str.formatted(new Object[] { Long.valueOf(l), Integer.valueOf(this.Zq.get()) }));
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public void Zi(Zx6t paramZx6t) {
    Zbqc[] arrayOfZbqc = Ze_f.ZP();
    paramZx6t.ZP(a(-32364, -18958), Integer.valueOf(this.Zr.get()));
    boolean bool = Zp() ? (this.Zh.ZM().ZQ().size() - 1) : false;
    paramZx6t.ZQ(a(-32355, -32531), Integer.valueOf(bool));
    paramZx6t.ZP(a(-32366, -29770), Integer.valueOf(this.Zy.get()));
    long l = !Zp() ? 0L : ((Long)this.Zh.ZM().ZQ().stream().map(Zc1::Zj).map(Zt8::ZA).reduce(Long.valueOf(0L), Long::sum)).longValue();
    paramZx6t.ZQ(a(-32362, 25252), Long.valueOf(l));
    paramZx6t.ZP(a(-32354, 10937), Integer.valueOf(this.Zq.get()));
    if (Zbqc.Zwu() == null)
      Ze_f.ZX(new Zbqc[4]); 
  }
  
  public void ZY() {
    this.ZV.writeLock().lock();
    try {
      if (this.Zh != null) {
        this.Zh.ZP();
        this.Zh.Zr(Duration.ofSeconds(5L));
      } 
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
    } finally {
      this.ZV.writeLock().unlock();
    } 
  }
  
  private void ZR(Zeu paramZeu) {
    // Byte code:
    //   0: invokestatic ZP : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zu : Ljava/util/function/Supplier;
    //   8: invokeinterface get : ()Ljava/lang/Object;
    //   13: checkcast burp/Zzy9
    //   16: astore_3
    //   17: aload_3
    //   18: invokeinterface ZKh : ()Z
    //   23: ifne -> 51
    //   26: aload_1
    //   27: invokeinterface Zq : ()Lnet/portswigger/browser/Zo;
    //   32: invokestatic Zo : ()Lnet/portswigger/browser/Zdx;
    //   35: invokeinterface Zg : (Lnet/portswigger/browser/Zdx;)V
    //   40: aload_2
    //   41: ifnonnull -> 204
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   50: athrow
    //   51: aload_0
    //   52: getfield Zj : Lburp/Zra1;
    //   55: getstatic burp/Zra1.EXECUTION_MODE_DESKTOP : Lburp/Zra1;
    //   58: if_acmpne -> 183
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   67: athrow
    //   68: aload_3
    //   69: invokeinterface ZKU : ()Ljava/nio/file/Path;
    //   74: aload_1
    //   75: invokeinterface ZR : ()Lnet/portswigger/browser/Ze5;
    //   80: invokeinterface toString : ()Ljava/lang/String;
    //   85: sipush #-32365
    //   88: sipush #24014
    //   91: invokestatic a : (II)Ljava/lang/String;
    //   94: swap
    //   95: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   100: invokeinterface resolve : (Ljava/lang/String;)Ljava/nio/file/Path;
    //   105: sipush #-32367
    //   108: sipush #8802
    //   111: invokestatic a : (II)Ljava/lang/String;
    //   114: invokeinterface resolve : (Ljava/lang/String;)Ljava/nio/file/Path;
    //   119: astore #4
    //   121: aload #4
    //   123: invokeinterface getParent : ()Ljava/nio/file/Path;
    //   128: iconst_0
    //   129: anewarray java/nio/file/attribute/FileAttribute
    //   132: invokestatic createDirectories : (Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
    //   135: pop
    //   136: aload_1
    //   137: invokeinterface Zq : ()Lnet/portswigger/browser/Zo;
    //   142: aload #4
    //   144: invokestatic Zr : (Ljava/nio/file/Path;)Lnet/portswigger/browser/Zdx;
    //   147: invokeinterface Zg : (Lnet/portswigger/browser/Zdx;)V
    //   152: goto -> 179
    //   155: astore #5
    //   157: aload #5
    //   159: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   162: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   165: aload_1
    //   166: invokeinterface Zq : ()Lnet/portswigger/browser/Zo;
    //   171: invokestatic Zj : ()Lnet/portswigger/browser/Zdx;
    //   174: invokeinterface Zg : (Lnet/portswigger/browser/Zdx;)V
    //   179: aload_2
    //   180: ifnonnull -> 204
    //   183: aload_1
    //   184: invokeinterface Zq : ()Lnet/portswigger/browser/Zo;
    //   189: invokestatic Zj : ()Lnet/portswigger/browser/Zdx;
    //   192: invokeinterface Zg : (Lnet/portswigger/browser/Zdx;)V
    //   197: goto -> 204
    //   200: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   203: athrow
    //   204: return
    // Exception table:
    //   from	to	target	type
    //   17	44	47	java/io/IOException
    //   26	61	64	java/io/IOException
    //   121	152	155	java/io/IOException
    //   179	197	200	java/io/IOException
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'e0âm Lm ËçÕw¶à, î67º\\bâÇ÷6ÉÊùÝ,ü7{2^/ý4ÿ¹ÔÓz1b¾0H*ÿÍß¤1±ä®~tnâV¨d5U]h_Ò×j×^Kú)¾`\\bz-:îRj\\fò±Ð¤[>ýÆÿ jÿ+ñ\\f\\bP>sn\\b.­Ná·¯*òXÏRHRzË2·É8}Æ§]8ã÷M#Ì0Åå7¢¾úÛ\\tEÕO6#'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #26
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #114
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc '?¼8\}©Ò¯.Ç'ÕL]IÀ: 'j;\\nðFpkîR\\tNòñûØn'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #31
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #120
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zt9w.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zt9w.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #38
    //   214: goto -> 244
    //   217: bipush #36
    //   219: goto -> 244
    //   222: bipush #54
    //   224: goto -> 244
    //   227: bipush #61
    //   229: goto -> 244
    //   232: bipush #60
    //   234: goto -> 244
    //   237: bipush #107
    //   239: goto -> 244
    //   242: bipush #20
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8194) & 0xFFFF;
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
      byte b1 = 50;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt9w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */