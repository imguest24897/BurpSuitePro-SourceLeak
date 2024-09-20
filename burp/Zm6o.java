package burp;

import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;

public class Zm6o {
  private static final String a;
  
  static DefaultCellEditor Zi() {
    DefaultComboBoxModel<Zzsm> defaultComboBoxModel = new DefaultComboBoxModel<>(Zzsm.ZP());
    Zedd<Zzsm> zedd = new Zedd();
    zedd.setName(a);
    zedd.setRenderer(new Ztgg());
    zedd.setModel(defaultComboBoxModel);
    return new DefaultCellEditor(zedd);
  }
  
  static {
    // Byte code:
    //   0: bipush #75
    //   2: ldc '&.G;\w,G7Ya(R FA-=I'vk$\\t&'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zm6o.a : Ljava/lang/String;
    //   11: goto -> 152
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
    //   29: if_icmpgt -> 126
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 108, 0 -> 80, 1 -> 84, 2 -> 89, 3 -> 93, 4 -> 98, 5 -> 103
    //   80: iconst_2
    //   81: goto -> 110
    //   84: bipush #32
    //   86: goto -> 110
    //   89: iconst_2
    //   90: goto -> 110
    //   93: bipush #109
    //   95: goto -> 110
    //   98: bipush #30
    //   100: goto -> 110
    //   103: bipush #126
    //   105: goto -> 110
    //   108: bipush #79
    //   110: ixor
    //   111: ixor
    //   112: i2c
    //   113: castore
    //   114: iinc #0, 1
    //   117: dup
    //   118: ifne -> 126
    //   121: dup2
    //   122: dup_x1
    //   123: goto -> 35
    //   126: dup2_x1
    //   127: pop2
    //   128: dup_x2
    //   129: iload_0
    //   130: if_icmpgt -> 32
    //   133: pop
    //   134: new java/lang/String
    //   137: dup_x1
    //   138: swap
    //   139: invokespecial <init> : ([C)V
    //   142: invokevirtual intern : ()Ljava/lang/String;
    //   145: swap
    //   146: pop
    //   147: swap
    //   148: pop
    //   149: goto -> 8
    //   152: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm6o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */