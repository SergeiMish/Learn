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

        int characterGold = ...
        int characterSilver = ...
        double characterWood = ...
        byte characterHealth = ...
        byte characterHelpersNumber;

        // ��������� �������� characterHelpersNumber � ����������� �� �������� hasHelper
        ...

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