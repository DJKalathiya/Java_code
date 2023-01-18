enum Colour{
    Red, Green, Yellow,Black,White,Pink
}
class valueMethod{
    public static void main(String [] args){
        Colour c1;
        System.out.println("All colour");
        Colour clr[] = Colour.values();
        for(Colour c : clr){
            System.out.println(c + " ");
        }
        System.out.println();
        c1 = Colour.valueOf("Black");
        System.out.println("c1 constraint "+ c1);
    }
}