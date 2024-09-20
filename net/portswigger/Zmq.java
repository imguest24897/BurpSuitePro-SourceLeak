package net.portswigger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zmq {
  private final List<Zn8> ZE = Collections.synchronizedList(new ArrayList<>());
  
  private static int[] Za;
  
  public void Zo(Zn8 paramZn8) {
    this.ZE.add(paramZn8);
  }
  
  public Zn8 ZL(int paramInt) {
    return this.ZE.get(paramInt);
  }
  
  public int Zy() {
    return this.ZE.size();
  }
  
  public void ZG(int paramInt) {
    int i = paramInt - 1;
    int j = i;
    int[] arrayOfInt = ZU();
    while (j >= 0) {
      this.ZE.remove(j);
      j--;
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  public boolean ZO() {
    return (0 == this.ZE.size());
  }
  
  public static void Zk(int[] paramArrayOfint) {
    Za = paramArrayOfint;
  }
  
  public static int[] ZU() {
    return Za;
  }
  
  static {
    if (ZU() != null)
      Zk(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zmq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */