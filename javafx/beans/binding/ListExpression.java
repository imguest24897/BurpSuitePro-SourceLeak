/*     */ package javafx.beans.binding;
/*     */ 
/*     */ import com.sun.javafx.binding.StringFormatter;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.property.ReadOnlyBooleanProperty;
/*     */ import javafx.beans.property.ReadOnlyIntegerProperty;
/*     */ import javafx.beans.value.ObservableIntegerValue;
/*     */ import javafx.beans.value.ObservableListValue;
/*     */ import javafx.beans.value.ObservableObjectValue;
/*     */ import javafx.beans.value.ObservableValue;
/*     */ import javafx.collections.FXCollections;
/*     */ import javafx.collections.ObservableList;
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
/*     */ 
/*     */ public abstract class ListExpression<E>
/*     */   implements ObservableListValue<E>
/*     */ {
/*     */   public ObservableList<E> getValue() {
/*  66 */     return (ObservableList<E>)get();
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
/*     */   public static <E> ListExpression<E> listExpression(final ObservableListValue<E> value) {
/*  86 */     if (value == null) {
/*  87 */       throw new NullPointerException("List must be specified.");
/*     */     }
/*  89 */     return (value instanceof ListExpression) ? (ListExpression<E>)value : 
/*  90 */       new ListBinding<E>()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public void dispose()
/*     */         {
/*  97 */           unbind(new Observable[] { (Observable)this.val$value });
/*     */         }
/*     */ 
/*     */         
/*     */         protected ObservableList<E> computeValue() {
/* 102 */           return (ObservableList<E>)value.get();
/*     */         }
/*     */ 
/*     */         
/*     */         public ObservableList<ObservableListValue<E>> getDependencies() {
/* 107 */           return FXCollections.singletonObservableList(value);
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSize() {
/* 117 */     return size();
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
/*     */ 
/*     */   
/*     */   public ObjectBinding<E> valueAt(int paramInt) {
/* 142 */     return Bindings.valueAt((ObservableList<E>)this, paramInt);
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
/*     */   public ObjectBinding<E> valueAt(ObservableIntegerValue paramObservableIntegerValue) {
/* 154 */     return Bindings.valueAt((ObservableList<E>)this, paramObservableIntegerValue);
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
/*     */   public BooleanBinding isEqualTo(ObservableList<?> paramObservableList) {
/* 168 */     return Bindings.equal((ObservableObjectValue<?>)this, paramObservableList);
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
/*     */   public BooleanBinding isNotEqualTo(ObservableList<?> paramObservableList) {
/* 182 */     return Bindings.notEqual((ObservableObjectValue<?>)this, paramObservableList);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BooleanBinding isNull() {
/* 191 */     return Bindings.isNull((ObservableObjectValue<?>)this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BooleanBinding isNotNull() {
/* 200 */     return Bindings.isNotNull((ObservableObjectValue<?>)this);
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
/*     */   public StringBinding asString() {
/* 212 */     return (StringBinding)StringFormatter.convert((ObservableValue)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/* 217 */     return getNonNull().size();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isEmpty() {
/* 222 */     return getNonNull().isEmpty();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean contains(Object paramObject) {
/* 227 */     return getNonNull().contains(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterator<E> iterator() {
/* 232 */     return getNonNull().iterator();
/*     */   }
/*     */ 
/*     */   
/*     */   public Object[] toArray() {
/* 237 */     return getNonNull().toArray();
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> T[] toArray(T[] paramArrayOfT) {
/* 242 */     return (T[])getNonNull().toArray((Object[])paramArrayOfT);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean add(E paramE) {
/* 247 */     return getNonNull().add(paramE);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean remove(Object paramObject) {
/* 252 */     return getNonNull().remove(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean containsAll(Collection<?> paramCollection) {
/* 257 */     return getNonNull().containsAll(paramCollection);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean addAll(Collection<? extends E> paramCollection) {
/* 262 */     return getNonNull().addAll(paramCollection);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean addAll(int paramInt, Collection<? extends E> paramCollection) {
/* 267 */     return getNonNull().addAll(paramInt, paramCollection);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeAll(Collection<?> paramCollection) {
/* 272 */     return getNonNull().removeAll(paramCollection);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean retainAll(Collection<?> paramCollection) {
/* 277 */     return getNonNull().retainAll(paramCollection);
/*     */   }
/*     */ 
/*     */   
/*     */   public void clear() {
/* 282 */     getNonNull().clear();
/*     */   }
/*     */ 
/*     */   
/*     */   public E get(int paramInt) {
/* 287 */     return (E)getNonNull().get(paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public E set(int paramInt, E paramE) {
/* 292 */     return (E)getNonNull().set(paramInt, paramE);
/*     */   }
/*     */ 
/*     */   
/*     */   public void add(int paramInt, E paramE) {
/* 297 */     getNonNull().add(paramInt, paramE);
/*     */   }
/*     */ 
/*     */   
/*     */   public E remove(int paramInt) {
/* 302 */     return (E)getNonNull().remove(paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public int indexOf(Object paramObject) {
/* 307 */     return getNonNull().indexOf(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public int lastIndexOf(Object paramObject) {
/* 312 */     return getNonNull().lastIndexOf(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public ListIterator<E> listIterator() {
/* 317 */     return getNonNull().listIterator();
/*     */   }
/*     */ 
/*     */   
/*     */   public ListIterator<E> listIterator(int paramInt) {
/* 322 */     return getNonNull().listIterator(paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public List<E> subList(int paramInt1, int paramInt2) {
/* 327 */     return getNonNull().subList(paramInt1, paramInt2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean addAll(E... paramVarArgs) {
/* 332 */     return getNonNull().addAll((Object[])paramVarArgs);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean setAll(E... paramVarArgs) {
/* 337 */     return getNonNull().setAll((Object[])paramVarArgs);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean setAll(Collection<? extends E> paramCollection) {
/* 342 */     return getNonNull().setAll(paramCollection);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeAll(E... paramVarArgs) {
/* 347 */     return getNonNull().removeAll((Object[])paramVarArgs);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean retainAll(E... paramVarArgs) {
/* 352 */     return getNonNull().retainAll((Object[])paramVarArgs);
/*     */   }
/*     */ 
/*     */   
/*     */   public void remove(int paramInt1, int paramInt2) {
/* 357 */     getNonNull().remove(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   private ObservableList<E> getNonNull() {
/* 361 */     ObservableList<E> observableList = (ObservableList)get();
/*     */     
/* 363 */     return (observableList == null) ? FXCollections.emptyObservableList() : observableList;
/*     */   }
/*     */   
/*     */   public abstract ReadOnlyIntegerProperty sizeProperty();
/*     */   
/*     */   public abstract ReadOnlyBooleanProperty emptyProperty();
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\ListExpression.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */