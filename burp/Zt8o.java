package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.ui.editor.extension.EditorMode;
import burp.api.montoya.ui.editor.extension.ExtensionProvidedWebSocketMessageEditor;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.util.Collections;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zt8o implements Zge7, Zrsc {
  private final Zb2h ZD;
  
  private final ExtensionProvidedWebSocketMessageEditor Zj;
  
  private final Zskl Zu;
  
  private final Zgli ZH;
  
  private final Zbqc ZQ;
  
  private boolean Zn;
  
  private boolean ZX;
  
  private Zsmh Zm;
  
  private ByteArray Zb;
  
  private static final String a;
  
  public Zt8o(Zb2h paramZb2h, Zeew paramZeew, EditorMode paramEditorMode, Zskl paramZskl, Zgli paramZgli) {
    this.ZD = paramZb2h;
    this.Zu = paramZskl;
    this.ZH = paramZgli;
    this.Zj = paramZb2h.ZO(paramZeew, paramEditorMode);
    this.ZX = true;
    this.Zm = Zsmh.Zy;
    this.ZQ = new Zbvy();
  }
  
  public boolean ZA(Zb2h paramZb2h) {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (this.ZD == paramZb2h);
  }
  
  public Zrri Zp() {
    return null;
  }
  
  public boolean ZT(Zsmh paramZsmh, Zgu3 paramZgu3, Zs68 paramZs68, boolean paramBoolean) {
    try {
      if (paramZgu3 != Zgu3.WS_MESSAGE)
        return false; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Zlun zlun = Zj(paramZsmh);
    try {
      if (zlun.upgradeRequest() != null)
        try {
          if (this.Zj.isEnabledFor(zlun));
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    this.Zn = false;
    return this.Zn;
  }
  
  private Zlun Zj(Zsmh paramZsmh) {
    Zrei zrei = new Zrei(paramZsmh, this.ZH);
    return new Zlun(zrei, this.Zu);
  }
  
  public boolean ZD(Zefx paramZefx) {
    return this.Zn;
  }
  
  public boolean Zv() {
    return this.Zn;
  }
  
  public boolean ZF() {
    return this.ZX;
  }
  
  public boolean Zr() {
    return false;
  }
  
  public boolean Zc() {
    return false;
  }
  
  public boolean ZR() {
    return this.Zj.isModified();
  }
  
  public Zsmh Zb() {
    if (ZR()) {
      Zsmh zsmh = ZS();
      this.Zm = zsmh;
      return zsmh;
    } 
    return this.Zm;
  }
  
  public void Zs(Zefx paramZefx, boolean paramBoolean) {
    ZA();
  }
  
  public void ZC(Zefx paramZefx, boolean paramBoolean1, boolean paramBoolean2) {
    ZA();
  }
  
  public void Zy(Zsmh paramZsmh, Zs68 paramZs68, boolean paramBoolean) {
    ZA();
  }
  
  public void Za(Zsmh paramZsmh, Zs68 paramZs68, boolean paramBoolean) {
    ZA();
  }
  
  public void Za(Zsmh paramZsmh, boolean paramBoolean) {
    this.Zm = paramZsmh;
    Zlun zlun = Zj(paramZsmh);
    this.Zj.setMessage(zlun);
  }
  
  public void ZN(int paramInt1, int paramInt2, byte[] paramArrayOfbyte) {}
  
  public void ZV(int paramInt1, int paramInt2, String paramString) {}
  
  public void Zx() {
    this.Zm = Zsmh.Zy;
    Zlun zlun = Zj(Zsmh.Zy);
    this.Zj.setMessage(zlun);
  }
  
  public boolean ZQ() {
    try {
      this.Zb = this.Zj.selectedData().contents();
      if (this.Zb == null)
        return false; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (this.Zb.length() > 0);
  }
  
  public String Zk() {
    return this.Zb.toString();
  }
  
  public byte[] Zw() {
    return this.Zb.getBytes();
  }
  
  public int[] Zg() {
    return null;
  }
  
  public void Zm(int paramInt1, int paramInt2) {}
  
  public Component Zz() {
    Component component = this.Zj.uiComponent();
    try {
      if ((this.ZQ.getComponents()).length != 0) {
        try {
          if (component != this.ZQ.getComponent(0)) {
            this.ZQ.removeAll();
            this.ZQ.add(component);
            return this.ZQ;
          } 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        return this.ZQ;
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    this.ZQ.removeAll();
    this.ZQ.add(component);
    return this.ZQ;
  }
  
  public List<Component> ZR(MouseEvent paramMouseEvent) {
    return Collections.emptyList();
  }
  
  public void Za() {
    this.Zj.uiComponent().requestFocus();
  }
  
  public void Zb(Ztoy paramZtoy) {
    this.ZX = paramZtoy.ZZ();
  }
  
  public Zkcm Zx(boolean paramBoolean) {
    return Zkcm.Zy(this.Zj.caption(), this.ZD.ZM().ZN());
  }
  
  private Zsmh ZS() {
    ByteArray byteArray = this.Zj.getMessage();
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (byteArray == null) ? Zsmh.Zy : Zsmh.Zh(byteArray.getBytes());
  }
  
  private static void ZA() {
    Zah.Zl(new UnsupportedOperationException(a), Zk_.UNEXPECTED);
  }
  
  public Ztcw ZI() {
    return Zi;
  }
  
  public void ZU() {}
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #113
    //   2: ldc '?nL8lVuQ;lVn5mVvH2lX'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zt8o.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 84, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: iconst_3
    //   81: goto -> 111
    //   84: bipush #14
    //   86: goto -> 111
    //   89: bipush #107
    //   91: goto -> 111
    //   94: bipush #85
    //   96: goto -> 111
    //   99: bipush #38
    //   101: goto -> 111
    //   104: bipush #121
    //   106: goto -> 111
    //   109: bipush #7
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt8o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */