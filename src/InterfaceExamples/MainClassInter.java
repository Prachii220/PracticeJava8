package InterfaceExamples;

public class MainClassInter {
    public static void main(String[] args) {
        System.out.println("System starts here:  ");



        //for print interface
        Print p = (a,b)-> {return a+b;};
        System.out.println(p.sum(3,5));

        //for draw interface
        draw d = ()->{
            System.out.println("drawing");
        };
        d.draw();






    }
}
