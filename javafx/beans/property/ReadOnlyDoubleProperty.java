/*     */ package javafx.beans.property;
/*     */ 
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.WeakInvalidationListener;
/*     */ import javafx.beans.binding.DoubleExpression;
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
/*     */ public abstract class ReadOnlyDoubleProperty
/*     */   extends DoubleExpression
/*     */   implements ReadOnlyProperty<Number>
/*     */ {
/*     */   public String toString() {
/*  56 */     Object object = getBean();
/*  57 */     String str = getName();
/*  58 */     StringBuilder stringBuilder = new StringBuilder("ReadOnlyDoubleProperty [");
/*     */     
/*  60 */     if (object != null) {
/*  61 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/*  63 */     if (str != null && !str.equals("")) {
/*  64 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/*  66 */     stringBuilder.append("value: ").append(get()).append("]");
/*  67 */     return stringBuilder.toString();
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
/*     */   public static <T extends Number> ReadOnlyDoubleProperty readOnlyDoubleProperty(final ReadOnlyProperty<T> property) {
/*  90 */     if (property == null) {
/*  91 */       throw new NullPointerException("Property cannot be null");
/*     */     }
/*     */     
/*  94 */     return (property instanceof ReadOnlyDoubleProperty) ? (ReadOnlyDoubleProperty)property : 
/*  95 */       new ReadOnlyDoublePropertyBase()
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
/*     */         public double get() {
/* 110 */           this.valid = true;
/* 111 */           Number number = (Number)property.getValue();
/* 112 */           return (number == null) ? 0.0D : number.doubleValue();
/*     */         }
/*     */ 
/*     */         
/*     */         public Object getBean() {
/* 117 */           return null;
/*     */         }
/*     */ 
/*     */         
/*     */         public String getName() {
/* 122 */           return property.getName();
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
/*     */   public ReadOnlyObjectProperty<Double> asObject() {
/* 138 */     return new ReadOnlyObjectPropertyBase<Double>()
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
/* 154 */           return null;
/*     */         }
/*     */ 
/*     */         
/*     */         public String getName() {
/* 159 */           return ReadOnlyDoubleProperty.this.getName();
/*     */         }
/*     */ 
/*     */         
/*     */         public Double get() {
/* 164 */           this.valid = true;
/* 165 */           return ReadOnlyDoubleProperty.this.getValue();
/*     */         }
/*     */       };
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlyDoubleProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */