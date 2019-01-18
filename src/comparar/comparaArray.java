package comparar;

public class comparaArray {
    
    public static boolean comparaArrayCuadrado(int a [], int b []){
        
        if((a.length != b.length)){
            return false;
        } else if (a.length == 0 && b.length == 0) {
            return true;
        }
        
        double raiz;
        int flag [] = new int [a.length];
        
        for (int i = 0; i < b.length; i++) {
            
            raiz = Math.sqrt(b[i]);
            
            for (int j = 0; j < a.length; j++) {
                if((a[j] == raiz) && (flag[j] == 0)){
                    flag[j] = 1;
                    break;
                }
            }
            
        }
        
        for (int i = 0; i < flag.length; i++) {
            if(flag[i] == 0) return false;
        }
        
        return true;
    }
    
}
