package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.swing.BorderFactory;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zrv4 extends Zrh7 {
  private final Zkk9 Zv;
  
  private final Zb0h Zm;
  
  private final Zr_4 Zs;
  
  private final Zk97 Zo;
  
  private final Zbnt Zt;
  
  private final Zr1j Zr;
  
  private Zm99 Zc;
  
  private Zm99 ZE;
  
  private Ze01 ZX;
  
  private Ze01 Zf;
  
  private Ze01 ZI;
  
  private Zedd Zd;
  
  private Zm2o ZY;
  
  private Zbqc Zh;
  
  private Zm9v Zl;
  
  private Zl8w ZL;
  
  private Zm99 Zb;
  
  private Zm99 ZU;
  
  private Zbqc Zx;
  
  private Zgff ZQ;
  
  private Zgff Zi;
  
  private Zgff ZT;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zrv4(Zkk9 paramZkk9, String paramString, Zmy8 paramZmy8, boolean paramBoolean, Zk97 paramZk97, Zbnt paramZbnt, Zb0h paramZb0h, Zr_4 paramZr_4, Zr1j paramZr1j) {
    super(Zt2m.ZF(paramZkk9.Zz()), true, Zzv7.SCOPE_RULES_POPUP_PANEL);
    this.Zv = paramZkk9;
    int i = Zbax.ZM();
    try {
      this.Zo = paramZk97;
      this.Zt = paramZbnt;
      this.Zm = paramZb0h;
      this.Zs = paramZr_4;
      this.Zr = paramZr1j;
      ZD();
      if (paramBoolean) {
        this.Zx.remove(this.ZU);
        this.Zx.remove(this.Zd);
        this.Zx.remove(this.Zb);
        this.Zx.remove(this.ZQ);
        this.ZL.setText(a(16706, 24611));
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    setTitle(paramString);
    this.Zi.ZM(a(16719, -4741));
    this.ZT.ZM(a(16714, 29281));
    this.ZQ.ZM(a(16708, 21267));
    String[] arrayOfString1 = Zmy8.Zx;
    String[] arrayOfString2 = arrayOfString1;
    int j = arrayOfString2.length;
    byte b = 0;
    while (b < j) {
      String str = arrayOfString2[b];
      this.Zd.addItem(str);
      b++;
      if (i == 0)
        break; 
    } 
    try {
      if (paramZmy8 != null)
        Zu(paramZmy8); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    addWindowListener(new Zx4_(this));
    pack();
    Zq(Zt2m.ZF(paramZkk9.Zz()));
  }
  
  private void Zu(Zmy8 paramZmy8) {
    this.Zd.setSelectedIndex(paramZmy8.Zl5());
    this.Zi.setText(paramZmy8.Zlg());
    this.ZT.setText(paramZmy8.ZlU());
    this.ZQ.setText(paramZmy8.ZlO());
  }
  
  private boolean ZL() {
    try {
      new Zsfr(this.Zi.getText(), this.Zr);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.USER_ERROR);
      return ZM(this.Zi.getText());
    } 
    return true;
  }
  
  private boolean ZC() {
    return ZM(this.ZT.getText());
  }
  
  private boolean Zf() {
    return ZM(this.ZQ.getText());
  }
  
  private boolean ZM(String paramString) {
    try {
      Pattern.compile(paramString, 2);
    } catch (PatternSyntaxException patternSyntaxException) {
      Zah.Zl(patternSyntaxException, Zk_.USER_ERROR);
      this.Zl.setText(a(16717, 28200) + a(16717, 28200));
      return false;
    } 
    return true;
  }
  
  private void ZD() {
    this.Zx = new Zbqc();
    this.ZL = new Zl8w();
    this.ZQ = new Zgff();
    this.Zd = new Zedd();
    this.ZT = new Zgff();
    this.Zi = new Zgff();
    this.Zc = new Zm99();
    this.ZE = new Zm99();
    this.Zb = new Zm99();
    this.ZU = new Zm99();
    this.Zh = new Zbqc();
    this.ZX = new Ze01();
    this.Zf = new Ze01();
    this.Zl = new Zm9v();
    this.ZY = new Zm2o();
    this.ZI = new Ze01();
    setDefaultCloseOperation(0);
    this.Zx.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0 };
    this.Zx.setLayout(gridBagLayout);
    this.ZL.setText(a(16712, -3026));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    this.Zx.add(this.ZL, gridBagConstraints);
    this.ZQ.ZH(Zlw9.SCOPE_FILE_REGEX);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.Zx.add(this.ZQ, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.Zx.add(this.Zd, gridBagConstraints);
    this.ZT.ZH(Zlw9.SCOPE_PORT_REGEX);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.Zx.add(this.ZT, gridBagConstraints);
    this.Zi.setColumns(30);
    this.Zi.ZH(Zlw9.SCOPE_HOST_REGEX);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.Zx.add(this.Zi, gridBagConstraints);
    this.Zc.setText(a(16704, 15932));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    this.Zx.add(this.Zc, gridBagConstraints);
    this.ZE.setText(a(16716, -5926));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    this.Zx.add(this.ZE, gridBagConstraints);
    this.Zb.setText(a(16711, -24900));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    this.Zx.add(this.Zb, gridBagConstraints);
    this.ZU.setText(a(16705, 11801));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    this.Zx.add(this.ZU, gridBagConstraints);
    this.Zh.setLayout(new GridLayout(1, 2, 5, 0));
    this.ZX.setText(a(16715, -13779));
    this.ZX.addActionListener(new Zk5f(this));
    this.Zh.add(this.ZX);
    this.Zf.setText(a(16707, 1917));
    this.Zf.addActionListener(new Zgyr(this));
    this.Zh.add(this.Zf);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.anchor = 12;
    gridBagConstraints.weighty = 1.0D;
    gridBagConstraints.insets = new Insets(15, 0, 0, 0);
    this.Zx.add(this.Zh, gridBagConstraints);
    this.Zl.setText(a(16710, -30743));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 23;
    this.Zx.add(this.Zl, gridBagConstraints);
    this.ZY.Zi(this.Zo);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.Zx.add(this.ZY, gridBagConstraints);
    this.ZI.setText(a(16718, 22427));
    this.ZI.setToolTipText(a(16709, -15155));
    this.ZI.addActionListener(new Zoj(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weighty = 1.0D;
    gridBagConstraints.insets = new Insets(15, 0, 0, 0);
    this.Zx.add(this.ZI, gridBagConstraints);
    getContentPane().add(this.Zx, a(16713, 2310));
    pack();
  }
  
  private void Zk(ActionEvent paramActionEvent) {
    try {
      if (ZL())
        try {
          if (ZC() && Zf()) {
            Zmy8 zmy8 = this.Zs.<Zmy8>ZH(new Zmks(true, this.Zd.getSelectedIndex(), this.Zi.getText(), this.ZT.getText(), this.ZQ.getText()));
            setVisible(false);
            dispose();
            this.Zv.ZT(zmy8);
          } 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        }  
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  private void Zm(ActionEvent paramActionEvent) {
    setVisible(false);
    dispose();
    this.Zv.ZT(null);
  }
  
  private void Zo(ActionEvent paramActionEvent) {
    this.Zl.setText("");
    try {
      Zu(Ze9z.ZM(new Zax(new URL(this.Zm.Zp()), this.Zt), this.Zs));
    } catch (MalformedURLException|Zxg5|Zxgy malformedURLException) {
      Zah.Zl(malformedURLException, Zk_.USER_ERROR);
      this.Zl.setText(malformedURLException.getMessage());
    } 
  }
  
  private static PatternSyntaxException a(PatternSyntaxException paramPatternSyntaxException) {
    return paramPatternSyntaxException;
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '×0^âY(=ÑvÅ¼²CW ]&F4£>£z\\nêÈË\\t´tìöåîYùB¨L¬è·ÑCçëÑä·"-B{É©Ñ!NÎÜHJúÌí}»ÓÕß\\fîópB9B_×7ï/¨**±úòfC®ªt¹ xGÎµû!çJq¦Ö!t(Jk½Zv"¨Ã«×Q^¸ùêo$\\fõWsO¨  º±Ã(àBK z°záérOuã­ÚI,Bu¡\\nZR$BX~EÌÉb l$÷QÕL5ÈSí·F¦m¾¤t bú3×)àûÃ|¹² N+¹®£\\fý3±£GãªAÛ0^O}Ð±tÌÅ\\bþO{\\rýÕ½¯&$7TÄä39Ó[u,×%¨ëíQÜ!VýË±Äi¤Äð§C@ÖüëK{jÊ§\÷¦¢KYç´ÀÐ¹á$róOây7¯¬)ñÜ@>âÙ<îÈ´Ùän+bhRÚ:¾DZòO²õ"v*a5;BÖ{ÈTåé¨¥}ÿ2´qÄê7DÿmF+röö>½Úú÷u'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #36
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #109
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
    //   68: ldc ']S[mT&¹ÊÈ}ÎWþ fø\\f'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #91
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
    //   129: putstatic burp/Zrv4.a : [Ljava/lang/String;
    //   132: bipush #16
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zrv4.b : [Ljava/lang/String;
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
    //   212: bipush #13
    //   214: goto -> 244
    //   217: bipush #87
    //   219: goto -> 244
    //   222: bipush #92
    //   224: goto -> 244
    //   227: bipush #8
    //   229: goto -> 244
    //   232: bipush #81
    //   234: goto -> 244
    //   237: bipush #92
    //   239: goto -> 244
    //   242: bipush #14
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
    int i = (paramInt1 ^ 0x414F) & 0xFFFF;
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
      char c = '§';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrv4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */