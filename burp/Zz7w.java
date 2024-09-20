package burp;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zae;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zl0;
import net.portswigger.Zqf;
import net.portswigger.Zrzg;
import net.portswigger.Zuh;

public class Zz7w extends Zz7x {
  private final Zl0 ZH;
  
  private final Zl6c Zl;
  
  private final Zmf_ Zz;
  
  private static final String c;
  
  public Zz7w(Zl0 paramZl0, Zrzg paramZrzg, Zmf_ paramZmf_, Zlal paramZlal, List<String> paramList, boolean paramBoolean) throws Zxcc, Ze0d {
    super(paramZmf_, paramBoolean);
    Zuh.Zb(paramZmf_ instanceof Zzkm, Zqf.Zr);
    this.ZH = paramZl0;
    this.Zl = new Zl6c(paramZl0, paramZrzg, paramZlal);
    this.Zz = ZV(paramList, paramZlal);
  }
  
  private Zmf_ ZV(List<String> paramList, Zlal paramZlal) throws Zxcc, Ze0d {
    Zz0e zz0e = new Zz0e();
    Iterator<String> iterator = paramList.iterator();
    Zbqc[] arrayOfZbqc = Zs4c.ZA();
    while (iterator.hasNext()) {
      String str = iterator.next();
      try {
        zz0e.ZC(Zs6n.Zr(this.ZH.Zg(str), this.ZH, Zae.Z_));
      } catch (IOException iOException) {
        Zah.Zl(iOException, Zk_.USER_ERROR);
        throw new Zxcc(Zrgs.COULD_NOT_LOAD_CONFIGURATION_FILE, str);
      } 
      if (arrayOfZbqc != null)
        break; 
    } 
    Zmf_ zmf_ = zz0e.ZO().ZV(new String[] { c });
    zmf_.Zg(paramZlal);
    return zmf_;
  }
  
  public void ZZ(Zlal paramZlal) {
    Zmf_ zmf_ = this.Zl.Zi();
    if (zmf_ != null)
      zmf_.Zg(paramZlal); 
    this.Zz.Zg(paramZlal);
  }
  
  public void Zg(Zm3g... paramVarArgs) {
    this.Zl.ZT(paramVarArgs);
  }
  
  Zmf_ Zv() {
    return Zg() ? this.Zl.Zi() : this.Zz;
  }
  
  static {
    // Byte code:
    //   0: bipush #22
    //   2: ldc 'A"<W4@8 {'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zz7w.c : Ljava/lang/String;
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
    //   80: bipush #34
    //   82: goto -> 112
    //   85: bipush #71
    //   87: goto -> 112
    //   90: bipush #101
    //   92: goto -> 112
    //   95: bipush #88
    //   97: goto -> 112
    //   100: bipush #30
    //   102: goto -> 112
    //   105: bipush #109
    //   107: goto -> 112
    //   110: bipush #82
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz7w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */