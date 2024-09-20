package net.portswigger.devtools.client;

import burp.Zbqc;
import burp.Zgrn;
import burp.Zxr8;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zd;
import net.portswigger.devtools.client.impl.Zg;
import net.portswigger.devtools.client.impl.Zmm;
import net.portswigger.devtools.client.impl.Zof;
import net.portswigger.devtools.client.impl.Zw;
import net.portswigger.devtools.client.impl.Zxl;
import net.portswigger.devtools.client.impl.connection.Zc;
import net.portswigger.devtools.client.impl.connection.Zl;
import net.portswigger.devtools.client.impl.connection.Zu;
import net.portswigger.devtools.protocol.Zs;

public class Zo implements InvocationHandler {
  private final Zl Zv;
  
  private final Zd Zw;
  
  private final Map<Zof, Set<Zxl<?>>> ZE;
  
  private final ExecutorService ZQ;
  
  private final Zgrn ZI;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zo(Zl paramZl, Zd paramZd) {
    this.Zv = Objects.<Zl>requireNonNull(paramZl);
    this.Zw = Objects.<Zd>requireNonNull(paramZd);
    this.ZE = new ConcurrentHashMap<>();
    boolean bool = Zn.Zx();
    try {
      this.ZQ = Executors.newSingleThreadExecutor(paramZd::lambda$new$0);
      this.ZI = paramZl.ZE(Zu.ZX, this::lambda$new$1);
      if (!bool)
        Zbqc.Zr(new Zbqc[4]); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject) throws Zp, Z_ {
    boolean bool = Zn.Zx();
    try {
      if (paramMethod.getName().equals(a(20324, 13135)))
        return toString(); 
    } catch (Zp zp) {
      throw a(null);
    } 
    try {
      if (!paramMethod.getName().equals(a(20326, 25439))) {
        try {
          if (paramMethod.getName().equals(a(20327, 9375)))
            throw new UnsupportedOperationException(a(20321, 26938)); 
        } catch (Zp zp) {
          throw a(null);
        } 
      } else {
        throw new UnsupportedOperationException(a(20321, 26938));
      } 
    } catch (Zp zp) {
      throw a(null);
    } 
    try {
      if (!this.Zv.ZR())
        throw new Zp(a(20329, -10613)); 
    } catch (Zp zp) {
      throw a(null);
    } 
    try {
      if (this.ZQ.isShutdown())
        throw new Z_(a(20328, -18459) + a(20328, -18459) + String.valueOf(this.Zw)); 
    } catch (Zp zp) {
      throw a(null);
    } 
    Zmm zmm = Zmm.Zg(paramMethod);
    if (zmm instanceof Zg) {
      Zg zg = (Zg)zmm;
      try {
        if (bool)
          return Zz(zg, paramArrayOfObject); 
        throw new IllegalArgumentException(a(20325, 18911) + a(20325, 18911));
      } catch (Zp zp) {
        throw a(null);
      } 
    } 
    throw new IllegalArgumentException(a(20325, 18911) + a(20325, 18911));
  }
  
  public String toString() {
    return a(20323, -31416) + a(20323, -31416) + String.valueOf(this.Zw);
  }
  
  public void ZZ() {
    try {
      if (this.ZQ.isShutdown())
        return; 
    } catch (InterruptedException interruptedException) {
      throw a(null);
    } 
    this.ZQ.shutdown();
    this.ZI.ZZ();
    this.ZE.clear();
    try {
      if (!this.ZQ.awaitTermination(500L, TimeUnit.MILLISECONDS))
        this.ZQ.shutdownNow(); 
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
      this.ZQ.shutdownNow();
    } 
  }
  
  private Zs Zz(Zg paramZg, Object[] paramArrayOfObject) {
    Zxl zxl = Zxl.ZO(this.ZE, paramZg, paramArrayOfObject);
    ((Set<Zxl>)this.ZE.computeIfAbsent(paramZg.name(), Zo::lambda$handleEventSubscription$2)).add(zxl);
    return (Zs)zxl;
  }
  
  private void Zg(Zc paramZc) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual Zq : ()Lnet/portswigger/devtools/client/impl/Zw;
    //   4: astore_2
    //   5: aload_0
    //   6: getfield ZQ : Ljava/util/concurrent/ExecutorService;
    //   9: invokeinterface isShutdown : ()Z
    //   14: ifne -> 63
    //   17: aload_2
    //   18: invokevirtual Zh : ()Lnet/portswigger/browser/Zd;
    //   21: aload_0
    //   22: getfield Zw : Lnet/portswigger/browser/Zd;
    //   25: invokevirtual equals : (Ljava/lang/Object;)Z
    //   28: ifeq -> 63
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   37: athrow
    //   38: aload_0
    //   39: getfield ZQ : Ljava/util/concurrent/ExecutorService;
    //   42: aload_0
    //   43: aload_1
    //   44: aload_2
    //   45: <illegal opcode> run : (Lnet/portswigger/devtools/client/Zo;Lnet/portswigger/devtools/client/impl/connection/Zc;Lnet/portswigger/devtools/client/impl/Zw;)Ljava/lang/Runnable;
    //   50: invokeinterface submit : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   55: pop
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   62: athrow
    //   63: return
    // Exception table:
    //   from	to	target	type
    //   5	31	34	java/lang/UnsupportedOperationException
    //   17	56	59	java/lang/UnsupportedOperationException
  }
  
  private void Zb(Zc paramZc, Zw paramZw) {
    Set<Zxl<?>> set = this.ZE.computeIfAbsent(paramZw.ZOE().name(), Zo::lambda$dispatchMessage$4);
    try {
      Zs(paramZc, set);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
    } 
  }
  
  private void Zs(Zc paramZc, Set<Zxl<?>> paramSet) throws InterruptedException {
    // Byte code:
    //   0: invokestatic Zx : ()Z
    //   3: aload_2
    //   4: invokeinterface iterator : ()Ljava/util/Iterator;
    //   9: astore #4
    //   11: istore_3
    //   12: aload #4
    //   14: invokeinterface hasNext : ()Z
    //   19: ifeq -> 87
    //   22: aload #4
    //   24: invokeinterface next : ()Ljava/lang/Object;
    //   29: checkcast net/portswigger/devtools/client/impl/Zxl
    //   32: astore #5
    //   34: aload_0
    //   35: getfield ZQ : Ljava/util/concurrent/ExecutorService;
    //   38: invokeinterface isShutdown : ()Z
    //   43: ifeq -> 57
    //   46: iload_3
    //   47: ifne -> 87
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   56: athrow
    //   57: aload #5
    //   59: aload_1
    //   60: invokevirtual ZQ : ()Lnet/portswigger/devtools/protocol/Zl;
    //   63: invokevirtual Zp : (Lnet/portswigger/devtools/protocol/Zl;)V
    //   66: goto -> 83
    //   69: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   72: athrow
    //   73: astore #6
    //   75: aload #6
    //   77: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   80: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   83: iload_3
    //   84: ifne -> 12
    //   87: return
    // Exception table:
    //   from	to	target	type
    //   34	50	53	java/lang/RuntimeException
    //   46	69	69	java/lang/InterruptedException
    //   57	66	73	java/lang/RuntimeException
  }
  
  private static Set lambda$dispatchMessage$4(Zof paramZof) {
    return new CopyOnWriteArraySet();
  }
  
  private void lambda$processReceivedMessage$3(Zc paramZc, Zw paramZw) {
    Zb(paramZc, paramZw);
  }
  
  private static Set lambda$handleEventSubscription$2(Zof paramZof) {
    return new CopyOnWriteArraySet();
  }
  
  private void lambda$new$1(Zxr8 paramZxr8) {
    Zg(paramZxr8.ZF().orElseThrow());
  }
  
  private static Thread lambda$new$0(Zd paramZd, Runnable paramRunnable) {
    return new Thread(paramRunnable, String.valueOf(paramZd) + String.valueOf(paramZd));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'êé°\\fvØwÂ¹Þ÷)ÈCDRXý0X0²çztÄà4¿ ?´ÐEu¦Ð¸ÚfÙ.ú­2Æ"ZÆ O2o/ÿñeýkÏ¢>}n§5ái»#þ3ÒÚ&JöÆü´%`;¥DÚçÕ\\bJ«dlìi+!>£[¨xKýi8ê¤¤Û±jÀùU¼;Þ«.©¤¸ñÃûÔ-+CAÚ\\b\\t B'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #15
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #84
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
    //   68: ldc 'ÚOþÉ`eÚ2V2ÉÕ?ñaÞ×hí¯Ål«£Næ /ò|T]'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #15
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #38
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
    //   129: putstatic net/portswigger/devtools/client/Zo.a : [Ljava/lang/String;
    //   132: bipush #10
    //   134: anewarray java/lang/String
    //   137: putstatic net/portswigger/devtools/client/Zo.b : [Ljava/lang/String;
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
    //   212: bipush #122
    //   214: goto -> 244
    //   217: bipush #100
    //   219: goto -> 244
    //   222: bipush #21
    //   224: goto -> 244
    //   227: bipush #74
    //   229: goto -> 244
    //   232: bipush #57
    //   234: goto -> 244
    //   237: bipush #27
    //   239: goto -> 244
    //   242: bipush #23
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
    int i = (paramInt1 ^ 0x4F60) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\Zo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */