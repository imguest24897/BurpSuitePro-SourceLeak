package net.portswigger;

import java.util.Optional;

public class Zod {
  public static final Zod Zv = new Zod(Integer.valueOf(10485760), Integer.valueOf(10485760));
  
  private final Integer ZM;
  
  private final Integer Za;
  
  private Zod(Integer paramInteger1, Integer paramInteger2) {
    this.Za = paramInteger1;
    this.ZM = paramInteger2;
  }
  
  public static Zod Ze(Integer paramInteger1, Integer paramInteger2) {
    return new Zod(paramInteger1, paramInteger2);
  }
  
  public Optional<Integer> Zm() {
    return Optional.ofNullable(this.Za);
  }
  
  public Optional<Integer> ZC() {
    return Optional.ofNullable(this.ZM);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zod.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */