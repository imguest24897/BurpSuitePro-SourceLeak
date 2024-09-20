package burp;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public interface Zge7 extends Zkgx {
  Zrri Zp();
  
  boolean ZT(Zsmh paramZsmh, Zgu3 paramZgu3, Zs68 paramZs68, boolean paramBoolean);
  
  boolean ZD(Zefx paramZefx);
  
  boolean Zv();
  
  boolean ZF();
  
  boolean Zr();
  
  boolean Zc();
  
  boolean ZR();
  
  Zsmh Zb();
  
  void Zs(Zefx paramZefx, boolean paramBoolean);
  
  void ZC(Zefx paramZefx, boolean paramBoolean1, boolean paramBoolean2);
  
  void Zy(Zsmh paramZsmh, Zs68 paramZs68, boolean paramBoolean);
  
  void Za(Zsmh paramZsmh, Zs68 paramZs68, boolean paramBoolean);
  
  void Za(Zsmh paramZsmh, boolean paramBoolean);
  
  void ZN(int paramInt1, int paramInt2, byte[] paramArrayOfbyte);
  
  void ZV(int paramInt1, int paramInt2, String paramString);
  
  void Zx();
  
  boolean ZQ();
  
  String Zk();
  
  byte[] Zw();
  
  int[] Zg();
  
  void Zm(int paramInt1, int paramInt2);
  
  Component Zz();
  
  List<Component> ZR(MouseEvent paramMouseEvent);
  
  void Za();
  
  void Zb(Ztoy paramZtoy);
  
  Zkcm Zx(boolean paramBoolean);
  
  default boolean ZD() {
    return (Zg() != null) ? ((Zg()[0] - Zg()[1] != 0)) : false;
  }
  
  default void Zf(byte[] paramArrayOfbyte) {
    Zuh.ZT(false, Zqf.ZC, getClass().getName());
  }
  
  default void ZR(boolean paramBoolean) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zge7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */