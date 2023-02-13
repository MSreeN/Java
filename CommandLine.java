// public class CommandLine {
//     // public static void main(String[] args) {
//     //     int temp = 0;
//     //     for (String i : args) {
//     //         if(i.matches("[\\d]+"))
//     //         temp+= Double.parseDouble(i);
//     //     }
//     //     System.out.println(temp);
        
//     // }
    
// }
class box 
    {
        int width;
        int height;
        int length;
        int volume;
        void volume(int height, int length, int width) 
        {
             volume = width*height*length;
        } 
    }    
    class Prameterized_method
    {
        public static void main(String args[])
        {
            box obj = new box();

            obj.volume(3,2,1);

            obj.volume(obj.height = 1,obj.length = 5, obj.width = 5);
            System.out.println(obj.volume);        
        } 
     }
