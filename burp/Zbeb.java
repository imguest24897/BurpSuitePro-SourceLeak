package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import javax.swing.ButtonGroup;

public class Zbeb extends Zbv5 implements Zt3u {
  private final Zr1m ZW;
  
  private final Zlhb ZH;
  
  private final Collection<String> ZE;
  
  private Zzdy Zb;
  
  private Zzdy ZP;
  
  private ButtonGroup Zy;
  
  private Zm99 ZQ;
  
  private Zmg2 Z_;
  
  private Zmg2 Zo;
  
  private Zmg2 ZI;
  
  private Zmg2 Zt;
  
  private static String[] ZL;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbeb(Zr1m paramZr1m, Zlhb paramZlhb) {
    this.ZW = paramZr1m;
    this.ZH = paramZlhb;
    this.ZE = Set.of(Zjd(), a(-16467, 4332), a(-16469, -27667), a(-16474, -14907), a(-16477, -3863));
    ZK();
    setName(a(-16471, 28778));
  }
  
  public String Zjd() {
    return a(-16472, 29258);
  }
  
  public String ZjS() {
    return a(-16478, -30156);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.ZP(Zjd().toLowerCase(Locale.ENGLISH), Zk97.DESKTOP_SETTINGS_TOOLS_REPEATER_REDIRECTS, this.ZW, new String[] { a(-16451, -14163), a(-16465, -16584), a(-16473, -8136) });
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.ZE;
  }
  
  public void Zt2() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zb : Lburp/Zzdy;
    //   4: aload_0
    //   5: getfield ZH : Lburp/Zlhb;
    //   8: invokeinterface ZTk : ()Z
    //   13: invokevirtual setSelected : (Z)V
    //   16: invokestatic Z_ : ()[Ljava/lang/String;
    //   19: aload_0
    //   20: getfield ZP : Lburp/Zzdy;
    //   23: aload_0
    //   24: getfield ZH : Lburp/Zlhb;
    //   27: invokeinterface ZTD : ()Z
    //   32: invokevirtual setSelected : (Z)V
    //   35: astore_1
    //   36: aload_0
    //   37: getfield ZH : Lburp/Zlhb;
    //   40: invokeinterface ZTQ : ()I
    //   45: tableswitch default -> 120, 0 -> 76, 1 -> 88, 2 -> 100, 3 -> 112
    //   76: aload_0
    //   77: getfield ZI : Lburp/Zmg2;
    //   80: iconst_1
    //   81: invokevirtual setSelected : (Z)V
    //   84: aload_1
    //   85: ifnonnull -> 120
    //   88: aload_0
    //   89: getfield Zt : Lburp/Zmg2;
    //   92: iconst_1
    //   93: invokevirtual setSelected : (Z)V
    //   96: aload_1
    //   97: ifnonnull -> 120
    //   100: aload_0
    //   101: getfield Zo : Lburp/Zmg2;
    //   104: iconst_1
    //   105: invokevirtual setSelected : (Z)V
    //   108: aload_1
    //   109: ifnonnull -> 120
    //   112: aload_0
    //   113: getfield Z_ : Lburp/Zmg2;
    //   116: iconst_1
    //   117: invokevirtual setSelected : (Z)V
    //   120: return
  }
  
  private void ZK() {
    this.Zy = new ButtonGroup();
    this.ZQ = new Zm99();
    this.ZI = new Zmg2();
    this.Zt = new Zmg2();
    this.Zo = new Zmg2();
    this.Z_ = new Zmg2();
    this.Zb = new Zzdy();
    this.ZP = new Zzdy();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZQ.setText(a(-16476, 6047));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    add(this.ZQ, gridBagConstraints);
    this.Zy.add(this.ZI);
    this.ZI.setText(a(-16466, -10093));
    this.ZI.addActionListener(new Zees(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 21;
    add(this.ZI, gridBagConstraints);
    this.Zy.add(this.Zt);
    this.Zt.setText(a(-16480, 2685));
    this.Zt.addActionListener(new Zz7g(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 21;
    add(this.Zt, gridBagConstraints);
    this.Zy.add(this.Zo);
    this.Zo.setText(a(-16475, 25866));
    this.Zo.addActionListener(new Zlbe(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 21;
    add(this.Zo, gridBagConstraints);
    this.Zy.add(this.Z_);
    this.Z_.setText(a(-16470, 4778));
    this.Z_.addActionListener(new Zekf(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 21;
    add(this.Z_, gridBagConstraints);
    this.Zb.setText(a(-16479, 6800));
    this.Zb.addActionListener(new Ztg5(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.Zb, gridBagConstraints);
    this.ZP.setText(a(-16468, -2144));
    this.ZP.addActionListener(new Zzpe(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.anchor = 21;
    add(this.ZP, gridBagConstraints);
  }
  
  private void ZC(ActionEvent paramActionEvent) {
    this.ZH.ZYF(this.Zb.isSelected());
  }
  
  private void Zf(ActionEvent paramActionEvent) {
    this.ZH.ZYk(this.ZP.isSelected());
  }
  
  private void ZY(ActionEvent paramActionEvent) {
    this.ZH.Zis(0);
  }
  
  private void Z_(ActionEvent paramActionEvent) {
    this.ZH.Zis(1);
  }
  
  private void Zd(ActionEvent paramActionEvent) {
    this.ZH.Zis(2);
  }
  
  private void ZQ(ActionEvent paramActionEvent) {
    this.ZH.Zis(3);
  }
  
  public static void ZP(String[] paramArrayOfString) {
    ZL = paramArrayOfString;
  }
  
  public static String[] Z_() {
    return ZL;
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: iconst_1
    //   10: anewarray java/lang/String
    //   13: ldc 'ãµxëµËÎ÷Ù6Xè¸0Ø¹¸Ür¤&t½Ki.G)ÆL©úw¬nkzÇiàK0<Ì´Ì¸Ayx)=ðÒ fä5Ú3dÝ²®kg\\b¥\\r<¿Y(X³>ºµ>¤>If62í_#\\r¸Y\\fkÉÅExB £/æ÷Pob\\tKjj\\n@\\n&òÊ`¢r©8òpú\\fáÂ\\raÇn¯õ«Õ+¨\\fã¥:Y.vx¥ýïôÓ-Üð°Òfëä(1#vBýú/íû\\f¥>|åÑp, u.¸ÿÏË©×K7Üìf»·ºAª}ÀF¾DFà\\fTÄÏó¼KÞ iÚ\\féÁRðh`9FËæ'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: invokestatic ZP : ([Ljava/lang/String;)V
    //   25: bipush #16
    //   27: istore_1
    //   28: iconst_m1
    //   29: istore_0
    //   30: bipush #48
    //   32: iinc #0, 1
    //   35: aload_2
    //   36: iload_0
    //   37: dup
    //   38: iload_1
    //   39: iadd
    //   40: invokevirtual substring : (II)Ljava/lang/String;
    //   43: iconst_m1
    //   44: goto -> 150
    //   47: aload #5
    //   49: swap
    //   50: iload_3
    //   51: iinc #3, 1
    //   54: swap
    //   55: aastore
    //   56: iload_0
    //   57: iload_1
    //   58: iadd
    //   59: dup
    //   60: istore_0
    //   61: iload #4
    //   63: if_icmpge -> 75
    //   66: aload_2
    //   67: iload_0
    //   68: invokevirtual charAt : (I)C
    //   71: istore_1
    //   72: goto -> 30
    //   75: ldc '*\µT½Y-uýYçÂjnm÷µ5b>¨aÏ\\n]ªâàáX]ò´»°ç°[Ø\1¤ÏØ¢0îRh]Ü¼p7¹äð:¦ðLS(q¥\\bú¨«LÄGãOjÇÿÐcwEvµë¿ÈÒ[và+ÐÒ'
    //   77: dup
    //   78: astore_2
    //   79: invokevirtual length : ()I
    //   82: istore #4
    //   84: bipush #79
    //   86: istore_1
    //   87: iconst_m1
    //   88: istore_0
    //   89: bipush #88
    //   91: iinc #0, 1
    //   94: aload_2
    //   95: iload_0
    //   96: dup
    //   97: iload_1
    //   98: iadd
    //   99: invokevirtual substring : (II)Ljava/lang/String;
    //   102: iconst_0
    //   103: goto -> 150
    //   106: aload #5
    //   108: swap
    //   109: iload_3
    //   110: iinc #3, 1
    //   113: swap
    //   114: aastore
    //   115: iload_0
    //   116: iload_1
    //   117: iadd
    //   118: dup
    //   119: istore_0
    //   120: iload #4
    //   122: if_icmpge -> 134
    //   125: aload_2
    //   126: iload_0
    //   127: invokevirtual charAt : (I)C
    //   130: istore_1
    //   131: goto -> 89
    //   134: aload #5
    //   136: putstatic burp/Zbeb.a : [Ljava/lang/String;
    //   139: bipush #17
    //   141: anewarray java/lang/String
    //   144: putstatic burp/Zbeb.b : [Ljava/lang/String;
    //   147: goto -> 308
    //   150: dup_x2
    //   151: pop
    //   152: invokevirtual toCharArray : ()[C
    //   155: dup_x1
    //   156: arraylength
    //   157: dup_x2
    //   158: pop
    //   159: iconst_0
    //   160: istore #6
    //   162: dup2_x1
    //   163: pop2
    //   164: dup_x2
    //   165: iconst_1
    //   166: if_icmpgt -> 268
    //   169: dup2
    //   170: swap
    //   171: iload #6
    //   173: dup2_x1
    //   174: caload
    //   175: swap
    //   176: iload #6
    //   178: bipush #7
    //   180: irem
    //   181: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #42
    //   222: goto -> 252
    //   225: bipush #20
    //   227: goto -> 252
    //   230: bipush #124
    //   232: goto -> 252
    //   235: bipush #51
    //   237: goto -> 252
    //   240: bipush #106
    //   242: goto -> 252
    //   245: bipush #124
    //   247: goto -> 252
    //   250: bipush #111
    //   252: ixor
    //   253: ixor
    //   254: i2c
    //   255: castore
    //   256: iinc #6, 1
    //   259: dup
    //   260: ifne -> 268
    //   263: dup2
    //   264: dup_x1
    //   265: goto -> 173
    //   268: dup2_x1
    //   269: pop2
    //   270: dup_x2
    //   271: iload #6
    //   273: if_icmpgt -> 169
    //   276: pop
    //   277: new java/lang/String
    //   280: dup_x1
    //   281: swap
    //   282: invokespecial <init> : ([C)V
    //   285: invokevirtual intern : ()Ljava/lang/String;
    //   288: swap
    //   289: pop
    //   290: swap
    //   291: tableswitch default -> 47, 0 -> 106
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFBFAD) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbeb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */