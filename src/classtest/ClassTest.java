package classtest;

class Candy{
    static { System.out.println("Loading classtest.Candy"); }
}

class Gum{
    static { System.out.println("Loading classtest.Gum"); }
}

class Cookie{
    static { System.out.println("Loading classtest.Cookie"); }
}

public class ClassTest {
    public static void main(String[] args){
        try {
            System.out.println(Class.forName("classtest.Candy").getName());

            System.out.println(Class.forName("classtest.Candy").getSimpleName());

            System.out.println(Class.forName("classtest.Candy").getCanonicalName());

            System.out.println(Class.forName("classtest.Candy").isInterface());

            try {
                System.out.println(Class.forName("classtest.Candy").newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

