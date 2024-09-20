package burp;

import burp.api.montoya.burpsuite.BurpSuite;
import burp.api.montoya.burpsuite.ShutdownOptions;
import burp.api.montoya.burpsuite.TaskExecutionEngine;
import burp.api.montoya.core.Version;
import burp.api.montoya.logging.Logging;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;

public class Ztuy implements BurpSuite {
  private final Logging Zs;
  
  private final Zgbj ZM;
  
  private final Zzxi Zt;
  
  private final Zr1m Zr;
  
  private final Version ZY;
  
  private final Zrag Zi;
  
  private final AtomicBoolean Zh;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ztuy(Logging paramLogging, Zgbj paramZgbj, Zzxi paramZzxi, Zr1m paramZr1m, Zgs1 paramZgs1, Zrag paramZrag) {
    this.Zs = paramLogging;
    this.ZM = paramZgbj;
    this.Zt = paramZzxi;
    this.Zr = paramZr1m;
    this.Zi = paramZrag;
    this.ZY = new Zttm(paramZgs1);
    this.Zh = new AtomicBoolean(true);
    Zlli<Zt11> zlli = paramZrag.Zi();
    zlli.ZE(Zt11.Zm, this::lambda$new$0);
    zlli.ZE(Zt11.ZW, this::lambda$new$1);
  }
  
  public Version version() {
    return this.ZY;
  }
  
  public String exportProjectOptionsAsJson(String... paramVarArgs) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic Zf : ()Ljava/lang/String;
    //   11: aload_1
    //   12: astore #4
    //   14: aload #4
    //   16: arraylength
    //   17: istore #5
    //   19: astore_2
    //   20: iconst_0
    //   21: istore #6
    //   23: iload #6
    //   25: iload #5
    //   27: if_icmpge -> 163
    //   30: aload #4
    //   32: iload #6
    //   34: aaload
    //   35: astore #7
    //   37: iconst_0
    //   38: istore #8
    //   40: getstatic burp/Zqw.Zj : [Ljava/lang/String;
    //   43: astore #9
    //   45: aload #9
    //   47: arraylength
    //   48: istore #10
    //   50: iconst_0
    //   51: istore #11
    //   53: iload #11
    //   55: iload #10
    //   57: if_icmpge -> 98
    //   60: aload #9
    //   62: iload #11
    //   64: aaload
    //   65: astore #12
    //   67: aload #7
    //   69: aload #12
    //   71: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   74: ifeq -> 84
    //   77: iconst_1
    //   78: istore #8
    //   80: aload_2
    //   81: ifnonnull -> 98
    //   84: iinc #11, 1
    //   87: aload_2
    //   88: ifnonnull -> 53
    //   91: goto -> 98
    //   94: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   97: athrow
    //   98: iload #8
    //   100: ifeq -> 123
    //   103: aload_3
    //   104: aload #7
    //   106: invokeinterface add : (Ljava/lang/Object;)Z
    //   111: pop
    //   112: aload_2
    //   113: ifnonnull -> 156
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   122: athrow
    //   123: aload_0
    //   124: getfield Zs : Lburp/api/montoya/logging/Logging;
    //   127: aload #7
    //   129: sipush #29778
    //   132: sipush #-8962
    //   135: invokestatic a : (II)Ljava/lang/String;
    //   138: swap
    //   139: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   144: invokeinterface raiseInfoEvent : (Ljava/lang/String;)V
    //   149: goto -> 156
    //   152: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   155: athrow
    //   156: iinc #6, 1
    //   159: aload_2
    //   160: ifnonnull -> 23
    //   163: aload_3
    //   164: invokeinterface isEmpty : ()Z
    //   169: ifeq -> 182
    //   172: getstatic burp/Zqw.Zj : [Ljava/lang/String;
    //   175: goto -> 195
    //   178: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   181: athrow
    //   182: aload_3
    //   183: iconst_0
    //   184: anewarray java/lang/String
    //   187: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   192: checkcast [Ljava/lang/String;
    //   195: astore #4
    //   197: aload_0
    //   198: getfield Zr : Lburp/Zr1m;
    //   201: aload #4
    //   203: invokevirtual ZZ : ([Ljava/lang/String;)Ljava/lang/String;
    //   206: areturn
    // Exception table:
    //   from	to	target	type
    //   80	91	94	java/lang/IllegalArgumentException
    //   98	116	119	java/lang/IllegalArgumentException
    //   103	149	152	java/lang/IllegalArgumentException
    //   163	178	178	java/lang/IllegalArgumentException
  }
  
  public void importProjectOptionsFromJson(String paramString) {
    try {
      this.Zr.Ze(paramString, Zqw.Zj);
    } catch (Ze0d ze0d) {
      Zah.Zl(ze0d, Zk_.IGNORED);
      throw new IllegalArgumentException(a(29780, -165), ze0d);
    } 
  }
  
  public String exportUserOptionsAsJson(String... paramVarArgs) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic Zf : ()Ljava/lang/String;
    //   11: aload_1
    //   12: astore #4
    //   14: astore_2
    //   15: aload #4
    //   17: arraylength
    //   18: istore #5
    //   20: iconst_0
    //   21: istore #6
    //   23: iload #6
    //   25: iload #5
    //   27: if_icmpge -> 114
    //   30: aload #4
    //   32: iload #6
    //   34: aaload
    //   35: astore #7
    //   37: aload #7
    //   39: sipush #29776
    //   42: sipush #-10137
    //   45: invokestatic a : (II)Ljava/lang/String;
    //   48: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   51: ifeq -> 74
    //   54: aload_3
    //   55: aload #7
    //   57: invokeinterface add : (Ljava/lang/Object;)Z
    //   62: pop
    //   63: aload_2
    //   64: ifnonnull -> 107
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   73: athrow
    //   74: aload_0
    //   75: getfield Zs : Lburp/api/montoya/logging/Logging;
    //   78: aload #7
    //   80: sipush #29779
    //   83: sipush #-15784
    //   86: invokestatic a : (II)Ljava/lang/String;
    //   89: swap
    //   90: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   95: invokeinterface raiseInfoEvent : (Ljava/lang/String;)V
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   106: athrow
    //   107: iinc #6, 1
    //   110: aload_2
    //   111: ifnonnull -> 23
    //   114: aload_3
    //   115: invokeinterface isEmpty : ()Z
    //   120: ifeq -> 146
    //   123: iconst_1
    //   124: anewarray java/lang/String
    //   127: dup
    //   128: iconst_0
    //   129: sipush #29776
    //   132: sipush #-10137
    //   135: invokestatic a : (II)Ljava/lang/String;
    //   138: aastore
    //   139: goto -> 159
    //   142: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   145: athrow
    //   146: aload_3
    //   147: iconst_0
    //   148: anewarray java/lang/String
    //   151: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   156: checkcast [Ljava/lang/String;
    //   159: astore #4
    //   161: aload_0
    //   162: getfield Zr : Lburp/Zr1m;
    //   165: aload #4
    //   167: invokevirtual ZZ : ([Ljava/lang/String;)Ljava/lang/String;
    //   170: areturn
    // Exception table:
    //   from	to	target	type
    //   37	67	70	java/lang/IllegalArgumentException
    //   54	100	103	java/lang/IllegalArgumentException
    //   114	142	142	java/lang/IllegalArgumentException
  }
  
  public void importUserOptionsFromJson(String paramString) {
    try {
      this.Zr.Ze(paramString, new String[] { a(29781, -24814) });
    } catch (Ze0d ze0d) {
      Zah.Zl(ze0d, Zk_.IGNORED);
      throw new IllegalArgumentException(a(29777, 20736), ze0d);
    } 
  }
  
  public List<String> commandLineArguments() {
    String[] arrayOfString = this.Zt.Zt();
    return Arrays.asList(arrayOfString);
  }
  
  public void shutdown(ShutdownOptions... paramVarArgs) {
    Zm2.ZC(Zrrh.SUITE_PROJECTS_GRACEFUL_SHUTDOWN_FROM_API);
    boolean bool = Arrays.<ShutdownOptions>stream(paramVarArgs).anyMatch(Ztuy::lambda$shutdown$2);
    this.ZM.ZK(bool);
  }
  
  public TaskExecutionEngine taskExecutionEngine() {
    return new Zgp9(this);
  }
  
  private static boolean lambda$shutdown$2(ShutdownOptions paramShutdownOptions) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramShutdownOptions == ShutdownOptions.PROMPT_USER);
  }
  
  private void lambda$new$1(Zxr8 paramZxr8) {
    this.Zh.set(true);
  }
  
  private void lambda$new$0(Zxr8 paramZxr8) {
    this.Zh.set(false);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'íÎ~Qü<{»º¤\\fUwÁËIºËmð§µ&.×Q0ÛÇòÞiMÃÚþ?ZîÓ,\\bÀìº$¬´0S<SÅÉbHò O¶ÜÛÁ+û¾ëñJ¨§fr¨Ë6jÃ\\bIÐßÁxt»½ß¼6ó$'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #12
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #83
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
    //   68: ldc ',û\\f¸6B#+-U\\fÈÀsÉ8xMÑ£Â'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #12
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #117
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
    //   129: putstatic burp/Ztuy.a : [Ljava/lang/String;
    //   132: bipush #6
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztuy.b : [Ljava/lang/String;
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
    //   212: bipush #73
    //   214: goto -> 244
    //   217: bipush #29
    //   219: goto -> 244
    //   222: bipush #109
    //   224: goto -> 244
    //   227: bipush #125
    //   229: goto -> 244
    //   232: bipush #49
    //   234: goto -> 244
    //   237: bipush #113
    //   239: goto -> 244
    //   242: bipush #120
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
    int i = (paramInt1 ^ 0x7450) & 0xFFFF;
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
      char c = 'º';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztuy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */