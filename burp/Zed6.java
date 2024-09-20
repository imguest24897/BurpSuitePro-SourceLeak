package burp;

import javax.swing.Icon;

public final class Zed6 extends Record implements Zgye {
  private final String Zf;
  
  private final int ZZ;
  
  private final Icon ZT;
  
  private final int ZG;
  
  public Zed6(String paramString, int paramInt1, Icon paramIcon, int paramInt2) {
    this.Zf = paramString;
    this.ZZ = paramInt1;
    this.ZT = paramIcon;
    this.ZG = paramInt2;
  }
  
  public Ze01 ZX() {
    Ze01 ze01 = (this.ZG > 0) ? new Ze02(this.Zf, this.ZG) : new Ze01(this.Zf);
    if (this.ZT != null)
      ze01.setIcon(this.ZT); 
    if (this.ZZ != 0)
      ze01.setMnemonic(this.ZZ); 
    ze01.setFocusable(true);
    return ze01;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zed6;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zed6;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zed6;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zed6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */