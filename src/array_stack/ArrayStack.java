
package array_stack;




public class ArrayStack  {
  int Size;
  Object [] arrayStack;
  int top = -1;
 
          
  public ArrayStack(int Size){
      this.Size=Size;
      arrayStack= new Object[this.Size];
  }
  
  public int Size(){
      return this.top+1;
  }

   public boolean isEmpty(){
       
       return (this.top < 0);
  }

   public boolean isFulle(){
       
       return (this.top == this.Size-1);
  }
 

  public Object top(){
   
      int t= 0;
     if(isEmpty())
          System.out.print("Stack is Empty  ");
     else
         t = this.top;
    
     return arrayStack[t];
}

  

  public void puch (Object newItem){
      if (isFulle() ) {
          System.out.println("Stack is Full");
      }else{
          this.top++;
      arrayStack[this.top]= newItem;    
      }         
  }

 public Object pop(){
      Object item = null;
      
     if(isEmpty())
          System.out.println("Stack is Empty");
     else
         item = arrayStack[this.top];
     this.top--;
     
     return item;
 }
 
}
