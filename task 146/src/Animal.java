public enum Animal {
    CAT("кошка"),DOG("собака"),BIRD("птица");

    private String translation;

    Animal(String translation){
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
    public String toString(){
        return "Перевод на русский язык " + translation;
    }
}
