package burp;

import java.awt.Component;
import java.util.List;
import net.portswigger.Zm2;

public class Zr4 implements Zit, Zkgx {
  private final Zbdq ZD;
  
  private final Zbdh ZX;
  
  private final Zbc9 Zk;
  
  private int ZS;
  
  public Zr4(Zb0h paramZb0h) {
    this.ZD = new Zbdq(paramZb0h);
    int[] arrayOfInt = Zbdh.Zu();
    this.ZX = new Zbdh(paramZb0h);
    this.Zk = new Zbc9(new Component[] { this.ZD, this.ZX });
    if (Zbqc.Zwu() == null)
      Zbdh.Zu(new int[1]); 
  }
  
  public void Ze(Zkhl paramZkhl, String paramString) {
    this.ZD.ZA(paramZkhl, paramString);
    this.ZS = 1;
    this.Zk.ZP(this.ZD);
  }
  
  public void Zu(Zkhl paramZkhl, String paramString, List<Ztkm> paramList) {
    this.ZX.ZP(paramZkhl, paramString, paramList);
    this.ZS = (paramString == null) ? 0 : paramString.length();
    this.Zk.ZP(this.ZX);
  }
  
  public Component ZB() {
    return this.Zk;
  }
  
  public boolean Zn() {
    return true;
  }
  
  public int Zl() {
    return this.ZS;
  }
  
  public void Z_() {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_EXPAND_SELECTION_SECTION);
  }
  
  public void Zo() {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_COLLAPSE_SELECTION_SECTION);
  }
  
  public Ztcw ZI() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zk : Lburp/Zbc9;
    //   4: invokevirtual ZY : ()Ljava/awt/Component;
    //   7: astore_1
    //   8: aload_0
    //   9: getfield ZS : I
    //   12: istore_2
    //   13: iconst_3
    //   14: anewarray burp/Ztcw
    //   17: dup
    //   18: iconst_0
    //   19: aload_0
    //   20: aload_1
    //   21: iload_2
    //   22: <illegal opcode> Zg : (Lburp/Zr4;Ljava/awt/Component;I)Lburp/Ztcw;
    //   27: aastore
    //   28: dup
    //   29: iconst_1
    //   30: aload_0
    //   31: getfield ZX : Lburp/Zbdh;
    //   34: invokevirtual ZI : ()Lburp/Ztcw;
    //   37: aastore
    //   38: dup
    //   39: iconst_2
    //   40: aload_0
    //   41: getfield ZD : Lburp/Zbdq;
    //   44: invokevirtual ZI : ()Lburp/Ztcw;
    //   47: aastore
    //   48: invokestatic Zb : ([Lburp/Ztcw;)Lburp/Ztcw;
    //   51: areturn
  }
  
  public void ZU() {
    this.ZX.ZU();
    this.ZD.ZU();
  }
  
  private void lambda$checkpoint$0(Component paramComponent, int paramInt) {
    this.Zk.ZP(paramComponent);
    this.ZS = paramInt;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */