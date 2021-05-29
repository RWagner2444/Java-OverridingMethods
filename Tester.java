import java.util.ArrayList;
/**
 * Learn Overriding Methods
 * 4/20/2021
 * Ryan Wagner
 */
public class Tester
{
    public static void main(String[] args){
        
        Rectangle4 r1 = new Rectangle4(12, 20);
        Box4 b1 = new Box4(4, 4, 4);
        Box4 b2 = new Box4(4, 12, 8);
        Cube4 c1 = new Cube4(4, 4, 4);
        Quadrilateral4 q1 = new Quadrilateral4(12, 20);
        RectangularPrism4 rp1 = new RectangularPrism4(18, 1, 1);
        
        ArrayList<Rectangle4> list = new ArrayList<Rectangle4>();
        list.add(r1);
        list.add(b1);
        list.add(b2);
        list.add(c1);
        list.add(q1);
        list.add(rp1);
        
        System.out.println("My Shapes: \n");
        for(Rectangle4 r: list){
            showEffectBoth(r);
        }
        
        System.out.println("\nTest for equality:\n");
        testForEquality(list);
    }
    
    public static void showEffectBoth(Rectangle4 r){
        System.out.println(r);
    }
    
    public static void testForEquality(ArrayList<Rectangle4> list){
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size(); j++){
                try{
                    if(list.get(i).equals(list.get(j)) && i != j){
                        System.out.println(list.get(i) + " IS the same size as " + list.get(j));
                    }
                }
                catch(Exception e){
                    
                }
            }
        }
    }
}