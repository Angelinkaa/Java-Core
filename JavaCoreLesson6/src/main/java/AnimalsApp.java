public class AnimalsApp {
    public static void main(String[] args) {
        Cats cat = new Cats("Барсик", 200, 0);
        cat.catInfo();
        cat.RunCats();
        cat.SwimCats();
        Dogs dog = new Dogs("Дамка", 500, 10);
        dog.dogInfo();
        dog.RunDogs();
        dog.SwimDogs();

    }
}

