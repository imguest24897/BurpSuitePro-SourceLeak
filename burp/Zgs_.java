package burp;

final class Zgs_<T extends Zgpi<T>> extends Record {
  private final T ze;
  
  private Zgs_(T paramT) {
    this.ze = paramT;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zgs_ zgs_ = (Zgs_)paramObject;
    return this.ze.ZF(zgs_.ze);
  }
  
  public int hashCode() {
    return this.ze.hashCode();
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zgs_;)Ljava/lang/String;
    //   6: areturn
  }
  
  public T Ze() {
    return this.ze;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgs_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */