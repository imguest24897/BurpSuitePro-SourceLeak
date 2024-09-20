package net.portswigger;

import java.util.List;

public interface Zv2<T extends Number> extends Zms {
  boolean required();
  
  Number min();
  
  Number max();
  
  List<T> examples();
  
  String description();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zv2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */