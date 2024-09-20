package burp;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.Iterator;
import java.util.List;

public class Zlus {
  private final Zb0h Zv;
  
  private final Zlpo ZD;
  
  private final List<Zbdu> ZU;
  
  private final boolean ZE;
  
  private final Zbqc Zn;
  
  private final Runnable Zy;
  
  private final Runnable ZS;
  
  private static final String a;
  
  public Zlus(Zb0h paramZb0h, Zlpo paramZlpo, List<Zbdu> paramList, boolean paramBoolean, Zbqc paramZbqc, Runnable paramRunnable1, Runnable paramRunnable2) {
    this.Zv = paramZb0h;
    this.ZD = paramZlpo;
    this.ZU = paramList;
    this.ZE = paramBoolean;
    this.Zn = paramZbqc;
    this.Zy = paramRunnable1;
    this.ZS = paramRunnable2;
  }
  
  public void Zd() {
    Zh(0);
  }
  
  public boolean Zc() {
    return this.ZE;
  }
  
  public void ZE() {
    this.Zn.removeAll();
    byte b = 0;
    Iterator<Zbdu> iterator = this.ZU.iterator();
    String str = Zljs.ZM();
    while (iterator.hasNext()) {
      Zbdu zbdu = iterator.next();
      zbdu.setName(a.formatted(new Object[] { Integer.valueOf(b) }));
      GridBagConstraints gridBagConstraints = new GridBagConstraints();
      gridBagConstraints.gridx = 0;
      gridBagConstraints.gridy = b++;
      gridBagConstraints.anchor = 23;
      gridBagConstraints.fill = 2;
      gridBagConstraints.weightx = 1.0D;
      gridBagConstraints.insets = new Insets(10, 0, 10, 0);
      this.Zn.add(zbdu, gridBagConstraints);
      if (str == null)
        break; 
    } 
    if (this.ZU.size() == 1)
      ((Zbdu)this.ZU.getFirst()).Zg(false); 
    this.Zy.run();
    if (Zbqc.Zwu() == null)
      Zljs.Zb("G0cmI"); 
  }
  
  String Zg(Zbdu paramZbdu) {
    int i = this.ZU.indexOf(paramZbdu);
    return (i <= 0) ? this.ZD.ZY() : ((Zbdu)this.ZU.get(i - 1)).ZL();
  }
  
  void ZW(Zbdu paramZbdu) {
    int i = this.ZU.indexOf(paramZbdu);
    this.ZU.add(i + 1, Zbdu.Zc(this.Zv, this, paramZbdu.ZL()));
    String str = Zljs.ZM();
    if (this.ZU.size() == 2)
      ((Zbdu)this.ZU.getFirst()).Zg(true); 
    ZE();
    if (str == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  void ZS(Zbdu paramZbdu) {
    int i = this.ZU.indexOf(paramZbdu);
    this.ZU.remove(i);
    Zh(i);
    ZE();
  }
  
  void ZV(Zbdu paramZbdu) {
    Zh(this.ZU.indexOf(paramZbdu) + 1);
  }
  
  private void Zh(int paramInt) {
    String str = Zljs.ZM();
    int i = paramInt;
    while (i < this.ZU.size()) {
      ((Zbdu)this.ZU.get(i)).Zr();
      i++;
      if (str == null)
        break; 
    } 
  }
  
  void ZW(Zbdu paramZbdu, String paramString) {
    int i = this.ZU.indexOf(paramZbdu);
    int j = i - 1;
    String str = Zljs.ZM();
    while (j >= 0) {
      paramString = ((Zbdu)this.ZU.get(j)).Zz(paramString);
      if (j == 0)
        this.ZD.ZW(paramString); 
      j--;
      if (str == null)
        break; 
    } 
    if (i == 0)
      this.ZD.ZW(paramString); 
    Zh(i + 1);
  }
  
  void ZJ() {
    this.ZS.run();
  }
  
  static {
    // Byte code:
    //   0: bipush #102
    //   2: ldc 'nh*eSr5},iCrTk'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zlus.a : Ljava/lang/String;
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
    //   80: bipush #29
    //   82: goto -> 112
    //   85: bipush #102
    //   87: goto -> 112
    //   90: bipush #23
    //   92: goto -> 112
    //   95: bipush #126
    //   97: goto -> 112
    //   100: bipush #41
    //   102: goto -> 112
    //   105: bipush #96
    //   107: goto -> 112
    //   110: bipush #65
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlus.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */