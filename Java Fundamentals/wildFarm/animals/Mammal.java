package wildFarm.animals;

abstract class Mammal extends Animal{
    private String livingRegion;

    Mammal(String animalName, double animalWeight, String livingRegion) {
        super(animalName, animalWeight);
        this.setLivingRegion(livingRegion);
    }

    String getLivingRegion() {
        return this.livingRegion;
    }

    private void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }
}
