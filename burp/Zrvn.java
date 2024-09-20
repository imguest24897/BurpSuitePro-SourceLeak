package burp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.KeyboardFocusManager;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.KeyStroke;

public class Zrvn extends Zrh7 {
  private final Zl1c ZL;
  
  private final Zgok ZU;
  
  private final Zxkl ZO;
  
  private final Consumer<Zl1c> Zd;
  
  private final BiFunction<KeyStroke, Zl1c, Optional<Zl1c>> ZA;
  
  private KeyStroke ZZ;
  
  private Ze0q Zb;
  
  private Zbqc ZY;
  
  private Ze01 Zt;
  
  private Zbqc ZP;
  
  private Box.Filler Zv;
  
  private static int[] ZB;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrvn(Window paramWindow, Zl1c paramZl1c, Consumer<Zl1c> paramConsumer, BiFunction<KeyStroke, Zl1c, Optional<Zl1c>> paramBiFunction) {
    super(paramWindow, true, Zzv7.EDIT_HOTKEY_DIALOG);
    this.ZL = paramZl1c;
    this.Zd = paramConsumer;
    this.ZA = paramBiFunction;
    this.ZZ = paramZl1c.ZC();
    Zq();
    int[] arrayOfInt = ZQ();
    String str = (paramZl1c.ZC() == null) ? a(-17229, 16581) : a(-17221, 17643);
    setTitle(str);
    Zc();
    this.ZU = new Zgok(paramZl1c);
    this.ZP.add(this.ZU, a(-17232, -3167));
    this.ZO = new Zxkl(this::Zs, this::Zx, this::Zy);
    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this.ZO);
    addWindowListener(new Zto_(this));
    this.Zb.setEnabled(false);
    pack();
    Zq(paramWindow);
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  private void Zc() {
    setName(a(-17224, 7828));
    this.Zt.setName(a(-17230, 13702));
    this.Zb.setName(a(-17219, -31753));
  }
  
  private void Zp() {
    boolean bool = !Objects.equals(this.ZZ, this.ZL.ZC()) ? true : false;
    this.Zb.setEnabled(bool);
  }
  
  private void Zs(KeyStroke paramKeyStroke) {
    // Byte code:
    //   0: invokestatic ZQ : ()[I
    //   3: astore_2
    //   4: aload_0
    //   5: aload_1
    //   6: putfield ZZ : Ljavax/swing/KeyStroke;
    //   9: aload_1
    //   10: ifnonnull -> 31
    //   13: ldc ''
    //   15: astore_3
    //   16: aload_0
    //   17: invokevirtual Zp : ()V
    //   20: aload_0
    //   21: getfield ZU : Lburp/Zgok;
    //   24: invokevirtual ZE : ()V
    //   27: aload_2
    //   28: ifnonnull -> 115
    //   31: aload_1
    //   32: invokevirtual getModifiers : ()I
    //   35: aload_1
    //   36: invokevirtual getKeyCode : ()I
    //   39: invokestatic ZO : (II)Ljava/lang/String;
    //   42: astore_3
    //   43: aload_0
    //   44: getfield ZA : Ljava/util/function/BiFunction;
    //   47: aload_1
    //   48: aload_0
    //   49: getfield ZL : Lburp/Zl1c;
    //   52: invokeinterface apply : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   57: checkcast java/util/Optional
    //   60: astore #4
    //   62: aload #4
    //   64: invokevirtual isPresent : ()Z
    //   67: ifeq -> 104
    //   70: aload #4
    //   72: invokevirtual get : ()Ljava/lang/Object;
    //   75: checkcast burp/Zl1c
    //   78: astore #5
    //   80: aload_0
    //   81: getfield ZU : Lburp/Zgok;
    //   84: aload #5
    //   86: invokevirtual ZW : ()Ljava/lang/String;
    //   89: invokevirtual Zy : (Ljava/lang/String;)V
    //   92: aload_0
    //   93: getfield Zb : Lburp/Ze0q;
    //   96: iconst_0
    //   97: invokevirtual setEnabled : (Z)V
    //   100: aload_2
    //   101: ifnonnull -> 115
    //   104: aload_0
    //   105: getfield ZU : Lburp/Zgok;
    //   108: invokevirtual ZE : ()V
    //   111: aload_0
    //   112: invokevirtual Zp : ()V
    //   115: aload_0
    //   116: getfield ZU : Lburp/Zgok;
    //   119: aload_3
    //   120: invokevirtual Zt : (Ljava/lang/String;)V
    //   123: return
  }
  
  private void Zx() {
    if (this.Zb.isEnabled())
      ZI(); 
  }
  
  private void Zy() {
    Zr();
  }
  
  private void ZI() {
    this.ZL.Zq(this.ZZ);
    this.Zd.accept(this.ZL);
    Zr();
  }
  
  private void Zr() {
    dispose();
  }
  
  private void Zq() {
    this.ZP = new Zbqc();
    this.ZY = new Zbqc();
    this.Zt = new Ze01();
    this.Zb = new Ze0q();
    this.Zv = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
    setDefaultCloseOperation(0);
    setTitle(a(-17222, 31281));
    setPreferredSize(new Dimension(600, 200));
    this.ZP.setBorder(BorderFactory.createEmptyBorder(20, 20, 0, 20));
    this.ZP.setLayout(new BorderLayout());
    getContentPane().add(this.ZP, a(-17223, -7327));
    this.ZY.setBorder(BorderFactory.createEmptyBorder(30, 0, 30, 20));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 10, 0, 10, 0 };
    gridBagLayout.rowHeights = new int[] { 0 };
    this.ZY.setLayout(gridBagLayout);
    this.Zt.setText(a(-17220, -546));
    this.Zt.addActionListener(new Zb0t(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 22;
    this.ZY.add(this.Zt, gridBagConstraints);
    this.Zb.setText(a(-17217, -28127));
    this.Zb.addActionListener(new Zl0_(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 22;
    this.ZY.add(this.Zb, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 22;
    gridBagConstraints.weightx = 1.0D;
    this.ZY.add(this.Zv, gridBagConstraints);
    getContentPane().add(this.ZY, a(-17218, -17063));
    pack();
  }
  
  private void ZK(ActionEvent paramActionEvent) {
    Zy();
  }
  
  private void ZG(ActionEvent paramActionEvent) {
    ZI();
  }
  
  public static void Zn(int[] paramArrayOfint) {
    ZB = paramArrayOfint;
  }
  
  public static int[] ZQ() {
    return ZB;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: iconst_2
    //   10: newarray int
    //   12: ldc 'ªHI§\\rCÎ]N?5H¼?VhÕI:XUÅ×yí'7ëìëo0cò­T=Ö®¨×Ö#¥Hyà=Ò5Ø±¼m;gÌKªwÿLGþX#Rýe¤jGåIScã'çÑB'
    //   14: dup
    //   15: astore_2
    //   16: invokevirtual length : ()I
    //   19: istore #4
    //   21: bipush #10
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: invokestatic Zn : ([I)V
    //   29: bipush #82
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 149
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: ldc 'í\\f?¶ý~ê#ØÙÑyfD'
    //   76: dup
    //   77: astore_2
    //   78: invokevirtual length : ()I
    //   81: istore #4
    //   83: bipush #10
    //   85: istore_1
    //   86: iconst_m1
    //   87: istore_0
    //   88: bipush #78
    //   90: iinc #0, 1
    //   93: aload_2
    //   94: iload_0
    //   95: dup
    //   96: iload_1
    //   97: iadd
    //   98: invokevirtual substring : (II)Ljava/lang/String;
    //   101: iconst_0
    //   102: goto -> 149
    //   105: aload #5
    //   107: swap
    //   108: iload_3
    //   109: iinc #3, 1
    //   112: swap
    //   113: aastore
    //   114: iload_0
    //   115: iload_1
    //   116: iadd
    //   117: dup
    //   118: istore_0
    //   119: iload #4
    //   121: if_icmpge -> 133
    //   124: aload_2
    //   125: iload_0
    //   126: invokevirtual charAt : (I)C
    //   129: istore_1
    //   130: goto -> 88
    //   133: aload #5
    //   135: putstatic burp/Zrvn.a : [Ljava/lang/String;
    //   138: bipush #11
    //   140: anewarray java/lang/String
    //   143: putstatic burp/Zrvn.b : [Ljava/lang/String;
    //   146: goto -> 308
    //   149: dup_x2
    //   150: pop
    //   151: invokevirtual toCharArray : ()[C
    //   154: dup_x1
    //   155: arraylength
    //   156: dup_x2
    //   157: pop
    //   158: iconst_0
    //   159: istore #6
    //   161: dup2_x1
    //   162: pop2
    //   163: dup_x2
    //   164: iconst_1
    //   165: if_icmpgt -> 268
    //   168: dup2
    //   169: swap
    //   170: iload #6
    //   172: dup2_x1
    //   173: caload
    //   174: swap
    //   175: iload #6
    //   177: bipush #7
    //   179: irem
    //   180: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #91
    //   222: goto -> 252
    //   225: bipush #18
    //   227: goto -> 252
    //   230: bipush #99
    //   232: goto -> 252
    //   235: bipush #58
    //   237: goto -> 252
    //   240: bipush #113
    //   242: goto -> 252
    //   245: bipush #35
    //   247: goto -> 252
    //   250: bipush #17
    //   252: ixor
    //   253: ixor
    //   254: i2c
    //   255: castore
    //   256: iinc #6, 1
    //   259: dup
    //   260: ifne -> 268
    //   263: dup2
    //   264: dup_x1
    //   265: goto -> 172
    //   268: dup2_x1
    //   269: pop2
    //   270: dup_x2
    //   271: iload #6
    //   273: if_icmpgt -> 168
    //   276: pop
    //   277: new java/lang/String
    //   280: dup_x1
    //   281: swap
    //   282: invokespecial <init> : ([C)V
    //   285: invokevirtual intern : ()Ljava/lang/String;
    //   288: swap
    //   289: pop
    //   290: swap
    //   291: tableswitch default -> 46, 0 -> 105
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFBCBA) & 0xFFFF;
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
      byte b1 = 61;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrvn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */