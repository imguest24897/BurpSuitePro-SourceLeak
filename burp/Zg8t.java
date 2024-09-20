package burp;

public final class Zg8t extends Record {
  private final Ze3n ZL;
  
  public Zg8t(Ze3n paramZe3n) {
    this.ZL = paramZe3n;
  }
  
  public Zg3d ZH(Zxgd paramZxgd) {
    int i = Zlew.Zj();
    if (i == 0)
      Zbqc.Zr(new Zbqc[2]); 
    return this.ZL.Zr((new Zlv5()).Za(paramZxgd.ZY(Zgyj::Zp)).ZD(false)).ZBB().Zz();
  }
  
  public boolean Zz(Zg3d paramZg3d) {
    if (paramZg3d.Ze() == null)
      return false; 
    Ze_5 ze_5 = new Ze_5(this.ZL.ZL(), paramZg3d.Ze());
    return (ze_5.ZK() == null);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zg8t;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zg8t;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zg8t;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg8t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */