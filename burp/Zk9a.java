package burp;

import java.util.function.Supplier;

final class Zk9a extends Record implements Zejo {
  private final Zbdy Za;
  
  private final Zz1m<Zt1j> ZV;
  
  private final Supplier<Boolean> ZZ;
  
  private Zk9a(Zbdy paramZbdy, Zz1m<Zt1j> paramZz1m, Supplier<Boolean> paramSupplier) {
    this.Za = paramZbdy;
    this.ZV = paramZz1m;
    this.ZZ = paramSupplier;
  }
  
  public void ZZ(int paramInt) {
    Zs_i zs_i = Zs_i.ZM(paramInt);
    this.Za.ZP(zs_i);
    this.ZV.ZD(new Zxr8(Zt1j.ZD));
    this.ZV.ZD(new Zxr8(Zt1j.Zm, zs_i));
  }
  
  public boolean ZE(int paramInt) {
    Zs_i zs_i = Zs_i.ZM(paramInt);
    return (this.Za.ZG(zs_i) && ((Boolean)this.ZZ.get()).booleanValue());
  }
  
  public Zs_i Zr() {
    return this.Za.ZD();
  }
  
  public void ZF(int paramInt) {
    this.ZV.ZD(new Zxr8(Zt1j.ZK));
    this.ZV.ZD(new Zxr8(Zt1j.Zx, Zs_i.ZM(paramInt)));
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zk9a;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zk9a;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zk9a;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk9a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */