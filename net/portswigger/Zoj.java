package net.portswigger;

import java.util.List;

public final class Zoj extends Record implements Zms {
  private final List<Zms> ZQK;
  
  private final String ZQ8;
  
  private final boolean ZL;
  
  private final int ZQe;
  
  private final int ZI;
  
  private final Boolean ZQo;
  
  private final List<List<Object>> ZQO;
  
  private final String ZA;
  
  public Zoj(List<Zms> paramList, String paramString1, boolean paramBoolean, int paramInt1, int paramInt2, Boolean paramBoolean1, List<List<Object>> paramList1, String paramString2) {
    this.ZQK = paramList;
    this.ZQ8 = paramString1;
    this.ZL = paramBoolean;
    this.ZQe = paramInt1;
    this.ZI = paramInt2;
    this.ZQo = paramBoolean1;
    this.ZQO = paramList1;
    this.ZA = paramString2;
  }
  
  public void ZF(Zuo paramZuo) {
    paramZuo.ZI(this);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/Zoj;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/Zoj;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/Zoj;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public List<Zms> ZQK() {
    return this.ZQK;
  }
  
  public String ZQ8() {
    return this.ZQ8;
  }
  
  public int ZQe() {
    return this.ZQe;
  }
  
  public Boolean ZQo() {
    return this.ZQo;
  }
  
  public List<List<Object>> ZQO() {
    return this.ZQO;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zoj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */