public enum Animal {
    DOG("Собака"), CAT("Кошка"), MOUSE("Мышь");
    private String traslation;
    Animal(String traslation){
        this.traslation = traslation;
    }

    public String getTraslation() {
        return traslation;
    }
}
