package burp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.util.function.Consumer;
import javax.swing.BorderFactory;
import javax.swing.Box;
import net.portswigger.Zm2;

public class Zr7z extends Zrh7 {
  private final Zl_q ZG;
  
  private final Zeg4 ZP;
  
  private final Consumer<Zgui> ZE;
  
  private Ze0q Zv;
  
  private Ze01 ZS;
  
  private Ze01 Zr;
  
  private Zzdy ZF;
  
  private Box.Filler ZA;
  
  private Box.Filler Zp;
  
  private Zm99 Zg;
  
  private Zm99 Zx;
  
  private Zm99 ZM;
  
  private Zm99 Zh;
  
  private Zbqc Zf;
  
  private Zbqc ZQ;
  
  private Zbqc Za;
  
  private static String[] Zw;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public Zr7z(Window paramWindow, Zl_q paramZl_q, Zeg4 paramZeg4, Consumer<Zgui> paramConsumer, boolean paramBoolean) {
    super(paramWindow, true, Zzv7.RUNNING_ATTACK_CLOSE_RESULTS_DIALOG);
    this.ZG = paramZl_q;
    this.ZP = paramZeg4;
    this.ZE = paramConsumer;
    ZL();
    Zl();
    String[] arrayOfString = Zt();
    Zo();
    this.Zr.setVisible(paramBoolean);
    addWindowListener(new Zkm2(this));
    pack();
    Zq(paramWindow);
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  private void Zo() {
    setName(a(-20627, -10294));
    this.Zr.setName(a(-20637, -30736));
    this.ZS.setName(a(-20640, -6754));
    this.Zv.setName(a(-20626, -1295));
  }
  
  private void Zc(Zgui paramZgui) {
    if (this.ZF.isSelected())
      this.ZE.accept(paramZgui); 
  }
  
  private void Zl() {
    this.Zh.ZE(Zt00.TITLE_FONT_LARGE);
    this.ZM.ZE(Zt00.DEFAULT_FONT);
    this.Zx.ZE(Zt00.DEFAULT_FONT);
    this.Zg.ZE(Zt00.DEFAULT_FONT);
    this.ZF.ZO(Zt00.DEFAULT_FONT);
  }
  
  public void Zk() {
    setVisible(false);
    dispose();
  }
  
  private void ZL() {
    this.ZQ = new Zbqc();
    this.Zh = new Zm99();
    this.ZM = new Zm99();
    this.Zx = new Zm99();
    this.Za = new Zbqc();
    this.ZF = new Zzdy();
    this.Zg = new Zm99();
    this.Zf = new Zbqc();
    this.ZA = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
    this.Zr = new Ze01();
    this.ZS = new Ze01();
    this.Zv = new Ze0q();
    this.Zp = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
    setDefaultCloseOperation(0);
    setModal(true);
    setResizable(false);
    getContentPane().setLayout(new GridBagLayout());
    this.ZQ.setLayout(new GridBagLayout());
    this.Zh.setHorizontalAlignment(0);
    this.Zh.setText(a(-20632, -21642));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(30, 55, 0, 55);
    this.ZQ.add(this.Zh, gridBagConstraints);
    this.ZM.setHorizontalAlignment(0);
    this.ZM.setText(a(-20630, -27408));
    this.ZM.setMaximumSize(new Dimension(52, 30));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(30, 82, 0, 82);
    this.ZQ.add(this.ZM, gridBagConstraints);
    this.Zx.setHorizontalAlignment(0);
    this.Zx.setText(a(-20638, -24300));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(0, 52, 33, 52);
    this.ZQ.add(this.Zx, gridBagConstraints);
    this.Za.setLayout(new GridBagLayout());
    this.ZF.setText(a(-20629, -3403));
    this.ZF.setIconTextGap(9);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    this.Za.add(this.ZF, gridBagConstraints);
    this.Zg.setText(a(-20631, -7900));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    this.Za.add(this.Zg, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.insets = new Insets(0, 0, 24, 0);
    this.ZQ.add(this.Za, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    getContentPane().add(this.ZQ, gridBagConstraints);
    this.Zf.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, new Color(79, 79, 80)));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 10, 0, 10, 0, 10, 0, 10, 0 };
    gridBagLayout.rowHeights = new int[] { 0 };
    this.Zf.setLayout(gridBagLayout);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    this.Zf.add(this.ZA, gridBagConstraints);
    this.Zr.setText(a(-20625, 20269));
    this.Zr.addActionListener(new Zm5r(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    this.Zf.add(this.Zr, gridBagConstraints);
    this.ZS.setText(a(-20639, 32153));
    this.ZS.addActionListener(new Zgn7(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    this.Zf.add(this.ZS, gridBagConstraints);
    this.Zv.setText(a(-20628, -21079));
    this.Zv.addActionListener(new Zt0v(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.insets = new Insets(20, 0, 20, 0);
    this.Zf.add(this.Zv, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    this.Zf.add(this.Zp, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = 2;
    getContentPane().add(this.Zf, gridBagConstraints);
  }
  
  private void ZX(ActionEvent paramActionEvent) {
    Zm2.ZC(Zrrh.INTRUDER_ATTACK_CLOSE_RESULTS_FINISHED_SAVE_TO_PROJECT_FILE);
    this.ZP.ZM(Zeg4.Zp, Zssw.CLOSE);
    Zc(Zgui.SAVE_ATTACK_PROJECT_FILE);
    Zk();
  }
  
  private void ZE(ActionEvent paramActionEvent) {
    Zm2.ZC(Zrrh.INTRUDER_ATTACK_CLOSE_RESULTS_FINISHED_KEEP_MEMORY);
    this.ZG.ZJ();
    Zc(Zgui.KEEP_IN_MEMORY);
    Zk();
  }
  
  private void Zz(ActionEvent paramActionEvent) {
    Zm2.ZC(Zrrh.INTRUDER_ATTACK_CLOSE_RESULTS_FINISHED_DELETE_TASK);
    this.ZG.Za();
    Zc(Zgui.DELETE_ATTACK);
    Zk();
  }
  
  public static void Zi(String[] paramArrayOfString) {
    Zw = paramArrayOfString;
  }
  
  public static String[] Zt() {
    return Zw;
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '±ý½êèy~rLêçùðg4ý·5fùÛÁ/lbª/*:º°ÎÖ\\r!-,4*¡3[37.Ì|5ëzhÒMA,¢vEØ4DÌó\\bÍøuÞ\È>õÿÄ3uA=¦/Já1æ«%.îzàÛ®ì,8ÀYªA±ÃUîé·[Z.ÅÛ"UúºÜ»ÎÄ¡nbI Û`yµÒ°K©4ß0^½Ym<Ö§>\\r^ôF\\t¢ÊåÖ>VÏMQA@SÙY|#`DÂ %ÃÜGg\\fPÒ7âí)åâWf{¯è¨G!PÄ;å°ÄàDªl<gSÑÒ1²ÓOQµüOI2]®ì'r0\EkÕºÂ¡t9Ç3ÅÞ³âãÁpê¦ÔJSjÐÝ«qÅOÕu).s¢u.gÜ×3ª]ßXêxáBñ´%tý3Pøb&!\È=Çxèeþ}$­Â'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: aconst_null
    //   19: bipush #49
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: invokestatic Zi : ([Ljava/lang/String;)V
    //   27: bipush #44
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc 'ò ºB5>T§ÏZW-(+ßQ)­\\b7\\rÀí.,ß_<©v .lmÉÌ¯"ÉL2<,D'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #14
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #88
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic burp/Zr7z.b : [Ljava/lang/String;
    //   136: bipush #12
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zr7z.c : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #104
    //   218: goto -> 248
    //   221: bipush #80
    //   223: goto -> 248
    //   226: bipush #90
    //   228: goto -> 248
    //   231: bipush #90
    //   233: goto -> 248
    //   236: bipush #16
    //   238: goto -> 248
    //   241: bipush #109
    //   243: goto -> 248
    //   246: bipush #109
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFAF6B) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      char c = '°';
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr7z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */