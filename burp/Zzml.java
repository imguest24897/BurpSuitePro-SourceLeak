package burp;

import java.util.List;

public final class Zzml extends Record {
  private final String zko;
  
  private final Ze9r zkp;
  
  private final String zkR;
  
  private final List<String> zkv;
  
  private final List<String> zk_;
  
  private final String zkO;
  
  private final boolean zkW;
  
  private static int[] ZI;
  
  public Zzml(String paramString1, Ze9r paramZe9r, String paramString2, List<String> paramList1, List<String> paramList2, String paramString3, boolean paramBoolean) {
    this.zko = paramString1;
    this.zkp = paramZe9r;
    this.zkR = paramString2;
    this.zkv = paramList1;
    int[] arrayOfInt = ZkX();
    this.zk_ = paramList2;
    this.zkO = paramString3;
    this.zkW = paramBoolean;
    if (Zbqc.Zwu() == null)
      ZN(new int[2]); 
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zzml;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zzml;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zzml;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String Zko() {
    return this.zko;
  }
  
  public Ze9r Zkp() {
    return this.zkp;
  }
  
  public String ZkR() {
    return this.zkR;
  }
  
  public List<String> Zkv() {
    return this.zkv;
  }
  
  public List<String> Zk_() {
    return this.zk_;
  }
  
  public String ZkO() {
    return this.zkO;
  }
  
  public boolean ZkW() {
    return this.zkW;
  }
  
  public static void ZN(int[] paramArrayOfint) {
    ZI = paramArrayOfint;
  }
  
  public static int[] ZkX() {
    return ZI;
  }
  
  static {
    if (ZkX() == null)
      ZN(new int[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzml.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */