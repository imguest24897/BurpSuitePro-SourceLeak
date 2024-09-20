package burp;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Iterator;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Segment;
import javax.swing.text.View;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zb1e {
  private final Zgpw ZB;
  
  private final Zmgn Zq;
  
  private final Ze9f ZX;
  
  private final Graphics2D ZC;
  
  private final Zb8n ZZ;
  
  private final Zgl1 Zd;
  
  private final Rectangle Zj;
  
  private final float ZW;
  
  private final float Zl;
  
  private final int Zs;
  
  private final Zkjk Zh;
  
  private final int Zn;
  
  private final Segment ZN;
  
  Zb1e(Zgpw paramZgpw, Zmgn paramZmgn, Ze9f paramZe9f, Graphics2D paramGraphics2D, Zb8n paramZb8n, Rectangle paramRectangle, Zgl1 paramZgl1, Zkjk paramZkjk) {
    this.ZB = paramZgpw;
    this.Zq = paramZmgn;
    int[] arrayOfInt = Zgpw.ZW();
    this.ZX = paramZe9f;
    this.ZC = paramGraphics2D;
    this.ZZ = paramZb8n;
    this.Zd = paramZgl1;
    this.Zh = paramZkjk;
    this.Zj = paramGraphics2D.getClipBounds();
    this.ZW = paramZmgn.Zg();
    this.Zl = paramZmgn.ZS();
    this.Zs = paramRectangle.x;
    this.Zn = this.Zj.y + this.Zj.height;
    this.ZN = new Segment();
    if (Zbqc.Zwu() == null)
      Zgpw.ZU(new int[3]); 
  }
  
  void Zl(int paramInt1, int paramInt2, Zzkh paramZzkh) {
    View view = this.ZB.getView(paramInt1);
    int i = view.getStartOffset();
    int j = view.getEndOffset();
    Segment segment = ZC(this.ZX, i, this.ZX.Zz(j), this.ZN);
    int k = segment.offset - i;
    Ze7g ze7g = this.ZX.Zw(paramInt1);
    if (Zh(ze7g)) {
      this.ZZ.Zi(i, j);
      return;
    } 
    float f = paramInt2 + this.ZW;
    int m = (int)Math.floor((Math.max(this.Zj.y - paramInt2, 0) / this.Zl));
    Zm1s zm1s = (new Zl75(this.ZB, paramZzkh)).ZQ(ze7g, i, f, m, this.Zl);
    ze7g = zm1s.Zu;
    int n = zm1s.Zm;
    f = zm1s.Zd;
    Zk(ze7g, n, f, segment, k, paramZzkh);
  }
  
  private void Zk(Ze7g paramZe7g, int paramInt1, float paramFloat, Segment paramSegment, int paramInt2, Zzkh paramZzkh) {
    int[] arrayOfInt = Zgpw.ZW();
    while (!Zh(paramZe7g) && paramFloat - this.ZW < this.Zn) {
      int i = this.ZB.Zc(paramInt1, paramZe7g, paramZzkh);
      this.ZZ.Zi(paramInt1, i);
      float f = this.Zs + this.ZB.Zi(paramZe7g, paramZzkh);
      paramZe7g = ZS(paramZe7g, i, paramFloat, paramSegment, paramInt2, f);
      paramInt1 = i;
      paramFloat += this.Zl;
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  private Ze7g ZS(Ze7g paramZe7g, int paramInt1, float paramFloat1, Segment paramSegment, int paramInt2, float paramFloat2) {
    int i = this.Zj.x + this.Zj.width;
    int j = (int)paramFloat2;
    Zt4c zt4c = Zt4c.NONE;
    Iterator<Zska> iterator = paramZe7g.iterator();
    int[] arrayOfInt = Zgpw.ZW();
    while (iterator.hasNext()) {
      Zska zska = iterator.next();
      if (!zska.ZG() || !ZZ(zska))
        continue; 
      if (paramFloat2 >= i)
        break; 
      boolean bool1 = Zq(zska, paramInt1);
      boolean bool2 = Za(zska, paramInt1);
      if (!bool1 && !bool2)
        break; 
      if (!bool1) {
        int k = zska.ZJ();
        zska = new Zska(paramSegment, k + paramInt2, paramInt1 - 1 + paramInt2, k, zska.ZX(), zska.ZO());
      } 
      Zlpi zlpi = this.Zd.Zw();
      paramFloat2 = zlpi.Zl(zska, paramFloat2, paramFloat1);
      zt4c = (zt4c == Zt4c.NONE) ? this.Zh.ZP(zska) : zt4c;
      if (arrayOfInt == null)
        break; 
    } 
    ZJ(paramFloat1, paramFloat2, j, zt4c);
    return paramZe7g.ZW(paramInt1);
  }
  
  private boolean ZZ(Zska paramZska) {
    return (this.Zq.ZE() || paramZska.ZX() != 49);
  }
  
  static boolean Zh(Ze7g paramZe7g) {
    return paramZe7g.Zo() ? true : ((paramZe7g.Zs() != null && paramZe7g.Zs().ZX() == 0));
  }
  
  private static boolean Zq(Zska paramZska, int paramInt) {
    return (paramZska.ZF() - 1 < paramInt);
  }
  
  private static boolean Za(Zska paramZska, int paramInt) {
    return (paramZska.ZJ() < paramInt);
  }
  
  private static Segment ZC(Document paramDocument, int paramInt1, int paramInt2, Segment paramSegment) {
    try {
      paramDocument.getText(paramInt1, paramInt2 - paramInt1, paramSegment);
      return paramSegment;
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
      return paramSegment;
    } 
  }
  
  private void ZJ(float paramFloat1, float paramFloat2, int paramInt, Zt4c paramZt4c) {
    int[] arrayOfInt = Zgpw.ZW();
    switch (Zgf.Zc[paramZt4c.ordinal()]) {
      case 1:
        if (arrayOfInt == null);
        return;
      case 2:
        ZT(this.ZC, paramInt, (int)(paramFloat1 + this.Zq.Zk()), (int)(paramFloat2 - paramInt));
        if (arrayOfInt == null)
          break; 
        return;
    } 
    Zuh.ZT(false, Zqf.Zr, paramZt4c.name());
  }
  
  private static void ZT(Graphics2D paramGraphics2D, int paramInt1, int paramInt2, int paramInt3) {
    int[] arrayOfInt = Zgpw.ZW();
    int i = paramInt1;
    while (i <= paramInt1 + paramInt3) {
      paramGraphics2D.setColor(Zlkk.TEXT_EDITOR_HEADER_NAME.ZS());
      paramGraphics2D.fillOval(i, paramInt2 - 2, 2, 2);
      i += 5;
      if (arrayOfInt == null)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb1e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */