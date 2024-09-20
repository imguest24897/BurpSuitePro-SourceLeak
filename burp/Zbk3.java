package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.util.Collection;
import java.util.Set;

class Zbk3 extends Zbv5 implements Ztbm {
  private final Zrgk Z_;
  
  private final Ztrg ZP;
  
  private final Ze5p ZO;
  
  private final Zr1m ZS;
  
  private final Collection<String> ZT;
  
  private Zljt Zf;
  
  private int Zd = -1;
  
  private Zmyw ZD;
  
  private Ze01 Zi;
  
  private Ze01 Zt;
  
  private Ze01 Zq;
  
  private Ze01 ZU;
  
  private Ze01 Za;
  
  private Zbup Zb;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbk3(Zrgk paramZrgk, Ztrg paramZtrg, Ze5p paramZe5p, Zr1m paramZr1m) {
    this.Z_ = paramZrgk;
    this.ZP = paramZtrg;
    this.ZO = paramZe5p;
    this.ZS = paramZr1m;
    ZEw();
    this.ZT = Set.of(new String[] { 
          Zjd(), a(15605, 29190), a(15594, 11322), a(15606, -24169), a(15615, -15942), a(15592, 17635), a(15604, -3020), a(15593, -32234), a(15608, 29644), a(15596, 19418), 
          a(15612, 27183), a(15595, 12272), a(15602, -23125) });
    ZEv();
  }
  
  public String Zjd() {
    return a(15598, 29087);
  }
  
  public String ZjS() {
    return a(15603, 12828);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    this.Zf = new Zljt(this.Z_, this.ZP, zbkr, this.ZS);
    Zt2();
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.ZT;
  }
  
  public boolean ZQA() {
    return this.Zf.ZA();
  }
  
  public void ZO(boolean paramBoolean) {
    this.Zf.Zu(paramBoolean);
    Zt2();
  }
  
  public void Zb(Zeap paramZeap) {
    // Byte code:
    //   0: invokestatic Zb : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: ifnull -> 63
    //   8: aload_0
    //   9: getfield Zd : I
    //   12: iconst_m1
    //   13: if_icmpne -> 33
    //   16: aload_0
    //   17: getfield Zf : Lburp/Zljt;
    //   20: invokevirtual ZD : ()Lburp/Zri3;
    //   23: aload_1
    //   24: invokeinterface ZR : (Lburp/Zeap;)V
    //   29: aload_2
    //   30: ifnonnull -> 50
    //   33: aload_0
    //   34: getfield Zf : Lburp/Zljt;
    //   37: invokevirtual ZD : ()Lburp/Zri3;
    //   40: aload_1
    //   41: aload_0
    //   42: getfield Zd : I
    //   45: invokeinterface Zw : (Lburp/Zeap;I)V
    //   50: aload_0
    //   51: getfield Zf : Lburp/Zljt;
    //   54: invokevirtual ZD : ()Lburp/Zri3;
    //   57: aload_1
    //   58: invokeinterface Zd : (Lburp/Zeap;)V
    //   63: aload_0
    //   64: iconst_m1
    //   65: putfield Zd : I
    //   68: return
  }
  
  public void Zt2() {
    this.Zb.setViewportView(this.Zf.ZD().ZF());
  }
  
  private void ZEv() {
    setName(a(15607, -14301));
  }
  
  private void ZEw() {
    this.Zi = new Ze01();
    this.Zt = new Ze01();
    this.Za = new Ze01();
    this.ZU = new Ze01();
    this.Zq = new Ze01();
    this.ZD = new Zmyw();
    this.Zb = new Zbup();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zi.setText(a(15600, -24135));
    this.Zi.setToolTipText(a(15599, -10757));
    this.Zi.addActionListener(new Zs3x(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zi, gridBagConstraints);
    this.Zt.setText(a(15597, 9237));
    this.Zt.setToolTipText(a(15611, 4141));
    this.Zt.addActionListener(new Zetb(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zt, gridBagConstraints);
    this.Za.setText(a(15614, 840));
    this.Za.setToolTipText(a(15610, -10729));
    this.Za.addActionListener(new Zsyc(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Za, gridBagConstraints);
    this.ZU.setText(a(15589, 4029));
    this.ZU.setToolTipText(a(15609, -18660));
    this.ZU.addActionListener(new Zrxj(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZU, gridBagConstraints);
    this.Zq.setText(a(15601, 3746));
    this.Zq.setToolTipText(a(15613, 30071));
    this.Zq.addActionListener(new Zs6_(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zq, gridBagConstraints);
    this.ZD.setLeftComponent(this.Zb);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 9;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZD, gridBagConstraints);
  }
  
  private void Zx(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zf : Lburp/Zljt;
    //   4: invokevirtual ZD : ()Lburp/Zri3;
    //   7: invokeinterface ZF : ()Lburp/Zbws;
    //   12: astore_3
    //   13: invokestatic Zb : ()Ljava/lang/String;
    //   16: aload_3
    //   17: invokevirtual getSelectedRow : ()I
    //   20: istore #4
    //   22: astore_2
    //   23: iload #4
    //   25: iconst_m1
    //   26: if_icmpeq -> 40
    //   29: iload #4
    //   31: aload_3
    //   32: invokevirtual getRowCount : ()I
    //   35: iconst_1
    //   36: isub
    //   37: if_icmpne -> 41
    //   40: return
    //   41: iload #4
    //   43: aload_0
    //   44: getfield Zd : I
    //   47: if_icmpne -> 64
    //   50: aload_0
    //   51: dup
    //   52: getfield Zd : I
    //   55: iconst_1
    //   56: iadd
    //   57: putfield Zd : I
    //   60: aload_2
    //   61: ifnonnull -> 85
    //   64: iload #4
    //   66: aload_0
    //   67: getfield Zd : I
    //   70: iconst_1
    //   71: isub
    //   72: if_icmpne -> 85
    //   75: aload_0
    //   76: dup
    //   77: getfield Zd : I
    //   80: iconst_1
    //   81: isub
    //   82: putfield Zd : I
    //   85: aload_0
    //   86: getfield Zf : Lburp/Zljt;
    //   89: invokevirtual ZD : ()Lburp/Zri3;
    //   92: iload #4
    //   94: invokeinterface ZT : (I)V
    //   99: aload_3
    //   100: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   103: iload #4
    //   105: iconst_1
    //   106: iadd
    //   107: iload #4
    //   109: iconst_1
    //   110: iadd
    //   111: invokeinterface setSelectionInterval : (II)V
    //   116: return
  }
  
  private void ZW(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zf : Lburp/Zljt;
    //   4: invokevirtual ZD : ()Lburp/Zri3;
    //   7: invokeinterface ZF : ()Lburp/Zbws;
    //   12: astore_3
    //   13: invokestatic Zb : ()Ljava/lang/String;
    //   16: aload_3
    //   17: invokevirtual getSelectedRow : ()I
    //   20: istore #4
    //   22: astore_2
    //   23: iload #4
    //   25: iconst_1
    //   26: if_icmpge -> 30
    //   29: return
    //   30: iload #4
    //   32: aload_0
    //   33: getfield Zd : I
    //   36: if_icmpne -> 53
    //   39: aload_0
    //   40: dup
    //   41: getfield Zd : I
    //   44: iconst_1
    //   45: isub
    //   46: putfield Zd : I
    //   49: aload_2
    //   50: ifnonnull -> 74
    //   53: iload #4
    //   55: aload_0
    //   56: getfield Zd : I
    //   59: iconst_1
    //   60: iadd
    //   61: if_icmpne -> 74
    //   64: aload_0
    //   65: dup
    //   66: getfield Zd : I
    //   69: iconst_1
    //   70: iadd
    //   71: putfield Zd : I
    //   74: aload_0
    //   75: getfield Zf : Lburp/Zljt;
    //   78: invokevirtual ZD : ()Lburp/Zri3;
    //   81: iload #4
    //   83: invokeinterface ZA : (I)V
    //   88: aload_3
    //   89: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   92: iload #4
    //   94: iconst_1
    //   95: isub
    //   96: iload #4
    //   98: iconst_1
    //   99: isub
    //   100: invokeinterface setSelectionInterval : (II)V
    //   105: return
  }
  
  private void Zy(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zf : Lburp/Zljt;
    //   4: invokevirtual ZD : ()Lburp/Zri3;
    //   7: invokeinterface ZF : ()Lburp/Zbws;
    //   12: astore_3
    //   13: invokestatic Zb : ()Ljava/lang/String;
    //   16: aload_3
    //   17: invokevirtual getSelectedRow : ()I
    //   20: istore #4
    //   22: astore_2
    //   23: iload #4
    //   25: iconst_m1
    //   26: if_icmpne -> 30
    //   29: return
    //   30: iload #4
    //   32: aload_0
    //   33: getfield Zd : I
    //   36: if_icmpne -> 48
    //   39: aload_0
    //   40: iconst_m1
    //   41: putfield Zd : I
    //   44: aload_2
    //   45: ifnonnull -> 67
    //   48: iload #4
    //   50: aload_0
    //   51: getfield Zd : I
    //   54: if_icmpge -> 67
    //   57: aload_0
    //   58: dup
    //   59: getfield Zd : I
    //   62: iconst_1
    //   63: isub
    //   64: putfield Zd : I
    //   67: aload_0
    //   68: getfield Zf : Lburp/Zljt;
    //   71: invokevirtual ZD : ()Lburp/Zri3;
    //   74: iload #4
    //   76: invokeinterface ZY : (I)V
    //   81: iload #4
    //   83: aload_3
    //   84: invokevirtual getRowCount : ()I
    //   87: if_icmplt -> 93
    //   90: iinc #4, -1
    //   93: iload #4
    //   95: iflt -> 120
    //   98: iload #4
    //   100: aload_3
    //   101: invokevirtual getRowCount : ()I
    //   104: if_icmpge -> 120
    //   107: aload_3
    //   108: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   111: iload #4
    //   113: iload #4
    //   115: invokeinterface setSelectionInterval : (II)V
    //   120: return
  }
  
  private void Zm(ActionEvent paramActionEvent) {
    Zbws zbws = this.Zf.ZD().ZF();
    int i = zbws.getSelectedRow();
    if (i == -1)
      return; 
    this.Zd = i;
    Zeap zeap = this.Zf.ZD().ZK(this.Zd);
    Zrv2 zrv2 = new Zrv2(Zt2m.ZF(this), this, zeap, this.ZO);
    zrv2.setVisible(true);
  }
  
  private void ZS(ActionEvent paramActionEvent) {
    Zrv2 zrv2 = new Zrv2(Zt2m.ZF(this), this, null, this.ZO);
    zrv2.setVisible(true);
  }
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '$a½ÁNÝ1·7½¯ÐÀ£-hÃÔð_4Ì\\b<!v)V¤Ó°J¡köÝ³V*Ê}(\\r.aéT´³{ÖåÛ°j]ÌqC\\r]B\\tÒÈgG\\t´ntbTbg6~àµ@ó7êÁq¥ßnØøø½ixl£XÑtÁC²j¥°4«°l\\bÅ\\rôa²\\n6|lLÜÞfª»2q!£Y÷îZ´°AlþLá¾7W*ÔÆ^@û¿3¨0¥kMË¶KJÉ¿r :>ê¤^-@è®ġ³æGëmúA.ÍS\\t¬HÓØ*¦í4ÖHÀï/ØßJ)±{tçÐ$aÀÆaM7óZ#ýÉ¦efåH¥Ùå»ó¡¸è{~Ç,þ·©ûe"±Î*UAE\\f¥¤qÈ  Î¨JfXI ÿêX$[JxO,·Ü31@°:±1öù\\tó\\n¯4TþzåýfºüLÊÕoi1¬¢0Ú#bî¤©ß¬dØg{­AfåÒs8r*ÎÄÍÙÝ4_®h¥çßñ«-}¬ÑuêuãxF\\r&«DgÂ¶BÞ¾)ø5¦÷I8ÉdOv³H|Ä¥<3W%_ÏP¿­yk\\t¿7Jßí¸a!ARù÷¢¦õû(\\bÁ5-Ã:îúóØóª±=@AdKõahÚ£ä¢oHw*7ùoíTé¤þ°ÄJ±Æ¾è»÷yÐÇ¹\¥2¬}E!Ù8e^iUÛ*p'¡^z\\bÓLVÖ£Qqq%øÀ÷'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #27
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #57
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
    //   68: ldc '`]YeSGTD­+¦G'Ñ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #17
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #62
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
    //   129: putstatic burp/Zbk3.a : [Ljava/lang/String;
    //   132: bipush #25
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbk3.b : [Ljava/lang/String;
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
    //   212: bipush #62
    //   214: goto -> 244
    //   217: bipush #91
    //   219: goto -> 244
    //   222: bipush #114
    //   224: goto -> 244
    //   227: bipush #127
    //   229: goto -> 244
    //   232: bipush #104
    //   234: goto -> 244
    //   237: bipush #58
    //   239: goto -> 244
    //   242: bipush #96
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
    int i = (paramInt1 ^ 0x3CFD) & 0xFFFF;
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
      char c = 'î';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbk3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */