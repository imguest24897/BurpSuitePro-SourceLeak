package net.portswigger.javatooling.api;

public interface ServiceLookup {
  ClasspathService classPathService();
  
  CompilationService compilationService();
  
  CompletionService completionService();
  
  JavadocService javadocService();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\javatooling\api\ServiceLookup.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */