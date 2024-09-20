package burp;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public abstract class Zbck extends Zbqc {
  protected int[] ZD;
  
  protected Zbid ZJ;
  
  protected Zbig Zo;
  
  protected int ZS;
  
  protected int Zs;
  
  private static Zbqc[] ZT;
  
  public void paintComponent(Graphics paramGraphics) {
    super.paintComponent(paramGraphics);
    Graphics2D graphics2D = (Graphics2D)paramGraphics;
    this.Zo.ZH(graphics2D, this.ZD[3], this.ZD[0]);
    int i = this.Zo.Ze();
    int j = this.Zo.Zv();
    this.ZJ.ZH(graphics2D, this.ZD[3] + i, this.ZD[0] + j);
    int k = this.ZJ.Ze();
    int m = this.ZJ.Zv();
    Zp(graphics2D, this.ZD[3] + i, this.ZD[0] + j);
    ZO(graphics2D, this.ZD[3] + i, this.ZD[0] + j);
    Zbqc[] arrayOfZbqc = Zr();
    this.ZS = this.ZD[1] + this.ZD[3] + i + k + Zv(graphics2D);
    this.Zs = this.ZD[0] + this.ZD[2] + j + m;
    if (Zbqc.Zwu() == null)
      Zj(new Zbqc[5]); 
  }
  
  abstract void ZO(Graphics2D paramGraphics2D, int paramInt1, int paramInt2);
  
  abstract void Zp(Graphics2D paramGraphics2D, int paramInt1, int paramInt2);
  
  abstract int Zv(Graphics2D paramGraphics2D);
  
  public Dimension getPreferredSize() {
    return new Dimension(this.ZS, this.Zs);
  }
  
  public int getHeight() {
    return this.Zs;
  }
  
  public int getWidth() {
    return this.ZS;
  }
  
  public Dimension getMinimumSize() {
    return new Dimension(this.ZS, this.Zs);
  }
  
  public Dimension getSize() {
    return new Dimension(this.ZS, this.Zs);
  }
  
  public static void Zj(Zbqc[] paramArrayOfZbqc) {
    ZT = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zr() {
    return ZT;
  }
  
  static {
    if (Zr() == null)
      Zj(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbck.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */