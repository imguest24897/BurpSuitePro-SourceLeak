/*    */ package META-INF.versions.9.com.formdev.flatlaf.ui;
/*    */ 
/*    */ import com.formdev.flatlaf.ui.StackUtils;
/*    */ import java.util.function.BiPredicate;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class StackUtilsImpl
/*    */   extends StackUtils
/*    */ {
/*    */   boolean wasInvokedFromImpl(BiPredicate<String, String> predicate, int limit) {
/* 29 */     return ((Boolean)StackWalker.getInstance().<Boolean>walk(stream -> { if (limit > 0) stream = stream.limit((limit + 2));  return Boolean.valueOf(stream.anyMatch(())); })).booleanValue();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\com\formdev\flatla\\ui\StackUtilsImpl.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */