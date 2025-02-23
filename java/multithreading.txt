class A extends Thread { 
    public void run () { 
        for (int i = 1; i <= 5; i++) 
            System.out.println("From Thread A: " + i + "*3=" + (i * 3)); 
        System.out.println("Exit from Thread A"); 
    } 
}

class B extends Thread { 
    public void run () { 
        for (int i = 1; i <= 5; i++) 
            System.out.println("From Thread B: " + i + "*4=" + (i * 4)); 
        System.out.println("Exit from Thread B"); 
    } 
}

public class multithreading { 
    public static void main (String[] args) 
    { 
        A obj1 = new A(); 
        B obj2 = new B(); 
        obj1.start(); 
        obj2.start(); 
    } 
}