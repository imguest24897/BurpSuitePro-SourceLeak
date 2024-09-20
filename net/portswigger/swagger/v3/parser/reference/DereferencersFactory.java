package net.portswigger.swagger.v3.parser.reference;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import java.util.concurrent.CopyOnWriteArrayList;

public class DereferencersFactory {
  private static DereferencersFactory instance;
  
  private final List<OpenAPIDereferencer> dereferencers = new CopyOnWriteArrayList<>();
  
  private static String[] ZU;
  
  public static DereferencersFactory getInstance() {
    if (instance == null)
      instance = new DereferencersFactory(); 
    return instance;
  }
  
  public void addDereferencer(OpenAPIDereferencer paramOpenAPIDereferencer) {
    this.dereferencers.add(0, paramOpenAPIDereferencer);
  }
  
  public void removeDereferencer(OpenAPIDereferencer paramOpenAPIDereferencer) {
    this.dereferencers.remove(paramOpenAPIDereferencer);
  }
  
  public List<OpenAPIDereferencer> getDereferencers() {
    return Collections.unmodifiableList(this.dereferencers);
  }
  
  static {
    ServiceLoader<OpenAPIDereferencer> serviceLoader = ServiceLoader.load(OpenAPIDereferencer.class);
    Iterator<OpenAPIDereferencer> iterator = serviceLoader.iterator();
    Zb(null);
    while (iterator.hasNext()) {
      OpenAPIDereferencer openAPIDereferencer = iterator.next();
      if (openAPIDereferencer != null)
        getInstance().addDereferencer(openAPIDereferencer); 
    } 
  }
  
  public static void Zb(String[] paramArrayOfString) {
    ZU = paramArrayOfString;
  }
  
  public static String[] Zz() {
    return ZU;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\reference\DereferencersFactory.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */