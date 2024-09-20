package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.io.File;
import java.util.List;
import javafx.collections.ObservableList;
import net.portswigger.Zkb;
import net.portswigger.Zm2;

class Zbys extends Zbqc {
  private final Object Zb;
  
  private final Zbws Zr;
  
  private final Zz0n ZL;
  
  private final Zbbv Zc;
  
  private final String ZW;
  
  private final Zr_4 Zg;
  
  private final Zt4u Zh;
  
  private ObservableList<Zstu> Zd;
  
  private Zefg<Zstu> Zx;
  
  private Zmyw ZA;
  
  private Zm99 ZK;
  
  private Ze01 ZM;
  
  private Ze01 ZF;
  
  private Ze01 ZC;
  
  private Ze01 Zm;
  
  private Ze01 ZD;
  
  private Ze01 Zn;
  
  protected Zedd<String> Za;
  
  protected Zbqc Zv;
  
  private Zbup Z_;
  
  private Zgff Zs;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbys(Zz0n paramZz0n, Zt4u paramZt4u, Zbbv paramZbbv, String paramString, Zr_4 paramZr_4, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: new java/lang/Object
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: putfield Zb : Ljava/lang/Object;
    //   15: aload_0
    //   16: aload_1
    //   17: putfield ZL : Lburp/Zz0n;
    //   20: aload_0
    //   21: aload_2
    //   22: putfield Zh : Lburp/Zt4u;
    //   25: invokestatic ZS : ()[Ljava/lang/String;
    //   28: aload_0
    //   29: aload_3
    //   30: putfield Zc : Lburp/Zbbv;
    //   33: aload_0
    //   34: aload #4
    //   36: putfield ZW : Ljava/lang/String;
    //   39: astore #7
    //   41: aload_0
    //   42: aload #5
    //   44: putfield Zg : Lburp/Zr_4;
    //   47: aload_0
    //   48: aload #5
    //   50: getstatic burp/Zstu.Zc : Lburp/Zllg;
    //   53: invokestatic ZV : (Lburp/Zr_4;Lburp/Zeu4;)Lburp/Zefg;
    //   56: putfield Zx : Lburp/Zefg;
    //   59: aload_0
    //   60: new burp/Zg00
    //   63: dup
    //   64: aload_0
    //   65: getfield Zx : Lburp/Zefg;
    //   68: invokespecial <init> : (Ljava/util/List;)V
    //   71: putfield Zd : Ljavafx/collections/ObservableList;
    //   74: aload_0
    //   75: invokevirtual ZL : ()V
    //   78: aload #4
    //   80: ifnonnull -> 96
    //   83: aload_0
    //   84: aload_0
    //   85: getfield ZK : Lburp/Zm99;
    //   88: invokevirtual remove : (Ljava/awt/Component;)V
    //   91: aload #7
    //   93: ifnonnull -> 115
    //   96: aload_0
    //   97: getfield ZK : Lburp/Zm99;
    //   100: aload #4
    //   102: invokevirtual setText : (Ljava/lang/String;)V
    //   105: aload_0
    //   106: getfield ZK : Lburp/Zm99;
    //   109: getstatic burp/Zlkk.BURP_TITLE : Lburp/Zlkk;
    //   112: invokevirtual Ze : (Lburp/Zlkk;)V
    //   115: aload_0
    //   116: new burp/Zbws
    //   119: dup
    //   120: new burp/Zmua
    //   123: dup
    //   124: new burp/Zg2d
    //   127: dup
    //   128: invokespecial <init> : ()V
    //   131: aload_0
    //   132: getfield Zd : Ljavafx/collections/ObservableList;
    //   135: invokespecial <init> : (Lburp/Zmjx;Ljavafx/collections/ObservableList;)V
    //   138: invokespecial <init> : (Lburp/Zztu;)V
    //   141: putfield Zr : Lburp/Zbws;
    //   144: aload_0
    //   145: getfield Zr : Lburp/Zbws;
    //   148: sipush #29702
    //   151: sipush #16608
    //   154: invokestatic a : (II)Ljava/lang/String;
    //   157: invokevirtual setName : (Ljava/lang/String;)V
    //   160: aload_0
    //   161: getfield Zr : Lburp/Zbws;
    //   164: aconst_null
    //   165: invokevirtual setTableHeader : (Ljavax/swing/table/JTableHeader;)V
    //   168: aload_0
    //   169: getfield Z_ : Lburp/Zbup;
    //   172: aload_0
    //   173: getfield Zr : Lburp/Zbws;
    //   176: invokevirtual setViewportView : (Ljava/awt/Component;)V
    //   179: aload_0
    //   180: getfield Z_ : Lburp/Zbup;
    //   183: new java/awt/Dimension
    //   186: dup
    //   187: sipush #289
    //   190: bipush #100
    //   192: invokespecial <init> : (II)V
    //   195: invokevirtual setPreferredSize : (Ljava/awt/Dimension;)V
    //   198: iload #6
    //   200: ifeq -> 216
    //   203: aload_0
    //   204: getfield Za : Lburp/Zedd;
    //   207: iconst_1
    //   208: invokevirtual setEnabled : (Z)V
    //   211: aload #7
    //   213: ifnonnull -> 224
    //   216: aload_0
    //   217: aload_0
    //   218: getfield Za : Lburp/Zedd;
    //   221: invokevirtual remove : (Ljava/awt/Component;)V
    //   224: aload_0
    //   225: getfield Za : Lburp/Zedd;
    //   228: iconst_0
    //   229: invokestatic ZX : (Lburp/Zedd;Z)V
    //   232: aload_0
    //   233: getfield Za : Lburp/Zedd;
    //   236: new burp/Zbih
    //   239: dup
    //   240: aload_0
    //   241: invokespecial <init> : (Lburp/Zbys;)V
    //   244: invokevirtual addPopupMenuListener : (Ljavax/swing/event/PopupMenuListener;)V
    //   247: aload_0
    //   248: getfield Za : Lburp/Zedd;
    //   251: aload_0
    //   252: aload #5
    //   254: <illegal opcode> actionPerformed : (Lburp/Zbys;Lburp/Zr_4;)Ljava/awt/event/ActionListener;
    //   259: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   262: return
  }
  
  private void ZP(Zr_4 paramZr_4) {
    int i = this.Za.getSelectedIndex();
    if (i <= 0)
      return; 
    List<Zstu> list = Zk5p.Zw(i - 1, paramZr_4, false);
    synchronized (this.Zb) {
      this.Zd.addAll(list);
    } 
    Zz();
    this.Za.setSelectedIndex(0);
  }
  
  Zefg<Zstu> ZK() {
    return this.Zx;
  }
  
  void Zm(Zefg<Zstu> paramZefg) {
    this.Zx = paramZefg;
    this.Zd = new Zg00<>(this.Zx);
    this.Zr.ZL(new Zmua<>(new Zg2d(), this.Zd));
    Zz();
  }
  
  void Zc() {
    (new Zri8(this)).execute();
  }
  
  private void ZU() {
    String[] arrayOfString = Zbb7.ZS();
    int[] arrayOfInt = this.Zr.getSelectedRows();
    if (arrayOfInt.length == 0 || arrayOfInt.length > this.Zr.getRowCount())
      return; 
    synchronized (this.Zb) {
      int i = arrayOfInt.length - 1;
      while (i >= 0) {
        this.Zd.remove(arrayOfInt[i]);
        i--;
        if (arrayOfString == null)
          break; 
      } 
    } 
    Zz();
  }
  
  private void Zz() {
    this.ZK.setText(this.ZW + this.ZW + a(29697, -23074) + this.Zd.size());
    this.Zc.ZB();
  }
  
  private void Zh() {
    File[] arrayOfFile = Zs6n.ZD(Zg1m.CONFIG, this.Zh, this, null);
    if (arrayOfFile == null)
      return; 
    Zm2.Zo(Zze0.INTRUDER_PAYLOADS_SIMPLE_LIST_LOAD_FROM_FILE);
    (new Zgrt(this, arrayOfFile)).execute();
  }
  
  private void ZP() {
    (new Zshs(this)).execute();
  }
  
  private void ZL() {
    this.ZM = new Ze01();
    this.Zs = new Zgff();
    this.Za = new Zedd<>();
    this.Zm = new Ze01();
    this.Zn = new Ze01();
    this.ZF = new Ze01();
    this.ZC = new Ze01();
    this.ZD = new Ze01();
    this.ZA = new Zmyw();
    this.Z_ = new Zbup();
    this.ZK = new Zm99();
    this.Zv = new Zbqc();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZM.setText(a(29705, -12734));
    this.ZM.setToolTipText(a(29711, -28524));
    this.ZM.setIconTextGap(0);
    this.ZM.setName(a(29707, 11694));
    this.ZM.addActionListener(new Zlbc(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZM, gridBagConstraints);
    this.Zs.setColumns(25);
    this.Zs.ZM(a(29698, -28477));
    this.Zs.setName(a(29696, -5245));
    this.Zs.addActionListener(new Zs9g(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 18;
    add(this.Zs, gridBagConstraints);
    this.Za.setName(a(29717, -18622));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Za, gridBagConstraints);
    this.Zm.setText(a(29699, 14632));
    this.Zm.setToolTipText(a(29706, -20632));
    this.Zm.addActionListener(new Zrxr(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zm, gridBagConstraints);
    this.Zn.setText(a(29710, -4936));
    this.Zn.setToolTipText(a(29703, 537));
    this.Zn.addActionListener(new Zgbs(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zn, gridBagConstraints);
    this.ZF.setText(a(29700, 18757));
    this.ZF.setToolTipText(a(29718, -8198));
    this.ZF.addActionListener(new Zsjl(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZF, gridBagConstraints);
    this.ZC.setText(a(29704, -20836));
    this.ZC.setToolTipText(a(29701, 18147));
    this.ZC.addActionListener(new Zvn(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZC, gridBagConstraints);
    this.ZD.setText(a(29709, 13909));
    this.ZD.setToolTipText(a(29708, 21960));
    this.ZD.addActionListener(new Zrpk(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZD, gridBagConstraints);
    this.ZA.setLeftComponent(this.Z_);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.gridheight = 9;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZA, gridBagConstraints);
    this.ZK.setText(a(29716, -31117));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    add(this.ZK, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zv, gridBagConstraints);
  }
  
  private void ZV(ActionEvent paramActionEvent) {
    ZP();
  }
  
  private void Zi(ActionEvent paramActionEvent) {
    ZO((ActionEvent)null);
  }
  
  private void ZD(ActionEvent paramActionEvent) {
    Zc();
  }
  
  private void ZK(ActionEvent paramActionEvent) {
    ZU();
  }
  
  private void ZU(ActionEvent paramActionEvent) {
    Zh();
  }
  
  private void ZO(ActionEvent paramActionEvent) {
    this.Zs.focusLost((FocusEvent)null);
    this.Zd.add(this.Zg.ZZ(Zkb.Zy(this.Zs.getText())));
    this.Zs.setText("");
    this.Zs.requestFocus();
    Zz();
    this.Zs.focusGained((FocusEvent)null);
  }
  
  private void Zs(ActionEvent paramActionEvent) {
    (new Zsmv(this)).execute();
  }
  
  private void lambda$new$0(Zr_4 paramZr_4, ActionEvent paramActionEvent) {
    ZP(paramZr_4);
  }
  
  static {
    // Byte code:
    //   0: bipush #19
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'SÇpîÆbä:`r:Ð7u&#¢ï¯?ß-lû©íÏ\\faªáîÅFóJ8?¼lkßÒÇ,°¦mJ÷ÉÿNÞ©5hxÂÊ¡ÂÂ¡$V£ð'ÑéuèB!E#û87õ!.¯Üfé\\b#NÞn*3Í\\b\\niy¹Ë£YKå}ÉØ&Å8|¶Sàá¯Ð~$6øñ¼fPð|âôWY¸w@ÜÖîD?U\n=ÍMÊèN,Ò£Øúµñ\\f/F/½ËÜãfÆ¨è®P½ÀÚt«9Õê¤»ßíµÁ¤4úÕ·YXø?E¹Å÷wó'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #78
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc 'ô J½vBï[8ûÌÄTÍ°4*bÑ©i©¡ó.;KØ@M@éâìÓûê'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #22
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #100
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zbys.a : [Ljava/lang/String;
    //   131: bipush #19
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbys.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 258
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 240, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 235
    //   212: bipush #123
    //   214: goto -> 242
    //   217: iconst_1
    //   218: goto -> 242
    //   221: bipush #34
    //   223: goto -> 242
    //   226: bipush #61
    //   228: goto -> 242
    //   231: iconst_3
    //   232: goto -> 242
    //   235: bipush #59
    //   237: goto -> 242
    //   240: bipush #74
    //   242: ixor
    //   243: ixor
    //   244: i2c
    //   245: castore
    //   246: iinc #6, 1
    //   249: dup
    //   250: ifne -> 258
    //   253: dup2
    //   254: dup_x1
    //   255: goto -> 165
    //   258: dup2_x1
    //   259: pop2
    //   260: dup_x2
    //   261: iload #6
    //   263: if_icmpgt -> 161
    //   266: pop
    //   267: new java/lang/String
    //   270: dup_x1
    //   271: swap
    //   272: invokespecial <init> : ([C)V
    //   275: invokevirtual intern : ()Ljava/lang/String;
    //   278: swap
    //   279: pop
    //   280: swap
    //   281: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7404) & 0xFFFF;
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
      char c = 'ì';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbys.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */