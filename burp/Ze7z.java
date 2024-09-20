package burp;

import java.io.File;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.util.Optional;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.management.Notification;
import javax.management.NotificationEmitter;
import javax.management.NotificationListener;
import net.portswigger.Zl0;

public class Ze7z implements NotificationListener {
  private final Zr_4 Zn;
  
  private final Ztg4 ZN;
  
  private final Zl0 Zk;
  
  private final Zlko Zb;
  
  private final MemoryMXBean Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ze7z(Zr_4 paramZr_4, Ztg4 paramZtg4, Zl0 paramZl0, Zlko paramZlko) {
    this.Zn = paramZr_4;
    this.ZN = paramZtg4;
    this.Zk = paramZl0;
    this.Zb = paramZlko;
    this.Zd = ManagementFactory.getMemoryMXBean();
  }
  
  public void Zd() {
    Zc();
    ZY();
  }
  
  private void Zc() {
    Zbqc[] arrayOfZbqc = Zbh0.Ze();
    for (GarbageCollectorMXBean garbageCollectorMXBean : ManagementFactory.getGarbageCollectorMXBeans()) {
      NotificationEmitter notificationEmitter = (NotificationEmitter)garbageCollectorMXBean;
      notificationEmitter.addNotificationListener(this, null, null);
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  private void ZY() {
    Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(this::ZD, 0L, 10L, TimeUnit.SECONDS);
  }
  
  public void handleNotification(Notification paramNotification, Object paramObject) {
    if (paramNotification.getType().equals(a(29070, 31942))) {
      MemoryUsage memoryUsage = this.Zd.getHeapMemoryUsage();
      long l1 = memoryUsage.getMax();
      long l2 = memoryUsage.getUsed();
      int i = (int)(l2 * 100L / l1);
      this.Zb.ZO(l2, i);
    } 
  }
  
  private void ZD() {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_0
    //   9: invokevirtual Zv : ()Ljava/util/Optional;
    //   12: astore_3
    //   13: invokestatic Ze : ()[Lburp/Zbqc;
    //   16: aload_0
    //   17: invokevirtual ZO : ()Ljava/util/Optional;
    //   20: astore #4
    //   22: astore_1
    //   23: aload_3
    //   24: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   29: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   32: lconst_0
    //   33: invokestatic valueOf : (J)Ljava/lang/Long;
    //   36: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   39: checkcast java/lang/Long
    //   42: invokevirtual longValue : ()J
    //   45: lstore #5
    //   47: aload #4
    //   49: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   54: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   57: lconst_0
    //   58: invokestatic valueOf : (J)Ljava/lang/Long;
    //   61: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   64: checkcast java/lang/Long
    //   67: invokevirtual longValue : ()J
    //   70: lstore #7
    //   72: lload #5
    //   74: lconst_0
    //   75: lcmp
    //   76: ifle -> 255
    //   79: lload #7
    //   81: lconst_0
    //   82: lcmp
    //   83: ifle -> 255
    //   86: aload_0
    //   87: getfield Zn : Lburp/Zr_4;
    //   90: invokeinterface Zl : ()Lburp/Zkit;
    //   95: invokevirtual Zy : ()Ljava/io/File;
    //   98: invokevirtual length : ()J
    //   101: lstore #9
    //   103: aload_0
    //   104: getfield ZN : Lburp/Ztg4;
    //   107: invokevirtual Zn : ()Ljava/util/List;
    //   110: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   115: <illegal opcode> applyAsLong : ()Ljava/util/function/ToLongFunction;
    //   120: invokeinterface mapToLong : (Ljava/util/function/ToLongFunction;)Ljava/util/stream/LongStream;
    //   125: invokeinterface sum : ()J
    //   130: lstore #11
    //   132: aload_3
    //   133: invokevirtual get : ()Ljava/lang/Object;
    //   136: checkcast java/io/File
    //   139: aload #4
    //   141: invokevirtual get : ()Ljava/lang/Object;
    //   144: invokevirtual equals : (Ljava/lang/Object;)Z
    //   147: ifeq -> 185
    //   150: lload #9
    //   152: lload #11
    //   154: ladd
    //   155: lstore #13
    //   157: aload_2
    //   158: new burp/Zebi
    //   161: dup
    //   162: lload #13
    //   164: aload_0
    //   165: lload #13
    //   167: lload #5
    //   169: invokevirtual ZL : (JJ)I
    //   172: invokespecial <init> : (JI)V
    //   175: invokeinterface add : (Ljava/lang/Object;)Z
    //   180: pop
    //   181: aload_1
    //   182: ifnonnull -> 251
    //   185: aload_2
    //   186: new burp/Zebi
    //   189: dup
    //   190: sipush #29071
    //   193: sipush #-6588
    //   196: invokestatic a : (II)Ljava/lang/String;
    //   199: lload #9
    //   201: aload_0
    //   202: lload #9
    //   204: lload #5
    //   206: invokevirtual ZL : (JJ)I
    //   209: invokespecial <init> : (Ljava/lang/String;JI)V
    //   212: invokeinterface add : (Ljava/lang/Object;)Z
    //   217: pop
    //   218: aload_2
    //   219: new burp/Zebi
    //   222: dup
    //   223: sipush #29068
    //   226: sipush #-11852
    //   229: invokestatic a : (II)Ljava/lang/String;
    //   232: lload #11
    //   234: aload_0
    //   235: lload #11
    //   237: lload #7
    //   239: invokevirtual ZL : (JJ)I
    //   242: invokespecial <init> : (Ljava/lang/String;JI)V
    //   245: invokeinterface add : (Ljava/lang/Object;)Z
    //   250: pop
    //   251: aload_1
    //   252: ifnonnull -> 360
    //   255: lload #5
    //   257: lconst_0
    //   258: lcmp
    //   259: ifle -> 307
    //   262: aload_0
    //   263: getfield Zn : Lburp/Zr_4;
    //   266: invokeinterface Zl : ()Lburp/Zkit;
    //   271: invokevirtual Zy : ()Ljava/io/File;
    //   274: invokevirtual length : ()J
    //   277: lstore #9
    //   279: aload_2
    //   280: new burp/Zebi
    //   283: dup
    //   284: lload #9
    //   286: aload_0
    //   287: lload #9
    //   289: lload #5
    //   291: invokevirtual ZL : (JJ)I
    //   294: invokespecial <init> : (JI)V
    //   297: invokeinterface add : (Ljava/lang/Object;)Z
    //   302: pop
    //   303: aload_1
    //   304: ifnonnull -> 360
    //   307: aload_0
    //   308: getfield ZN : Lburp/Ztg4;
    //   311: invokevirtual Zn : ()Ljava/util/List;
    //   314: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   319: <illegal opcode> applyAsLong : ()Ljava/util/function/ToLongFunction;
    //   324: invokeinterface mapToLong : (Ljava/util/function/ToLongFunction;)Ljava/util/stream/LongStream;
    //   329: invokeinterface sum : ()J
    //   334: lstore #9
    //   336: aload_2
    //   337: new burp/Zebi
    //   340: dup
    //   341: lload #9
    //   343: aload_0
    //   344: lload #9
    //   346: lload #7
    //   348: invokevirtual ZL : (JJ)I
    //   351: invokespecial <init> : (JI)V
    //   354: invokeinterface add : (Ljava/lang/Object;)Z
    //   359: pop
    //   360: aload_0
    //   361: getfield Zb : Lburp/Zlko;
    //   364: aload_2
    //   365: invokeinterface ZL : (Ljava/util/List;)V
    //   370: return
  }
  
  private Optional<File> Zv() {
    return this.Zn.Zi() ? Zs6n.Zf(this.Zn.Zl().Zy(), this.Zk) : Optional.empty();
  }
  
  private Optional<File> ZO() {
    return Zs6n.Zf(this.ZN.ZH(), this.Zk);
  }
  
  private int ZL(long paramLong1, long paramLong2) {
    return (int)(paramLong1 * 100L / (paramLong2 + paramLong1));
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '}áÆ>ãóî%¬~Í¯¬ÂîYO¼Û{4gÿF«6ò!­Âm­]Zí-'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #34
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #57
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
    //   69: putstatic burp/Ze7z.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Ze7z.b : [Ljava/lang/String;
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
    //   152: bipush #30
    //   154: goto -> 184
    //   157: bipush #45
    //   159: goto -> 184
    //   162: bipush #12
    //   164: goto -> 184
    //   167: bipush #100
    //   169: goto -> 184
    //   172: bipush #105
    //   174: goto -> 184
    //   177: bipush #14
    //   179: goto -> 184
    //   182: bipush #123
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
    int i = (paramInt1 ^ 0x718E) & 0xFFFF;
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
      char c = 'Ñ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze7z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */