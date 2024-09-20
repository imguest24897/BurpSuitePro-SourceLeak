package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.function.Consumer;
import javax.swing.BorderFactory;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zr74 extends Zrh7 {
  private final Consumer<Zxwh> Zd;
  
  private final Zsvr Zs;
  
  private final Zxwh ZH;
  
  private final Zbyu Zh;
  
  private Zbtk ZB;
  
  private Zm99 ZN;
  
  private Zm99 ZJ;
  
  private Zm99 ZM;
  
  private Zbqc ZA;
  
  private Ze01 Zx;
  
  private Ze01 ZU;
  
  private Zedd Zz;
  
  private Zm2o Zr;
  
  private Zbqc ZS;
  
  private Zm9v Zb;
  
  private Zl8w Zg;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zr74(Component paramComponent, Consumer<Zxwh> paramConsumer, Zm42 paramZm42, Zxwh paramZxwh, Zr_4 paramZr_4) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   5: iconst_1
    //   6: getstatic burp/Zzv7.CONFIG_PANEL_PAYLOAD_PROCESSOR_RULES_POPUP : Lburp/Zzv7;
    //   9: invokespecial <init> : (Ljava/awt/Window;ZLburp/Zzv7;)V
    //   12: aload_0
    //   13: aload_2
    //   14: putfield Zd : Ljava/util/function/Consumer;
    //   17: aload_0
    //   18: new burp/Zsvr
    //   21: dup
    //   22: aload_3
    //   23: invokespecial <init> : (Lburp/Zm42;)V
    //   26: putfield Zs : Lburp/Zsvr;
    //   29: aload_0
    //   30: new burp/Zbyu
    //   33: dup
    //   34: invokespecial <init> : ()V
    //   37: putfield Zh : Lburp/Zbyu;
    //   40: aload_0
    //   41: invokevirtual Z_ : ()V
    //   44: invokestatic ZS : ()[Ljava/lang/String;
    //   47: aload_0
    //   48: getfield Zz : Lburp/Zedd;
    //   51: sipush #15676
    //   54: sipush #30023
    //   57: invokestatic a : (II)Ljava/lang/String;
    //   60: invokevirtual addItem : (Ljava/lang/Object;)V
    //   63: invokestatic values : ()[Lburp/Ze0f;
    //   66: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   69: aload_0
    //   70: <illegal opcode> test : (Lburp/Zr74;)Ljava/util/function/Predicate;
    //   75: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   80: aload_0
    //   81: <illegal opcode> accept : (Lburp/Zr74;)Ljava/util/function/Consumer;
    //   86: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   91: new java/awt/GridBagConstraints
    //   94: dup
    //   95: invokespecial <init> : ()V
    //   98: astore #7
    //   100: aload #7
    //   102: iconst_2
    //   103: putfield gridx : I
    //   106: aload #7
    //   108: iconst_4
    //   109: putfield gridy : I
    //   112: aload #7
    //   114: iconst_3
    //   115: putfield gridheight : I
    //   118: aload #7
    //   120: iconst_2
    //   121: putfield fill : I
    //   124: aload #7
    //   126: bipush #23
    //   128: putfield anchor : I
    //   131: astore #6
    //   133: aload_0
    //   134: getfield ZA : Lburp/Zbqc;
    //   137: aload_0
    //   138: getfield Zh : Lburp/Zbyu;
    //   141: aload #7
    //   143: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   146: aload #4
    //   148: ifnonnull -> 163
    //   151: sipush #15675
    //   154: sipush #22430
    //   157: invokestatic a : (II)Ljava/lang/String;
    //   160: goto -> 172
    //   163: sipush #15672
    //   166: sipush #22955
    //   169: invokestatic a : (II)Ljava/lang/String;
    //   172: astore #8
    //   174: aload_0
    //   175: aload #8
    //   177: invokevirtual setTitle : (Ljava/lang/String;)V
    //   180: aload #4
    //   182: ifnonnull -> 211
    //   185: aload_0
    //   186: aload #5
    //   188: new burp/Ze3s
    //   191: dup
    //   192: invokespecial <init> : ()V
    //   195: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   200: checkcast burp/Zxwh
    //   203: putfield ZH : Lburp/Zxwh;
    //   206: aload #6
    //   208: ifnonnull -> 248
    //   211: aload_0
    //   212: aload #5
    //   214: new burp/Ze3s
    //   217: dup
    //   218: aload #4
    //   220: invokespecial <init> : (Lburp/Zxwh;)V
    //   223: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   228: checkcast burp/Zxwh
    //   231: putfield ZH : Lburp/Zxwh;
    //   234: aload_0
    //   235: getfield Zz : Lburp/Zedd;
    //   238: aload #4
    //   240: invokeinterface ZWG : ()Lburp/Ze0f;
    //   245: invokevirtual setSelectedItem : (Ljava/lang/Object;)V
    //   248: aload_0
    //   249: new burp/Zmi2
    //   252: dup
    //   253: aload_0
    //   254: invokespecial <init> : (Lburp/Zr74;)V
    //   257: invokevirtual addWindowListener : (Ljava/awt/event/WindowListener;)V
    //   260: aload_0
    //   261: bipush #80
    //   263: invokestatic Zb : (Ljava/awt/Component;I)V
    //   266: aload_0
    //   267: invokevirtual pack : ()V
    //   270: aload_0
    //   271: aload_1
    //   272: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   275: invokevirtual Zq : (Ljava/awt/Window;)V
    //   278: aload_0
    //   279: getfield Zz : Lburp/Zedd;
    //   282: sipush #15673
    //   285: sipush #-2260
    //   288: invokestatic a : (II)Ljava/lang/String;
    //   291: invokevirtual setName : (Ljava/lang/String;)V
    //   294: return
  }
  
  private boolean Zq(Ze0f paramZe0f) {
    return Ze0f.REPLACE_PLACEHOLDER_COLLABORATOR_PAYLOAD.equals(paramZe0f) ? true : true;
  }
  
  private void Z_() {
    this.ZA = new Zbqc();
    this.Zg = new Zl8w();
    this.Zr = new Zm2o();
    this.ZS = new Zbqc();
    this.Zx = new Ze01();
    this.ZU = new Ze01();
    this.Zz = new Zedd();
    this.Zb = new Zm9v();
    this.ZN = new Zm99();
    this.ZJ = new Zm99();
    this.ZM = new Zm99();
    setDefaultCloseOperation(2);
    this.ZA.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    this.ZA.setLayout(gridBagLayout);
    this.Zg.setText(a(15674, -9722));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    this.ZA.add(this.Zg, gridBagConstraints);
    this.Zr.Zi(Zk97.DESKTOP_TOOLS_INTRUDER_PAYLOADS_PROCESSING_PAYLOAD_PROCESSING_RULES);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.ZA.add(this.Zr, gridBagConstraints);
    this.ZS.setLayout(new GridLayout(1, 2, 5, 0));
    this.Zx.setText(a(15677, -16133));
    this.Zx.addActionListener(new Zgct(this));
    this.ZS.add(this.Zx);
    this.ZU.setText(a(15679, -15735));
    this.ZU.addActionListener(new Zb0a(this));
    this.ZS.add(this.ZU);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 12;
    gridBagConstraints.weighty = 1.0D;
    this.ZA.add(this.ZS, gridBagConstraints);
    this.Zz.addActionListener(new Zto0(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.ZA.add(this.Zz, gridBagConstraints);
    this.Zb.setText(a(15664, -143));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 23;
    this.ZA.add(this.Zb, gridBagConstraints);
    this.ZN.setText(" ");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(20, 0, 0, 0);
    this.ZA.add(this.ZN, gridBagConstraints);
    this.ZJ.setText(" ");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(20, 0, 0, 0);
    this.ZA.add(this.ZJ, gridBagConstraints);
    this.ZM.setText(" ");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(20, 0, 0, 0);
    this.ZA.add(this.ZM, gridBagConstraints);
    getContentPane().add(this.ZA, a(15678, 21927));
    pack();
  }
  
  private void ZC(ActionEvent paramActionEvent) {
    try {
      if (this.ZH.ZWG() == null) {
        this.Zb.setText(a(15665, -7154));
        return;
      } 
    } catch (Zsx7 zsx7) {
      throw a(null);
    } 
    try {
      this.ZB.ZB();
    } catch (Zsx7 zsx7) {
      Zah.Zl(zsx7, Zk_.USER_ERROR);
      this.Zb.setText(zsx7.getMessage());
      return;
    } 
    setVisible(false);
    dispose();
    this.Zd.accept(this.ZH);
  }
  
  private void Zp(ActionEvent paramActionEvent) {
    setVisible(false);
    dispose();
    this.Zd.accept(null);
  }
  
  private void ZE(ActionEvent paramActionEvent) {
    String[] arrayOfString = Zbb7.ZS();
    this.Zb.setText("");
    if (this.ZH == null)
      return; 
    Object object = this.Zz.getSelectedItem();
    if (object instanceof Ze0f) {
      Ze0f ze0f = (Ze0f)object;
      this.ZH.ZA(ze0f);
      this.ZB = this.Zs.Zi(this.ZH).Zi();
      this.Zh.ZP(this.ZB);
      if (arrayOfString == null) {
        this.ZH.ZA(null);
        this.Zh.Zp();
        this.ZB = null;
        return;
      } 
      return;
    } 
    this.ZH.ZA(null);
    this.Zh.Zp();
    this.ZB = null;
  }
  
  private void lambda$new$0(Ze0f paramZe0f) {
    this.Zz.addItem(paramZe0f);
  }
  
  private static Zsx7 a(Zsx7 paramZsx7) {
    return paramZsx7;
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'pR{ÌHá÷{Ní:òå°ùzÓà¡µ;ré¸µ¬y²jîÍðù¤ÔÌrÇÙùä9©XZU_Ì?®\\tgBySWx<S\\f|1p=¶oÚ8ÜÊR?´¢ðà\\rßh¼ïèé{éÏpRÇ}/>¾âÅäÚjÍ¢´{Çßê¿±¹K¹K.n)ñZÒÚlè/ ô7æI'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #29
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #88
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
    //   68: ldc 'g\\t¨`Yt¼ÝWüMõV!,Ä:iÚ¡ß'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #25
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #80
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
    //   129: putstatic burp/Zr74.a : [Ljava/lang/String;
    //   132: bipush #10
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zr74.b : [Ljava/lang/String;
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
    //   212: bipush #34
    //   214: goto -> 244
    //   217: bipush #46
    //   219: goto -> 244
    //   222: bipush #101
    //   224: goto -> 244
    //   227: bipush #49
    //   229: goto -> 244
    //   232: bipush #57
    //   234: goto -> 244
    //   237: bipush #36
    //   239: goto -> 244
    //   242: bipush #21
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
    int i = (paramInt1 ^ 0x3D39) & 0xFFFF;
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
      byte b1 = 4;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr74.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */