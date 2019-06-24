import builder.Cat;
import builder.CatFurColor;
import builder.CatPersonality;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Cat cat = createCat();
        System.out.format(
                "Cat name is %s , age %d , breed %s , color %s and it is %s .",
                cat.getName(),
                cat.getAge(),
                cat.getBreed(),
                cat.getFurColor(),
                cat.getPersonality()
        );
    }

    private static Cat createCat() {
        return new Cat.Builder()
                .setName("Fluffy")
                .setAge(10)
                .setFurColor(CatFurColor.GINGER)
                .setPersonality(CatPersonality.PLAYFUL)
                .build();
    }

}
