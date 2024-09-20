package burp;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.border.Border;

class Zr7t extends Zrh7 {
  private final List<Zkv6> ZI;
  
  private final Zg85 Zo;
  
  private final List<Zmgq> ZX;
  
  private final Zbqc Zf;
  
  private Ze0q ZT;
  
  private int ZA;
  
  private boolean ZK;
  
  private int Ze = -1;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static Zr7t Zw(Window paramWindow, String paramString, List<Zkv6> paramList) {
    return new Zr7t(paramWindow, a(3542, -27011), paramString, paramList, Zbf6.GREY, false);
  }
  
  static Zr7t Zm(Window paramWindow, Zr6e paramZr6e, List<Zkv6> paramList) {
    return new Zr7t(paramWindow, a(3544, 3544), paramZr6e.ZyV(), paramList, paramZr6e.Zyd(), true);
  }
  
  private Zr7t(Window paramWindow, String paramString1, String paramString2, List<Zkv6> paramList, Zbf6 paramZbf6, boolean paramBoolean) {
    super(paramWindow, true, Zzv7.REPEATER_NEW_TAB_GROUP_DIALOG);
    this.ZI = paramList;
    this.ZX = Zz();
    this.Zo = new Zg85();
    setTitle(paramString1);
    this.ZA = (int)paramList.stream().filter(Zkv6::ZU).count();
    this.Zf = new Zbqc(new GridLayout(0, 1, 0, 4));
    Zbqc zbqc1 = new Zbqc(new GridBagLayout());
    Zbqc zbqc2 = Zl(paramString2);
    Zbqc zbqc3 = Z_();
    Zbqc zbqc4 = Zn(paramZbf6);
    Zbqc zbqc5 = ZK(paramBoolean);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.anchor = 23;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(10, 10, 10, 10);
    zbqc1.add(zbqc2, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.fill = 2;
    zbqc1.add(new Zem9(), gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    gridBagConstraints.insets = new Insets(10, 10, 0, 10);
    zbqc1.add(zbqc3, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.fill = 2;
    zbqc1.add(new Zem9(), gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(5, 10, 5, 10);
    zbqc1.add(zbqc4, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridy = 5;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.fill = 2;
    zbqc1.add(new Zem9(), gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 22;
    gridBagConstraints.insets = new Insets(5, 5, 5, 5);
    zbqc1.add(zbqc5, gridBagConstraints);
    setLayout(new BorderLayout());
    add(zbqc1, a(3536, 28077));
    Zmse.Zf(this, 50, 25);
    pack();
    paramList.stream().filter(Zkv6::ZU).findFirst().ifPresent(this::lambda$new$0);
    Zq(paramWindow);
  }
  
  protected void processWindowEvent(WindowEvent paramWindowEvent) {
    if (paramWindowEvent.getID() == 201)
      this.ZK = true; 
    super.processWindowEvent(paramWindowEvent);
  }
  
  boolean ZC() {
    return this.ZK;
  }
  
  String Zr() {
    return this.Zo.getText();
  }
  
  Zbf6 Zx() {
    return this.ZX.stream().filter(AbstractButton::isSelected).map(Zmgq::Zw).findFirst().orElse(Zbf6.GREY);
  }
  
  private Zbqc Zl(String paramString) {
    Zm99 zm99 = new Zm99(a(3541, -19453));
    this.Zo.setName(a(3537, 5644));
    this.Zo.setText(paramString);
    this.Zo.getDocument().addDocumentListener(new Zt5d(this));
    Zbqc zbqc = new Zbqc(new BorderLayout(0, 10));
    zbqc.add(zm99, a(3543, -9204));
    zbqc.add(this.Zo, a(3551, -1692));
    return zbqc;
  }
  
  private Zbqc Z_() {
    Zm99 zm99 = new Zm99(a(3548, 27095));
    byte b = 0;
    int i = Zsob.Zl();
    while (b < this.ZI.size()) {
      Zkv6 zkv6 = this.ZI.get(b);
      zkv6.ZW.addActionListener(new Zzq8(this, zkv6, b));
      this.Zf.add(zkv6.ZW);
      b++;
      if (i == 0)
        break; 
    } 
    Zbqc zbqc1 = new Zbqc(new BorderLayout());
    zbqc1.add(this.Zf, a(3549, -10909));
    Zbup zbup = new Zbup(zbqc1);
    zbup.setBorder((Border)null);
    Zbqc zbqc2 = new Zbqc(new BorderLayout(0, 10));
    zbqc2.add(zm99, a(3549, -10909));
    zbqc2.add(zbup, a(3536, 28077));
    this.Ze = IntStream.range(0, this.ZI.size()).filter(this::lambda$buildTabSelector$1).findFirst().orElse(-1);
    return zbqc2;
  }
  
  private Zbqc Zn(Zbf6 paramZbf6) {
    // Byte code:
    //   0: new burp/Zbqc
    //   3: dup
    //   4: new java/awt/GridLayout
    //   7: dup
    //   8: iconst_1
    //   9: iconst_0
    //   10: bipush #10
    //   12: iconst_0
    //   13: invokespecial <init> : (IIII)V
    //   16: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   19: astore_2
    //   20: new javax/swing/ButtonGroup
    //   23: dup
    //   24: invokespecial <init> : ()V
    //   27: astore_3
    //   28: aload_0
    //   29: getfield ZX : Ljava/util/List;
    //   32: aload_3
    //   33: aload_2
    //   34: aload_1
    //   35: <illegal opcode> accept : (Ljavax/swing/ButtonGroup;Lburp/Zbqc;Lburp/Zbf6;)Ljava/util/function/Consumer;
    //   40: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   45: aload_2
    //   46: areturn
  }
  
  private Zbqc ZK(boolean paramBoolean) {
    Ze01 ze01 = new Ze01(a(3540, -31419));
    ze01.addActionListener(this::lambda$buildActionPanel$3);
    this.ZT = new Ze0q(paramBoolean ? a(3539, -21597) : a(3550, -13641));
    this.ZT.setEnabled(Zf());
    this.ZT.addActionListener(this::lambda$buildActionPanel$4);
    this.Zo.addActionListener(this::lambda$buildActionPanel$5);
    this.Zo.addKeyListener(new Zb48(this));
    Zbqc zbqc = new Zbqc();
    zbqc.add(ze01);
    zbqc.add(this.ZT);
    return zbqc;
  }
  
  private boolean Zf() {
    return (this.ZA > 0 && !Zr().isBlank());
  }
  
  private void Zj() {
    this.ZK = true;
    setVisible(false);
  }
  
  private void ZZ(boolean paramBoolean) {
    this.ZA += paramBoolean ? 1 : -1;
  }
  
  private void Zm() {
    this.ZT.setEnabled(Zf());
  }
  
  private List<Zmgq> Zz() {
    ArrayList<Zmgq> arrayList = new ArrayList();
    Zbf6[] arrayOfZbf6 = Zbf6.values();
    int j = arrayOfZbf6.length;
    byte b = 0;
    int i = Zsob.ZI();
    while (b < j) {
      Zbf6 zbf6 = arrayOfZbf6[b];
      arrayList.add(new Zmgq(zbf6));
      b++;
      if (i != 0)
        break; 
    } 
    return arrayList;
  }
  
  private void lambda$buildActionPanel$5(ActionEvent paramActionEvent) {
    if (Zf())
      setVisible(false); 
  }
  
  private void lambda$buildActionPanel$4(ActionEvent paramActionEvent) {
    setVisible(false);
  }
  
  private void lambda$buildActionPanel$3(ActionEvent paramActionEvent) {
    Zj();
  }
  
  private static void lambda$buildColourSelector$2(ButtonGroup paramButtonGroup, Zbqc paramZbqc, Zbf6 paramZbf6, Zmgq paramZmgq) {
    paramButtonGroup.add(paramZmgq);
    paramZbqc.add(paramZmgq);
    if (paramZmgq.Zw() == paramZbf6) {
      paramZmgq.setName(a(3538, 18624));
      paramZmgq.setSelected(true);
    } 
  }
  
  private boolean lambda$buildTabSelector$1(int paramInt) {
    return ((Zkv6)this.ZI.get(paramInt)).ZU();
  }
  
  private void lambda$new$0(Zkv6 paramZkv6) {
    this.Zf.scrollRectToVisible(paramZkv6.ZW.getBounds());
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ':Ò~.2·9Jéú¡`aâönéWIvyMömC=õ7]nôê!CFýi_}Áû¥ðmÖsïöE[|³©ÐøbNwõ¬4&&¡ qhöío?ÃýLé§éZ´Í¯XÇ5Ì,×Ñ¸þC®Ên,6Óß¬=3XúxN\\bû6å|'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
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
    //   68: ldc 'ä}HE\\nöË×Á8è½~'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #6
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #54
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
    //   129: putstatic burp/Zr7t.a : [Ljava/lang/String;
    //   132: bipush #13
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zr7t.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
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
    //   212: bipush #73
    //   214: goto -> 243
    //   217: bipush #67
    //   219: goto -> 243
    //   222: bipush #72
    //   224: goto -> 243
    //   227: bipush #31
    //   229: goto -> 243
    //   232: bipush #51
    //   234: goto -> 243
    //   237: bipush #108
    //   239: goto -> 243
    //   242: iconst_2
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xDD4) & 0xFFFF;
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
      byte b1 = 89;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr7t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */