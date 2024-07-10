interface Shape{
    private double getVoulme(){
        return 0;
    }







class cube implements Shape {
    private double leght;
    public cube(double leght){
        this.leght = leght;
        this.getVoulme();
    }


    double getVoulme(){
        return  (leght * leght * leght);
    }
}






class piramid implements Shape{
    private double cleght;
    private double height;
    public piramid(double сleght, double height){
        this.cleght = сleght;
        this.height = height;
        this.getVoulme();
    }
    double getVoulme(){
        return  (cleght * height) / 3;
    }
}




//проверка тута
public class Main {
    public static void main(String[] args) {
        cube cube = new cube( 2);
        piramid piramid = new piramid( 5,  6);
        System.out.println("куб: "+ cube.getVoulme());
        System.out.println("пирамида: "+ piramid.getVoulme());
    }
}}