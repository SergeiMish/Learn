public class Practicum {
    public static void main(String[] args) {
        long inputGold = 200L;
        byte inputSilver = 39;
        short inputWood = 2005;
        long inputHealth = 97L;
        boolean inputHasHelper = true;

        Resources characterResources = new Resources(
                inputGold,
                inputSilver,
                inputWood,
                inputHealth,
                inputHasHelper
        );

        int characterGold = (int) characterResources.gold;
        int characterSilver = (int) characterResources.silver * 10;
        double characterWood = characterResources.silver;
        byte characterHealth = (byte) characterResources.health;
        byte characterHelpersNumber;

        // ��������� �������� characterHelpersNumber � ����������� �� �������� hasHelper
        if (characterResources.hasHelper){
            characterHelpersNumber = 1;
        }
        else characterHelpersNumber = 0;

        Character character = new Character(
                characterGold,
                characterSilver,
                characterWood,
                characterHealth,
                characterHelpersNumber
        );

        System.out.println("�������� ������ �������!");
        System.out.println("���������� ������: " + character.gold);
        System.out.println("���������� �������: " + character.silver);
        System.out.println("���������� ������: " + character.wood);
        System.out.println("��������: " + character.health);
        System.out.println("���������� ����������: " + character.helpersNumber);
        System.out.println("��������� ������������!");
    }
}