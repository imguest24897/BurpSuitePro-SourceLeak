package burp;

public interface Zxwh extends Zgpi<Zxwh> {
  public static final Zk_y ZF = new Zk_y();
  
  boolean ZWy();
  
  void ZvX(boolean paramBoolean);
  
  Ze0f ZWG();
  
  void ZA(Ze0f paramZe0f);
  
  String ZWV();
  
  void ZAC(String paramString);
  
  String ZWP();
  
  void ZAI(String paramString);
  
  String ZWp();
  
  void ZAe(String paramString);
  
  int ZWN();
  
  void ZWW(int paramInt);
  
  int ZWn();
  
  void ZWA(int paramInt);
  
  default String ZWY() {
    return Zr5t.Zm(ZWy(), ZWG(), ZWV(), ZWP(), ZWN(), ZWn(), ZWp());
  }
  
  default void ZO(Zraf paramZraf) {
    Ze0f ze0f = ZWG();
    if (ze0f != null)
      ze0f.legacyMigrationStrategy.accept(this, paramZraf); 
  }
  
  default void ZW3() throws Ztgu, Zs7w {
    Ze0f ze0f = ZWG();
    try {
      if (ze0f != null)
        ze0f.payloadProcessorRuleValidator.Zg(this); 
    } catch (Ztgu ztgu) {
      throw a(null);
    } 
  }
  
  private static Ztgu a(Ztgu paramZtgu) {
    return paramZtgu;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxwh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */