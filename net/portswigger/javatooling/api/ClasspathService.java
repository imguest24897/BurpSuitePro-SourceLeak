package net.portswigger.javatooling.api;

import java.nio.file.Path;

public interface ClasspathService {
  void addLibrary(Path paramPath);
  
  void addLibrary(Path paramPath1, Path paramPath2);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\javatooling\api\ClasspathService.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */