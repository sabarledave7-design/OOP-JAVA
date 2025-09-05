/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medtermsabarle;

/**
 *
 * @author User
 */
public class Arrays {
 Object[] list;
    int count;

    public Arrays(Object[] list) {
        this.list = list;
        count = 0;
    }
    
    
    
    public void addElement (Object o){
        list[count] = o;
        count += 1;
 }
    
    public void addElementAfter(Object o, int index){  
       if (index == -1){
           System.out.println("Fruit cannot be found");
           return;
       }
        shiftToRight(index);
        list[index = 1] = o; 
        count += 1;
    }
    
    public void delete(){
        count -= 1;
        list[count] = null;
    }
    
    public void deleteElement (int index){
         list[index] = null;
         shiftToLeft(index);
         count -= 1;   
    } 
    
    public void showAllElements(){
        for (Object list : list) {
            if  (list != null){              
            System.out.println(list);
            }
        }
    
        
    }
    
    public int findElement(Object o){
        for (int i = 0; i < count; i++){
            if (o == list[i]){
                return i;
            }
        }
         return -1;
        
    }

    private void shiftToLeft(int index) {
        for (int i = index; i < count; i++) {
            list[index] = list[index = 1];
            
        }
  
    }

    private void shiftToRight(int index) {
        for (int i = count; i > index; i--) {
            list[i] = list[i-1];
        }
    }
        
}  

