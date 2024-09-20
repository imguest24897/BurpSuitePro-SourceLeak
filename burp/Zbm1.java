package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ButtonGroup;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zbm1 extends Zbv5 {
  private final Zgvc Zm;
  
  private final Zz28 Zy;
  
  private final Zbnt ZI;
  
  private Zm99 Zk;
  
  private Zm99 Z_;
  
  private ButtonGroup ZG;
  
  private Zzdy Zx;
  
  private Zl8w ZT;
  
  private Zm2o ZD;
  
  private Zm99 Zl;
  
  private Zm99 ZQ;
  
  private Zm99 ZH;
  
  private Zm9v ZP;
  
  private Zm9v ZY;
  
  private Zbkc ZA;
  
  private Zmg2 ZB;
  
  private Zmg2 ZX;
  
  private Zmg2 Zq;
  
  private Zgff Zz;
  
  private Zgff Zu;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbm1(Zgvc paramZgvc, Zlit paramZlit, Zz28 paramZz28, Zbnt paramZbnt) {
    this.Zm = paramZgvc;
    this.Zy = paramZz28;
    this.ZI = paramZbnt;
    Ze();
    this.ZY.setVisible(false);
    this.Zu.setName(a(-1114, -13023));
    this.Zu.setText(paramZlit.toString());
    ZA();
    ZQ((KeyEvent)null);
  }
  
  Zlit ZL() {
    try {
      String str = this.Zu.getText();
      if (!str.endsWith("/"))
        str = str + "/"; 
      Zax zax = new Zax(new URL(str), this.ZI);
      try {
        this.Zm.ZD(zax.toString());
        this.Zu.setText(zax.toString());
        if (!this.Zy.ZG(zax) && !Zx6o.ZY(this.Zm.ZB(), a(-1112, -17772)))
          return null; 
      } catch (MalformedURLException malformedURLException) {
        throw a(null);
      } 
      this.Zu.setEnabled(false);
      return zax;
    } catch (MalformedURLException|Zxg5|Zxgy malformedURLException) {
      Zah.Zl(malformedURLException, Zk_.USER_ERROR);
      this.ZY.setVisible(true);
      return null;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      this.ZY.setVisible(true);
      return null;
    } 
  }
  
  private void ZA() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: invokestatic Zb : ()[Lburp/Zbqc;
    //   5: iconst_0
    //   6: istore_3
    //   7: astore_1
    //   8: aload_0
    //   9: getfield ZX : Lburp/Zmg2;
    //   12: invokevirtual isSelected : ()Z
    //   15: ifeq -> 26
    //   18: iconst_1
    //   19: istore_2
    //   20: iconst_1
    //   21: istore_3
    //   22: aload_1
    //   23: ifnonnull -> 54
    //   26: aload_0
    //   27: getfield Zq : Lburp/Zmg2;
    //   30: invokevirtual isSelected : ()Z
    //   33: ifeq -> 42
    //   36: iconst_1
    //   37: istore_2
    //   38: aload_1
    //   39: ifnonnull -> 54
    //   42: aload_0
    //   43: getfield ZB : Lburp/Zmg2;
    //   46: invokevirtual isSelected : ()Z
    //   49: ifeq -> 54
    //   52: iconst_1
    //   53: istore_3
    //   54: aload_0
    //   55: getfield Zx : Lburp/Zzdy;
    //   58: iload_3
    //   59: invokevirtual setEnabled : (Z)V
    //   62: aload_0
    //   63: getfield Zz : Lburp/Zgff;
    //   66: iload_3
    //   67: ifeq -> 84
    //   70: aload_0
    //   71: getfield Zx : Lburp/Zzdy;
    //   74: invokevirtual isSelected : ()Z
    //   77: ifeq -> 84
    //   80: iconst_1
    //   81: goto -> 85
    //   84: iconst_0
    //   85: invokevirtual setEnabled : (Z)V
    //   88: aload_0
    //   89: getfield Zm : Lburp/Zgvc;
    //   92: iload_2
    //   93: iload_3
    //   94: invokevirtual ZO : (ZZ)V
    //   97: aload_0
    //   98: getfield Zm : Lburp/Zgvc;
    //   101: aload_0
    //   102: getfield Zx : Lburp/Zzdy;
    //   105: invokevirtual isSelected : ()Z
    //   108: invokevirtual Zx : (Z)V
    //   111: return
  }
  
  private void Ze() {
    this.ZG = new ButtonGroup();
    this.ZQ = new Zm99();
    this.ZX = new Zmg2();
    this.Zq = new Zmg2();
    this.ZB = new Zmg2();
    this.Zu = new Zgff();
    this.Zl = new Zm99();
    this.Zx = new Zzdy();
    this.ZH = new Zm99();
    this.Zz = new Zgff();
    this.ZP = new Zm9v();
    this.ZY = new Zm9v();
    this.Zk = new Zm99();
    this.Z_ = new Zm99();
    this.ZT = new Zl8w();
    this.ZA = new Zbkc();
    this.ZD = new Zm2o();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZQ.setText(a(-1113, 20454));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.ZQ, gridBagConstraints);
    this.ZG.add(this.ZX);
    this.ZX.setSelected(true);
    this.ZX.setText(a(-1110, -31629));
    this.ZX.addActionListener(new Zlyg(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.ZX, gridBagConstraints);
    this.ZG.add(this.Zq);
    this.Zq.setText(a(-1111, 4569));
    this.Zq.addActionListener(new Zg4v(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 1280;
    add(this.Zq, gridBagConstraints);
    this.ZG.add(this.ZB);
    this.ZB.setText(a(-1116, 10536));
    this.ZB.addActionListener(new Zx5b(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 1280;
    add(this.ZB, gridBagConstraints);
    this.Zu.setColumns(25);
    this.Zu.ZH(Zlw9.URL);
    this.Zu.addKeyListener(new Zrj6(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 1280;
    add(this.Zu, gridBagConstraints);
    this.Zl.setText(a(-1108, -18233));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    add(this.Zl, gridBagConstraints);
    this.Zx.setSelected(true);
    this.Zx.setText(a(-1119, -15561));
    this.Zx.addActionListener(new Zrin(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 1280;
    add(this.Zx, gridBagConstraints);
    this.ZH.setText(a(-1118, -11738));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = 1280;
    add(this.ZH, gridBagConstraints);
    this.Zz.setColumns(5);
    this.Zz.setText(a(-1115, -3927));
    this.Zz.ZH(Zlw9.NUMBER);
    this.Zz.addKeyListener(new Zk2w(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 10;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = 1280;
    add(this.Zz, gridBagConstraints);
    this.ZP.setText(a(-1105, -2564));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 12;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = 1280;
    add(this.ZP, gridBagConstraints);
    this.ZY.setHorizontalAlignment(4);
    this.ZY.setText(a(-1106, 19138));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 14;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    add(this.ZY, gridBagConstraints);
    this.Zk.setText(a(-1117, 27666));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 12;
    add(this.Zk, gridBagConstraints);
    this.Z_.setText(a(-1109, -29364));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 14;
    add(this.Z_, gridBagConstraints);
    this.ZT.setText(a(-1120, 29825));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 13;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZT, gridBagConstraints);
    this.ZA.Zx(a(-1107, -10181));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 13;
    gridBagConstraints.anchor = 21;
    add(this.ZA, gridBagConstraints);
    this.ZD.Zi(Zk97.DESKTOP_FUNCTIONS_CONTENT_DISCOVERY_TARGET);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.ZD, gridBagConstraints);
  }
  
  private void ZC(ActionEvent paramActionEvent) {
    ZA();
  }
  
  private void Zb(ActionEvent paramActionEvent) {
    ZA();
  }
  
  private void ZN(ActionEvent paramActionEvent) {
    ZA();
  }
  
  private void Zh(ActionEvent paramActionEvent) {
    ZA();
  }
  
  private void ZQ(KeyEvent paramKeyEvent) {
    try {
      int i = Integer.parseInt(this.Zz.getText());
      try {
        if (i <= 0)
          throw new Exception(); 
      } catch (Exception exception) {
        throw a(null);
      } 
      this.ZP.setVisible(false);
      if (i > 32767)
        i = 32767; 
      this.Zm.Zc((short)i);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.USER_ERROR);
      this.ZP.setVisible(true);
    } 
  }
  
  private void Zp(KeyEvent paramKeyEvent) {
    this.ZY.setVisible(false);
    this.Zm.ZD(this.Zu.getText());
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ì#±xËcº ×åVr?Zý*³úkµeHÝðñAü9\\f÷xëKÏÛáig6¿M&.ì\\t¢[\\n«_õ¾NÐoYYép}Õå\\tUDà,Ý®M7¼¢O°Ã®ä»\\rYòTpú±KÆönÔ|Þ\\nãËäWûÍY­àxÿ*;?é"(Bµûm±èÌg± \\trL"Çw1B©f\:v¥¿\\t¸lA\\tGÛ1*(´Gt¥Úò\tCrïémN705AZ%J¾Êc,Xô¥ù>/3¯éõ·%ÌÝ¢áÏÉ"aûíOóôtMæz»P×qbjBÃ­\\bNScÅ'Ä4ÁëU«cVJ7£/^ÕÉãÙÛOD½Z\\ní½ïçMÀ6)\\rWßLH³uq3p«¤©\\rÖ àh=ç*'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #10
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #124
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
    //   68: ldc 'éên¡»çBV50Q¡Ê8E'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #16
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #64
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
    //   129: putstatic burp/Zbm1.a : [Ljava/lang/String;
    //   132: bipush #16
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbm1.b : [Ljava/lang/String;
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
    //   212: bipush #75
    //   214: goto -> 244
    //   217: bipush #124
    //   219: goto -> 244
    //   222: bipush #42
    //   224: goto -> 244
    //   227: bipush #13
    //   229: goto -> 244
    //   232: bipush #88
    //   234: goto -> 244
    //   237: bipush #10
    //   239: goto -> 244
    //   242: bipush #122
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
    int i = (paramInt1 ^ 0xFFFFFBA2) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbm1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */