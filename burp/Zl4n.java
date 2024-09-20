package burp;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import javax.swing.Timer;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zli;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zsy;
import net.portswigger.Zuh;

public class Zl4n extends Zl04 implements KeyListener, ActionListener {
  private final Zez3[] ZJ;
  
  private final Zlll ZT;
  
  private final Zbnt ZF;
  
  private final Timer Zu;
  
  private final Zsy Zk;
  
  private final Zkl6 ZV;
  
  private final Zey9 Zr;
  
  private boolean Zl;
  
  private int ZZ;
  
  private int ZL;
  
  private long Zq;
  
  private Zm2o Zw;
  
  private Zbkc ZG;
  
  private Zbkc ZK;
  
  private Zm99 ZI;
  
  private Zbqc ZP;
  
  private Zbqc ZW;
  
  private Zzdy Zb;
  
  private Zbqc Zg;
  
  private Zl8w ZR;
  
  private Zm99 ZY;
  
  private Zm99 ZN;
  
  private Zm99 Zz;
  
  private Zm99 Zs;
  
  private Zm99 ZC;
  
  private Zm99 Zt;
  
  private Zm99 Za;
  
  private Zm99 ZE;
  
  private Zm99 Zm;
  
  private Zm99 Zf;
  
  private Zm99 Zh;
  
  private Zm99 ZQ;
  
  private Zm99 ZH;
  
  private Zm99 ZA;
  
  private Zm99 Zd;
  
  private Zm99 Zx;
  
  private Zm99 Zy;
  
  private Zm99 ZO;
  
  private Zm99 Zi;
  
  private Zm99 Zc;
  
  private Zm99 Zo;
  
  private Zg85 Zv;
  
  private static final String[] ZX;
  
  private final byte[] Zn = new byte[4];
  
  private boolean ZM;
  
  private int ZU;
  
  private static final byte[] ZS;
  
  private static int[] ZB;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zl4n(Window paramWindow, Zz0n paramZz0n, Zerg paramZerg, Zgb6 paramZgb6, Zkl6 paramZkl6, Ztwv paramZtwv, Zez3[] paramArrayOfZez3, Zlaa paramZlaa, Zlcb paramZlcb) {
    int[] arrayOfInt = ZT();
    Zuh.Zv((paramZerg != null), Zqf.Zv, 0L);
    Zm2.ZC(Zrrh.SUITE_TOOLS_MANUAL_TESTING_SIMULATOR);
    this.ZJ = paramArrayOfZez3;
    this.ZV = paramZkl6;
    this.ZF = paramZkl6.ZB();
    this.Zr = paramZkl6.ZH();
    ZO();
    this.Zb.ZO(Zt00.TITLE_BOLD_FONT);
    this.Zb.Zq(Zlkk.BURP_TITLE);
    this.Zk = paramZz0n.ZU();
    Zskh zskh = paramZerg.Zj().ZY4();
    this.ZT = new Zlll(paramZlaa.Zk(Zeew.TARGET, zskh, paramZlcb.ZW(Zeew.TARGET)), zskh, paramZgb6);
    paramZtwv.Zx(new Zzdo(this));
    setTitle(a(-6971, 16506));
    addWindowListener(new Zlyo(this));
    pack();
    setSize(Math.max(600, getWidth()), getHeight() + 5);
    this.Zg.setVisible(false);
    ZZ(this);
    this.Zu = new Timer(1000, this);
    this.Zu.start();
    ZO(paramWindow);
    setVisible(true);
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  private void ZO() {
    this.ZP = new Zbqc();
    this.Zb = new Zzdy();
    this.Zf = new Zm99();
    this.Zh = new Zm99();
    this.Zm = new Zm99();
    this.Zi = new Zm99();
    this.ZH = new Zm99();
    this.ZA = new Zm99();
    this.ZY = new Zm99();
    this.ZN = new Zm99();
    this.Zz = new Zm99();
    this.Zs = new Zm99();
    this.ZC = new Zm99();
    this.Zd = new Zm99();
    this.ZO = new Zm99();
    this.Zy = new Zm99();
    this.ZQ = new Zm99();
    this.Zx = new Zm99();
    this.ZR = new Zl8w();
    this.ZW = new Zbqc();
    this.Zg = new Zbqc();
    this.Zv = new Zg85();
    this.Zc = new Zm99();
    this.Zo = new Zm99();
    this.Zt = new Zm99();
    this.Za = new Zm99();
    this.ZE = new Zm99();
    this.ZK = new Zbkc();
    this.ZI = new Zm99();
    this.ZG = new Zbkc();
    this.Zw = new Zm2o();
    setDefaultCloseOperation(0);
    this.ZP.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0 };
    this.ZP.setLayout(gridBagLayout1);
    this.Zb.setText(a(-6955, -21922));
    this.Zb.addActionListener(new Zkcy(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(10, 0, 5, 0);
    this.ZP.add(this.Zb, gridBagConstraints);
    this.Zf.setText(a(-6937, -25313));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    this.ZP.add(this.Zf, gridBagConstraints);
    this.Zh.setText(a(-6970, -19565));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    this.ZP.add(this.Zh, gridBagConstraints);
    this.Zm.setText(a(-6930, -19254));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    this.ZP.add(this.Zm, gridBagConstraints);
    this.Zi.setHorizontalAlignment(4);
    this.Zi.setText("0");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    this.ZP.add(this.Zi, gridBagConstraints);
    this.ZH.setHorizontalAlignment(4);
    this.ZH.setText("0");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    this.ZP.add(this.ZH, gridBagConstraints);
    this.ZA.setHorizontalAlignment(4);
    this.ZA.setText("0");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    this.ZP.add(this.ZA, gridBagConstraints);
    this.ZY.setText(a(-6918, -12982));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.anchor = 1280;
    this.ZP.add(this.ZY, gridBagConstraints);
    this.ZN.setText(a(-6934, 17762));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = 1280;
    this.ZP.add(this.ZN, gridBagConstraints);
    this.Zz.setText(a(-6940, 32297));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.anchor = 1280;
    this.ZP.add(this.Zz, gridBagConstraints);
    this.Zs.setText(a(-6928, 6930));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 1280;
    this.ZP.add(this.Zs, gridBagConstraints);
    this.ZC.setText(a(-6916, 9055));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.anchor = 1280;
    this.ZP.add(this.ZC, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.anchor = 1280;
    this.ZP.add(this.Zd, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = 1280;
    this.ZP.add(this.ZO, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.anchor = 1280;
    this.ZP.add(this.Zy, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 1280;
    this.ZP.add(this.ZQ, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.anchor = 1280;
    this.ZP.add(this.Zx, gridBagConstraints);
    this.ZR.setText(a(-6965, -155));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    this.ZP.add(this.ZR, gridBagConstraints);
    this.ZW.setLayout(new BorderLayout());
    this.Zg.setBorder(BorderFactory.createEmptyBorder(15, 0, 15, 0));
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    this.Zg.setLayout(gridBagLayout2);
    this.Zv.setColumns(7);
    this.Zv.setText(a(-6915, 9145));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    this.Zg.add(this.Zv, gridBagConstraints);
    this.Zc.setText("0");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    this.Zg.add(this.Zc, gridBagConstraints);
    this.Zo.setText("0");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    this.Zg.add(this.Zo, gridBagConstraints);
    this.Zt.setText(a(-6921, 14177));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    this.Zg.add(this.Zt, gridBagConstraints);
    this.Za.setText(a(-6972, 32320));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    this.Zg.add(this.Za, gridBagConstraints);
    this.ZE.setText(a(-6913, 12118));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    this.Zg.add(this.ZE, gridBagConstraints);
    this.ZK.Zx(a(-6976, 6757));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    this.Zg.add(this.ZK, gridBagConstraints);
    this.ZW.add(this.Zg, a(-6967, -1989));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(5, 0, 0, 0);
    this.ZP.add(this.ZW, gridBagConstraints);
    this.ZI.setText(" ");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 24;
    gridBagConstraints.weighty = 1.0D;
    this.ZP.add(this.ZI, gridBagConstraints);
    this.ZG.Zx(a(-6961, -20844));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(15, 0, 0, 0);
    this.ZP.add(this.ZG, gridBagConstraints);
    this.Zw.Zi(Zk97.DESKTOP_FUNCTIONS_MANUAL_SIMULATOR);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.ZP.add(this.Zw, gridBagConstraints);
    getContentPane().add(this.ZP, a(-6963, 21273));
    pack();
  }
  
  private void ZB(ActionEvent paramActionEvent) {
    synchronized (this) {
      notifyAll();
    } 
  }
  
  private void Zu() {
    try {
      Thread.sleep((2000 + (int)(Math.random() * 10000.0D)));
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
    } 
  }
  
  private String Zd(String paramString) {
    return (paramString.length() > 60) ? (paramString.substring(0, 20) + paramString.substring(0, 20) + a(-6941, -3495)) : paramString;
  }
  
  private void ZZ(Container paramContainer) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: invokevirtual addKeyListener : (Ljava/awt/event/KeyListener;)V
    //   5: invokestatic ZT : ()[I
    //   8: aload_1
    //   9: invokevirtual getComponents : ()[Ljava/awt/Component;
    //   12: astore_3
    //   13: astore_2
    //   14: aload_3
    //   15: astore #4
    //   17: aload #4
    //   19: arraylength
    //   20: istore #5
    //   22: iconst_0
    //   23: istore #6
    //   25: iload #6
    //   27: iload #5
    //   29: if_icmpge -> 73
    //   32: aload #4
    //   34: iload #6
    //   36: aaload
    //   37: astore #7
    //   39: aload #7
    //   41: instanceof java/awt/Container
    //   44: ifeq -> 60
    //   47: aload_0
    //   48: aload #7
    //   50: checkcast java/awt/Container
    //   53: invokevirtual ZZ : (Ljava/awt/Container;)V
    //   56: aload_2
    //   57: ifnonnull -> 66
    //   60: aload #7
    //   62: aload_0
    //   63: invokevirtual addKeyListener : (Ljava/awt/event/KeyListener;)V
    //   66: iinc #6, 1
    //   69: aload_2
    //   70: ifnonnull -> 25
    //   73: return
  }
  
  public void keyTyped(KeyEvent paramKeyEvent) {
    this.Zn[0] = this.Zn[1];
    this.Zn[1] = this.Zn[2];
    this.Zn[2] = this.Zn[3];
    this.Zn[3] = (byte)paramKeyEvent.getKeyChar();
    int[] arrayOfInt = ZT();
    if (Zli.ZQ(this.Zn, ZS) && !this.ZM)
      this.Zg.setVisible(true); 
    if (Zbqc.Zwu() == null)
      Zu(new int[2]); 
  }
  
  public void keyPressed(KeyEvent paramKeyEvent) {}
  
  public void keyReleased(KeyEvent paramKeyEvent) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    int[] arrayOfInt = ZT();
    try {
      if (this.Zb.isSelected())
        this.ZU++; 
    } catch (Exception exception) {
      throw a(null);
    } 
    String str1 = this.Zv.getText();
    String str2 = "";
    int i = 0;
    try {
      byte b = 0;
      while (b < str1.length()) {
        try {
          if (!Character.isDigit(str1.charAt(b))) {
            b++;
            if (arrayOfInt == null)
              break; 
          } 
        } catch (Exception exception) {
          throw a(null);
        } 
      } 
      str2 = str1.substring(0, b);
      i = Integer.parseInt(str1.substring(b));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    try {
    
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
    
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      this.Zc.setText(((this.ZU < 3600) ? "" : ("" + this.ZU / 3600 + this.ZU / 3600)) + ((this.ZU < 3600) ? "" : ("" + this.ZU / 3600 + this.ZU / 3600)) + ((this.ZU < 60) ? "" : ("" + this.ZU % 3600 / 60 + this.ZU % 3600 / 60)) + "s");
      if (i == 0) {
        this.Zo.setText("");
        if (arrayOfInt == null) {
          float f1 = this.ZU * i / 28800.0F;
          this.Zo.setText(str2 + str2);
          return;
        } 
        return;
      } 
    } catch (Exception exception) {
      throw a(null);
    } 
    float f = this.ZU * i / 28800.0F;
    this.Zo.setText(str2 + str2);
  }
  
  static {
    // Byte code:
    //   0: bipush #52
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_3
    //   8: newarray int
    //   10: iconst_0
    //   11: istore_3
    //   12: ldc 'íqCd¶ÄÏÌË#lC\\nKpE5Ï³¸­BoE\!ôùz\\f_Kòì$KÕ¹¸!«Àû;qµÓ\\f' nÅ~j Ç0v?\\t`Ù ûKÉ£ý6\\r±¨ÌiöN_ó($À«Ô»wÂ\\b%1æàåñ/t$}vWßY°ËÅa`fUê=}¯üxÃK1ÆöôhnþµÇ4ÏhM¨)ôIS·áü®óò¡Áf«÷Ëº\\r3u·5vkpz\\bÈbÕ¹3Ñ»­(¼ýhbD.Ò\\b¹0¥9 ¿³6\\tGYY9S5-002·ãèlÓ²ygw[Þïµ'(OYàøÙ°¤&>n|iþ:¸¨cN¦(ÜÅ·XèÓ\yØg'w,0ïh')(øO·=Cx`ÈpÓ·£§¿ºõÚZÉ´D©·ÀU®*#fyDP¥ÎÒæÁ\õ5ÐÒrÝ-~W+{c'#£YîÇ>\\fgÑ2 ³:A}ÈuKLløÒ`Î<éöè \\f\\b¬WÀ¬¹ÕSPåO\\tyÜÄÝÚÿr"é"ïâ£1ÞÁhsí½Nnøu/7mq&Í»å3ÒØ ?»3ëGh¾$$Á©ôâÂ¸mÑ\\r³Áî4y£ºXB¯üGÇÖrB¬ZAâþ¨©\RÛÞw¿ðqÎüS!RDlð%}à#¿qä¨E[8ßO»º5¿³*X­C|=^!&*qãª8%ÍÞ¯wú(ÊY©Ì³?OÖ°;\\bÉIZzþ}_mAeÑÍÖÛ.NÃÐÏ)3a8±éd®·k²áõ)ØïgeQf½h´\\båfÆÆÜz¢Rÿ© tª~àéáÀ!#ŜÌ;*fFâþ®RÂÿl7÷u^B ð±1y\\fùi§©=U;3&4 - P5\¶=Ö\\t¢ØÄÍ;#Ò+1rëz¾a°¸[5¯$ì5c¥è_kÄÿWQ$¿9¨s¬/8Ùä|üääÑDá#«µN7ygtH>w:§»ÂðáÃ@b\\tå»V9&áä¾H2?A^KiwU2Ô®Õj#¡Cb8V\\n8Ü¥S^§M¾C!ØÂ½z\\b}\\f^Rm0ûmOÅÁî]qH«¾~º¯áösG±>«xI¶Û²ø!Tÿ*èFõµYµ§CYy©qÊv/¡y X;¦(ïBêâË¦13wÆmlÑ\\tá-ØÏwÄKÛÀWZ\\rnl_õ®¤RÝ¨¥éÂØÞM (ÛÚH'5òä¿Î´µiÒîßÕÄàñKÃÍüµF;°UÚu'
    //   14: dup
    //   15: astore_2
    //   16: invokevirtual length : ()I
    //   19: istore #4
    //   21: iconst_2
    //   22: istore_1
    //   23: invokestatic Zu : ([I)V
    //   26: iconst_m1
    //   27: istore_0
    //   28: iconst_5
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 28
    //   72: ldc '¹êR}Ðuhü«õéd}d·QïÙÓåQ,0fèìKgåÜQËýlòKSC'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #35
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #99
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic burp/Zl4n.a : [Ljava/lang/String;
    //   136: bipush #52
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zl4n.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #61
    //   218: goto -> 248
    //   221: bipush #108
    //   223: goto -> 248
    //   226: bipush #6
    //   228: goto -> 248
    //   231: bipush #63
    //   233: goto -> 248
    //   236: bipush #83
    //   238: goto -> 248
    //   241: bipush #127
    //   243: goto -> 248
    //   246: bipush #58
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 103
    //   304: bipush #33
    //   306: anewarray java/lang/String
    //   309: dup
    //   310: iconst_0
    //   311: ldc '''
    //   313: aastore
    //   314: dup
    //   315: iconst_1
    //   316: sipush #-6969
    //   319: sipush #-31403
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: aastore
    //   326: dup
    //   327: iconst_2
    //   328: sipush #-6924
    //   331: sipush #12700
    //   334: invokestatic a : (II)Ljava/lang/String;
    //   337: aastore
    //   338: dup
    //   339: iconst_3
    //   340: sipush #-6938
    //   343: sipush #30009
    //   346: invokestatic a : (II)Ljava/lang/String;
    //   349: aastore
    //   350: dup
    //   351: iconst_4
    //   352: sipush #-6975
    //   355: sipush #-1805
    //   358: invokestatic a : (II)Ljava/lang/String;
    //   361: aastore
    //   362: dup
    //   363: iconst_5
    //   364: sipush #-6944
    //   367: sipush #2226
    //   370: invokestatic a : (II)Ljava/lang/String;
    //   373: aastore
    //   374: dup
    //   375: bipush #6
    //   377: sipush #-6929
    //   380: sipush #-1165
    //   383: invokestatic a : (II)Ljava/lang/String;
    //   386: aastore
    //   387: dup
    //   388: bipush #7
    //   390: sipush #-6966
    //   393: sipush #32630
    //   396: invokestatic a : (II)Ljava/lang/String;
    //   399: aastore
    //   400: dup
    //   401: bipush #8
    //   403: sipush #-6917
    //   406: sipush #10044
    //   409: invokestatic a : (II)Ljava/lang/String;
    //   412: aastore
    //   413: dup
    //   414: bipush #9
    //   416: sipush #-6925
    //   419: sipush #6165
    //   422: invokestatic a : (II)Ljava/lang/String;
    //   425: aastore
    //   426: dup
    //   427: bipush #10
    //   429: sipush #-6964
    //   432: sipush #-20317
    //   435: invokestatic a : (II)Ljava/lang/String;
    //   438: aastore
    //   439: dup
    //   440: bipush #11
    //   442: sipush #-6923
    //   445: sipush #6764
    //   448: invokestatic a : (II)Ljava/lang/String;
    //   451: aastore
    //   452: dup
    //   453: bipush #12
    //   455: sipush #-6973
    //   458: sipush #23954
    //   461: invokestatic a : (II)Ljava/lang/String;
    //   464: aastore
    //   465: dup
    //   466: bipush #13
    //   468: sipush #-6926
    //   471: sipush #1782
    //   474: invokestatic a : (II)Ljava/lang/String;
    //   477: aastore
    //   478: dup
    //   479: bipush #14
    //   481: sipush #-6933
    //   484: sipush #32287
    //   487: invokestatic a : (II)Ljava/lang/String;
    //   490: aastore
    //   491: dup
    //   492: bipush #15
    //   494: sipush #-6962
    //   497: sipush #-32524
    //   500: invokestatic a : (II)Ljava/lang/String;
    //   503: aastore
    //   504: dup
    //   505: bipush #16
    //   507: sipush #-6939
    //   510: sipush #-4009
    //   513: invokestatic a : (II)Ljava/lang/String;
    //   516: aastore
    //   517: dup
    //   518: bipush #17
    //   520: sipush #-6968
    //   523: sipush #-721
    //   526: invokestatic a : (II)Ljava/lang/String;
    //   529: aastore
    //   530: dup
    //   531: bipush #18
    //   533: sipush #-6914
    //   536: sipush #-4541
    //   539: invokestatic a : (II)Ljava/lang/String;
    //   542: aastore
    //   543: dup
    //   544: bipush #19
    //   546: sipush #-6927
    //   549: sipush #-8450
    //   552: invokestatic a : (II)Ljava/lang/String;
    //   555: aastore
    //   556: dup
    //   557: bipush #20
    //   559: sipush #-6935
    //   562: sipush #-23669
    //   565: invokestatic a : (II)Ljava/lang/String;
    //   568: aastore
    //   569: dup
    //   570: bipush #21
    //   572: sipush #-6920
    //   575: sipush #17970
    //   578: invokestatic a : (II)Ljava/lang/String;
    //   581: aastore
    //   582: dup
    //   583: bipush #22
    //   585: sipush #-6936
    //   588: sipush #-26280
    //   591: invokestatic a : (II)Ljava/lang/String;
    //   594: aastore
    //   595: dup
    //   596: bipush #23
    //   598: sipush #-6919
    //   601: sipush #-8141
    //   604: invokestatic a : (II)Ljava/lang/String;
    //   607: aastore
    //   608: dup
    //   609: bipush #24
    //   611: sipush #-6931
    //   614: sipush #-1461
    //   617: invokestatic a : (II)Ljava/lang/String;
    //   620: aastore
    //   621: dup
    //   622: bipush #25
    //   624: sipush #-6943
    //   627: sipush #-6436
    //   630: invokestatic a : (II)Ljava/lang/String;
    //   633: aastore
    //   634: dup
    //   635: bipush #26
    //   637: sipush #-6956
    //   640: sipush #-3406
    //   643: invokestatic a : (II)Ljava/lang/String;
    //   646: aastore
    //   647: dup
    //   648: bipush #27
    //   650: ldc '>'
    //   652: aastore
    //   653: dup
    //   654: bipush #28
    //   656: ldc '<'
    //   658: aastore
    //   659: dup
    //   660: bipush #29
    //   662: sipush #-6974
    //   665: sipush #29930
    //   668: invokestatic a : (II)Ljava/lang/String;
    //   671: aastore
    //   672: dup
    //   673: bipush #30
    //   675: sipush #-6954
    //   678: sipush #-6935
    //   681: invokestatic a : (II)Ljava/lang/String;
    //   684: aastore
    //   685: dup
    //   686: bipush #31
    //   688: sipush #-6922
    //   691: sipush #-28459
    //   694: invokestatic a : (II)Ljava/lang/String;
    //   697: aastore
    //   698: dup
    //   699: bipush #32
    //   701: sipush #-6953
    //   704: sipush #-18131
    //   707: invokestatic a : (II)Ljava/lang/String;
    //   710: aastore
    //   711: putstatic burp/Zl4n.ZX : [Ljava/lang/String;
    //   714: iconst_4
    //   715: newarray byte
    //   717: dup
    //   718: iconst_0
    //   719: bipush #98
    //   721: bastore
    //   722: dup
    //   723: iconst_1
    //   724: bipush #117
    //   726: bastore
    //   727: dup
    //   728: iconst_2
    //   729: bipush #114
    //   731: bastore
    //   732: dup
    //   733: iconst_3
    //   734: bipush #112
    //   736: bastore
    //   737: putstatic burp/Zl4n.ZS : [B
    //   740: return
  }
  
  public static void Zu(int[] paramArrayOfint) {
    ZB = paramArrayOfint;
  }
  
  public static int[] ZT() {
    return ZB;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE4E6) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl4n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */