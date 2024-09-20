package burp;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zbaz extends Zbv5 implements Zt3u {
  private final Zr1m Zw;
  
  private final Zqe ZL;
  
  private final Zggn Zn;
  
  private final Set<String> ZF;
  
  private ButtonGroup ZK;
  
  private Zzdy ZM;
  
  private Box.Filler Zz;
  
  private Zm99 ZI;
  
  private Zm99 ZR;
  
  private Zm9v Zi;
  
  private Zmg2 Zd;
  
  private Zmg2 Zu;
  
  private Zg85 ZU;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbaz(Zqe paramZqe, Zr1m paramZr1m) {
    this(paramZqe, paramZr1m, (Zggn)null);
  }
  
  public Zbaz(Zqe paramZqe, Zr1m paramZr1m, Zggn paramZggn) {
    this.ZL = paramZqe;
    this.Zw = paramZr1m;
    this.Zn = paramZggn;
    this.ZF = Set.of(Zjd(), a(-18483, 31708), a(-18492, 5843), a(-18484, 3090), a(-18479, 8583), a(-18485, 13700), a(-18482, 27332), a(-18496, 1668));
    ZR();
    setName(a(-18489, -13751));
    Zt2();
  }
  
  public String Zjd() {
    return a(-18488, -17435);
  }
  
  public String ZjS() {
    return a(-18487, 12713);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.ZM(Zjd().toLowerCase(Locale.ENGLISH), Zk97.DESKTOP_TOOLS_SEQUENCER_OPTIONS_TOKEN_HANDLING, this.Zw, this, true, new String[] { a(-18481, -6463) });
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.ZF;
  }
  
  public void Zt2() {
    // Byte code:
    //   0: invokestatic ZT : ()Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zi : Lburp/Zm9v;
    //   8: iconst_0
    //   9: invokevirtual setVisible : (Z)V
    //   12: aload_0
    //   13: getfield ZL : Lburp/Zqe;
    //   16: invokeinterface ZGH : ()Z
    //   21: ifeq -> 43
    //   24: aload_0
    //   25: getfield Zd : Lburp/Zmg2;
    //   28: iconst_1
    //   29: invokevirtual setSelected : (Z)V
    //   32: iload_1
    //   33: ifne -> 58
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   42: athrow
    //   43: aload_0
    //   44: getfield Zu : Lburp/Zmg2;
    //   47: iconst_1
    //   48: invokevirtual setSelected : (Z)V
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   57: athrow
    //   58: aload_0
    //   59: getfield ZU : Lburp/Zg85;
    //   62: aload_0
    //   63: aload_0
    //   64: getfield ZL : Lburp/Zqe;
    //   67: invokeinterface ZG3 : ()I
    //   72: i2s
    //   73: invokevirtual Zw : (S)Ljava/lang/String;
    //   76: invokevirtual setText : (Ljava/lang/String;)V
    //   79: aload_0
    //   80: getfield ZM : Lburp/Zzdy;
    //   83: aload_0
    //   84: getfield ZL : Lburp/Zqe;
    //   87: invokeinterface ZG2 : ()Z
    //   92: invokevirtual setSelected : (Z)V
    //   95: aload_0
    //   96: invokevirtual ZT : ()V
    //   99: return
    // Exception table:
    //   from	to	target	type
    //   4	36	39	java/lang/NumberFormatException
    //   24	51	54	java/lang/NumberFormatException
  }
  
  private String Zw(short paramShort) {
    try {
      if (paramShort > 32)
        try {
          if (paramShort < 127)
            return Character.toString((char)paramShort); 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    String str = Integer.toHexString(paramShort);
    try {
      if (str.length() == 1)
        return "0" + str; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return str;
  }
  
  private short ZM(String paramString) {
    try {
      if (paramString.length() == 1) {
        this.Zi.setVisible(false);
        return (short)(byte)paramString.charAt(0);
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      int i = Integer.parseInt(paramString.substring(0, 2), 16);
      this.Zi.setVisible(false);
      return (short)i;
    } catch (NumberFormatException|StringIndexOutOfBoundsException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
      this.Zi.setVisible(true);
      return 48;
    } 
  }
  
  private void ZT() {
    try {
      if (this.Zn != null)
        this.Zn.Zf(); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  private void ZR() {
    this.ZK = new ButtonGroup();
    this.ZI = new Zm99();
    this.Zu = new Zmg2();
    this.Zd = new Zmg2();
    this.ZR = new Zm99();
    this.ZU = new Zg85();
    this.ZM = new Zzdy();
    this.Zi = new Zm9v();
    this.Zz = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(0, 32767));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZI.setText(a(-18491, 26973));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    add(this.ZI, gridBagConstraints);
    this.ZK.add(this.Zu);
    this.Zu.setText(a(-18493, 8541));
    this.Zu.setMargin(new Insets(0, 0, 0, 0));
    this.Zu.addActionListener(new Znz(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    add(this.Zu, gridBagConstraints);
    this.ZK.add(this.Zd);
    this.Zd.setText(a(-18486, -2936));
    this.Zd.setMargin(new Insets(0, 0, 0, 0));
    this.Zd.addActionListener(new Zghv(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    add(this.Zd, gridBagConstraints);
    this.ZR.setText(a(-18490, 9444));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    add(this.ZR, gridBagConstraints);
    this.ZU.setColumns(5);
    this.ZU.addKeyListener(new Zgnr(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    add(this.ZU, gridBagConstraints);
    this.ZM.setText(a(-18494, -9262));
    this.ZM.addActionListener(new Zr_u(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    add(this.ZM, gridBagConstraints);
    this.Zi.setText(a(-18495, 32170));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    add(this.Zi, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 10;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zz, gridBagConstraints);
  }
  
  private void Zc(KeyEvent paramKeyEvent) {
    this.ZL.ZF(ZM(this.ZU.getText()));
    ZT();
  }
  
  private void ZA(ActionEvent paramActionEvent) {
    this.ZL.ZKJ(this.Zd.isSelected());
    ZT();
  }
  
  private void Zd(ActionEvent paramActionEvent) {
    this.ZL.ZKJ(this.Zd.isSelected());
    ZT();
  }
  
  private void ZY(ActionEvent paramActionEvent) {
    this.ZL.ZKy(this.ZM.isSelected());
    ZT();
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'o/É${µ ÿ?Y® vÏaYµIçBâxfhr/xFÊ°á&^è}¥{Ï_(ÇgC3w?Ó·;¾ÑnÀ;à]È,Çza46íÐÉ3Âôßÿ1Ð>XÈ}©Ellµ!CbEQÒ1µ/J¿ÏË6Ï%¹ãnôÄÏ¢£æmö6"I(¿dOÃ¹¿ª-.Wù¯lY×qØ^WöuÇ\\t®KD.iË\¬°Bj*»v 4E\\têö¥YU.Ë^1iå­½¥ñ÷Z3¦ÎØ,éX&bWîV#y,-À74ªFX4t#Wtÿm~ÿ^Ãbí2jÀ<y¥âÍFà@XU\\rÿ ¾á¡ùL¹>ô}!ªßÇ|ôý^§®¨®:e­õI!À·Ê2ì¸¯®,4Áû%QmugT^yI,ÑÆ8:¶ÕÌª'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #13
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #46
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
    //   68: ldc 'lMlá]6nÚÂ7;zvâÿª[©Wë\\r'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #13
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #94
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
    //   129: putstatic burp/Zbaz.a : [Ljava/lang/String;
    //   132: bipush #17
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbaz.b : [Ljava/lang/String;
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
    //   212: bipush #53
    //   214: goto -> 244
    //   217: bipush #120
    //   219: goto -> 244
    //   222: bipush #126
    //   224: goto -> 244
    //   227: bipush #114
    //   229: goto -> 244
    //   232: bipush #45
    //   234: goto -> 244
    //   237: bipush #110
    //   239: goto -> 244
    //   242: bipush #48
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
    int i = (paramInt1 ^ 0xFFFFB7C1) & 0xFFFF;
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
      byte b1 = 47;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbaz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */