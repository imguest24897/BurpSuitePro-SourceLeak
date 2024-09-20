package burp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.javatooling.api.CompiledClass;

class Zxx9 extends ClassLoader {
  private final Map<String, byte[]> ZR = (Map)new HashMap<>();
  
  Zxx9(Set<CompiledClass> paramSet) {
    Iterator<CompiledClass> iterator = paramSet.iterator();
    int[] arrayOfInt = Zs4l.Zz();
    while (iterator.hasNext()) {
      CompiledClass compiledClass = iterator.next();
      this.ZR.put(compiledClass.name(), compiledClass.bytes());
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  public Class<?> loadClass(String paramString) throws ClassNotFoundException {
    try {
      return super.loadClass(paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      Zah.Zl(classNotFoundException, Zk_.IGNORED);
      byte[] arrayOfByte = this.ZR.get(paramString);
      try {
        if (arrayOfByte != null)
          return defineClass(paramString, arrayOfByte, 0, arrayOfByte.length); 
      } catch (ClassNotFoundException classNotFoundException1) {
        throw a(null);
      } 
      throw new ClassNotFoundException(paramString);
    } 
  }
  
  private static ClassNotFoundException a(ClassNotFoundException paramClassNotFoundException) {
    return paramClassNotFoundException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxx9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */