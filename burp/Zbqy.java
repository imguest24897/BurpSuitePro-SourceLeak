package burp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;

public class Zbqy extends Zbqc {
  private final Zbqr Z_;
  
  private final Zl7l ZN;
  
  private Zbqc ZK;
  
  private Ze0q Zl;
  
  private Ze01 Zn;
  
  private Zm99 Zg;
  
  private Zg85 Zo;
  
  private Zbqc ZI;
  
  private Zm9t Zj;
  
  private Box.Filler Zt;
  
  private Box.Filler ZJ;
  
  private Box.Filler ZG;
  
  private Box.Filler Zh;
  
  private Box.Filler ZE;
  
  private Zbqc ZH;
  
  private Zm2o Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbqy(Zbqr paramZbqr, Zby paramZby, String paramString1, String paramString2, Zl7l paramZl7l, Zk97 paramZk97) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield Z_ : Lburp/Zbqr;
    //   9: aload_0
    //   10: aload #5
    //   12: putfield ZN : Lburp/Zl7l;
    //   15: invokestatic ZL : ()[Lburp/Zbqc;
    //   18: aload_0
    //   19: invokevirtual ZO : ()V
    //   22: aload_0
    //   23: invokevirtual ZI : ()V
    //   26: aload_0
    //   27: getfield ZI : Lburp/Zbqc;
    //   30: aload_1
    //   31: sipush #14196
    //   34: sipush #12784
    //   37: invokestatic a : (II)Ljava/lang/String;
    //   40: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   43: astore #7
    //   45: aload_3
    //   46: ifnull -> 75
    //   49: aload_1
    //   50: aload_3
    //   51: invokevirtual Zl : (Ljava/lang/String;)V
    //   54: aload_0
    //   55: getfield Zo : Lburp/Zg85;
    //   58: aload #4
    //   60: invokevirtual setText : (Ljava/lang/String;)V
    //   63: aload #7
    //   65: ifnull -> 79
    //   68: iconst_3
    //   69: anewarray burp/Zbqc
    //   72: invokestatic Zr : ([Lburp/Zbqc;)V
    //   75: aload_0
    //   76: invokevirtual Zk : ()V
    //   79: aload_0
    //   80: getfield Zo : Lburp/Zg85;
    //   83: aload_0
    //   84: getfield Zo : Lburp/Zg85;
    //   87: invokevirtual getPreferredSize : ()Ljava/awt/Dimension;
    //   90: invokevirtual setMaximumSize : (Ljava/awt/Dimension;)V
    //   93: aload_0
    //   94: getfield Zd : Lburp/Zm2o;
    //   97: aload #6
    //   99: invokevirtual Zi : (Lburp/Zk97;)V
    //   102: getstatic burp/Zeuf.DELETE : Lburp/Zeuf;
    //   105: getstatic burp/Zlkk.ACTION_NORMAL : Lburp/Zlkk;
    //   108: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   111: getstatic burp/Zlkk.ACTION_HOVER : Lburp/Zlkk;
    //   114: invokevirtual ZG : (Lburp/Zlkk;)Lburp/Ze3m;
    //   117: getstatic burp/Zmcx.EXTRA_LARGE_LINE_SIZE : Lburp/Zmcx;
    //   120: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   123: invokevirtual Z_ : ()Lburp/Ze9n;
    //   126: astore #8
    //   128: aload_2
    //   129: invokeinterface Zm : ()Z
    //   134: ifeq -> 171
    //   137: aload_0
    //   138: getfield Zj : Lburp/Zm9t;
    //   141: aload #8
    //   143: sipush #14199
    //   146: sipush #24208
    //   149: invokestatic a : (II)Ljava/lang/String;
    //   152: aload_2
    //   153: dup
    //   154: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   157: pop
    //   158: <illegal opcode> run : (Lburp/Zby;)Ljava/lang/Runnable;
    //   163: invokevirtual Zv : (Lburp/Ze9n;Ljava/lang/String;Ljava/lang/Runnable;)V
    //   166: aload #7
    //   168: ifnull -> 179
    //   171: aload_0
    //   172: getfield Zj : Lburp/Zm9t;
    //   175: iconst_0
    //   176: invokevirtual setVisible : (Z)V
    //   179: aload_0
    //   180: getfield Zn : Lburp/Ze01;
    //   183: aload_2
    //   184: <illegal opcode> actionPerformed : (Lburp/Zby;)Ljava/awt/event/ActionListener;
    //   189: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   192: aload_0
    //   193: getfield Zl : Lburp/Ze0q;
    //   196: aload_0
    //   197: aload_2
    //   198: aload_1
    //   199: <illegal opcode> actionPerformed : (Lburp/Zbqy;Lburp/Zby;Lburp/Zbqr;)Ljava/awt/event/ActionListener;
    //   204: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   207: return
  }
  
  private void ZI() {
    this.Zo.setName(a(14198, -3427));
    this.Zl.setName(a(14195, 13947));
  }
  
  private void Zk() {
    this.Zo.setText(this.ZN.Zb());
    this.Z_.Zl(a(14193, 25139));
  }
  
  public void Zh() {
    this.Z_.requestFocus();
  }
  
  private void ZO() {
    this.ZH = new Zbqc();
    this.Zg = new Zm99();
    this.Zt = new Box.Filler(new Dimension(10, 0), new Dimension(10, 0), new Dimension(10, 32767));
    this.Zo = new Zg85();
    this.ZJ = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
    this.Zd = new Zm2o();
    this.ZE = new Box.Filler(new Dimension(10, 0), new Dimension(10, 0), new Dimension(10, 32767));
    this.Zj = new Zm9t();
    this.ZI = new Zbqc();
    this.ZK = new Zbqc();
    this.ZG = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
    this.Zn = new Ze01();
    this.Zh = new Box.Filler(new Dimension(12, 0), new Dimension(12, 0), new Dimension(12, 32767));
    this.Zl = new Ze0q();
    setLayout(new GridBagLayout());
    this.ZH.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    this.ZH.setLayout(new BoxLayout(this.ZH, 2));
    this.Zg.setText(a(14197, -11261));
    this.ZH.add(this.Zg);
    this.ZH.add(this.Zt);
    this.Zo.setColumns(10);
    this.Zo.setMaximumSize(new Dimension(100, 2147483647));
    this.ZH.add(this.Zo);
    this.ZH.add(this.ZJ);
    this.ZH.add(this.Zd);
    this.ZH.add(this.ZE);
    this.ZH.add(this.Zj);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZH, gridBagConstraints);
    this.ZI.setLayout(new BorderLayout());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.ZI, gridBagConstraints);
    this.ZK.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    this.ZK.setLayout(new BoxLayout(this.ZK, 2));
    this.ZK.add(this.ZG);
    this.Zn.setText(a(14194, -24468));
    this.ZK.add(this.Zn);
    this.ZK.add(this.Zh);
    this.Zl.setText(a(14192, -32257));
    this.ZK.add(this.Zl);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZK, gridBagConstraints);
  }
  
  private void lambda$new$1(Zby paramZby, Zbqr paramZbqr, ActionEvent paramActionEvent) {
    paramZby.Zk(new Zs3l(this.Zo.getText(), paramZbqr.Zs()));
  }
  
  private static void lambda$new$0(Zby paramZby, ActionEvent paramActionEvent) {
    paramZby.ZP();
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '³}öÕIwqýÂKÀúª¨e>GXôS¶LÕ³E÷lmÚ\\rÜH©ÿÀGh7d\\t`Ù¬Â¶ý\\r×<îÏ1%å»<2A/ÑUv1¢áB«-£I± ÛöñûÙx$² u'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #33
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #115
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc '!Q,\\nä² ¤ÝD;'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_5
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #77
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zbqy.a : [Ljava/lang/String;
    //   131: bipush #8
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbqy.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #68
    //   214: goto -> 244
    //   217: bipush #84
    //   219: goto -> 244
    //   222: bipush #41
    //   224: goto -> 244
    //   227: bipush #9
    //   229: goto -> 244
    //   232: bipush #91
    //   234: goto -> 244
    //   237: bipush #101
    //   239: goto -> 244
    //   242: bipush #74
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3776) & 0xFFFF;
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
      byte b1 = 66;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbqy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */