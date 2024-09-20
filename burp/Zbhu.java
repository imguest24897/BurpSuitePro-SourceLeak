package burp;

import java.awt.Component;
import java.util.List;
import java.util.Set;
import javax.swing.SwingUtilities;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zbhu extends Zbqc implements Zrm5 {
  private final Zbs3 Zd;
  
  private final Set<Zb2e> Zz;
  
  private final Zm2s ZK;
  
  private boolean ZT;
  
  private static int Z_;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbhu(Zbs3 paramZbs3) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield Zd : Lburp/Zbs3;
    //   9: aload_0
    //   10: new java/util/concurrent/CopyOnWriteArraySet
    //   13: dup
    //   14: invokespecial <init> : ()V
    //   17: putfield Zz : Ljava/util/Set;
    //   20: invokestatic Zm : ()I
    //   23: aload_0
    //   24: new burp/Zm2s
    //   27: dup
    //   28: sipush #-32690
    //   31: sipush #-17448
    //   34: invokestatic a : (II)Ljava/lang/String;
    //   37: invokespecial <init> : (Ljava/lang/String;)V
    //   40: putfield ZK : Lburp/Zm2s;
    //   43: aload_0
    //   44: getstatic burp/Zlkk.BACKGROUNDER : Lburp/Zlkk;
    //   47: invokevirtual Zl : (Lburp/Zlkk;)V
    //   50: aload_0
    //   51: new java/awt/BorderLayout
    //   54: dup
    //   55: invokespecial <init> : ()V
    //   58: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   61: aload_0
    //   62: new javax/swing/border/EmptyBorder
    //   65: dup
    //   66: bipush #20
    //   68: bipush #20
    //   70: bipush #20
    //   72: bipush #20
    //   74: invokespecial <init> : (IIII)V
    //   77: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   80: istore_2
    //   81: aload_0
    //   82: aload_1
    //   83: invokevirtual ZR : ()Lburp/Zbqc;
    //   86: sipush #-32689
    //   89: sipush #-11089
    //   92: invokestatic a : (II)Ljava/lang/String;
    //   95: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   98: aload_1
    //   99: invokevirtual ZI : ()Lburp/Zzbt;
    //   102: astore_3
    //   103: aload_1
    //   104: aload_0
    //   105: aload_3
    //   106: <illegal opcode> ZX : (Lburp/Zbhu;Lburp/Zzbt;)Lburp/Zb4f;
    //   111: invokevirtual Zl : (Lburp/Zb4f;)V
    //   114: aload_1
    //   115: aload_0
    //   116: aload_1
    //   117: <illegal opcode> accept : (Lburp/Zbhu;Lburp/Zbs3;)Ljava/util/function/Consumer;
    //   122: invokevirtual Zr : (Ljava/util/function/Consumer;)V
    //   125: invokestatic Zwu : ()[Lburp/Zbqc;
    //   128: ifnonnull -> 138
    //   131: iinc #2, 1
    //   134: iload_2
    //   135: invokestatic Zl : (I)V
    //   138: return
  }
  
  public void Za(Runnable paramRunnable) {
    this.Zd.Zs(paramRunnable);
  }
  
  public Component ZW() {
    return this;
  }
  
  public Zewb ZM() {
    return this.ZK;
  }
  
  public void Ze() {
    this.ZT = true;
    ZQ();
    this.Zz.clear();
  }
  
  private Zlkk Zh() {
    boolean bool = this.Zz.stream().map(Zb2e::ZBf).anyMatch(Zbhu::lambda$getDotColourForHighestSeverityUnseenIssue$5);
    return bool ? Zlkk.TEXT_ERROR : Zlkk.SEVERITY_LOW;
  }
  
  private void ZM(Zlkk paramZlkk) {
    Zlkk zlkk = this.ZK.Zo();
    if (zlkk != paramZlkk) {
      this.ZK.ZI(paramZlkk);
      this.ZK.Ze((paramZlkk == Zlkk.TEXT_ERROR) ? paramZlkk : Zlkk.FOREGROUND);
    } 
  }
  
  private void Zy(int paramInt) {
    int i = ZC();
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    if (paramInt == 0) {
      ZQ();
      if (i == 0) {
        this.ZK.setText(a(-32691, 19256).formatted(new Object[] { a(-32690, -17448), Integer.valueOf(paramInt) }));
        return;
      } 
      return;
    } 
    this.ZK.setText(a(-32691, 19256).formatted(new Object[] { a(-32690, -17448), Integer.valueOf(paramInt) }));
  }
  
  private void ZQ() {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    this.ZK.setText(a(-32692, 30509));
    this.ZK.ZX();
    this.ZK.Ze(Zlkk.FOREGROUND);
  }
  
  public void ZV() {
    this.ZT = false;
  }
  
  public void ZJ(boolean paramBoolean) {
    if (paramBoolean)
      Zm2.Zo(Zze0.BOTTOM_DRAWER_ALL_ISSUES_DETACHED); 
    this.Zd.Zi(paramBoolean);
  }
  
  private static boolean lambda$getDotColourForHighestSeverityUnseenIssue$5(Zrdb paramZrdb) {
    return (paramZrdb.ZaJ() >= 3);
  }
  
  private void lambda$new$4(Zbs3 paramZbs3, List paramList) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZT : Z
    //   4: ifne -> 58
    //   7: aload_1
    //   8: invokevirtual ZW : ()Z
    //   11: ifne -> 58
    //   14: aload_0
    //   15: getfield Zz : Ljava/util/Set;
    //   18: aload_2
    //   19: <illegal opcode> test : (Ljava/util/List;)Ljava/util/function/Predicate;
    //   24: invokeinterface removeIf : (Ljava/util/function/Predicate;)Z
    //   29: pop
    //   30: aload_0
    //   31: getfield Zz : Ljava/util/Set;
    //   34: invokeinterface size : ()I
    //   39: istore_3
    //   40: aload_0
    //   41: invokevirtual Zh : ()Lburp/Zlkk;
    //   44: astore #4
    //   46: aload_0
    //   47: aload #4
    //   49: iload_3
    //   50: <illegal opcode> run : (Lburp/Zbhu;Lburp/Zlkk;I)Ljava/lang/Runnable;
    //   55: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   58: return
  }
  
  private static boolean lambda$new$2(List paramList, Zb2e paramZb2e) {
    return paramList.contains(paramZb2e.ZBf());
  }
  
  private void lambda$new$1(Zzbt paramZzbt, List paramList) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZT : Z
    //   4: ifne -> 86
    //   7: aload_2
    //   8: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   13: aload_1
    //   14: dup
    //   15: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   18: pop
    //   19: <illegal opcode> test : (Lburp/Zzbt;)Ljava/util/function/Predicate;
    //   24: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   29: invokeinterface toList : ()Ljava/util/List;
    //   34: astore_3
    //   35: aload_3
    //   36: invokeinterface isEmpty : ()Z
    //   41: ifeq -> 45
    //   44: return
    //   45: aload_0
    //   46: getfield Zz : Ljava/util/Set;
    //   49: aload_3
    //   50: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   55: pop
    //   56: aload_0
    //   57: getfield Zz : Ljava/util/Set;
    //   60: invokeinterface size : ()I
    //   65: istore #4
    //   67: aload_0
    //   68: invokevirtual Zh : ()Lburp/Zlkk;
    //   71: astore #5
    //   73: aload_0
    //   74: aload #5
    //   76: iload #4
    //   78: <illegal opcode> run : (Lburp/Zbhu;Lburp/Zlkk;I)Ljava/lang/Runnable;
    //   83: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   86: return
  }
  
  private void lambda$new$0(Zlkk paramZlkk, int paramInt) {
    ZM(paramZlkk);
    Zy(paramInt);
  }
  
  public static void Zl(int paramInt) {
    Z_ = paramInt;
  }
  
  public static int ZC() {
    return Z_;
  }
  
  public static int Zm() {
    int i = ZC();
    return (i == 0) ? 40 : 0;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: bipush #122
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc 'í£8.\\tõØàC{'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic Zl : (I)V
    //   22: bipush #10
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: iconst_3
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 145
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 27
    //   71: ldc '®o½}ö±Wt+ægËì§'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: bipush #10
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #126
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 145
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic burp/Zbhu.a : [Ljava/lang/String;
    //   135: iconst_4
    //   136: anewarray java/lang/String
    //   139: putstatic burp/Zbhu.b : [Ljava/lang/String;
    //   142: goto -> 304
    //   145: dup_x2
    //   146: pop
    //   147: invokevirtual toCharArray : ()[C
    //   150: dup_x1
    //   151: arraylength
    //   152: dup_x2
    //   153: pop
    //   154: iconst_0
    //   155: istore #6
    //   157: dup2_x1
    //   158: pop2
    //   159: dup_x2
    //   160: iconst_1
    //   161: if_icmpgt -> 264
    //   164: dup2
    //   165: swap
    //   166: iload #6
    //   168: dup2_x1
    //   169: caload
    //   170: swap
    //   171: iload #6
    //   173: bipush #7
    //   175: irem
    //   176: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #97
    //   218: goto -> 248
    //   221: bipush #71
    //   223: goto -> 248
    //   226: bipush #84
    //   228: goto -> 248
    //   231: bipush #110
    //   233: goto -> 248
    //   236: bipush #45
    //   238: goto -> 248
    //   241: bipush #53
    //   243: goto -> 248
    //   246: bipush #98
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 168
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 164
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 43, 0 -> 102
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF804E) & 0xFFFF;
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
      byte b1 = 45;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbhu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */