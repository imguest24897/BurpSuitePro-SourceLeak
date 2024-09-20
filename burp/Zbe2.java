package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import net.portswigger.Zm2;

public class Zbe2 extends Zbv5 implements Zky2, Zt3u {
  private final Zs2p Zs;
  
  private final Zr1m ZY;
  
  private final Zbws Z_;
  
  private final Set<String> Zo;
  
  private final Zt_3 Zn;
  
  private int Zl = -1;
  
  private Zmyw Za;
  
  private Zzdy Zm;
  
  private Ze01 Zg;
  
  private Ze01 Zw;
  
  private Ze01 Zx;
  
  private Ze01 ZB;
  
  private Ze01 ZF;
  
  private Zbup ZT;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbe2(Zs2p paramZs2p, Zr1m paramZr1m) {
    this.Zs = paramZs2p;
    this.ZY = paramZr1m;
    this.Zo = Set.of(Zjd(), a(19685, -21737), a(19696, 1504), a(19688, 25679), a(19690, 32416), a(19694, 18405), a(19707, -12981));
    ZC();
    setName(a(19700, -6746));
    this.Zm.setName(a(19705, -12408));
    this.Zg.setName(a(19698, -30718));
    this.Zw.setName(a(19709, 3702));
    this.Zm.setSelected(paramZs2p.ZF());
    this.Zn = new Zt_3(paramZs2p);
    this.Z_ = new Zbws(this.Zn);
    this.Z_.Zk(this);
    this.Z_.setName(a(19695, 23984));
    this.ZT.setViewportView(this.Z_);
  }
  
  public String Zjd() {
    return a(19699, 6136);
  }
  
  public String ZjS() {
    return a(19701, 12889);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.ZP(Zjd().toLowerCase(Locale.ENGLISH), Zk97.DESKTOP_TOOLS_PROXY_OPTIONS_MATCH_AND_REPLACE, this.ZY, new String[] { a(19692, 10965), a(19693, 2324) });
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.Zo;
  }
  
  public void Zt2() {
    this.Zm.setSelected(this.Zs.ZF());
    this.Zn.fireTableDataChanged();
    if (this.Zs.Zt())
      Zm2.ZC(Zrrh.PROXY_OPTIONS_WS_MATCH_REPLACE_RULES_USED); 
  }
  
  void Ze() {
    this.Zl = -1;
  }
  
  public void Zv(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    if (paramInt2 != 0)
      return; 
    Zku8 zku8 = this.Zs.Z_(paramInt1);
    zku8.ZXg(!zku8.ZIp());
    this.Zn.fireTableCellUpdated(paramInt1, paramInt2);
    if (zku8.ZIp())
      Zm2.ZC(Zrrh.PROXY_OPTIONS_WS_MATCH_REPLACE_RULES_USED); 
  }
  
  private void ZC(boolean paramBoolean) {
    this.Zs.Zm(paramBoolean);
  }
  
  private void ZC() {
    this.Zm = new Zzdy();
    this.Zg = new Ze01();
    this.Zw = new Ze01();
    this.ZF = new Ze01();
    this.ZB = new Ze01();
    this.Zx = new Ze01();
    this.Za = new Zmyw();
    this.ZT = new Zbup();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    setLayout(gridBagLayout);
    this.Zm.setText(a(19706, 18096));
    this.Zm.addActionListener(new Zk1t(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 8, 0);
    add(this.Zm, gridBagConstraints);
    this.Zg.setText(a(19684, -24156));
    this.Zg.setToolTipText(a(19710, 9164));
    this.Zg.addActionListener(new Zena(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zg, gridBagConstraints);
    this.Zw.setText(a(19697, 15310));
    this.Zw.setToolTipText(a(19711, 15147));
    this.Zw.addActionListener(new Zg4m(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zw, gridBagConstraints);
    this.ZF.setText(a(19691, -22302));
    this.ZF.setToolTipText(a(19689, 23931));
    this.ZF.addActionListener(new Zsc6(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.ZF, gridBagConstraints);
    this.ZB.setText(a(19702, 22575));
    this.ZB.setToolTipText(a(19703, -31843));
    this.ZB.addActionListener(new Zs_7(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.ZB, gridBagConstraints);
    this.Zx.setText(a(19708, -7049));
    this.Zx.setToolTipText(a(19704, -31405));
    this.Zx.addActionListener(new Zefq(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zx, gridBagConstraints);
    this.Za.setLeftComponent(this.ZT);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridheight = 9;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    add(this.Za, gridBagConstraints);
  }
  
  private void ZH(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic Zv : ()[I
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Z_ : Lburp/Zbws;
    //   8: invokevirtual getSelectedRow : ()I
    //   11: istore_3
    //   12: iload_3
    //   13: iconst_m1
    //   14: if_icmpeq -> 30
    //   17: iload_3
    //   18: aload_0
    //   19: getfield Z_ : Lburp/Zbws;
    //   22: invokevirtual getRowCount : ()I
    //   25: iconst_1
    //   26: isub
    //   27: if_icmpne -> 31
    //   30: return
    //   31: iload_3
    //   32: aload_0
    //   33: getfield Zl : I
    //   36: if_icmpne -> 53
    //   39: aload_0
    //   40: dup
    //   41: getfield Zl : I
    //   44: iconst_1
    //   45: iadd
    //   46: putfield Zl : I
    //   49: aload_2
    //   50: ifnull -> 73
    //   53: iload_3
    //   54: aload_0
    //   55: getfield Zl : I
    //   58: iconst_1
    //   59: isub
    //   60: if_icmpne -> 73
    //   63: aload_0
    //   64: dup
    //   65: getfield Zl : I
    //   68: iconst_1
    //   69: isub
    //   70: putfield Zl : I
    //   73: aload_0
    //   74: getfield Zs : Lburp/Zs2p;
    //   77: iload_3
    //   78: invokevirtual Zo : (I)V
    //   81: aload_0
    //   82: getfield Z_ : Lburp/Zbws;
    //   85: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   88: iload_3
    //   89: iconst_1
    //   90: iadd
    //   91: iload_3
    //   92: iconst_1
    //   93: iadd
    //   94: invokeinterface setSelectionInterval : (II)V
    //   99: return
  }
  
  private void Zn(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic Zv : ()[I
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Z_ : Lburp/Zbws;
    //   8: invokevirtual getSelectedRow : ()I
    //   11: istore_3
    //   12: iload_3
    //   13: iconst_1
    //   14: if_icmpge -> 18
    //   17: return
    //   18: iload_3
    //   19: aload_0
    //   20: getfield Zl : I
    //   23: if_icmpne -> 40
    //   26: aload_0
    //   27: dup
    //   28: getfield Zl : I
    //   31: iconst_1
    //   32: isub
    //   33: putfield Zl : I
    //   36: aload_2
    //   37: ifnull -> 60
    //   40: iload_3
    //   41: aload_0
    //   42: getfield Zl : I
    //   45: iconst_1
    //   46: iadd
    //   47: if_icmpne -> 60
    //   50: aload_0
    //   51: dup
    //   52: getfield Zl : I
    //   55: iconst_1
    //   56: iadd
    //   57: putfield Zl : I
    //   60: aload_0
    //   61: getfield Zs : Lburp/Zs2p;
    //   64: iload_3
    //   65: iconst_1
    //   66: isub
    //   67: invokevirtual Zo : (I)V
    //   70: aload_0
    //   71: getfield Z_ : Lburp/Zbws;
    //   74: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   77: iload_3
    //   78: iconst_1
    //   79: isub
    //   80: iload_3
    //   81: iconst_1
    //   82: isub
    //   83: invokeinterface setSelectionInterval : (II)V
    //   88: return
  }
  
  private void ZD(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic Zv : ()[I
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Z_ : Lburp/Zbws;
    //   8: invokevirtual getSelectedRow : ()I
    //   11: istore_3
    //   12: iload_3
    //   13: iconst_m1
    //   14: if_icmpne -> 18
    //   17: return
    //   18: iload_3
    //   19: aload_0
    //   20: getfield Zl : I
    //   23: if_icmpne -> 35
    //   26: aload_0
    //   27: iconst_m1
    //   28: putfield Zl : I
    //   31: aload_2
    //   32: ifnull -> 53
    //   35: iload_3
    //   36: aload_0
    //   37: getfield Zl : I
    //   40: if_icmpge -> 53
    //   43: aload_0
    //   44: dup
    //   45: getfield Zl : I
    //   48: iconst_1
    //   49: isub
    //   50: putfield Zl : I
    //   53: aload_0
    //   54: getfield Zs : Lburp/Zs2p;
    //   57: iload_3
    //   58: invokevirtual ZV : (I)V
    //   61: aload_0
    //   62: getfield Zn : Lburp/Zt_3;
    //   65: iload_3
    //   66: iload_3
    //   67: invokevirtual fireTableRowsDeleted : (II)V
    //   70: iload_3
    //   71: aload_0
    //   72: getfield Z_ : Lburp/Zbws;
    //   75: invokevirtual getRowCount : ()I
    //   78: if_icmplt -> 84
    //   81: iinc #3, -1
    //   84: iload_3
    //   85: iflt -> 113
    //   88: iload_3
    //   89: aload_0
    //   90: getfield Z_ : Lburp/Zbws;
    //   93: invokevirtual getRowCount : ()I
    //   96: if_icmpge -> 113
    //   99: aload_0
    //   100: getfield Z_ : Lburp/Zbws;
    //   103: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   106: iload_3
    //   107: iload_3
    //   108: invokeinterface setSelectionInterval : (II)V
    //   113: return
  }
  
  private void ZW(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Z_ : Lburp/Zbws;
    //   4: invokevirtual getSelectedRow : ()I
    //   7: istore_2
    //   8: iload_2
    //   9: iconst_m1
    //   10: if_icmpne -> 14
    //   13: return
    //   14: aload_0
    //   15: iload_2
    //   16: putfield Zl : I
    //   19: aload_0
    //   20: getfield Zs : Lburp/Zs2p;
    //   23: aload_0
    //   24: getfield Zl : I
    //   27: invokevirtual Z_ : (I)Lburp/Zku8;
    //   30: astore_3
    //   31: new burp/Zr7d
    //   34: dup
    //   35: aload_0
    //   36: aload_3
    //   37: aload_0
    //   38: getfield Zs : Lburp/Zs2p;
    //   41: aload_0
    //   42: aload_3
    //   43: <illegal opcode> run : (Lburp/Zbe2;Lburp/Zku8;)Ljava/lang/Runnable;
    //   48: invokespecial <init> : (Lburp/Zbe2;Lburp/Zku8;Lburp/Zs2p;Ljava/lang/Runnable;)V
    //   51: astore #4
    //   53: aload #4
    //   55: iconst_1
    //   56: invokevirtual setVisible : (Z)V
    //   59: return
  }
  
  private void Zt(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zs : Lburp/Zs2p;
    //   4: invokevirtual Ze : ()I
    //   7: iconst_1
    //   8: isub
    //   9: istore_2
    //   10: new burp/Zr7d
    //   13: dup
    //   14: aload_0
    //   15: aconst_null
    //   16: aload_0
    //   17: getfield Zs : Lburp/Zs2p;
    //   20: aload_0
    //   21: iload_2
    //   22: <illegal opcode> run : (Lburp/Zbe2;I)Ljava/lang/Runnable;
    //   27: invokespecial <init> : (Lburp/Zbe2;Lburp/Zku8;Lburp/Zs2p;Ljava/lang/Runnable;)V
    //   30: astore_3
    //   31: aload_3
    //   32: iconst_1
    //   33: invokevirtual setVisible : (Z)V
    //   36: return
  }
  
  private void ZV(ActionEvent paramActionEvent) {
    ZC(this.Zm.isSelected());
  }
  
  private void lambda$cmdAddActionPerformed$1(int paramInt) {
    this.Zn.fireTableRowsInserted(paramInt, paramInt);
    Zm2.ZC(Zrrh.PROXY_OPTIONS_WS_MATCH_REPLACE_RULES_USED);
  }
  
  private void lambda$cmdEditActionPerformed$0(Zku8 paramZku8) {
    this.Zn.fireTableRowsUpdated(this.Zl, this.Zl);
    if (paramZku8.ZIp())
      Zm2.ZC(Zrrh.PROXY_OPTIONS_WS_MATCH_REPLACE_RULES_USED); 
  }
  
  static {
    // Byte code:
    //   0: bipush #26
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'º,÷H#BfþÒW®/Ùá6A½A,'®µV¦ä"V¶,U¯ë@Í\\nÓ]uçÈ¸å&©ÚH-Ea$ZX³}t»|®Ò\\nrV®Û\\fck^'ZUÁÎi×@³·£FÉmx)XÈÜµ·ýèÛW)öä5zeRCò4^Äe(A)¤]GÝKÊvwL ;Ýz¨u^`³ ®\\ngùüHùo"ãÝ&;díö.¨³&¢Åã'·__,_ÕN/¯\iJÙUJL\\t(XbÑKò©L×A,\\fSl\\r}iáßîÒóÝÄu¯/µ¥Ä¢{®Zá`À¨øÉTkQ8¨*;SÎV}0hg¼¤º4ÆÞüþ^Ç?~<eÇë°«-'í@ÓõÇåârÙBgÂ¡çcµbÃ;»Eû\\r(køj'¢¸®Xà°<TåPÓ¸;\\tk®z+÷¦=1húZÞÁ!ö5ê¢Eµ#(rGüçÓ1¼òçfy¨a÷³oCVHÊ£zÖ­Ù yùºÏóDtÔnFù`\\t³+±u\\\fÊïÌ\\r=ÒOµ\\tjá£¢iex4B`)ºìËj\\rYátEÝìóFíJ1vÄ\\r\\bf÷ÇQÉµZ0ÓÞÒ´hZó\\fK:Iÿüa§Ã¨\xÿÔ`TôÜj\sFZ\\t;ö,Ü¸¨$±^Æ¹F'½'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #18
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc '¯\\bâAú16è'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_3
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #22
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zbe2.a : [Ljava/lang/String;
    //   130: bipush #26
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zbe2.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #77
    //   214: goto -> 244
    //   217: bipush #95
    //   219: goto -> 244
    //   222: bipush #18
    //   224: goto -> 244
    //   227: bipush #37
    //   229: goto -> 244
    //   232: bipush #75
    //   234: goto -> 244
    //   237: bipush #79
    //   239: goto -> 244
    //   242: bipush #91
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x4CFC) & 0xFFFF;
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
      byte b1 = 98;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbe2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */