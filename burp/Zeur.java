package burp;

import java.util.List;
import java.util.Objects;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

final class Zeur extends Record {
  private final List<Zzme> ZT;
  
  private final Zey9 Zd;
  
  private Zeur(List<Zzme> paramList, Zey9 paramZey9) {
    this.ZT = paramList;
    this.Zd = paramZey9;
  }
  
  private void Zx(Ztj1 paramZtj1) {
    boolean bool = Zmio.ZI();
    Zrbm zrbm = paramZtj1.Zi();
    if (zrbm instanceof Zriy) {
      Zriy zriy = (Zriy)zrbm;
      Objects.requireNonNull(zriy);
      this.ZT.stream().map(this::lambda$addToAuditTask$0).forEach(zriy::Zy);
      if (!bool) {
        Zuh.ZT(false, Zqf.Zr, zrbm.getClass().getName());
        return;
      } 
      return;
    } 
    Zuh.ZT(false, Zqf.Zr, zrbm.getClass().getName());
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zeur;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zeur;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zeur;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  private Zl7e lambda$addToAuditTask$0(Zzme paramZzme) {
    return new Zl7e(paramZzme, this.Zd);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeur.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */