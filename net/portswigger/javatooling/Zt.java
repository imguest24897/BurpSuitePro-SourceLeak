package net.portswigger.javatooling;

import net.portswigger.javatooling.api.ClasspathService;
import net.portswigger.javatooling.api.CompilationService;
import net.portswigger.javatooling.api.CompletionService;
import net.portswigger.javatooling.api.JavadocService;
import net.portswigger.javatooling.api.ServiceLookup;

class Zt implements ServiceLookup {
  final ClasspathService Z_;
  
  final CompilationService ZR;
  
  final CompletionService Zb;
  
  final JavadocService ZB;
  
  Zt(Zb paramZb, ClasspathService paramClasspathService, CompilationService paramCompilationService, CompletionService paramCompletionService, JavadocService paramJavadocService) {}
  
  public ClasspathService classPathService() {
    return this.Z_;
  }
  
  public CompilationService compilationService() {
    return this.ZR;
  }
  
  public CompletionService completionService() {
    return this.Zb;
  }
  
  public JavadocService javadocService() {
    return this.ZB;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\javatooling\Zt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */