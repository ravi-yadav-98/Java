class Square{
    int side;
    public int area() {
        return side * side;
    }
    public int perimeter(){
        return 4*side;
    }
}

public class ClassObjectBasics {

    public static void main(String[] args) {

        Square s1 = new Square();
        s1.side = 12;
        System.out.println(s1.side);
        System.out.println(s1.area());
        System.out.println(s1.perimeter());



    }
}
