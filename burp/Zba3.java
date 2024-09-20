package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Collection;
import java.util.Set;
import javax.swing.ButtonGroup;
import net.portswigger.Zqf;
import net.portswigger.Zsy;
import net.portswigger.Zuh;

class Zba3 extends Zbv5 implements Ztbm {
  private final Zgb6 ZD;
  
  private final Zkl6 Zn;
  
  private final Ze_7 ZA;
  
  private final Ztwv ZV;
  
  private final Zr_4 Zt;
  
  private final Zrgd ZP;
  
  private final Zsy ZU;
  
  private final Zr1m Zz;
  
  private final Set<String> ZO;
  
  private Zm99 Zy;
  
  private Zm99 ZI;
  
  private Zm99 ZS;
  
  private ButtonGroup ZR;
  
  private Zzdy ZL;
  
  private Ze01 Zc;
  
  private Zm9v Zv;
  
  private Zm9v ZY;
  
  private Zmg2 Zx;
  
  private Zmg2 ZQ;
  
  private Zmg2 Z_;
  
  private Zg85 Zi;
  
  private Zg85 Zq;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zba3(Zgb6 paramZgb6, Zkl6 paramZkl6, Ze_7 paramZe_7, Ztwv paramZtwv, Zr_4 paramZr_4, Zrgd paramZrgd, Zsy paramZsy, Zr1m paramZr1m) {
    Zuh.Zv((paramZgb6 != null), Zqf.Zv, 4L);
    Zuh.Zv((paramZe_7 != null), Zqf.Zv, 2L);
    Zuh.Zv((paramZr_4 != null), Zqf.Zv, 3L);
    this.ZD = paramZgb6;
    this.Zn = paramZkl6;
    this.ZA = paramZe_7;
    this.ZV = paramZtwv;
    this.Zt = paramZr_4;
    this.ZP = paramZrgd;
    this.ZU = paramZsy;
    this.Zz = paramZr1m;
    ZCq();
    this.ZO = Set.of(Zjd(), a(-27157, 12799), a(-27163, 28896), a(-27152, 6551), a(-27156, 22234), a(-27165, -26594), a(-27145, 4849), a(-27162, -13479));
    setName(a(-27150, -6311));
    this.Zx.setName(a(-27155, 30654));
    this.ZQ.setName(a(-27167, 9774));
  }
  
  public String Zjd() {
    return a(-27148, 7119);
  }
  
  public String ZjS() {
    return a(-27147, -9506);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.ZP(a(-27153, -25526), Zk97.DESKTOP_SETTINGS_TOOLS_COLLABORATOR_BURP_COLLABORATOR_SERVER, this.Zz, new String[] { a(-27168, 3518) });
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.ZO;
  }
  
  public void Zt2() {
    this.Zi.setText(this.ZD.ZUV());
    this.Zv.setVisible(false);
    this.ZY.setVisible(false);
    this.Zq.setText(this.ZD.ZUT());
    this.ZL.setSelected(this.ZD.ZUv());
    int i = this.ZD.ZUY();
    this.Zx.setSelected((i == 0));
    this.ZQ.setSelected((i == 1));
    this.Z_.setSelected((i == 2));
    ZG(i);
  }
  
  private void ZG(int paramInt) {
    this.Zc.setEnabled((paramInt != 1));
    this.ZL.setEnabled((paramInt != 1));
    this.Zi.Zt((paramInt == 2));
    this.Zq.Zt((paramInt == 2));
  }
  
  private Zkck Zh(String paramString) {
    return (new Zx6g(paramString)).ZV();
  }
  
  private Zkck Zl(String paramString) {
    return (new Zx6g(paramString)).ZN();
  }
  
  private void ZCJ() {
    Zes1 zes1 = this.ZD.ZU0();
    if (!zes1.ZT)
      return; 
    Zl0b zl0b = new Zl0b(Zt2m.ZF(this));
    zl0b.setVisible(true);
    this.ZV.Zx(new Zep5(this.ZA, this.Zn.ZG(), this.Zn.Zj(), this.Zt, this.Zn.Zs(), zes1, zl0b, this.Zn.ZB(), this.ZP, this.ZU, this.Zn.ZH()));
  }
  
  public boolean ZQA() {
    return !this.ZD.ZU3();
  }
  
  public void ZO(boolean paramBoolean) {
    this.ZD.ZdC(!paramBoolean);
    Zt2();
  }
  
  private void ZCq() {
    this.ZR = new ButtonGroup();
    this.Zx = new Zmg2();
    this.ZQ = new Zmg2();
    this.Z_ = new Zmg2();
    this.Zy = new Zm99();
    this.ZI = new Zm99();
    this.ZS = new Zm99();
    this.Zq = new Zg85();
    this.Zi = new Zg85();
    this.Zc = new Ze01();
    this.ZL = new Zzdy();
    this.Zv = new Zm9v();
    this.ZY = new Zm9v();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZR.add(this.Zx);
    this.Zx.setText(a(-27164, 30241));
    this.Zx.addActionListener(new Zgji(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zx, gridBagConstraints);
    this.ZR.add(this.ZQ);
    this.ZQ.setText(a(-27159, 6699));
    this.ZQ.addActionListener(new Zzsu(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    add(this.ZQ, gridBagConstraints);
    this.ZR.add(this.Z_);
    this.Z_.setText(a(-27166, -25562));
    this.Z_.addActionListener(new Zeb0(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 5, 0);
    add(this.Z_, gridBagConstraints);
    this.Zy.setText(a(-27151, 30701));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    add(this.Zy, gridBagConstraints);
    this.ZI.setText(a(-27161, -16114));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    add(this.ZI, gridBagConstraints);
    this.ZS.setText(a(-27146, 9936));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    add(this.ZS, gridBagConstraints);
    this.Zq.setColumns(30);
    this.Zq.addKeyListener(new Zrnn(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    add(this.Zq, gridBagConstraints);
    this.Zi.setColumns(30);
    this.Zi.addKeyListener(new Zrdr(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    add(this.Zi, gridBagConstraints);
    this.Zc.setText(a(-27149, -22533));
    this.Zc.addActionListener(new Ze_a(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.Zc, gridBagConstraints);
    this.ZL.setText(a(-27158, -29091));
    this.ZL.addActionListener(new Zzvk(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.ZL, gridBagConstraints);
    this.Zv.setText(a(-27160, -15005));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    add(this.Zv, gridBagConstraints);
    this.ZY.setText(a(-27154, -27290));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    add(this.ZY, gridBagConstraints);
  }
  
  private void ZE(ActionEvent paramActionEvent) {
    this.ZD.Zf(0);
    ZG(0);
  }
  
  private void Zc(ActionEvent paramActionEvent) {
    this.ZD.Zf(1);
    ZG(1);
  }
  
  private void ZC(ActionEvent paramActionEvent) {
    this.ZD.Zf(2);
    ZG(2);
  }
  
  private void Zi(ActionEvent paramActionEvent) {
    this.ZD.Zd1(this.ZL.isSelected());
  }
  
  private void Zd(ActionEvent paramActionEvent) {
    ZCJ();
  }
  
  private void ZC(KeyEvent paramKeyEvent) {
    String str = this.Zi.getText();
    Zkck zkck = Zl(str);
    this.ZY.setVisible(!zkck.Zt);
    this.ZD.ZY(str);
  }
  
  private void Zm(KeyEvent paramKeyEvent) {
    String str = this.Zq.getText();
    Zkck zkck = Zh(str);
    boolean bool = (str.isEmpty() || zkck.Zt) ? true : false;
    this.Zv.setVisible(!bool);
    this.ZD.Zu(str);
  }
  
  static {
    // Byte code:
    //   0: bipush #24
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '3¸ëê×òiÍÍÇ"ËU»ù@]2aÙÓ¸®o Fûv9é@uÁ\\n-fyhDoª/_ã}éº¢¨×ÁMû9L¬>÷ê¡¹À{0(µc+v·\\rêFI\\nYîNÃ¹rîõ"=ßgP|9­MÎúÆ°Iò¡ÑàBiã½O<ë} }\\rÊÃáujÇz)ÜWv=¬ö®ô/#æzcmwhèÉØ)¬ÒÏ@¢IÐÛQøJÐ}¦¡DVä\\n\\nT¹k:õÙ¬Õjx\bºkTîs?O«-µM­N%yû¶ª¨£ðîLòxkzþ2ôç¥k\\rN719kñðû%¬P²°I|8á¡d¦­ß\\fëÎ,Ï°oÿ\\rôP#Ýd¯Zh6-µ\\ræÏDõwqÜ­OÍqë¿~t/ÕO|)¨·4ý?ÞküÚ1»qÜè®kÃY°=H+x4Ä@_âe>!¾"zÞ\óU÷sã©´n¥ @ÈhQEÂ«»gÚõµ#£ùG£'wý|pÔ(wÓ\\féóÐ©Ã>lüÔ¾EñÎX¢&x¡e÷#Ê.¦N\\f°+¹ö¤>¸¹«U0©\\f¿î/lÖ\\f'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #76
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 144
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
    //   68: ldc ';\\rÙ:ÔHê±º\B,7ñ¨]lÆmsd/x³°0ÁÝ=ãNïÁÅÁÃõ¯ÜP6ìFÛ´_h¿dNú ¿àÓ££òa,ÔwÎÆõÏ8÷z¡¤¬ò-iiÌ7òºÄgNWWðâRká´va·¦ì×òêÁÔß:'·ëÅ4í\\r7ïK¯aÞ¤Ô|Bo÷ío#É<ùÃ\\nÇjBKpEý(SÇ÷ð"ÏÍË»°nÂ¾%¶µ¥?Óelù&%/H-D vØ¥y5*}7VqèQa÷ ùGç\\nfv'Ogw«¿¯¥¦S÷ÊxøaZËF¤®ðéÇ^Ñè\\b^\\ncIýª¬³MÊB-Æ-1é@ÓÝÈ¹¢£ÙXyG3iã:>xÒ¨%aê8ÊVý'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: sipush #313
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #117
    //   85: iinc #0, 1
    //   88: aload_2
    //   89: iload_0
    //   90: dup
    //   91: iload_1
    //   92: iadd
    //   93: invokevirtual substring : (II)Ljava/lang/String;
    //   96: iconst_0
    //   97: goto -> 144
    //   100: aload #5
    //   102: swap
    //   103: iload_3
    //   104: iinc #3, 1
    //   107: swap
    //   108: aastore
    //   109: iload_0
    //   110: iload_1
    //   111: iadd
    //   112: dup
    //   113: istore_0
    //   114: iload #4
    //   116: if_icmpge -> 128
    //   119: aload_2
    //   120: iload_0
    //   121: invokevirtual charAt : (I)C
    //   124: istore_1
    //   125: goto -> 83
    //   128: aload #5
    //   130: putstatic burp/Zba3.a : [Ljava/lang/String;
    //   133: bipush #24
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Zba3.b : [Ljava/lang/String;
    //   141: goto -> 300
    //   144: dup_x2
    //   145: pop
    //   146: invokevirtual toCharArray : ()[C
    //   149: dup_x1
    //   150: arraylength
    //   151: dup_x2
    //   152: pop
    //   153: iconst_0
    //   154: istore #6
    //   156: dup2_x1
    //   157: pop2
    //   158: dup_x2
    //   159: iconst_1
    //   160: if_icmpgt -> 260
    //   163: dup2
    //   164: swap
    //   165: iload #6
    //   167: dup2_x1
    //   168: caload
    //   169: swap
    //   170: iload #6
    //   172: bipush #7
    //   174: irem
    //   175: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #74
    //   214: goto -> 244
    //   217: bipush #79
    //   219: goto -> 244
    //   222: bipush #84
    //   224: goto -> 244
    //   227: bipush #61
    //   229: goto -> 244
    //   232: bipush #76
    //   234: goto -> 244
    //   237: bipush #53
    //   239: goto -> 244
    //   242: bipush #22
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 167
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 163
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 100
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF95E3) & 0xFFFF;
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
      byte b1 = 94;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zba3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */