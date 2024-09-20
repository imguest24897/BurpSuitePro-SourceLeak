package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import net.portswigger.Zm2;

public class Zbep extends Zbv5 implements Zt3u {
  private final Zekl ZD;
  
  private final Zgr_ ZH;
  
  private final boolean ZK;
  
  private final Zr_4 ZT;
  
  private final Ztn0 ZW;
  
  private final Zbws ZS;
  
  private final Zr1m ZA;
  
  private final Set<String> Zo;
  
  private int ZV = -1;
  
  private final Zr1j Zm;
  
  private Zmyw Zw;
  
  private Zzdy ZC;
  
  public Zzdy ZQ;
  
  public Zzdy ZE;
  
  private Ze01 Zu;
  
  private Ze01 ZF;
  
  private Ze01 ZI;
  
  private Ze01 Za;
  
  private Ze01 ZO;
  
  private Zm9v Zd;
  
  private Zbup Zr;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbep(Zekl paramZekl, Zgr_ paramZgr_, boolean paramBoolean, Zr_4 paramZr_4, Zr1m paramZr1m, Zr1j paramZr1j) {
    this.ZD = paramZekl;
    this.ZH = paramZgr_;
    this.ZK = paramBoolean;
    this.ZT = paramZr_4;
    this.ZA = paramZr1m;
    this.Zm = paramZr1j;
    this.Zo = Set.of(new String[] { 
          Zjd(), a(-8338, 6903), a(-8326, 26701), a(-8357, 23612), a(-8325, -20357), a(-8352, -20083), a(-8332, 29973), a(-8356, -5268), a(-8331, -28939), a(-8324, -28634), 
          a(-8335, 17083) });
    Zd();
    String str = paramBoolean ? a(-8329, 7965) : a(-8360, -27768);
    setName(str);
    this.ZQ.setText(a(-8339, -11679) + a(-8339, -11679) + (paramBoolean ? a(-8359, -16093) : a(-8358, -30420)));
    this.ZQ.setName(paramBoolean ? a(-8347, 24799) : a(-8361, -31988));
    this.ZE.setText(a(-8346, 22384) + a(-8346, 22384) + (paramBoolean ? a(-8343, 13644) : a(-8322, 31095)));
    this.ZW = paramZgr_.Zq(paramBoolean);
    this.ZS = new Zbws(this.ZW);
    this.ZS.Zk(new Ze0r(this));
    this.ZS.setName(paramBoolean ? a(-8363, -28561) : a(-8354, 2894));
    this.Zr.setViewportView(this.ZS);
    this.Zd.setVisible(false);
    if (!paramBoolean)
      remove(this.ZC); 
  }
  
  public String Zjd() {
    String str = this.ZK ? a(-8334, 19265) : a(-8349, -3069);
    return String.format(a(-8353, 30908), new Object[] { str });
  }
  
  public String ZjS() {
    String str = this.ZK ? a(-8344, -11780) : a(-8330, 23177);
    return String.format(a(-8342, -4478), new Object[] { str });
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    String str = this.ZK ? a(-8321, 18831) : a(-8336, 16466);
    zbkr.ZP(Zjd().toLowerCase(Locale.ENGLISH), Zk97.DESKTOP_TOOLS_PROXY_OPTIONS_INTERCEPTING_HTTP_REQUESTS_AND_RESPONSES, this.ZA, new String[] { str });
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.Zo;
  }
  
  public void Zt2() {
    this.ZE.setSelected(this.ZK ? this.ZD.ZlY() : this.ZD.Zll());
    this.ZQ.setSelected(this.ZK ? this.ZD.Zlo() : this.ZD.Zlg());
    this.ZC.setSelected((this.ZK && this.ZD.Zld()));
  }
  
  void ZR(Zrgr paramZrgr) {
    // Byte code:
    //   0: invokestatic Zv : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: ifnull -> 48
    //   8: aload_0
    //   9: getfield ZV : I
    //   12: iconst_m1
    //   13: if_icmpne -> 32
    //   16: aload_0
    //   17: getfield ZH : Lburp/Zgr_;
    //   20: aload_1
    //   21: aload_0
    //   22: getfield ZK : Z
    //   25: invokevirtual ZB : (Lburp/Zrgr;Z)V
    //   28: aload_2
    //   29: ifnull -> 48
    //   32: aload_0
    //   33: getfield ZH : Lburp/Zgr_;
    //   36: aload_1
    //   37: aload_0
    //   38: getfield ZK : Z
    //   41: aload_0
    //   42: getfield ZV : I
    //   45: invokevirtual Zc : (Lburp/Zrgr;ZI)V
    //   48: aload_0
    //   49: iconst_m1
    //   50: putfield ZV : I
    //   53: return
  }
  
  public void ZP(boolean paramBoolean) {
    this.Zd.setVisible(!paramBoolean);
  }
  
  boolean Z_() {
    return this.ZK;
  }
  
  private void Zd() {
    this.Zu = new Ze01();
    this.ZF = new Ze01();
    this.ZO = new Ze01();
    this.Za = new Ze01();
    this.ZI = new Ze01();
    this.ZQ = new Zzdy();
    this.ZE = new Zzdy();
    this.Zd = new Zm9v();
    this.Zw = new Zmyw();
    this.Zr = new Zbup();
    this.ZC = new Zzdy();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zu.setText(a(-8340, 16996));
    this.Zu.setToolTipText(a(-8341, 17524));
    this.Zu.addActionListener(new Zmni(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(5, 0, 0, 0);
    add(this.Zu, gridBagConstraints);
    this.ZF.setText(a(-8364, 14826));
    this.ZF.setToolTipText(a(-8351, -16805));
    this.ZF.addActionListener(new Zmzd(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZF, gridBagConstraints);
    this.ZO.setText(a(-8323, 31303));
    this.ZO.setToolTipText(a(-8355, 30856));
    this.ZO.addActionListener(new Zgjy(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZO, gridBagConstraints);
    this.Za.setText(a(-8345, 12043));
    this.Za.setToolTipText(a(-8327, -24429));
    this.Za.addActionListener(new Zs60(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Za, gridBagConstraints);
    this.ZI.setText(a(-8333, -19174));
    this.ZI.setToolTipText(a(-8348, -27620));
    this.ZI.addActionListener(new Zs9r(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZI, gridBagConstraints);
    this.ZQ.addActionListener(new Zkcr(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.ZQ, gridBagConstraints);
    this.ZE.setHorizontalAlignment(4);
    this.ZE.addActionListener(new Zl_w(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    add(this.ZE, gridBagConstraints);
    this.Zd.setHorizontalAlignment(4);
    this.Zd.setText(a(-8350, 17574));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    add(this.Zd, gridBagConstraints);
    this.Zw.setLeftComponent(this.Zr);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.gridheight = 9;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(5, 0, 0, 0);
    add(this.Zw, gridBagConstraints);
    this.ZC.setText(a(-8362, -9550));
    this.ZC.addActionListener(new Zee1(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.ZC, gridBagConstraints);
  }
  
  private void Zy(ActionEvent paramActionEvent) {
    int[] arrayOfInt = Zr7c.Zv();
    Zekl zekl = this.ZD;
    if (this.ZK) {
      zekl.ZfG(this.ZE.isSelected());
      if (arrayOfInt != null) {
        zekl.Zfy(this.ZE.isSelected());
        return;
      } 
      return;
    } 
    zekl.Zfy(this.ZE.isSelected());
  }
  
  private void Ze(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic Zv : ()[I
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZS : Lburp/Zbws;
    //   8: invokevirtual getSelectedRow : ()I
    //   11: istore_3
    //   12: iload_3
    //   13: iconst_m1
    //   14: if_icmpeq -> 30
    //   17: iload_3
    //   18: aload_0
    //   19: getfield ZS : Lburp/Zbws;
    //   22: invokevirtual getRowCount : ()I
    //   25: iconst_1
    //   26: isub
    //   27: if_icmpne -> 31
    //   30: return
    //   31: iload_3
    //   32: aload_0
    //   33: getfield ZV : I
    //   36: if_icmpne -> 53
    //   39: aload_0
    //   40: dup
    //   41: getfield ZV : I
    //   44: iconst_1
    //   45: iadd
    //   46: putfield ZV : I
    //   49: aload_2
    //   50: ifnull -> 73
    //   53: iload_3
    //   54: aload_0
    //   55: getfield ZV : I
    //   58: iconst_1
    //   59: isub
    //   60: if_icmpne -> 73
    //   63: aload_0
    //   64: dup
    //   65: getfield ZV : I
    //   68: iconst_1
    //   69: isub
    //   70: putfield ZV : I
    //   73: aload_0
    //   74: getfield ZH : Lburp/Zgr_;
    //   77: aload_0
    //   78: getfield ZK : Z
    //   81: iload_3
    //   82: invokevirtual Zz : (ZI)V
    //   85: aload_0
    //   86: getfield ZS : Lburp/Zbws;
    //   89: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   92: iload_3
    //   93: iconst_1
    //   94: iadd
    //   95: iload_3
    //   96: iconst_1
    //   97: iadd
    //   98: invokeinterface setSelectionInterval : (II)V
    //   103: return
  }
  
  private void ZU(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic Zv : ()[I
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZS : Lburp/Zbws;
    //   8: invokevirtual getSelectedRow : ()I
    //   11: istore_3
    //   12: iload_3
    //   13: iconst_1
    //   14: if_icmpge -> 18
    //   17: return
    //   18: iload_3
    //   19: aload_0
    //   20: getfield ZV : I
    //   23: if_icmpne -> 40
    //   26: aload_0
    //   27: dup
    //   28: getfield ZV : I
    //   31: iconst_1
    //   32: isub
    //   33: putfield ZV : I
    //   36: aload_2
    //   37: ifnull -> 60
    //   40: iload_3
    //   41: aload_0
    //   42: getfield ZV : I
    //   45: iconst_1
    //   46: iadd
    //   47: if_icmpne -> 60
    //   50: aload_0
    //   51: dup
    //   52: getfield ZV : I
    //   55: iconst_1
    //   56: iadd
    //   57: putfield ZV : I
    //   60: aload_0
    //   61: getfield ZH : Lburp/Zgr_;
    //   64: aload_0
    //   65: getfield ZK : Z
    //   68: iload_3
    //   69: iconst_1
    //   70: isub
    //   71: invokevirtual Zz : (ZI)V
    //   74: aload_0
    //   75: getfield ZS : Lburp/Zbws;
    //   78: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   81: iload_3
    //   82: iconst_1
    //   83: isub
    //   84: iload_3
    //   85: iconst_1
    //   86: isub
    //   87: invokeinterface setSelectionInterval : (II)V
    //   92: return
  }
  
  private void Zu(ActionEvent paramActionEvent) {
    int[] arrayOfInt = Zr7c.Zv();
    if (this.ZK) {
      this.ZD.ZfO(this.ZQ.isSelected());
      if (arrayOfInt != null) {
        this.ZD.Zfm(this.ZQ.isSelected());
        return;
      } 
      return;
    } 
    this.ZD.Zfm(this.ZQ.isSelected());
  }
  
  private void Zn(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: getstatic burp/Zrrh.PROXY_OPTIONS_INTERCEPT_RULE_REMOVED : Lburp/Zrrh;
    //   3: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   6: invokestatic Zv : ()[I
    //   9: aload_0
    //   10: getfield ZS : Lburp/Zbws;
    //   13: invokevirtual getSelectedRow : ()I
    //   16: istore_3
    //   17: astore_2
    //   18: iload_3
    //   19: iconst_m1
    //   20: if_icmpne -> 24
    //   23: return
    //   24: iload_3
    //   25: aload_0
    //   26: getfield ZV : I
    //   29: if_icmpne -> 41
    //   32: aload_0
    //   33: iconst_m1
    //   34: putfield ZV : I
    //   37: aload_2
    //   38: ifnull -> 59
    //   41: iload_3
    //   42: aload_0
    //   43: getfield ZV : I
    //   46: if_icmpge -> 59
    //   49: aload_0
    //   50: dup
    //   51: getfield ZV : I
    //   54: iconst_1
    //   55: isub
    //   56: putfield ZV : I
    //   59: aload_0
    //   60: getfield ZH : Lburp/Zgr_;
    //   63: aload_0
    //   64: getfield ZK : Z
    //   67: iload_3
    //   68: invokevirtual Zh : (ZI)V
    //   71: iload_3
    //   72: aload_0
    //   73: getfield ZS : Lburp/Zbws;
    //   76: invokevirtual getRowCount : ()I
    //   79: if_icmplt -> 85
    //   82: iinc #3, -1
    //   85: iload_3
    //   86: iflt -> 114
    //   89: iload_3
    //   90: aload_0
    //   91: getfield ZS : Lburp/Zbws;
    //   94: invokevirtual getRowCount : ()I
    //   97: if_icmpge -> 114
    //   100: aload_0
    //   101: getfield ZS : Lburp/Zbws;
    //   104: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   107: iload_3
    //   108: iload_3
    //   109: invokeinterface setSelectionInterval : (II)V
    //   114: return
  }
  
  private void ZR(ActionEvent paramActionEvent) {
    Zm2.ZC(Zrrh.PROXY_OPTIONS_INTERCEPT_RULE_EDITED);
    int i = this.ZS.getSelectedRow();
    if (i == -1)
      return; 
    this.ZV = i;
    Zrgr zrgr = this.ZH.Zg(this.ZK, this.ZV);
    Zr7k zr7k = new Zr7k(this, zrgr, this.ZT, this.Zm);
    zr7k.setVisible(true);
  }
  
  private void Zg(ActionEvent paramActionEvent) {
    Zm2.ZC(Zrrh.PROXY_OPTIONS_INTERCEPT_RULE_ADDED);
    Zr7k zr7k = new Zr7k(this, null, this.ZT, this.Zm);
    zr7k.setVisible(true);
  }
  
  private void Za(ActionEvent paramActionEvent) {
    if (this.ZK)
      this.ZD.Zf_(this.ZC.isSelected()); 
  }
  
  static {
    // Byte code:
    //   0: bipush #44
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¾ÿ*~Ë«&?{=9ßu\\tsºÉDèÜ§\\föIhYTÌËf»Ðºs#ÿJQ§ñÇE3¡\\b1ue@h¯ûÔ<©R-ÃEIþ[ì\\bÙ)<¿âbb.­ÔÚ}ÓÊü¿núÜ\\nÍÕ³Êþò½°tÏT¯·Â×8mìä×Ì©éhÚ\\tn0g¦8© { » 2K$(¿æËñw¯ñáÅI¾t°¹"O¾D7¹°Eõ3$åÐ*81Ôï»ÓnSº<\\t¡0&vr´h7*t¸êjò~èø÷Õ#!ò*À¬Á]ÖÆW²a¾\\boÊÈ Ù¶ÌÓ­J»\\bWÃ¬>ð*ëVeAIQÇc%æç:Ùh9·Ù\\n\ÝÂ´`Ðh²?o·;\\tóÍ[[î½Ã?»©&±_¡èÔv\þÓvòoÌ|;pa=e±ê¡_\\n\\fïÖí¯CÞ\\bcv|»qà=£¦9.úqf  Ùb^H}päHw$\\f`WÊ-­Ü¥\ë#øQ©GnÔ½¯÷ÑÐ,²·ÛhÕ`qkd¼\\bB=}ý?0 @.Ãvj $'ûlk\\bKjuæÌ>P-Mèù.öDÉª0eQ¡2eá# ÖLW¶ûý§wÛT`iÙN¦êbÌïwâ$½wÛ@½Ç¤ÒÓ;ð¥"=#`:`ü3ÄÖ64Ïµ¹ËdÆ308¬âQ÷IÿÛªÑ¸h}û(Ù!ù8òn*\R[Ô¤/HWYò·d/ÙEéï\wlf8<Ät[®5Øý[\\b¦Ø JN\\b@W>qÔÛ&xyÿ+Î´ýÚI\\t¨S_68a®áhpä\¥­n>í<ØLB¹ìE&;ä28}±âÖÿJæ¯?^Tz³\\nèLjÚ\\fæ°,`à\\bªx_nsY²-·'ºihI Ühx8¹Ýæn¿PÔ¼IÇ?zGßO_\\rPu§cEfS»(\\b@b9ýÓ\\tê)ý³[~úÐKá:Þå«\\rë¸ý)$¸ç_1C·ÞoÆòSã²\\r?Oæ*ñÄLÎò\\tCÞz«ù9Å,r ÕÂóvÈ¶óß«è0«Å,§Èø¹~.Á©ÙqJªé\\f6|B#ä½É'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #114
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
    //   68: ldc 'Û)1><)yð,ËFë¦ý1Ù{kÏËhëßðØD\\fÊ·ÐömÁ_Ä,Ûäüctÿ]Á$\\f¤\\fDdÙª¿ÜÚQÏáá+ú(^Rø¤Ã'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #36
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #66
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
    //   129: putstatic burp/Zbep.a : [Ljava/lang/String;
    //   132: bipush #44
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbep.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #35
    //   214: goto -> 243
    //   217: bipush #116
    //   219: goto -> 243
    //   222: iconst_5
    //   223: goto -> 243
    //   226: bipush #123
    //   228: goto -> 243
    //   231: bipush #88
    //   233: goto -> 243
    //   236: bipush #15
    //   238: goto -> 243
    //   241: bipush #60
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
    int i = (paramInt1 ^ 0xFFFFDF7D) & 0xFFFF;
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
      char c = 'ö';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbep.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */