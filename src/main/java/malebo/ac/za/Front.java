package malebo.ac.za;

public class Front {
    public static void main(String [] args){
        Back me = new Back();
        if(me.Check(3)==false){
            System.out.println("No");
        }
        if(me.Check(3)==true){
            System.out.println("Yes");
        }

        System.out.println(me.GetAge(2020,1992));
    }
}
