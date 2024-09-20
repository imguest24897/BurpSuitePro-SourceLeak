package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;

public class Zrhm extends Zrh7 {
  private Ze01 Z_;
  
  private Zl8w Zs;
  
  private Zbqc Zw;
  
  private Zbup Zu;
  
  private Zl86 ZD;
  
  private static final String a;
  
  public Zrhm(Window paramWindow, String paramString1, String paramString2, String paramString3) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iconst_1
    //   3: getstatic burp/Zzv7.CONFIG_IMPORT_EXPORT_RESULTS : Lburp/Zzv7;
    //   6: invokespecial <init> : (Ljava/awt/Window;ZLburp/Zzv7;)V
    //   9: invokestatic Za : ()[I
    //   12: aload_0
    //   13: invokevirtual Zx : ()V
    //   16: aload_0
    //   17: aload_2
    //   18: invokevirtual setTitle : (Ljava/lang/String;)V
    //   21: aload_0
    //   22: getfield Zs : Lburp/Zl8w;
    //   25: aload_3
    //   26: invokevirtual setText : (Ljava/lang/String;)V
    //   29: astore #5
    //   31: aload_0
    //   32: getfield ZD : Lburp/Zl86;
    //   35: aload #4
    //   37: invokevirtual setText : (Ljava/lang/String;)V
    //   40: aload_0
    //   41: getfield ZD : Lburp/Zl86;
    //   44: iconst_0
    //   45: invokevirtual setCaretPosition : (I)V
    //   48: aload_0
    //   49: bipush #60
    //   51: bipush #30
    //   53: invokestatic Zf : (Ljava/awt/Component;II)V
    //   56: aload_0
    //   57: invokevirtual pack : ()V
    //   60: aload_1
    //   61: ifnull -> 74
    //   64: aload_0
    //   65: aload_1
    //   66: invokestatic Zy : (Ljava/awt/Window;Ljava/awt/Window;)V
    //   69: aload #5
    //   71: ifnull -> 79
    //   74: aload_0
    //   75: aconst_null
    //   76: invokestatic Zq : (Ljava/awt/Window;Ljava/awt/Window;)V
    //   79: aload_0
    //   80: iconst_1
    //   81: invokevirtual setVisible : (Z)V
    //   84: return
  }
  
  private void Zx() {
    this.Zw = new Zbqc();
    this.Zs = new Zl8w();
    this.Zu = new Zbup();
    this.ZD = new Zl86();
    this.Z_ = new Ze01();
    setDefaultCloseOperation(2);
    getContentPane().setLayout(new GridLayout(1, 0));
    this.Zw.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0 };
    this.Zw.setLayout(gridBagLayout);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.Zw.add(this.Zs, gridBagConstraints);
    this.Zu.setHorizontalScrollBarPolicy(31);
    this.ZD.setLineWrap(true);
    this.ZD.setWrapStyleWord(true);
    this.Zu.setViewportView(this.ZD);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    this.Zw.add(this.Zu, gridBagConstraints);
    this.Z_.setText(a);
    this.Z_.addActionListener(new Zlq_(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 26;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    this.Zw.add(this.Z_, gridBagConstraints);
    getContentPane().add(this.Zw);
    pack();
  }
  
  private void ZG(ActionEvent paramActionEvent) {
    setVisible(false);
    dispose();
  }
  
  static {
    // Byte code:
    //   0: bipush #112
    //   2: ldc 'h%'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zrhm.a : Ljava/lang/String;
    //   11: goto -> 153
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #87
    //   82: goto -> 111
    //   85: bipush #30
    //   87: goto -> 111
    //   90: bipush #48
    //   92: goto -> 111
    //   95: bipush #126
    //   97: goto -> 111
    //   100: bipush #64
    //   102: goto -> 111
    //   105: iconst_5
    //   106: goto -> 111
    //   109: bipush #8
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrhm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */