package burp;

import java.awt.Dimension;
import java.util.List;
import java.util.function.Supplier;
import javax.swing.event.TreeSelectionEvent;

class Zb7f extends Zbqc {
  private final Zbhy Zb;
  
  private final Zoy Zn;
  
  private final Supplier<Integer> Zu;
  
  private Zsj0 Zh;
  
  private byte[] Zs;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zb7f(Zbhy paramZbhy, Zti6 paramZti6, Supplier<Integer> paramSupplier) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_3
    //   6: putfield Zu : Ljava/util/function/Supplier;
    //   9: aload_0
    //   10: new java/awt/BorderLayout
    //   13: dup
    //   14: invokespecial <init> : ()V
    //   17: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   20: aload_0
    //   21: aload_1
    //   22: putfield Zb : Lburp/Zbhy;
    //   25: new burp/Zbup
    //   28: dup
    //   29: invokespecial <init> : ()V
    //   32: astore #4
    //   34: aload #4
    //   36: getstatic burp/Zxt_.Zb : Ljavax/swing/border/Border;
    //   39: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   42: aload #4
    //   44: bipush #31
    //   46: invokevirtual setHorizontalScrollBarPolicy : (I)V
    //   49: aload_0
    //   50: new burp/Zoy
    //   53: dup
    //   54: aload #4
    //   56: invokevirtual getViewport : ()Ljavax/swing/JViewport;
    //   59: invokespecial <init> : (Ljava/awt/Container;)V
    //   62: putfield Zn : Lburp/Zoy;
    //   65: aload_0
    //   66: getfield Zn : Lburp/Zoy;
    //   69: aload_0
    //   70: aload_1
    //   71: aload_2
    //   72: <illegal opcode> valueChanged : (Lburp/Zb7f;Lburp/Zbhy;Lburp/Zti6;)Ljavax/swing/event/TreeSelectionListener;
    //   77: invokevirtual addTreeSelectionListener : (Ljavax/swing/event/TreeSelectionListener;)V
    //   80: aload #4
    //   82: aload_0
    //   83: getfield Zn : Lburp/Zoy;
    //   86: invokevirtual setViewportView : (Ljava/awt/Component;)V
    //   89: aload_0
    //   90: aload #4
    //   92: sipush #-19296
    //   95: sipush #-6898
    //   98: invokestatic a : (II)Ljava/lang/String;
    //   101: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   104: return
  }
  
  private String Zn(Zshh paramZshh) {
    // Byte code:
    //   0: invokestatic ZY : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual ZG : ()Lburp/Zs66;
    //   8: aload_1
    //   9: invokevirtual ZX : ()Lburp/Zs66;
    //   12: if_acmpeq -> 29
    //   15: sipush #-19294
    //   18: sipush #-13372
    //   21: invokestatic a : (II)Ljava/lang/String;
    //   24: astore_3
    //   25: aload_2
    //   26: ifnull -> 96
    //   29: getstatic burp/Zs66.SYNTHETIC_TYPES : Ljava/util/List;
    //   32: aload_1
    //   33: invokevirtual ZG : ()Lburp/Zs66;
    //   36: invokeinterface contains : (Ljava/lang/Object;)Z
    //   41: ifeq -> 58
    //   44: sipush #-19295
    //   47: sipush #-8883
    //   50: invokestatic a : (II)Ljava/lang/String;
    //   53: astore_3
    //   54: aload_2
    //   55: ifnull -> 96
    //   58: aload_1
    //   59: invokevirtual ZK : ()[B
    //   62: aload_0
    //   63: getfield Zs : [B
    //   66: invokestatic equals : ([B[B)Z
    //   69: ifne -> 86
    //   72: sipush #-19293
    //   75: sipush #-5775
    //   78: invokestatic a : (II)Ljava/lang/String;
    //   81: astore_3
    //   82: aload_2
    //   83: ifnull -> 96
    //   86: sipush #-19289
    //   89: sipush #-23082
    //   92: invokestatic a : (II)Ljava/lang/String;
    //   95: astore_3
    //   96: aload_3
    //   97: areturn
  }
  
  private Zkv5 Z_(Zgh_ paramZgh_) {
    Zsbw zsbw = new Zsbw(this);
    return paramZgh_.<Zkv5>Z_(zsbw);
  }
  
  public Dimension getPreferredSize() {
    return new Dimension((this.Zn.getPreferredSize()).width, ((Integer)this.Zu.get()).intValue());
  }
  
  void ZO(List<Zsj0> paramList, byte[] paramArrayOfbyte) {
    this.Zn.Zs(paramArrayOfbyte, paramList);
    this.Zs = paramArrayOfbyte;
  }
  
  void ZG(Zga paramZga) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zb7f;Lburp/Zga;)Ljava/lang/Runnable;
    //   7: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  private void lambda$statusUpdated$1(Zga paramZga) {
    Zro0 zro0 = paramZga.ZrE();
    this.Zn.Zt(zro0);
    if (this.Zh != null && this.Zh.Zh4().equals(zro0))
      this.Zb.ZZ(this.Zh); 
  }
  
  private void lambda$new$0(Zbhy paramZbhy, Zti6 paramZti6, TreeSelectionEvent paramTreeSelectionEvent) {
    // Byte code:
    //   0: invokestatic ZY : ()[I
    //   3: astore #4
    //   5: aload_3
    //   6: invokevirtual getNewLeadSelectionPath : ()Ljavax/swing/tree/TreePath;
    //   9: astore #5
    //   11: aload #5
    //   13: ifnull -> 194
    //   16: aload #5
    //   18: invokevirtual getLastPathComponent : ()Ljava/lang/Object;
    //   21: checkcast javax/swing/tree/DefaultMutableTreeNode
    //   24: astore #6
    //   26: aload #6
    //   28: invokevirtual getUserObject : ()Ljava/lang/Object;
    //   31: astore #8
    //   33: aload #8
    //   35: instanceof burp/Zsj0
    //   38: ifeq -> 65
    //   41: aload #8
    //   43: checkcast burp/Zsj0
    //   46: astore #7
    //   48: aload_0
    //   49: aload #7
    //   51: putfield Zh : Lburp/Zsj0;
    //   54: aload_1
    //   55: aload #7
    //   57: invokevirtual Zx : (Lburp/Zsj0;)V
    //   60: aload #4
    //   62: ifnull -> 78
    //   65: aload_0
    //   66: aconst_null
    //   67: putfield Zh : Lburp/Zsj0;
    //   70: aload_1
    //   71: invokevirtual Zr : ()V
    //   74: aload_2
    //   75: invokevirtual ZU : ()V
    //   78: aload_0
    //   79: getfield Zh : Lburp/Zsj0;
    //   82: ifnull -> 133
    //   85: aload_0
    //   86: getfield Zh : Lburp/Zsj0;
    //   89: invokevirtual ZhH : ()Lburp/Zgh_;
    //   92: astore #8
    //   94: aload #8
    //   96: instanceof burp/Zshh
    //   99: ifeq -> 133
    //   102: aload #8
    //   104: checkcast burp/Zshh
    //   107: astore #7
    //   109: aload_2
    //   110: aload #7
    //   112: invokevirtual ZK : ()[B
    //   115: invokevirtual ZV : ([B)V
    //   118: aload_2
    //   119: aload_0
    //   120: aload #7
    //   122: invokevirtual Zn : (Lburp/Zshh;)Ljava/lang/String;
    //   125: invokevirtual ZX : (Ljava/lang/String;)V
    //   128: aload #4
    //   130: ifnull -> 154
    //   133: aload_2
    //   134: aload_0
    //   135: getfield Zs : [B
    //   138: invokevirtual ZV : ([B)V
    //   141: aload_2
    //   142: sipush #-19290
    //   145: sipush #-16810
    //   148: invokestatic a : (II)Ljava/lang/String;
    //   151: invokevirtual ZX : (Ljava/lang/String;)V
    //   154: aload_0
    //   155: getfield Zh : Lburp/Zsj0;
    //   158: ifnull -> 194
    //   161: aload_0
    //   162: aload_0
    //   163: getfield Zh : Lburp/Zsj0;
    //   166: invokevirtual ZhH : ()Lburp/Zgh_;
    //   169: invokevirtual Z_ : (Lburp/Zgh_;)Lburp/Zkv5;
    //   172: astore #7
    //   174: aload #7
    //   176: ifnull -> 190
    //   179: aload_2
    //   180: aload #7
    //   182: invokevirtual ZX : (Lburp/Zkv5;)V
    //   185: aload #4
    //   187: ifnull -> 194
    //   190: aload_2
    //   191: invokevirtual ZU : ()V
    //   194: return
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ':ºÆ)mkJôKö"ôÔI!»G¢4lai¸·õïÝX#ïv~k¸¨äuµ²d"FÉÜ»Q=x5 ÇÀ*÷N{Ø\\f¾31åËµtG¸Áêåä¦'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #86
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
    //   68: ldc ' B¸®5\ö\\n\\f]Þ¸ÚÍ Wº°\\r'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #12
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #103
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
    //   129: putstatic burp/Zb7f.a : [Ljava/lang/String;
    //   132: bipush #6
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zb7f.b : [Ljava/lang/String;
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
    //   212: bipush #92
    //   214: goto -> 244
    //   217: bipush #84
    //   219: goto -> 244
    //   222: bipush #106
    //   224: goto -> 244
    //   227: bipush #40
    //   229: goto -> 244
    //   232: bipush #33
    //   234: goto -> 244
    //   237: bipush #123
    //   239: goto -> 244
    //   242: bipush #87
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
    int i = (paramInt1 ^ 0xFFFFB4A3) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb7f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */