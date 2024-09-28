
class WildCat{
    void speak(){
        System.out.println("Meon....!");
    }
}

class PetCat extends WildCat{
    void speak(){
        System.out.println("Meow...!");
    }
}

class MagiCat extends WildCat{
    static boolean owned =true;
    void speak(){
        if(owned){
            super.speak();
        }else{
            System.out.println("Hello World!");
        }
    }
}




class multipleinheritance {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        PetCat wc = new PetCat();
        MagiCat mc = new MagiCat();

        mc.owned = true;
        mc.speak();
        wc.speak();

    }
}
