package burp;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JTable;

public class Zbgs extends Zbgn {
  private final Function<Integer, Zryx> ZF;
  
  private final Consumer<Zryx> Zd;
  
  private Zryx Zo;
  
  private Zzdy ZW;
  
  private Box.Filler Za;
  
  private Zm99 Zf;
  
  private static final String a;
  
  public Zbgs(Function<Integer, Zryx> paramFunction, Consumer<Zryx> paramConsumer) {
    this.ZF = paramFunction;
    this.Zd = paramConsumer;
    ZL();
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    Zryx zryx = this.ZF.apply(Integer.valueOf(paramInt1));
    ZN(zryx);
    return super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
  }
  
  void ZN(Zryx paramZryx) {
    this.Zo = paramZryx;
    this.ZW.setSelected(paramZryx.Zl());
    String str = Zbve.ZH();
    if (paramZryx.Zb()) {
      this.Zf.setIcon(null);
      setToolTipText((String)null);
      if (str != null) {
        Ze9n ze9n1 = Ze3m.ZC(Zeuf.WARNING, Zlkk.BCHECK_SCRIPT_IMPORT_ERROR_ICON).ZU(Zmcx.LINE_SIZE).Z_();
        this.Zf.setIcon(ze9n1);
        setToolTipText(a);
        return;
      } 
      return;
    } 
    Ze9n ze9n = Ze3m.ZC(Zeuf.WARNING, Zlkk.BCHECK_SCRIPT_IMPORT_ERROR_ICON).ZU(Zmcx.LINE_SIZE).Z_();
    this.Zf.setIcon(ze9n);
    setToolTipText(a);
  }
  
  private void ZP() {
    if (this.Zo != null)
      this.Zd.accept(this.Zo.ZF().Zd(this.ZW.isSelected()).Zr()); 
  }
  
  private void ZL() {
    this.ZW = new Zzdy();
    this.Za = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
    this.Zf = new Zm99();
    setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
    setLayout(new GridBagLayout());
    this.ZW.addActionListener(new Zeoe(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    add(this.ZW, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    add(this.Za, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 22;
    add(this.Zf, gridBagConstraints);
  }
  
  private void Zd(ActionEvent paramActionEvent) {
    ZP();
  }
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: ldc 'LA-}OZnJy}\\bIQ;Ec8^GtV-oI[;PaBR;Pb8\\bIrI}w\\bXoLdkZ_ViM}lZC[;Wyy\\bXnT#'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zbgs.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 99, 5 -> 104
    //   80: bipush #6
    //   82: goto -> 111
    //   85: bipush #57
    //   87: goto -> 111
    //   90: bipush #16
    //   92: goto -> 111
    //   95: iconst_5
    //   96: goto -> 111
    //   99: bipush #103
    //   101: goto -> 111
    //   104: bipush #49
    //   106: goto -> 111
    //   109: bipush #40
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbgs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */