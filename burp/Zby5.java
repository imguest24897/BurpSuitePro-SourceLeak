package burp;

import java.awt.FlowLayout;

public class Zby5 extends Zbqc {
  private Zm99 Zo;
  
  private Zm99 ZW;
  
  private static final String a;
  
  public Zby5() {
    ZX();
  }
  
  public void Zi(Zzsm paramZzsm) {
    this.Zo.setIcon(paramZzsm.svgIconFile.ZD());
    this.ZW.setText(paramZzsm.displayLabel);
  }
  
  private void ZX() {
    this.Zo = new Zm99();
    this.ZW = new Zm99();
    setLayout(new FlowLayout(0, 10, 0));
    add(this.Zo);
    this.ZW.setText(a);
    add(this.ZW);
  }
  
  static {
    // Byte code:
    //   0: bipush #26
    //   2: ldc 'uf(c~=&E'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zby5.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #85
    //   82: goto -> 111
    //   85: bipush #106
    //   87: goto -> 111
    //   90: bipush #79
    //   92: goto -> 111
    //   95: bipush #44
    //   97: goto -> 111
    //   100: bipush #64
    //   102: goto -> 111
    //   105: bipush #22
    //   107: goto -> 111
    //   110: iconst_3
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zby5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */