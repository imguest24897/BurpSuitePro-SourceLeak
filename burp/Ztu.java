package burp;

import java.awt.Point;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public final class Ztu extends Record {
  private final int zak;
  
  private final int za4;
  
  private final int zaQ;
  
  private final int zaJ;
  
  private final int zaw;
  
  public Ztu(Point paramPoint) {
    this(paramPoint.x, paramPoint.y, 1024, 768, 0);
  }
  
  public Ztu(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this.zak = paramInt1;
    this.za4 = paramInt2;
    this.zaQ = paramInt3;
    this.zaJ = paramInt4;
    this.zaw = paramInt5;
  }
  
  public static Ztu ZI(Zshb paramZshb, Ztu paramZtu) {
    return new Ztu(ZE(paramZshb, Zm4m.X, paramZtu.zak), ZE(paramZshb, Zm4m.Y, paramZtu.za4), ZE(paramZshb, Zm4m.WIDTH, paramZtu.zaQ), ZE(paramZshb, Zm4m.HEIGHT, paramZtu.zaJ), ZE(paramZshb, Zm4m.EXPANDED_STATE, paramZtu.zaw));
  }
  
  private static int ZE(Zshb paramZshb, Zm4m paramZm4m, int paramInt) {
    String str = paramZshb.Zn(paramZm4m.ZH());
    if (str != null)
      try {
        return Integer.parseInt(str);
      } catch (NumberFormatException numberFormatException) {
        Zah.Zl(numberFormatException, Zk_.COMMON_RUNTIME_FAILURE);
      }  
    return paramInt;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Ztu;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Ztu;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Ztu;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public int Zak() {
    return this.zak;
  }
  
  public int Za4() {
    return this.za4;
  }
  
  public int ZaQ() {
    return this.zaQ;
  }
  
  public int ZaJ() {
    return this.zaJ;
  }
  
  public int Zaw() {
    return this.zaw;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */