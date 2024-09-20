package burp;

import java.util.List;
import java.util.Optional;
import javax.swing.SwingUtilities;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztn1 extends Ztn0 {
  private final List<Zez3> Zw;
  
  private static final String a;
  
  public Ztn1(List<Zez3> paramList) {
    this.Zw = paramList;
    Zl5a[] arrayOfZl5a = Zl5a.values();
    this.Zf = new String[arrayOfZl5a.length];
    this.ZV = new byte[arrayOfZl5a.length];
    this.Zc = new int[arrayOfZl5a.length];
    String str = Zb71.Zc();
    byte b = 0;
    while (b < arrayOfZl5a.length) {
      this.Zf[b] = (arrayOfZl5a[b]).ZD;
      this.ZV[b] = (arrayOfZl5a[b]).Zq;
      this.Zc[b] = (arrayOfZl5a[b]).ZU;
      b++;
      if (str == null)
        break; 
    } 
    this.ZZ = 2;
  }
  
  Zez3 Zh(int paramInt) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    return this.Zw.get(paramInt);
  }
  
  public int getRowCount() {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    return this.Zw.size();
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    Zez3 zez3 = Zh(paramInt1);
    Optional<Zrf_> optional = Optional.ofNullable((new Zgb3(zez3)).ZM());
    try {
      switch (paramInt2) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalStateException(a + a);
  }
  
  public void Zx(Zbws paramZbws) {
    super.Zx(paramZbws);
    paramZbws.setDefaultRenderer(String.class, new Zm2k(this));
    paramZbws.setDefaultRenderer(Integer.class, new Zm2k(this));
  }
  
  private boolean Zk(int paramInt) {
    return Optional.<Zs73>ofNullable((new Zz19(this.Zw.get(paramInt))).ZN()).map(Zs73::ZTU).filter(Ztn1::lambda$isRequested$0).isPresent();
  }
  
  private static boolean lambda$isRequested$0(Byte paramByte) {
    try {
      if (paramByte.byteValue() != 2) {
        try {
          if (paramByte.byteValue() == 3);
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: bipush #53
    //   2: ldc 'k<[_Jd][K@d'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ztn1.a : Ljava/lang/String;
    //   11: goto -> 154
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
    //   29: if_icmpgt -> 128
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
    //   80: bipush #11
    //   82: goto -> 112
    //   85: bipush #77
    //   87: goto -> 112
    //   90: bipush #79
    //   92: goto -> 112
    //   95: bipush #113
    //   97: goto -> 112
    //   100: bipush #30
    //   102: goto -> 112
    //   105: bipush #15
    //   107: goto -> 112
    //   110: bipush #93
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztn1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */