

/*
Two things you need to do in this file.
See 
  TODO 1
  TODO 2
*/


public class Shuffle1D {

    int N;
    int[] A;
    int numsCalled;
            
    // Constructor
    public Shuffle1D(int n) {
        N = n;
        A = new int[N];

        // TODO 1
        // Your code here: Fill in the Array with values 0 to N-1
        for (int ii=0;ii<N;++ii) {
            A[ii] = ii;
        }
        
        numsCalled = 0;
    }
    
    // The function nextInt() returns a random number from the array, with the following
    // limitations:
    // 1. If it was called more then N times, it return 0.
    // 2. Otherwise, it returns one number from the array, but with NO repeat.
    // Note 1: The array A can be modified in your function.
    // Note 2: A variable numsCalled might be useful.
    
    public int nextInt() {
        
        
        // TODO 2
        // Your code here: See the requirements above the function
        int min = 0;
        int max = N-numsCalled-1;
        int nn = (int) ( Math.random()*(max-min+1)) + min;
        if (numsCalled >= N) return 0;
        int val = A[nn];
        for (int i=nn; i<A.length-numsCalled-1; ++i) {
            A[i] = A[i+1];
        }
        numsCalled += 1;
        return val;
    }
     
}


// Two example outputs, N=10
/*

Output 1:

Shuffle :
0 -->9
1 -->1
2 -->3
3 -->7
4 -->2
5 -->6
6 -->4
7 -->0
8 -->8
9 -->5
10 -->0
11 -->0
12 -->0
13 -->0
14 -->0

Output 2:

0 -->0
1 -->8
2 -->2
3 -->5
4 -->7
5 -->1
6 -->9
7 -->4
8 -->3
9 -->6
10 -->0
11 -->0
12 -->0
13 -->0
14 -->0


*/