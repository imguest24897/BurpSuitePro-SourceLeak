package burp;

import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.Collection;
import java.util.Set;
import javax.swing.SwingUtilities;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zbae extends Zbv5 implements Zt3u {
  private final Zgb6 Zo;
  
  private final Zr1m ZJ;
  
  private final Zg85 ZY;
  
  private final Set<String> Zg;
  
  private Zl4i Zj;
  
  private Zm99 Zw;
  
  private Zzdy Zs;
  
  private Zzdy ZH;
  
  private Zzdy ZG;
  
  private Ze01 ZT;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbae(Zgb6 paramZgb6, Zr1m paramZr1m) {
    this.Zo = paramZgb6;
    this.ZJ = paramZr1m;
    ZZ();
    this.Zg = Set.of(Zjd(), a(21483, -23694), a(21472, -12820), a(21476, 31785), a(21482, 22855), a(21481, -30805));
    setName(a(21477, -28894));
    this.ZY = new Zgfx(this, 30);
    this.ZY.setEditable(false);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 18;
    add(this.ZY, gridBagConstraints);
  }
  
  public String Zjd() {
    return a(21480, 11492);
  }
  
  public String ZjS() {
    return a(21474, 20828);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.ZP(a(21487, 14751), Zk97.DESKTOP_SETTINGS_USER_INTERFACE_MESSAGE_EDITOR_HTTP_MESSAGE_DISPLAY, this.ZJ, new String[] { a(21484, 25725) });
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.Zg;
  }
  
  public void Zt2() {
    String str = Zbk_.Zb();
    try {
      if (SwingUtilities.isEventDispatchThread()) {
        Zq();
        if (str == null) {
          try {
            SwingUtilities.invokeAndWait(this::Zq);
          } catch (Exception exception) {
            Zah.Zl(exception, Zk_.UNEXPECTED);
          } 
          return;
        } 
        return;
      } 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      SwingUtilities.invokeAndWait(this::Zq);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void Zq() {
    Font font = new Font(this.Zo.Zf8(), 0, this.Zo.ZfF());
    this.Zs.setSelected(this.Zo.ZfN());
    this.ZH.setSelected(this.Zo.ZfV());
    this.ZG.setSelected(this.Zo.Zfd());
    this.ZY.setFont(font);
    this.ZY.repaint();
  }
  
  String Zn(Font paramFont) {
    return paramFont.getName() + paramFont.getName() + " " + paramFont.getSize();
  }
  
  void ZT() {
    this.Zj = null;
  }
  
  private void ZZ() {
    this.ZT = new Ze01();
    this.ZH = new Zzdy();
    this.Zs = new Zzdy();
    this.ZG = new Zzdy();
    this.Zw = new Zm99();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZT.setText(a(21473, 14517));
    this.ZT.setToolTipText(a(21478, -23879));
    this.ZT.addActionListener(new Zsu0(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 18;
    add(this.ZT, gridBagConstraints);
    this.ZH.setText(a(21498, 8830));
    this.ZH.addActionListener(new Zll1(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    add(this.ZH, gridBagConstraints);
    this.Zs.setText(a(21479, 23636));
    this.Zs.addActionListener(new Zdn(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(15, 0, 0, 0);
    add(this.Zs, gridBagConstraints);
    this.ZG.setText(a(21485, 2996));
    this.ZG.addActionListener(new Zt99(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    add(this.ZG, gridBagConstraints);
    this.Zw.setText(a(21486, 2496));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    add(this.Zw, gridBagConstraints);
  }
  
  private void Ze(ActionEvent paramActionEvent) {
    if (this.Zj == null)
      this.Zj = new Zl4i(Zt2m.ZF(this), this, this.Zo); 
    this.Zj.setVisible(true);
    this.Zj.requestFocus();
  }
  
  private void Zi(ActionEvent paramActionEvent) {
    this.Zo.ZHf(this.Zs.isSelected());
  }
  
  private void ZJ(ActionEvent paramActionEvent) {
    this.Zo.ZHv(this.ZH.isSelected());
  }
  
  private void Za(ActionEvent paramActionEvent) {
    this.Zo.ZHj(this.ZG.isSelected());
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ':[¸ïí[¤5,óÛâ7íê¦ÜÝÑe\\f è¤Ø<v)[©©²&ú¾w¶hÍ¦ÚY#­µû\\fßCýÚÂ¬²yÌ.î,ümÌLè!gõïÆÇT" )¶ëÏ;ÀÆp/àÚEìTþõµ|ZØñºÏÑâ»û@Ë°ý\\r4ð·äåkVâåmÅ/wy5²\\f>C"¤Cj×n÷\\rÿèb»y©"[+5ÙOX\n¹:à¶YbXo#÷L#&iN(#WMþíaØÙ6nÍt\\t§óÍU%É`¹ÛÌu¬ÚÁ)¼§½-<03ÖíRP(µ«R¶h¤5;oÎþÛR¥\\n¤ñü$¯Nie%ðëx#H¿ø¡G-¶ý#þmMeFÿß5WiT/Ê°é|20Vé*P:'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #25
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #22
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
    //   68: ldc 'mÍí\\\bÕî1ÂÌ.¢\\npÕ]UwIDk6AÄKÂ!¿Z#Åa5¶_\,;ï'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #29
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #51
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
    //   129: putstatic burp/Zbae.a : [Ljava/lang/String;
    //   132: bipush #17
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbae.b : [Ljava/lang/String;
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
    //   212: bipush #32
    //   214: goto -> 244
    //   217: bipush #82
    //   219: goto -> 244
    //   222: bipush #45
    //   224: goto -> 244
    //   227: bipush #67
    //   229: goto -> 244
    //   232: bipush #110
    //   234: goto -> 244
    //   237: bipush #14
    //   239: goto -> 244
    //   242: bipush #57
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
    int i = (paramInt1 ^ 0x53EA) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbae.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */