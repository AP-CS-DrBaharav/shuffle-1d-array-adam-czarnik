
// For Random
import java.util.Random;


public class Main {

    static public void main(String[] args) {
        
        // short detour: What are args?!?
        // Commandline arguments
        System.out.println("String[] args :");
        for (int ii=0; ii<args.length ; ++ii)
            System.out.println(ii + " :: " + args[ii]);
        
        
        // Random
        // 1. using the class Random
        // import java.util.Random;
        Random rand = new Random();
        int n = rand.nextInt(10);   // [0,9]
        System.out.println("rand.nextInt() :");
        for (int ii=0; ii<15; ++ii)
            System.out.println(ii + " -->" + rand.nextInt(10));
    
        // Using Math.random
        // Nothing to import!
        System.out.println("Math.random() :");
        for (int ii=0; ii<15; ++ii) {
            // Math.random() returns [0,1)
            int nn = (int) (Math.random()*10 + 1) ;
            System.out.println(ii + " -->" + nn );
        }
        
        
        // Our own exercise:
        // A new 'Shuffle' random number generator.
        Shuffle1D shuffle = new Shuffle1D(10);
        System.out.println("Shuffle :");
        for (int ii=0; ii<15; ++ii) 
            System.out.println(ii + " -->" + shuffle.nextInt() );
        
        
        
    }
    
    
}
