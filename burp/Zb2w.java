package burp;

import javax.swing.SortOrder;

public final class Zb2w extends Record implements Zr8p {
  private final String identifier;
  
  private final String name;
  
  private final boolean visible;
  
  private final int width;
  
  private final SortOrder sortOrder;
  
  private final Zlcu sortPrecedence;
  
  private final boolean userResized;
  
  private Zb2w(Zgym paramZgym) {
    this(paramZgym.ZY, paramZgym.ZS, paramZgym.ZL, paramZgym.Zj, paramZgym.Zk, paramZgym.Zy, paramZgym.Zf);
  }
  
  public Zb2w(String paramString1, String paramString2, boolean paramBoolean1, int paramInt, SortOrder paramSortOrder, Zlcu paramZlcu, boolean paramBoolean2) {
    Zbqc[] arrayOfZbqc = Zgy7.ZI();
    this.identifier = paramString1;
    this.name = paramString2;
    this.visible = paramBoolean1;
    this.width = paramInt;
    this.sortOrder = paramSortOrder;
    this.sortPrecedence = paramZlcu;
    this.userResized = paramBoolean2;
    if (Zbqc.Zwu() == null)
      Zgy7.Zo(new Zbqc[3]); 
  }
  
  public Zg4f Zv() {
    Zbqc[] arrayOfZbqc = Zgy7.ZI();
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[2]); 
    return Zj().Zm(this.identifier).ZU(this.name).ZZ(this.visible).Zu(this.width).ZR(this.sortOrder).ZZ(this.sortPrecedence).ZH(this.userResized);
  }
  
  public static Zgym Zj() {
    return new Zgym();
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zb2w;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zb2w;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zb2w;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String identifier() {
    return this.identifier;
  }
  
  public String name() {
    return this.name;
  }
  
  public boolean visible() {
    return this.visible;
  }
  
  public int width() {
    return this.width;
  }
  
  public SortOrder sortOrder() {
    return this.sortOrder;
  }
  
  public Zlcu sortPrecedence() {
    return this.sortPrecedence;
  }
  
  public boolean userResized() {
    return this.userResized;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb2w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */