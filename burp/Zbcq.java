package burp;

import java.awt.Component;
import java.awt.Container;
import javax.swing.Icon;
import net.portswigger.Zm2;

public class Zbcq extends Zbqc {
  private static final Icon Zh;
  
  private static final Icon Zz;
  
  private final Zbqc Zn;
  
  private final Zbqc ZJ;
  
  private final Zbqc ZG;
  
  private final Zldk ZV;
  
  private boolean ZF;
  
  private Component Zw;
  
  private Component ZL;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbcq() {
    this(new Zbxm());
  }
  
  public Zbcq(Zbxm paramZbxm) {
    // Byte code:
    //   0: aload_0
    //   1: new java/awt/BorderLayout
    //   4: dup
    //   5: invokespecial <init> : ()V
    //   8: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   11: aload_0
    //   12: new burp/Zbqc
    //   15: dup
    //   16: new java/awt/FlowLayout
    //   19: dup
    //   20: iconst_0
    //   21: iconst_5
    //   22: iconst_0
    //   23: invokespecial <init> : (III)V
    //   26: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   29: putfield Zn : Lburp/Zbqc;
    //   32: aload_0
    //   33: new burp/Zbqc
    //   36: dup
    //   37: new java/awt/BorderLayout
    //   40: dup
    //   41: invokespecial <init> : ()V
    //   44: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   47: putfield ZJ : Lburp/Zbqc;
    //   50: aload_0
    //   51: new burp/Zbqc
    //   54: dup
    //   55: new java/awt/BorderLayout
    //   58: dup
    //   59: invokespecial <init> : ()V
    //   62: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   65: putfield ZG : Lburp/Zbqc;
    //   68: aload_0
    //   69: aload_1
    //   70: getfield ZT : Lburp/Zldk;
    //   73: putfield ZV : Lburp/Zldk;
    //   76: aload_0
    //   77: iconst_1
    //   78: putfield ZF : Z
    //   81: aload_0
    //   82: getfield ZV : Lburp/Zldk;
    //   85: aload_0
    //   86: aload_1
    //   87: <illegal opcode> run : (Lburp/Zbcq;Lburp/Zbxm;)Ljava/lang/Runnable;
    //   92: invokeinterface Zd : (Ljava/lang/Runnable;)V
    //   97: aload_0
    //   98: getfield ZG : Lburp/Zbqc;
    //   101: iconst_5
    //   102: iconst_5
    //   103: iconst_5
    //   104: iconst_5
    //   105: invokestatic createEmptyBorder : (IIII)Ljavax/swing/border/Border;
    //   108: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   111: aload_1
    //   112: getfield ZX : Z
    //   115: ifeq -> 141
    //   118: aload_0
    //   119: getfield ZJ : Lburp/Zbqc;
    //   122: new burp/Zem9
    //   125: dup
    //   126: invokespecial <init> : ()V
    //   129: sipush #-9301
    //   132: sipush #-24100
    //   135: invokestatic a : (II)Ljava/lang/String;
    //   138: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   141: aload_0
    //   142: getfield ZJ : Lburp/Zbqc;
    //   145: aload_0
    //   146: getfield ZG : Lburp/Zbqc;
    //   149: sipush #-9302
    //   152: sipush #-12933
    //   155: invokestatic a : (II)Ljava/lang/String;
    //   158: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   161: aload_1
    //   162: getfield Z_ : Ljava/awt/Component;
    //   165: ifnull -> 176
    //   168: aload_0
    //   169: aload_1
    //   170: getfield Z_ : Ljava/awt/Component;
    //   173: invokevirtual ZL : (Ljava/awt/Component;)V
    //   176: new burp/Zbqc
    //   179: dup
    //   180: invokespecial <init> : ()V
    //   183: astore_2
    //   184: aload_2
    //   185: aload_0
    //   186: getfield ZV : Lburp/Zldk;
    //   189: invokeinterface Zk : ()Ljava/awt/Component;
    //   194: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   197: pop
    //   198: aload_2
    //   199: iconst_0
    //   200: iconst_0
    //   201: iconst_0
    //   202: iconst_5
    //   203: invokestatic createEmptyBorder : (IIII)Ljavax/swing/border/Border;
    //   206: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   209: aload_0
    //   210: getfield Zn : Lburp/Zbqc;
    //   213: aload_2
    //   214: aload_1
    //   215: getfield ZD : Lburp/Zett;
    //   218: getfield ZH : Ljava/lang/String;
    //   221: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   224: aload_1
    //   225: getfield Zt : Ljava/awt/Component;
    //   228: ifnull -> 239
    //   231: aload_0
    //   232: aload_1
    //   233: getfield Zt : Ljava/awt/Component;
    //   236: invokevirtual Zt : (Ljava/awt/Component;)V
    //   239: aload_0
    //   240: aload_0
    //   241: getfield Zn : Lburp/Zbqc;
    //   244: sipush #-9303
    //   247: sipush #-28397
    //   250: invokestatic a : (II)Ljava/lang/String;
    //   253: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   256: aload_0
    //   257: aload_0
    //   258: getfield ZJ : Lburp/Zbqc;
    //   261: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   264: pop
    //   265: aload_0
    //   266: getfield Zn : Lburp/Zbqc;
    //   269: new burp/Zkue
    //   272: dup
    //   273: aload_0
    //   274: invokespecial <init> : (Lburp/Zbcq;)V
    //   277: invokevirtual addMouseListener : (Ljava/awt/event/MouseListener;)V
    //   280: return
  }
  
  public void Zt(boolean paramBoolean) {
    this.ZF = paramBoolean;
    boolean bool = !paramBoolean ? true : false;
    this.ZV.ZU(bool);
    this.ZJ.setVisible(bool);
  }
  
  public void ZL(Component paramComponent) {
    Zc(this.Zn, this.Zw);
    this.Zw = paramComponent;
    ZN(this.Zn, paramComponent);
  }
  
  public void Zt(Component paramComponent) {
    Zc(this.ZG, this.ZL);
    this.ZL = paramComponent;
    ZN(this.ZG, paramComponent);
    this.ZJ.setVisible(!this.ZF);
  }
  
  private void Zc(Container paramContainer, Component paramComponent) {
    if (paramComponent != null)
      paramContainer.remove(paramComponent); 
  }
  
  private void ZN(Container paramContainer, Component paramComponent) {
    if (paramComponent != null)
      paramContainer.add(paramComponent, a(-9304, -9896)); 
  }
  
  private void lambda$new$0(Zbxm paramZbxm) {
    if (paramZbxm.Zb != null && this.ZF)
      Zm2.ZC(paramZbxm.Zb); 
    Zt(!this.ZF);
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'fÇ0¿çÎZ=ñ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_5
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #22
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 139
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
    //   66: ldc 'u¼wtkÏ>3'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: iconst_5
    //   76: istore_1
    //   77: iconst_m1
    //   78: istore_0
    //   79: bipush #61
    //   81: iinc #0, 1
    //   84: aload_2
    //   85: iload_0
    //   86: dup
    //   87: iload_1
    //   88: iadd
    //   89: invokevirtual substring : (II)Ljava/lang/String;
    //   92: iconst_0
    //   93: goto -> 139
    //   96: aload #5
    //   98: swap
    //   99: iload_3
    //   100: iinc #3, 1
    //   103: swap
    //   104: aastore
    //   105: iload_0
    //   106: iload_1
    //   107: iadd
    //   108: dup
    //   109: istore_0
    //   110: iload #4
    //   112: if_icmpge -> 124
    //   115: aload_2
    //   116: iload_0
    //   117: invokevirtual charAt : (I)C
    //   120: istore_1
    //   121: goto -> 79
    //   124: aload #5
    //   126: putstatic burp/Zbcq.a : [Ljava/lang/String;
    //   129: iconst_4
    //   130: anewarray java/lang/String
    //   133: putstatic burp/Zbcq.b : [Ljava/lang/String;
    //   136: goto -> 296
    //   139: dup_x2
    //   140: pop
    //   141: invokevirtual toCharArray : ()[C
    //   144: dup_x1
    //   145: arraylength
    //   146: dup_x2
    //   147: pop
    //   148: iconst_0
    //   149: istore #6
    //   151: dup2_x1
    //   152: pop2
    //   153: dup_x2
    //   154: iconst_1
    //   155: if_icmpgt -> 256
    //   158: dup2
    //   159: swap
    //   160: iload #6
    //   162: dup2_x1
    //   163: caload
    //   164: swap
    //   165: iload #6
    //   167: bipush #7
    //   169: irem
    //   170: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #50
    //   210: goto -> 240
    //   213: bipush #111
    //   215: goto -> 240
    //   218: bipush #59
    //   220: goto -> 240
    //   223: bipush #7
    //   225: goto -> 240
    //   228: bipush #74
    //   230: goto -> 240
    //   233: bipush #6
    //   235: goto -> 240
    //   238: bipush #42
    //   240: ixor
    //   241: ixor
    //   242: i2c
    //   243: castore
    //   244: iinc #6, 1
    //   247: dup
    //   248: ifne -> 256
    //   251: dup2
    //   252: dup_x1
    //   253: goto -> 162
    //   256: dup2_x1
    //   257: pop2
    //   258: dup_x2
    //   259: iload #6
    //   261: if_icmpgt -> 158
    //   264: pop
    //   265: new java/lang/String
    //   268: dup_x1
    //   269: swap
    //   270: invokespecial <init> : ([C)V
    //   273: invokevirtual intern : ()Ljava/lang/String;
    //   276: swap
    //   277: pop
    //   278: swap
    //   279: tableswitch default -> 38, 0 -> 96
    //   296: getstatic burp/Zeuf.CHEVRON_RIGHT : Lburp/Zeuf;
    //   299: getstatic burp/Zlkk.FOREGROUND : Lburp/Zlkk;
    //   302: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   305: invokevirtual Z_ : ()Lburp/Ze9n;
    //   308: putstatic burp/Zbcq.Zh : Ljavax/swing/Icon;
    //   311: getstatic burp/Zeuf.CHEVRON_DOWN : Lburp/Zeuf;
    //   314: getstatic burp/Zlkk.FOREGROUND : Lburp/Zlkk;
    //   317: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   320: invokevirtual Z_ : ()Lburp/Ze9n;
    //   323: putstatic burp/Zbcq.Zz : Ljavax/swing/Icon;
    //   326: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFDBAB) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbcq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */