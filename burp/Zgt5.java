package burp;

import javax.swing.text.Highlighter;

final class Zgt5 implements Zkv5 {
  private final int ZV;
  
  private final int ZQ;
  
  private final Zkv5 ZT;
  
  Zgt5(int paramInt1, int paramInt2, Zkv5 paramZkv5) {
    this.ZV = paramInt1;
    this.ZQ = paramInt2;
    this.ZT = paramZkv5;
  }
  
  Zgt5(Zkv5 paramZkv5) {
    this.ZV = paramZkv5.startOffset();
    this.ZQ = paramZkv5.endOffset();
    this.ZT = paramZkv5;
  }
  
  public Highlighter.HighlightPainter ZOJ() {
    return this.ZT.ZOJ();
  }
  
  public Zlkk ZOU() {
    return this.ZT.ZOU();
  }
  
  public int ZOl() {
    return this.ZT.ZOl();
  }
  
  public boolean ZO7() {
    return this.ZT.ZO7();
  }
  
  public int startOffset() {
    return this.ZV;
  }
  
  public int endOffset() {
    return this.ZQ;
  }
  
  public Zkv5 Zg(int paramInt1, int paramInt2) {
    return new Zgt5(paramInt1, paramInt2, this.ZT);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgt5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */