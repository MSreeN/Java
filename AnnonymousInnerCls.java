public class AnnonymousInnerCls {
    public static void main(String[] args) {
        M mm = new M();
        mm.obj();
    }
}

abstract class My{
    public abstract void sample();
}

class M extends My{
    public void sample(){

    }
    void obj(){
        My m = new My(){
            public void sample(){
                System.out.println("Abstract method overrided");
            }
            
        };
        m.sample();
        
        
    }


    
}