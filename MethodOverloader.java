
package methodoverloader;


public class MethodOverloader {
    public static void main(String[] args) {
        MethodOverloader mo = new MethodOverloader();        
        
        //Testing out all the methods to see which 
        //version of the method each would respond to.
        
        // To output the first method version 
        System.out.println(mo.declareArgs());
        
        // To output the second method version
        System.out.println(mo.declareArgs("church", "temple"));
        
        // To output the third method version
        System.out.println(mo.declareArgs("car", "boat", "helicopter"));
        
        // To output the fourth method version
        System.out.println(mo.declareArgs(23, 34, 73, 55)); 
        
        // To output the fifth method version
        System.out.println(mo.declareArgs(23, 34, 73));        
    }
    
    
    
    
    // First oveloaded method
    public String declareArgs(){
        return "See, I have no arguments passed in!";
    }
    
    // Second overloaded method
    public String declareArgs(String a, String b){
        return "You have two arguments: " + a + " and " + b + ".";
    }
    
    // Third overloaded method
    public String declareArgs(String a, String b, String c){
        return "There are three arguments here: " 
                + a + ", " + b + ", and " + c + ".";
    }
    
    // Fourth overloaded method
    public String declareArgs(int a, int b, int c, int d){
        return "The sum of all three int variables is: " + a + b + c + d;
    }
    
    // Fifth overloaded method
    public int declareArgs(int j, int k, int l){
        return j + k + l;
    }
    
}
