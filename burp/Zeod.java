package burp;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Zeod {
  private static final Map<Zlah, Zeuf> Zk = Map.ofEntries((Map.Entry<? extends Zlah, ? extends Zeuf>[])new Map.Entry[] { 
        Map.entry(new Zlah((byte)4, (byte)3), Zeuf.SCAN_ISSUE_DECORATION_HIGH_CERTAIN), Map.entry(new Zlah((byte)4, (byte)2), Zeuf.SCAN_ISSUE_DECORATION_HIGH_TENTATIVE), Map.entry(new Zlah((byte)4, (byte)1), Zeuf.SCAN_ISSUE_DECORATION_HIGH_TENTATIVE), Map.entry(new Zlah((byte)3, (byte)3), Zeuf.SCAN_ISSUE_DECORATION_MEDIUM_CERTAIN), Map.entry(new Zlah((byte)3, (byte)2), Zeuf.SCAN_ISSUE_DECORATION_MEDIUM_TENTATIVE), Map.entry(new Zlah((byte)3, (byte)1), Zeuf.SCAN_ISSUE_DECORATION_MEDIUM_TENTATIVE), Map.entry(new Zlah((byte)2, (byte)3), Zeuf.SCAN_ISSUE_DECORATION_LOW_CERTAIN), Map.entry(new Zlah((byte)2, (byte)2), Zeuf.SCAN_ISSUE_DECORATION_LOW_TENTATIVE), Map.entry(new Zlah((byte)2, (byte)1), Zeuf.SCAN_ISSUE_DECORATION_LOW_TENTATIVE), Map.entry(new Zlah((byte)1, (byte)3), Zeuf.SCAN_ISSUE_DECORATION_INFO_CERTAIN), 
        Map.entry(new Zlah((byte)1, (byte)2), Zeuf.SCAN_ISSUE_DECORATION_INFO_TENTATIVE), Map.entry(new Zlah((byte)1, (byte)1), Zeuf.SCAN_ISSUE_DECORATION_INFO_TENTATIVE) });
  
  private final ImageIcon ZG;
  
  private final Map<Zlah, Icon> Zt = new HashMap<>();
  
  public Zeod(ImageIcon paramImageIcon) {
    this.ZG = paramImageIcon;
  }
  
  public Icon Zh(Zlah paramZlah) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual ZR : ()Z
    //   4: ifne -> 12
    //   7: aload_0
    //   8: getfield ZG : Ljavax/swing/ImageIcon;
    //   11: areturn
    //   12: aload_0
    //   13: getfield Zt : Ljava/util/Map;
    //   16: aload_1
    //   17: aload_0
    //   18: aload_1
    //   19: <illegal opcode> apply : (Lburp/Zeod;Lburp/Zlah;)Ljava/util/function/Function;
    //   24: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   29: checkcast javax/swing/Icon
    //   32: areturn
  }
  
  private Icon lambda$decorate$0(Zlah paramZlah1, Zlah paramZlah2) {
    Zeuf zeuf = Zk.get(paramZlah1);
    return (Icon)((zeuf == null) ? this.ZG : new Zmve(this.ZG, new FlatSVGIcon(zeuf.ZX())));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeod.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */