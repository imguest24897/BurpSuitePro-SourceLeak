package burp;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zb52 extends Zbqc {
  public static final Border ZS;
  
  private static final Ze9n ZA;
  
  private static final Ze9n ZP;
  
  private final Zg85 Zo;
  
  private final Zm99 Zj;
  
  private final Zm99 Zs;
  
  private final Zm99 ZF;
  
  private final Zexh Zz;
  
  private final Zg5f Zh;
  
  private final Ze0q Zn;
  
  private final String Zl;
  
  private Zzsp ZJ = Zzsp.INITIAL;
  
  private CompletableFuture<Zrk5> ZM;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zb52(String paramString1, String paramString2, Zg5f paramZg5f) {
    super(new GridBagLayout());
    this.Zh = paramZg5f;
    this.Zl = paramString2;
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(0, 0, 4, 0);
    add(new Zm99(paramString1), gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridy = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.gridwidth = 1;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(0, 0, 6, 0);
    gridBagConstraints.anchor = 17;
    this.Zo = new Zgfz(this);
    this.Zo.setName(a(-17080, -8196));
    this.Zo.setColumns(1);
    this.Zo.addActionListener(this::lambda$new$0);
    this.Zo.addKeyListener(new Zm0_(this));
    this.Zo.getDocument().addDocumentListener(new Zriq(this));
    add(this.Zo, gridBagConstraints);
    this.Zn = new Ze0q(paramString2);
    this.Zn.setName(a(-17084, -17944));
    this.Zn.setEnabled(false);
    this.Zn.addActionListener(this::lambda$new$0);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridx = 1;
    gridBagConstraints.weightx = 0.0D;
    gridBagConstraints.gridwidth = 1;
    gridBagConstraints.fill = 0;
    gridBagConstraints.insets = new Insets(0, 6, 6, 0);
    add(this.Zn, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridx = 0;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(0, 0, 6, 0);
    this.Zz = new Zexh();
    this.Zz.setName(a(-17083, 11545));
    this.Zz.setIndeterminate(true);
    this.Zz.ZX(Zlkk.FILE_UPLOAD_PROGRESS_FOREGROUND);
    this.Zz.setAlignmentX(0.5F);
    this.Zz.setPreferredSize(new Dimension(1, 5));
    this.Zz.setVisible(false);
    add(this.Zz, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridy = 3;
    gridBagConstraints.gridx = 0;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(0, 0, 6, 0);
    this.Zs = new Zm99("", ZA);
    this.Zs.setName(a(-17077, -22428));
    this.Zs.setVisible(false);
    this.Zs.ZE(Zt00.BOLD_FONT);
    this.Zs.Ze(Zlkk.FILE_UPLOAD_ERROR);
    add(this.Zs, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridx = 0;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(0, 0, 6, 0);
    this.ZF = new Zm99(a(-17075, 22856), ZP);
    this.ZF.setName(a(-17073, 15304));
    this.ZF.setVisible(false);
    int[] arrayOfInt = Zt3i.Zu();
    this.ZF.ZE(Zt00.BOLD_FONT);
    this.ZF.Ze(Zlkk.URL_INPUT_STATUS_DONE);
    add(this.ZF, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridy = 5;
    gridBagConstraints.gridx = 0;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(0, 0, 6, 0);
    this.Zj = new Zm99(a(-17074, -1191));
    this.Zj.setVisible(false);
    this.Zj.ZE(Zt00.BOLD_FONT);
    add(this.Zj, gridBagConstraints);
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    Arrays.<Component>stream(getComponents()).forEach(paramBoolean::lambda$setEnabled$2);
  }
  
  private void Zp() {
    // Byte code:
    //   0: invokestatic Zu : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZJ : Lburp/Zzsp;
    //   8: getstatic burp/Zzsp.SUCCESS : Lburp/Zzsp;
    //   11: invokevirtual equals : (Ljava/lang/Object;)Z
    //   14: ifeq -> 25
    //   17: aload_0
    //   18: invokevirtual Zd : ()V
    //   21: aload_1
    //   22: ifnull -> 50
    //   25: aload_0
    //   26: getfield ZJ : Lburp/Zzsp;
    //   29: getstatic burp/Zzsp.IN_PROGRESS : Lburp/Zzsp;
    //   32: invokevirtual equals : (Ljava/lang/Object;)Z
    //   35: ifeq -> 46
    //   38: aload_0
    //   39: invokevirtual Zz : ()V
    //   42: aload_1
    //   43: ifnull -> 50
    //   46: aload_0
    //   47: invokevirtual Zc : ()V
    //   50: return
  }
  
  private void Zd() {
    if (this.ZM != null)
      this.ZM.cancel(true); 
    this.Zo.setText("");
    ZC(Zzsp.INITIAL);
  }
  
  private void Zz() {
    if (this.ZM != null)
      this.ZM.cancel(true); 
    ZC(Zzsp.INITIAL);
  }
  
  private void Zc() {
    ZC(Zzsp.IN_PROGRESS);
    this.ZM = this.Zh.ZQ(this.Zo.getText());
    this.ZM.thenAcceptAsync(this::lambda$start$5).exceptionally(this::lambda$start$7).whenComplete(this::lambda$start$8);
  }
  
  private void ZC(Zzsp paramZzsp) {
    // Byte code:
    //   0: invokestatic Zu : ()[I
    //   3: astore_2
    //   4: aload_0
    //   5: aload_1
    //   6: putfield ZJ : Lburp/Zzsp;
    //   9: aload_0
    //   10: getfield ZJ : Lburp/Zzsp;
    //   13: getstatic burp/Zzsp.INITIAL : Lburp/Zzsp;
    //   16: invokevirtual equals : (Ljava/lang/Object;)Z
    //   19: ifne -> 35
    //   22: aload_0
    //   23: getfield ZJ : Lburp/Zzsp;
    //   26: getstatic burp/Zzsp.ERROR : Lburp/Zzsp;
    //   29: invokevirtual equals : (Ljava/lang/Object;)Z
    //   32: ifeq -> 44
    //   35: aload_0
    //   36: getfield Zh : Lburp/Zg5f;
    //   39: invokeinterface ZB : ()V
    //   44: aload_0
    //   45: getfield ZJ : Lburp/Zzsp;
    //   48: invokevirtual ordinal : ()I
    //   51: lookupswitch default -> 116, 1 -> 76, 3 -> 96
    //   76: aload_0
    //   77: getfield Zn : Lburp/Ze0q;
    //   80: sipush #-17079
    //   83: sipush #31468
    //   86: invokestatic a : (II)Ljava/lang/String;
    //   89: invokevirtual setText : (Ljava/lang/String;)V
    //   92: aload_2
    //   93: ifnull -> 127
    //   96: aload_0
    //   97: getfield Zn : Lburp/Ze0q;
    //   100: sipush #-17078
    //   103: sipush #-31619
    //   106: invokestatic a : (II)Ljava/lang/String;
    //   109: invokevirtual setText : (Ljava/lang/String;)V
    //   112: aload_2
    //   113: ifnull -> 127
    //   116: aload_0
    //   117: getfield Zn : Lburp/Ze0q;
    //   120: aload_0
    //   121: getfield Zl : Ljava/lang/String;
    //   124: invokevirtual setText : (Ljava/lang/String;)V
    //   127: aload_0
    //   128: invokevirtual ZP : ()V
    //   131: return
  }
  
  private void ZP() {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    this.Zo.setEnabled((!this.ZJ.equals(Zzsp.IN_PROGRESS) && !this.ZJ.equals(Zzsp.SUCCESS)));
    this.Zn.setEnabled(!this.Zo.getText().isEmpty());
    this.Zz.setVisible(this.ZJ.equals(Zzsp.IN_PROGRESS));
    this.Zj.setVisible(this.ZJ.equals(Zzsp.IN_PROGRESS));
    this.Zs.setVisible(this.ZJ.equals(Zzsp.ERROR));
    this.ZF.setVisible(this.ZJ.equals(Zzsp.SUCCESS));
    updateUI();
  }
  
  private void ZG(String paramString) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    this.Zs.setText(paramString);
    ZC(Zzsp.ERROR);
  }
  
  private void ZM(String paramString) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    this.ZF.setText(paramString);
    ZC(Zzsp.SUCCESS);
  }
  
  public void Zy(String paramString) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    this.Zj.setText(paramString);
    updateUI();
  }
  
  private void lambda$start$8(Void paramVoid, Throwable paramThrowable) {
    this.ZM = null;
  }
  
  private Void lambda$start$7(Throwable paramThrowable) {
    Zah.Zl(paramThrowable, Zk_.UNEXPECTED);
    if (this.ZM != null && !this.ZM.isCancelled())
      SwingUtilities.invokeLater(this::lambda$start$6); 
    return null;
  }
  
  private void lambda$start$6() {
    ZG(a(-17076, 8060));
  }
  
  private void lambda$start$5(Zrk5 paramZrk5) {
    // Byte code:
    //   0: invokestatic Zu : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual Zvi : ()Z
    //   8: ifeq -> 25
    //   11: aload_0
    //   12: aload_1
    //   13: <illegal opcode> run : (Lburp/Zb52;Lburp/Zrk5;)Ljava/lang/Runnable;
    //   18: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   21: aload_2
    //   22: ifnull -> 35
    //   25: aload_0
    //   26: aload_1
    //   27: <illegal opcode> run : (Lburp/Zb52;Lburp/Zrk5;)Ljava/lang/Runnable;
    //   32: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   35: return
  }
  
  private void lambda$start$4(Zrk5 paramZrk5) {
    ZG(paramZrk5.ZvD());
  }
  
  private void lambda$start$3(Zrk5 paramZrk5) {
    ZM(paramZrk5.ZvD());
  }
  
  private static void lambda$setEnabled$2(boolean paramBoolean, Component paramComponent) {
    paramComponent.setEnabled(paramBoolean);
  }
  
  private void lambda$new$0(ActionEvent paramActionEvent) {
    Zp();
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'u) SS¦Ü»ùùÚ£­|ÔBÈ\AVCN¢Qh:«2B"LÉÏv@9¢²s½\\\n¹uÕñkxADÑFØ}4ö±C2læQ1ßé½$sÚTÂÌ\\r®å ÝîÀøð TØYY±¡i#Û'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #7
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #125
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
    //   68: ldc ')O¨mqiòxòõ;eäíywÎc6ðk§±êÄekoñQýúÓ,UJ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #24
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
    //   129: putstatic burp/Zb52.a : [Ljava/lang/String;
    //   132: bipush #10
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zb52.b : [Ljava/lang/String;
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
    //   212: bipush #66
    //   214: goto -> 244
    //   217: bipush #11
    //   219: goto -> 244
    //   222: bipush #17
    //   224: goto -> 244
    //   227: bipush #46
    //   229: goto -> 244
    //   232: bipush #38
    //   234: goto -> 244
    //   237: bipush #56
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
    //   300: new burp/Zdf
    //   303: dup
    //   304: new java/awt/Insets
    //   307: dup
    //   308: iconst_3
    //   309: iconst_3
    //   310: iconst_3
    //   311: iconst_3
    //   312: invokespecial <init> : (IIII)V
    //   315: getstatic burp/Zlkk.TABLE_FILTER_BAR_BORDER : Lburp/Zlkk;
    //   318: fconst_1
    //   319: bipush #8
    //   321: invokespecial <init> : (Ljava/awt/Insets;Lburp/Zlkk;FI)V
    //   324: putstatic burp/Zb52.ZS : Ljavax/swing/border/Border;
    //   327: new burp/Ze3m
    //   330: dup
    //   331: getstatic burp/Zeuf.WARNING : Lburp/Zeuf;
    //   334: getstatic burp/Zlkk.FILE_UPLOAD_ERROR : Lburp/Zlkk;
    //   337: invokespecial <init> : (Lburp/Zeuf;Lburp/Zlkk;)V
    //   340: getstatic burp/Zmcx.LARGE_LINE_SIZE : Lburp/Zmcx;
    //   343: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   346: invokevirtual Z_ : ()Lburp/Ze9n;
    //   349: putstatic burp/Zb52.ZA : Lburp/Ze9n;
    //   352: new burp/Ze3m
    //   355: dup
    //   356: getstatic burp/Zeuf.CHECK : Lburp/Zeuf;
    //   359: getstatic burp/Zlkk.URL_INPUT_STATUS_DONE : Lburp/Zlkk;
    //   362: invokespecial <init> : (Lburp/Zeuf;Lburp/Zlkk;)V
    //   365: getstatic burp/Zmcx.LARGE_LINE_SIZE : Lburp/Zmcx;
    //   368: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   371: invokevirtual Z_ : ()Lburp/Ze9n;
    //   374: putstatic burp/Zb52.ZP : Lburp/Ze9n;
    //   377: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFBD4D) & 0xFFFF;
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
      byte b1 = 95;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb52.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */