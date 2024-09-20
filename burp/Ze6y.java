package burp;

import java.util.List;
import javax.swing.SwingUtilities;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Ze6y implements Ztww {
  private final Zzxj Zq;
  
  private Zgo0 ZV;
  
  String ZP = "";
  
  final Zbm_ Zr;
  
  private Ze6y(Zbm_ paramZbm_, Zzxj paramZzxj) {
    this.Zq = paramZzxj;
  }
  
  void Ze(Zgo0 paramZgo0) {
    this.ZV = paramZgo0;
  }
  
  public void Zb(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: ldc ''
    //   3: invokevirtual ZC : (Ljava/lang/String;)V
    //   6: invokestatic Zca : ()I
    //   9: aload_0
    //   10: getfield Zq : Lburp/Zzxj;
    //   13: iload_1
    //   14: putfield Zq : Z
    //   17: istore_2
    //   18: iload_1
    //   19: ifeq -> 33
    //   22: aload_0
    //   23: getfield ZV : Lburp/Zgo0;
    //   26: invokevirtual Zi : ()V
    //   29: iload_2
    //   30: ifeq -> 40
    //   33: aload_0
    //   34: getfield ZV : Lburp/Zgo0;
    //   37: invokevirtual Zp : ()V
    //   40: aload_0
    //   41: invokevirtual Zn : ()V
    //   44: return
  }
  
  public void Z_(List<String> paramList1, List<String> paramList2) {
    ZC(this.Zq.ZW(paramList1, paramList2));
    this.ZV.ZB(this.Zq.ZJ, this.Zq.Zl);
  }
  
  public void ZA(Zmy8 paramZmy8) {
    this.Zq.Zb(paramZmy8);
  }
  
  public void ZU(Zmy8 paramZmy8, int paramInt) {
    this.Zq.Zr(paramInt, paramZmy8);
  }
  
  public void Zg(int paramInt) {
    this.Zq.ZA(paramInt);
  }
  
  public void ZY(Zmy8 paramZmy8) {
    this.Zq.ZK(paramZmy8);
  }
  
  public void ZZ(Zmy8 paramZmy8, int paramInt) {
    this.Zq.Zv(paramInt, paramZmy8);
  }
  
  public void ZO(int paramInt) {
    this.Zq.ZG(paramInt);
  }
  
  public void ZZK() {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void Zl(Zmf_ paramZmf_) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public String Zv(String paramString) {
    Zuh.Zb(false, Zqf.ZC);
    return null;
  }
  
  public void ZC(String paramString) {
    this.ZP = paramString;
  }
  
  private void Zn() {
    SwingUtilities.invokeLater(this::lambda$refreshSwingLayout$0);
  }
  
  private void lambda$refreshSwingLayout$0() {
    Zmse.ZF(this.Zr);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze6y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */