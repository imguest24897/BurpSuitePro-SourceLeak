package burp;

import java.awt.Font;
import java.awt.FontMetrics;

public class Zxj6 implements Zzkh {
  private final FontMetrics ZF;
  
  Zxj6(FontMetrics paramFontMetrics) {
    this.ZF = paramFontMetrics;
  }
  
  public float Zo(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    return (paramArrayOfchar.length == 0) ? 0.0F : this.ZF.charsWidth(paramArrayOfchar, paramInt1, paramInt2);
  }
  
  public float Zm(char paramChar) {
    return Zk(new char[] { paramChar });
  }
  
  public float Zh() {
    return this.ZF.getHeight();
  }
  
  public float ZV() {
    return this.ZF.getMaxAscent();
  }
  
  public float Zi() {
    return this.ZF.getAscent();
  }
  
  public float Zy() {
    return this.ZF.getDescent();
  }
  
  public Font Zl() {
    return this.ZF.getFont();
  }
  
  private float Zk(char... paramVarArgs) {
    return Zo(paramVarArgs, 0, paramVarArgs.length);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxj6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */