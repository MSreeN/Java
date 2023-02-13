class LimitingNoOfObjectsSingleton{
    public static void main(String[] args) {
    // ObjClass oc = new ObjClass();   
        ObjClass o1 = ObjClass.objCreator();
        ObjClass o2 = ObjClass.objCreator();
        ObjClass o3 = ObjClass.objCreator();
        ObjClass o4 = ObjClass.objCreator();
        ObjClass o5 = ObjClass.objCreator();
        ObjClass o6 = ObjClass.objCreator();
    }
}

class ObjClass{
    private ObjClass(){}
    static private int count = 1;
    static private ObjClass ref = null;
    static public ObjClass objCreator(){
        if (count <= 5) {
            ref = new ObjClass();
            System.out.println(count +" object is created!");
            count++;
            return ref;
        }
        else{
            System.out.println("Object limit exceeded!");
            return null;
        }
        
    }

}