package burp;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JComponent;
import net.portswigger.Zkb;
import org.jetbrains.annotations.MustBeInvokedByOverriders;

abstract class Zthr implements Zge7 {
  protected final Zey9 Zd;
  
  protected Zrri ZE;
  
  protected boolean Zn;
  
  protected Zsmh Zg;
  
  protected boolean Z_;
  
  protected boolean ZO;
  
  protected boolean ZK = true;
  
  protected boolean ZY;
  
  protected JComponent ZM;
  
  public Zthr(Zey9 paramZey9) {
    this.Zd = paramZey9;
    this.Zg = Zsmh.Zy;
  }
  
  public void Za() {}
  
  public void Zb(Ztoy paramZtoy) {
    this.ZK = paramZtoy.ZZ();
    this.ZY = paramZtoy.Zc();
  }
  
  public boolean ZR() {
    return this.ZO;
  }
  
  public boolean ZF() {
    return this.ZK;
  }
  
  public boolean ZT(Zsmh paramZsmh, Zgu3 paramZgu3, Zs68 paramZs68, boolean paramBoolean) {
    return this.Z_;
  }
  
  public boolean Zv() {
    return this.Z_;
  }
  
  public boolean ZD(Zefx paramZefx) {
    return this.Z_;
  }
  
  public boolean Zr() {
    return this.Zn;
  }
  
  public boolean Zc() {
    return false;
  }
  
  public Component Zz() {
    return this.ZM;
  }
  
  public List<Component> ZR(MouseEvent paramMouseEvent) {
    return null;
  }
  
  public Zrri Zp() {
    return this.ZE;
  }
  
  public boolean ZQ() {
    return false;
  }
  
  public String Zk() {
    return Zkb.ZG(Zt6s.Zh(this.Zg));
  }
  
  public byte[] Zw() {
    return Zt6s.Zh(this.Zg);
  }
  
  public int[] Zg() {
    return null;
  }
  
  public void Zm(int paramInt1, int paramInt2) {}
  
  void Ze(byte[] paramArrayOfbyte) {
    Zlg6 zlg6 = new Zlg6(paramArrayOfbyte, this.Zd);
    this.Zg.Zh(zlg6);
    this.Zg = zlg6.Zz;
  }
  
  @MustBeInvokedByOverriders
  public Ztcw ZI() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zg : Lburp/Zsmh;
    //   4: astore_1
    //   5: aload_0
    //   6: getfield Z_ : Z
    //   9: istore_2
    //   10: aload_0
    //   11: aload_1
    //   12: iload_2
    //   13: <illegal opcode> Zg : (Lburp/Zthr;Lburp/Zsmh;Z)Lburp/Ztcw;
    //   18: areturn
  }
  
  public void ZU() {
    this.Zg = Zsmh.Zy;
  }
  
  private void lambda$checkpoint$0(Zsmh paramZsmh, boolean paramBoolean) {
    this.Zg = paramZsmh;
    this.Z_ = paramBoolean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zthr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */