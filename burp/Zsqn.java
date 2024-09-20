package burp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Zsqn extends JPanel {
  private Zmgw Zf;
  
  private Zzbj Zm;
  
  private Color Zp = Color.gray;
  
  private int ZU = 1;
  
  private Font Zu = null;
  
  private Zzbf ZT;
  
  private final transient Zrp5 ZE = new Zrp5(this);
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zsqn(Zmgw paramZmgw) {
    ZJ(paramZmgw);
    setLayout(new BorderLayout());
    if (this.Zf != null) {
      Zu(true);
      Zmgw zmgw = this.Zf;
      if (zmgw instanceof Zmgn) {
        Zmgn zmgn = (Zmgn)zmgw;
        Zj(zmgn.ZY());
      } 
    } 
    setBorder(new Zrqg(0, 0, 0, 1));
    Color color = null;
    if (paramZmgw != null)
      color = paramZmgw.getBackground(); 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    setBackground((color != null) ? color : Color.WHITE);
    setUI(new Zr(this));
  }
  
  public Color ZP() {
    return this.Zp;
  }
  
  public Font ZZ() {
    return this.Zu;
  }
  
  public int Zs() {
    return this.ZU;
  }
  
  public void Zh(Color paramColor) {
    ((Zrqg)getBorder()).ZR(paramColor);
    repaint();
  }
  
  public void setComponentOrientation(ComponentOrientation paramComponentOrientation) {
    // Byte code:
    //   0: invokestatic ZT : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: invokevirtual getBorder : ()Ljavax/swing/border/Border;
    //   8: instanceof burp/Zrqg
    //   11: ifeq -> 74
    //   14: aload_1
    //   15: invokevirtual isLeftToRight : ()Z
    //   18: ifeq -> 53
    //   21: goto -> 28
    //   24: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   27: athrow
    //   28: aload_0
    //   29: invokevirtual getBorder : ()Ljavax/swing/border/Border;
    //   32: checkcast burp/Zrqg
    //   35: iconst_0
    //   36: iconst_0
    //   37: iconst_0
    //   38: iconst_1
    //   39: invokevirtual ZE : (IIII)V
    //   42: iload_2
    //   43: ifne -> 74
    //   46: goto -> 53
    //   49: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   52: athrow
    //   53: aload_0
    //   54: invokevirtual getBorder : ()Ljavax/swing/border/Border;
    //   57: checkcast burp/Zrqg
    //   60: iconst_0
    //   61: iconst_1
    //   62: iconst_0
    //   63: iconst_0
    //   64: invokevirtual ZE : (IIII)V
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   73: athrow
    //   74: aload_0
    //   75: aload_1
    //   76: invokespecial setComponentOrientation : (Ljava/awt/ComponentOrientation;)V
    //   79: return
    // Exception table:
    //   from	to	target	type
    //   4	21	24	java/lang/IllegalArgumentException
    //   14	46	49	java/lang/IllegalArgumentException
    //   28	67	70	java/lang/IllegalArgumentException
  }
  
  public void Zj(boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic Zm : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield ZT : Lburp/Zzbf;
    //   8: ifnull -> 69
    //   11: iload_1
    //   12: ifeq -> 50
    //   15: goto -> 22
    //   18: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   21: athrow
    //   22: aload_0
    //   23: aload_0
    //   24: getfield ZT : Lburp/Zzbf;
    //   27: sipush #8540
    //   30: sipush #31136
    //   33: invokestatic a : (II)Ljava/lang/String;
    //   36: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   39: iload_2
    //   40: ifeq -> 65
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   49: athrow
    //   50: aload_0
    //   51: aload_0
    //   52: getfield ZT : Lburp/Zzbf;
    //   55: invokevirtual remove : (Ljava/awt/Component;)V
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   64: athrow
    //   65: aload_0
    //   66: invokevirtual revalidate : ()V
    //   69: return
    // Exception table:
    //   from	to	target	type
    //   4	15	18	java/lang/IllegalArgumentException
    //   11	43	46	java/lang/IllegalArgumentException
    //   22	58	61	java/lang/IllegalArgumentException
  }
  
  public void Zq(Color paramColor) {
    try {
      if (paramColor != null)
        try {
          if (!paramColor.equals(this.Zp))
            try {
              this.Zp = paramColor;
              if (this.Zm != null)
                this.Zm.setForeground(paramColor); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void ZU(Font paramFont) {
    try {
      if (paramFont == null)
        throw new IllegalArgumentException(a(8541, 1109)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!paramFont.equals(this.Zu))
        try {
          this.Zu = paramFont;
          if (this.Zm != null)
            this.Zm.setFont(paramFont); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  void Zu(boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZT : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield Zm : Lburp/Zzbj;
    //   8: ifnull -> 61
    //   11: iload_1
    //   12: ifeq -> 42
    //   15: goto -> 22
    //   18: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   21: athrow
    //   22: aload_0
    //   23: aload_0
    //   24: getfield Zm : Lburp/Zzbj;
    //   27: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   30: pop
    //   31: iload_2
    //   32: ifne -> 57
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   41: athrow
    //   42: aload_0
    //   43: aload_0
    //   44: getfield Zm : Lburp/Zzbj;
    //   47: invokevirtual remove : (Ljava/awt/Component;)V
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   56: athrow
    //   57: aload_0
    //   58: invokevirtual revalidate : ()V
    //   61: return
    // Exception table:
    //   from	to	target	type
    //   4	15	18	java/lang/IllegalArgumentException
    //   11	35	38	java/lang/IllegalArgumentException
    //   22	50	53	java/lang/IllegalArgumentException
  }
  
  void ZJ(Zmgw paramZmgw) {
    // Byte code:
    //   0: invokestatic Zm : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield Zf : Lburp/Zmgw;
    //   8: ifnull -> 25
    //   11: aload_0
    //   12: getfield ZE : Lburp/Zrp5;
    //   15: invokevirtual ZK : ()V
    //   18: goto -> 25
    //   21: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   24: athrow
    //   25: aload_1
    //   26: ifnull -> 169
    //   29: aload_1
    //   30: invokevirtual getUI : ()Ljavax/swing/plaf/TextUI;
    //   33: aload_1
    //   34: invokevirtual getEditorKit : (Ljavax/swing/text/JTextComponent;)Ljavax/swing/text/EditorKit;
    //   37: checkcast burp/Ze86
    //   40: astore_3
    //   41: aload_0
    //   42: getfield Zm : Lburp/Zzbj;
    //   45: ifnonnull -> 101
    //   48: aload_0
    //   49: aload_3
    //   50: aload_1
    //   51: invokevirtual Zg : (Lburp/Zmgw;)Lburp/Zzbj;
    //   54: putfield Zm : Lburp/Zzbj;
    //   57: aload_0
    //   58: getfield Zm : Lburp/Zzbj;
    //   61: aload_0
    //   62: invokevirtual ZZ : ()Ljava/awt/Font;
    //   65: invokevirtual setFont : (Ljava/awt/Font;)V
    //   68: aload_0
    //   69: getfield Zm : Lburp/Zzbj;
    //   72: aload_0
    //   73: invokevirtual ZP : ()Ljava/awt/Color;
    //   76: invokevirtual setForeground : (Ljava/awt/Color;)V
    //   79: aload_0
    //   80: getfield Zm : Lburp/Zzbj;
    //   83: aload_0
    //   84: invokevirtual Zs : ()I
    //   87: invokevirtual Zl : (I)V
    //   90: iload_2
    //   91: ifeq -> 116
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   100: athrow
    //   101: aload_0
    //   102: getfield Zm : Lburp/Zzbj;
    //   105: aload_1
    //   106: invokevirtual ZQ : (Lburp/Zmgw;)V
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   115: athrow
    //   116: aload_0
    //   117: getfield ZT : Lburp/Zzbf;
    //   120: ifnonnull -> 146
    //   123: aload_0
    //   124: new burp/Zzbf
    //   127: dup
    //   128: aload_1
    //   129: invokespecial <init> : (Lburp/Zmgw;)V
    //   132: putfield ZT : Lburp/Zzbf;
    //   135: iload_2
    //   136: ifeq -> 161
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   145: athrow
    //   146: aload_0
    //   147: getfield ZT : Lburp/Zzbf;
    //   150: aload_1
    //   151: invokevirtual ZQ : (Lburp/Zmgw;)V
    //   154: goto -> 161
    //   157: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   160: athrow
    //   161: aload_0
    //   162: getfield ZE : Lburp/Zrp5;
    //   165: aload_1
    //   166: invokevirtual Zt : (Lburp/Zmgw;)V
    //   169: aload_0
    //   170: aload_1
    //   171: putfield Zf : Lburp/Zmgw;
    //   174: return
    // Exception table:
    //   from	to	target	type
    //   4	18	21	java/lang/IllegalArgumentException
    //   41	94	97	java/lang/IllegalArgumentException
    //   48	109	112	java/lang/IllegalArgumentException
    //   116	139	142	java/lang/IllegalArgumentException
    //   123	154	157	java/lang/IllegalArgumentException
  }
  
  public void setBorder(Border paramBorder) {
    try {
      if (paramBorder instanceof Zrqg)
        super.setBorder(paramBorder); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'k#V$BíàZËx¦kxå\òþ+@'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #19
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #60
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
    //   69: putstatic burp/Zsqn.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zsqn.b : [Ljava/lang/String;
    //   79: goto -> 226
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
    //   98: if_icmpgt -> 199
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
    //   152: bipush #80
    //   154: goto -> 183
    //   157: bipush #96
    //   159: goto -> 183
    //   162: bipush #78
    //   164: goto -> 183
    //   167: iconst_1
    //   168: goto -> 183
    //   171: bipush #121
    //   173: goto -> 183
    //   176: bipush #107
    //   178: goto -> 183
    //   181: bipush #121
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 105
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 101
    //   207: pop
    //   208: new java/lang/String
    //   211: dup_x1
    //   212: swap
    //   213: invokespecial <init> : ([C)V
    //   216: invokevirtual intern : ()Ljava/lang/String;
    //   219: swap
    //   220: pop
    //   221: swap
    //   222: pop
    //   223: goto -> 39
    //   226: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x215D) & 0xFFFF;
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
      byte b1 = 108;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsqn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */