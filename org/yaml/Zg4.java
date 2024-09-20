package org.yaml;

import java.lang.reflect.Field;

public class Zg4 extends Zga {
  private final Field ZK;
  
  public Zg4(Field paramField) {
    super(paramField.getName(), paramField.getType(), paramField.getGenericType());
    this.ZK = paramField;
    paramField.setAccessible(true);
  }
  
  public void ZO(Object paramObject1, Object paramObject2) throws Exception {
    this.ZK.set(paramObject1, paramObject2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zg4.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */