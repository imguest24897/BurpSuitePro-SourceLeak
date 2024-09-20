/*    */ package javafx.beans.property;
/*    */ 
/*    */ import javafx.beans.binding.ObjectExpression;
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
/*    */ public abstract class ReadOnlyObjectProperty<T>
/*    */   extends ObjectExpression<T>
/*    */   implements ReadOnlyProperty<T>
/*    */ {
/*    */   public String toString() {
/* 64 */     Object object = getBean();
/* 65 */     String str = getName();
/* 66 */     StringBuilder stringBuilder = new StringBuilder("ReadOnlyObjectProperty [");
/*    */     
/* 68 */     if (object != null) {
/* 69 */       stringBuilder.append("bean: ").append(object).append(", ");
/*    */     }
/* 71 */     if (str != null && !str.equals("")) {
/* 72 */       stringBuilder.append("name: ").append(str).append(", ");
/*    */     }
/* 74 */     stringBuilder.append("value: ").append(get()).append("]");
/* 75 */     return stringBuilder.toString();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlyObjectProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */