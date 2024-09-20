package burp;

import javax.swing.SortOrder;

public final class Zrg extends Record implements Zmfp {
  private final String ZT;
  
  private final String identifier;
  
  private final String name;
  
  private final boolean visible;
  
  private final int width;
  
  private final SortOrder sortOrder;
  
  private final Zlcu sortPrecedence;
  
  private final boolean userResized;
  
  private static int ZA;
  
  private Zrg(Zgyv paramZgyv) {
    this(paramZgyv.ZF, paramZgyv.ZY, paramZgyv.ZS, paramZgyv.ZL, paramZgyv.Zj, paramZgyv.Zk, paramZgyv.Zy, paramZgyv.Zf);
  }
  
  public Zrg(String paramString1, String paramString2, String paramString3, boolean paramBoolean1, int paramInt, SortOrder paramSortOrder, Zlcu paramZlcu, boolean paramBoolean2) {
    this.ZT = paramString1;
    this.identifier = paramString2;
    this.name = paramString3;
    this.visible = paramBoolean1;
    int i = Zi();
    this.width = paramInt;
    this.sortOrder = paramSortOrder;
    this.sortPrecedence = paramZlcu;
    this.userResized = paramBoolean2;
    if (Zbqc.Zwu() == null)
      Zs(++i); 
  }
  
  public Zg4f Zv() {
    return Zo(this.ZT).Zm(this.identifier).ZU(this.name).ZZ(this.visible).Zu(this.width).ZR(this.sortOrder).ZZ(this.sortPrecedence).ZH(this.userResized);
  }
  
  public static Zgyv Zo(String paramString) {
    return new Zgyv(paramString);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zrg;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zrg;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zrg;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String ZT() {
    return this.ZT;
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
  
  public static void Zs(int paramInt) {
    ZA = paramInt;
  }
  
  public static int Zi() {
    return ZA;
  }
  
  public static int ZR() {
    int i = Zi();
    return (i == 0) ? 80 : 0;
  }
  
  static {
    if (ZR() != 0)
      Zs(84); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */