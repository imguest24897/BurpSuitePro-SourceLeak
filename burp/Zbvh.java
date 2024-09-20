package burp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import javax.swing.BorderFactory;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;

public class Zbvh extends Zbqc implements Zzyl {
  private final ListModel<Zx02> Zj;
  
  private final ListSelectionModel ZI;
  
  private final Zed0 ZH;
  
  private final Zl5i ZY;
  
  private Ze01 Zk;
  
  private Ze0q Zf;
  
  private Zbqc ZN;
  
  private Zbqc Zg;
  
  private Zbqc ZO;
  
  private Zbqc Zx;
  
  private Zbup Zs;
  
  private Zem9 ZC;
  
  private Zmyn Zh;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbvh(Zgb6 paramZgb6, Zkc0 paramZkc0, Zed0 paramZed0) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_3
    //   6: putfield ZH : Lburp/Zed0;
    //   9: new burp/Zmm
    //   12: dup
    //   13: new burp/Zgig
    //   16: dup
    //   17: invokespecial <init> : ()V
    //   20: invokespecial <init> : (Lburp/Zgig;)V
    //   23: astore #4
    //   25: aload_0
    //   26: new burp/Zlxv
    //   29: dup
    //   30: aload #4
    //   32: invokespecial <init> : (Lburp/Zmm;)V
    //   35: putfield Zj : Ljavax/swing/ListModel;
    //   38: aload_0
    //   39: invokevirtual ZQ : ()V
    //   42: new burp/Zms_
    //   45: dup
    //   46: aload_0
    //   47: getfield Zj : Ljavax/swing/ListModel;
    //   50: invokespecial <init> : (Ljavax/swing/ListModel;)V
    //   53: astore #5
    //   55: aload #5
    //   57: bipush #10
    //   59: bipush #10
    //   61: bipush #10
    //   63: bipush #10
    //   65: invokestatic createEmptyBorder : (IIII)Ljavax/swing/border/Border;
    //   68: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   71: aload #5
    //   73: getstatic burp/Zlkk.TEXT_EDITOR_BACKGROUND : Lburp/Zlkk;
    //   76: invokevirtual Zc : (Lburp/Zlkk;)V
    //   79: aload_0
    //   80: getfield Zs : Lburp/Zbup;
    //   83: aload #5
    //   85: invokevirtual setViewportView : (Ljava/awt/Component;)V
    //   88: new burp/Zm99
    //   91: dup
    //   92: sipush #-16012
    //   95: sipush #6863
    //   98: invokestatic a : (II)Ljava/lang/String;
    //   101: getstatic burp/Zeuf.OPEN_BOOK : Lburp/Zeuf;
    //   104: getstatic burp/Zlkk.FOREGROUND : Lburp/Zlkk;
    //   107: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   110: getstatic burp/Zmcx.LARGE_LINE_SIZE : Lburp/Zmcx;
    //   113: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   116: invokevirtual Z_ : ()Lburp/Ze9n;
    //   119: invokespecial <init> : (Ljava/lang/String;Ljavax/swing/Icon;)V
    //   122: astore #6
    //   124: aload #6
    //   126: getstatic burp/Zt00.TITLE_BOLD_FONT : Lburp/Zt00;
    //   129: invokevirtual ZE : (Lburp/Zt00;)V
    //   132: aload #6
    //   134: getstatic burp/Zlkk.BURP_TITLE : Lburp/Zlkk;
    //   137: invokevirtual Ze : (Lburp/Zlkk;)V
    //   140: aload_0
    //   141: getfield Zh : Lburp/Zmyn;
    //   144: aload #6
    //   146: invokevirtual Zv : (Ljava/awt/Component;)V
    //   149: new burp/Zm99
    //   152: dup
    //   153: sipush #-16011
    //   156: sipush #-23840
    //   159: invokestatic a : (II)Ljava/lang/String;
    //   162: getstatic burp/Zeuf.EYE : Lburp/Zeuf;
    //   165: getstatic burp/Zlkk.FOREGROUND : Lburp/Zlkk;
    //   168: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   171: getstatic burp/Zmcx.LARGE_LINE_SIZE : Lburp/Zmcx;
    //   174: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   177: invokevirtual Z_ : ()Lburp/Ze9n;
    //   180: invokespecial <init> : (Ljava/lang/String;Ljavax/swing/Icon;)V
    //   183: astore #7
    //   185: aload #7
    //   187: getstatic burp/Zt00.TITLE_BOLD_FONT : Lburp/Zt00;
    //   190: invokevirtual ZE : (Lburp/Zt00;)V
    //   193: aload #7
    //   195: getstatic burp/Zlkk.BURP_TITLE : Lburp/Zlkk;
    //   198: invokevirtual Ze : (Lburp/Zlkk;)V
    //   201: aload_0
    //   202: getfield Zh : Lburp/Zmyn;
    //   205: aload #7
    //   207: invokevirtual ZG : (Ljava/awt/Component;)V
    //   210: aload_0
    //   211: getfield Zf : Lburp/Ze0q;
    //   214: getstatic burp/Zeuf.ADD_CIRCLE : Lburp/Zeuf;
    //   217: getstatic burp/Zlkk.PRIMARY_BUTTON_FOREGROUND : Lburp/Zlkk;
    //   220: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   223: getstatic burp/Zmcx.LINE_SIZE : Lburp/Zmcx;
    //   226: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   229: invokevirtual Z_ : ()Lburp/Ze9n;
    //   232: invokevirtual setIcon : (Ljavax/swing/Icon;)V
    //   235: aload_0
    //   236: aload_2
    //   237: invokestatic Zb : ()Lburp/Ztu6;
    //   240: iconst_4
    //   241: invokevirtual ZD : (I)Lburp/Ztu6;
    //   244: iconst_1
    //   245: invokevirtual ZK : (Z)Lburp/Ztu6;
    //   248: iconst_0
    //   249: invokevirtual Z_ : (Z)Lburp/Ztu6;
    //   252: invokevirtual ZP : ()Lburp/Zztr;
    //   255: new burp/Zzn5
    //   258: dup
    //   259: aload_1
    //   260: invokespecial <init> : (Lburp/Zgb6;)V
    //   263: <illegal opcode> run : ()Ljava/lang/Runnable;
    //   268: invokevirtual ZH : (Lburp/Zztr;Lburp/Zr5s;Ljava/lang/Runnable;)Lburp/Zl59;
    //   271: putfield ZY : Lburp/Zl5i;
    //   274: aload_0
    //   275: aload #5
    //   277: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   280: putfield ZI : Ljavax/swing/ListSelectionModel;
    //   283: aload_0
    //   284: getfield ZI : Ljavax/swing/ListSelectionModel;
    //   287: new burp/Zel8
    //   290: dup
    //   291: aload_0
    //   292: getfield Zj : Ljavax/swing/ListModel;
    //   295: aload_0
    //   296: getfield ZI : Ljavax/swing/ListSelectionModel;
    //   299: aload_0
    //   300: getfield ZY : Lburp/Zl5i;
    //   303: invokespecial <init> : (Ljavax/swing/ListModel;Ljavax/swing/ListSelectionModel;Lburp/Zl5i;)V
    //   306: invokeinterface addListSelectionListener : (Ljavax/swing/event/ListSelectionListener;)V
    //   311: aload_0
    //   312: getfield ZI : Ljavax/swing/ListSelectionModel;
    //   315: iconst_0
    //   316: iconst_0
    //   317: invokeinterface setSelectionInterval : (II)V
    //   322: aload #5
    //   324: new burp/Zbvm
    //   327: dup
    //   328: invokespecial <init> : ()V
    //   331: invokevirtual setCellRenderer : (Ljavax/swing/ListCellRenderer;)V
    //   334: aload_0
    //   335: getfield Zh : Lburp/Zmyn;
    //   338: sipush #-16015
    //   341: sipush #-21067
    //   344: invokestatic a : (II)Ljava/lang/String;
    //   347: aload_0
    //   348: aload #5
    //   350: <illegal opcode> propertyChange : (Lburp/Zbvh;Lburp/Zms_;)Ljava/beans/PropertyChangeListener;
    //   355: invokevirtual addPropertyChangeListener : (Ljava/lang/String;Ljava/beans/PropertyChangeListener;)V
    //   358: aload_0
    //   359: getfield Zh : Lburp/Zmyn;
    //   362: new burp/Zkdy
    //   365: dup
    //   366: aload_0
    //   367: invokespecial <init> : (Lburp/Zbvh;)V
    //   370: invokevirtual addComponentListener : (Ljava/awt/event/ComponentListener;)V
    //   373: aload_0
    //   374: <illegal opcode> run : (Lburp/Zbvh;)Ljava/lang/Runnable;
    //   379: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   382: return
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    return this.ZY.ZI(paramInt, paramObject);
  }
  
  private void ZQ() {
    this.Zh = new Zmyn();
    this.Zx = new Zbqc();
    this.Zs = new Zbup();
    this.ZO = new Zbqc();
    this.Zg = new Zbqc();
    this.ZC = new Zem9();
    this.ZN = new Zbqc();
    this.Zk = new Ze01();
    this.Zf = new Ze0q();
    setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    setLayout(new GridBagLayout());
    this.Zx.setLayout(new BorderLayout());
    this.Zs.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    this.Zx.add(this.Zs, a(-16016, 7522));
    this.Zh.setLeftComponent(this.Zx);
    this.ZO.setLayout(new BorderLayout());
    this.Zg.setLayout(new BorderLayout());
    this.ZO.add(this.Zg, a(-16013, -12374));
    this.Zh.setRightComponent(this.ZO);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zh, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.ZC, gridBagConstraints);
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0 };
    this.ZN.setLayout(gridBagLayout);
    this.Zk.setText(a(-16010, 2896));
    this.Zk.addActionListener(new Zew5(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 26;
    this.ZN.add(this.Zk, gridBagConstraints);
    this.Zf.setText(a(-16014, -9855));
    this.Zf.addActionListener(new Zxn_(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 26;
    this.ZN.add(this.Zf, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 26;
    gridBagConstraints.insets = new Insets(20, 20, 20, 20);
    add(this.ZN, gridBagConstraints);
  }
  
  private void ZH(ActionEvent paramActionEvent) {
    SwingUtilities.windowForComponent(this).setVisible(false);
  }
  
  private void Zy(ActionEvent paramActionEvent) {
    Zx02 zx02 = null;
    if ((this.ZI.getSelectedIndices()).length == 1) {
      int i = this.ZI.getMinSelectionIndex();
      zx02 = this.Zj.getElementAt(i);
    } 
    String str = (zx02 == null) ? "" : zx02.ZtQ();
    this.ZH.ZC(Zt2m.ZF(this), str);
    SwingUtilities.windowForComponent(this).setVisible(false);
  }
  
  private void lambda$new$2() {
    this.Zg.add(this.ZY.ZiB());
  }
  
  private void lambda$new$1(Zms_ paramZms_, PropertyChangeEvent paramPropertyChangeEvent) {
    paramZms_.setPreferredSize(new Dimension(this.Zh.getDividerLocation(), (paramZms_.getPreferredSize()).height));
  }
  
  private static void lambda$new$0() {}
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Õ\\t½Û% <x[eã^oòÉºxD`¨ énCídaúÜ»ÏTÄ³Ï-¢ÆX°@®ãF0½'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #63
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
    //   68: ldc 'ìÍ×ç%&µÎG\\n'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #7
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #60
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
    //   129: putstatic burp/Zbvh.a : [Ljava/lang/String;
    //   132: bipush #7
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbvh.b : [Ljava/lang/String;
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
    //   212: bipush #109
    //   214: goto -> 244
    //   217: bipush #44
    //   219: goto -> 244
    //   222: bipush #55
    //   224: goto -> 244
    //   227: bipush #26
    //   229: goto -> 244
    //   232: bipush #106
    //   234: goto -> 244
    //   237: bipush #72
    //   239: goto -> 244
    //   242: bipush #28
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
    int i = (paramInt1 ^ 0xFFFFC170) & 0xFFFF;
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
      byte b1 = 106;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbvh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */