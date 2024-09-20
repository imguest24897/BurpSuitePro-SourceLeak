package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zbv6 extends Zbqc implements Zsq4 {
  private static final Border ZY;
  
  private static final Border Zd;
  
  private final Zlfb Zj;
  
  private final Ztj1 ZU;
  
  private final Zm9q ZW;
  
  private final Zm9t ZH;
  
  private final Zm9t ZJ;
  
  private final Zbc9 Zw;
  
  private final Zm9t ZB;
  
  private boolean Zn;
  
  private Zkj9 ZL;
  
  private boolean Zv;
  
  private static final String[] a;
  
  private static final String[] b;
  
  protected Zbv6(Zlfb paramZlfb, Ztj1 paramZtj1) {
    this.Zj = paramZlfb;
    this.ZU = paramZtj1;
    this.Zn = false;
    setName(a(29297, 27716) + a(29297, 27716));
    setLayout(new BorderLayout());
    Zl(Zlkk.TASK_LIST_ENTRY);
    Zbqc zbqc1 = new Zbqc();
    zbqc1.setOpaque(false);
    int[] arrayOfInt = Zx0w.ZP();
    zbqc1.setBorder(new EmptyBorder(0, 0, 5, 0));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 10, 0, 10, 0 };
    zbqc1.setLayout(gridBagLayout);
    this.ZW = new Zm9q(this);
    Zj(paramZtj1.ZO(), paramZtj1.ZM());
    this.Zw = new Zbc9();
    this.Zw.setOpaque(false);
    this.ZH = new Zm9t();
    this.ZH.Zv(Ze3m.ZC(Zeuf.PAUSE, Zlkk.ACTION_NORMAL).ZU(Zmcx.LARGE_LINE_SIZE).ZG(Zlkk.ACTION_HOVER).Z_(), a(29307, -8228), this::ZK);
    this.ZH.setOpaque(false);
    this.Zw.add(this.ZH);
    this.ZJ = new Zm9t();
    this.ZJ.Zv(Ze3m.ZC(Zeuf.RESUME, Zlkk.ACTION_NORMAL).ZU(Zmcx.LARGE_LINE_SIZE).ZG(Zlkk.ACTION_HOVER).Z_(), a(29308, -21847), this::ZK);
    this.ZJ.setOpaque(false);
    this.ZJ.setName(a(29311, -9543));
    this.Zw.add(this.ZJ);
    this.Zw.ZP(paramZtj1.ZE() ? this.ZJ : this.ZH);
    this.ZB = new Zm9t();
    this.ZB.ZB(Ze3m.ZC(Zeuf.OPTIONS, Zlkk.ACTION_NORMAL).ZU(Zmcx.LARGE_LINE_SIZE).ZG(Zlkk.ACTION_HOVER).Z_(), a(29285, -23540));
    this.ZB.addMouseListener(new Zmiv(this));
    this.ZB.setOpaque(false);
    this.ZB.setName(a(29303, 915));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.anchor = 23;
    zbqc1.add(this.ZW, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 24;
    zbqc1.add(this.Zw, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 24;
    zbqc1.add(this.ZB, gridBagConstraints);
    add(zbqc1, a(29298, 30388));
    Zbqc zbqc2 = new Zbqc();
    zbqc2.setOpaque(false);
    zbqc2.setLayout(new BoxLayout(zbqc2, 1));
    for (Component component : Zc(paramZtj1)) {
      zbqc2.add(Box.createVerticalStrut(10));
      zbqc2.add(component);
      if (arrayOfInt != null) {
        Zbqc.Zr(new Zbqc[3]);
        break;
      } 
    } 
    add(zbqc2, a(29282, 27444));
    setBorder(ZY);
    Zgnd zgnd = new Zgnd(this);
    addMouseListener(zgnd);
    addMouseMotionListener(zgnd);
  }
  
  public void Zs() {
    this.Zw.ZP(this.ZJ);
    this.Zw.setVisible(true);
  }
  
  public void Zb() {
    this.Zw.ZP(this.ZH);
    this.Zw.setVisible(true);
  }
  
  public void Zm() {
    this.Zw.setVisible(false);
  }
  
  private void ZE() {
    int[] arrayOfInt = Zx0w.ZP();
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    if (this.ZL == null) {
      this.ZL = new Zkj9();
      for (Zepe zepe : Zg()) {
        this.ZL.add(zepe);
        if (arrayOfInt != null)
          break; 
      } 
      this.ZL.addPopupMenuListener(new Zzqh(this));
    } 
    if (!this.Zv) {
      this.Zv = true;
      this.ZL.show(this.ZB, this.ZB.getWidth(), 0);
    } 
  }
  
  public void Zj(String paramString1, String paramString2) {
    this.ZW.Zu(paramString1, paramString2);
  }
  
  public void ZF(boolean paramBoolean) {
    this.Zn = paramBoolean;
    Zh();
  }
  
  public Component ZB() {
    return this;
  }
  
  private void ZK() {
    this.Zj.Zy(this.ZU.Zh());
  }
  
  private void Zh() {
    Zl(this.Zn ? Zlkk.TASK_LIST_ENTRY_SELECTED : Zlkk.TASK_LIST_ENTRY);
    setBorder(this.Zn ? Zd : ZY);
  }
  
  public Ztj1 ZP() {
    return this.ZU;
  }
  
  protected abstract List<Component> Zc(Ztj1 paramZtj1);
  
  protected List<Zepe> Zg() {
    ArrayList<Zepe> arrayList = new ArrayList();
    Zepe zepe1 = new Zepe(a(29306, -19266), Ze3m.ZC(Zeuf.DELETE, Zlkk.ACTION_NORMAL).ZU(Zmcx.LARGE_LINE_SIZE).ZG(Zlkk.ACTION_HOVER).Z_());
    zepe1.addActionListener(this::lambda$createOptions$0);
    zepe1.setName(a(29305, 14014));
    arrayList.add(zepe1);
    Zepe zepe2 = new Zepe(a(29299, 18098), Ze3m.ZC(Zeuf.SETTINGS, Zlkk.ACTION_NORMAL).ZU(Zmcx.LARGE_LINE_SIZE).ZG(Zlkk.ACTION_HOVER).Z_());
    int[] arrayOfInt = Zx0w.ZP();
    zepe2.addActionListener(this::lambda$createOptions$1);
    zepe2.setName(a(29296, 15843));
    arrayList.add(zepe2);
    Zepe zepe3 = new Zepe(a(29304, 12291), Ze3m.ZC(Zeuf.EDIT, Zlkk.ACTION_NORMAL).ZU(Zmcx.LARGE_LINE_SIZE).ZG(Zlkk.ACTION_HOVER).Z_());
    zepe3.addActionListener(this::lambda$createOptions$2);
    zepe3.setName(a(29301, 13936));
    arrayList.add(zepe3);
    Zepe zepe4 = new Zepe(a(29302, 15206), Ze3m.ZC(Zeuf.SHOW_DETAILS, Zlkk.ACTION_NORMAL).ZU(Zmcx.LARGE_LINE_SIZE).ZG(Zlkk.ACTION_HOVER).Z_());
    zepe4.addActionListener(this::lambda$createOptions$3);
    zepe4.setName(a(29287, 16510));
    arrayList.add(zepe4);
    if (Zbqc.Zwu() == null)
      Zx0w.ZI(new int[1]); 
    return arrayList;
  }
  
  protected void Zy() {
    boolean bool = Zx6o.ZY(Zt2m.ZF(this), a(29309, 22426) + a(29309, 22426) + this.ZU.Zh());
    if (bool)
      this.Zj.Zo(this.ZU.Zh()); 
  }
  
  protected void ZM() {
    this.Zj.ZQ(this, this.ZU.Zh());
  }
  
  protected void ZZ() {
    String str = Zx6o.ZE(this, -1, a(29300, 16337), a(29284, -12650) + a(29284, -12650), this.ZU.ZM());
    if (str != null)
      this.Zj.ZT(this.ZU.Zh(), str.trim()); 
  }
  
  protected void Zu() {
    this.Zj.ZZ(this.ZU.Zh());
  }
  
  protected Zx0w ZO() {
    Zx0w zx0w = new Zx0w(this.ZU.Zz());
    Zgnd zgnd = new Zgnd(this);
    zx0w.addMouseListener(zgnd);
    zx0w.addMouseMotionListener(zgnd);
    return zx0w;
  }
  
  public static String Zg(String paramString) {
    if (!paramString.contains(","))
      return paramString; 
    String[] arrayOfString = paramString.split(a(29310, 32107));
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(arrayOfString[0]);
    if (arrayOfString.length > 1)
      stringBuilder.append(a(29281, 23579)).append(arrayOfString[1]); 
    if (arrayOfString.length > 2)
      stringBuilder.append(a(29286, -1645)).append(arrayOfString.length - 2).append(a(29283, 9217)); 
    return stringBuilder.toString();
  }
  
  private void lambda$createOptions$3(ActionEvent paramActionEvent) {
    Zu();
  }
  
  private void lambda$createOptions$2(ActionEvent paramActionEvent) {
    ZZ();
  }
  
  private void lambda$createOptions$1(ActionEvent paramActionEvent) {
    ZM();
  }
  
  private void lambda$createOptions$0(ActionEvent paramActionEvent) {
    Zy();
  }
  
  static {
    // Byte code:
    //   0: bipush #23
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÃVm|Q>h>ÒñJJ^¯©?ü£Ü¢\\f\\rÌ·Øæ\\f¡Ë±Õ]\\fÂ½Wæ#lR#òQ4åëÒ<Æù»NHy²ÈÐ\\bñNÔ]î¬ù7JÜDÐ\\r®c/Ý§oÇ]Î»âÜrøn®Ân¥u:42QòÞsNoïs^aþïibGXÙR"­_ì²ínß¸%ìI¨~ÍëiYÛm""ó}Ñª¿÷À°ÄÑF#Ã"$ÊÐè1|êÊnXª\\fý§¸qe8Ð)^Ã¬%v´±×ñÿuÛ1X}l~\\fæ:;®?Ú *OóÏà-/Ó²öüÅ´wO~c@ ×\\fQËÇyOÆ×ªC£\\fàá5A?áÉ3ãàûðä'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #24
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #69
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
    //   68: ldc 'äîZmN4\\f'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #6
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #101
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
    //   129: putstatic burp/Zbv6.a : [Ljava/lang/String;
    //   132: bipush #23
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbv6.b : [Ljava/lang/String;
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
    //   212: bipush #81
    //   214: goto -> 244
    //   217: bipush #36
    //   219: goto -> 244
    //   222: bipush #96
    //   224: goto -> 244
    //   227: bipush #64
    //   229: goto -> 244
    //   232: bipush #6
    //   234: goto -> 244
    //   237: bipush #118
    //   239: goto -> 244
    //   242: bipush #42
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
    //   300: new burp/Zr63
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic burp/Zbv6.ZY : Ljavax/swing/border/Border;
    //   310: new burp/Zr61
    //   313: dup
    //   314: invokespecial <init> : ()V
    //   317: putstatic burp/Zbv6.Zd : Ljavax/swing/border/Border;
    //   320: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7277) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbv6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */