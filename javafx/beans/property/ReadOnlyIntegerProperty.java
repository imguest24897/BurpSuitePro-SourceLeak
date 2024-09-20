/*     */ package javafx.beans.property;
/*     */ 
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.WeakInvalidationListener;
/*     */ import javafx.beans.binding.IntegerExpression;
/*     */ import javafx.beans.binding.ObjectExpression;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ReadOnlyIntegerProperty
/*     */   extends IntegerExpression
/*     */   implements ReadOnlyProperty<Number>
/*     */ {
/*     */   public String toString() {
/*  57 */     Object object = getBean();
/*  58 */     String str = getName();
/*  59 */     StringBuilder stringBuilder = new StringBuilder("ReadOnlyIntegerProperty [");
/*     */     
/*  61 */     if (object != null) {
/*  62 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/*  64 */     if (str != null && !str.equals("")) {
/*  65 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/*  67 */     stringBuilder.append("value: ").append(get()).append("]");
/*  68 */     return stringBuilder.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <T extends Number> ReadOnlyIntegerProperty readOnlyIntegerProperty(final ReadOnlyProperty<T> property) {
/*  91 */     if (property == null) {
/*  92 */       throw new NullPointerException("Property cannot be null");
/*     */     }
/*     */     
/*  95 */     return (property instanceof ReadOnlyIntegerProperty) ? (ReadOnlyIntegerProperty)property : 
/*  96 */       new ReadOnlyIntegerPropertyBase()
/*     */       {
/*     */         private boolean valid;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         private final InvalidationListener listener;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         public int get() {
/* 111 */           this.valid = true;
/* 112 */           Number number = (Number)property.getValue();
/* 113 */           return (number == null) ? 0 : number.intValue();
/*     */         }
/*     */ 
/*     */         
/*     */         public Object getBean() {
/* 118 */           return null;
/*     */         }
/*     */ 
/*     */         
/*     */         public String getName() {
/* 123 */           return property.getName();
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyObjectProperty<Integer> asObject() {
/* 139 */     return new ReadOnlyObjectPropertyBase<Integer>()
/*     */       {
/*     */         private boolean valid;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         private final InvalidationListener listener;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         public Object getBean() {
/* 155 */           return null;
/*     */         }
/*     */ 
/*     */         
/*     */         public String getName() {
/* 160 */           return ReadOnlyIntegerProperty.this.getName();
/*     */         }
/*     */ 
/*     */         
/*     */         public Integer get() {
/* 165 */           this.valid = true;
/* 166 */           return ReadOnlyIntegerProperty.this.getValue();
/*     */         }
/*     */       };
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlyIntegerProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */