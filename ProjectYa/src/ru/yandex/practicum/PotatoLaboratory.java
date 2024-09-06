package ru.yandex.practicum;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class PotatoLaboratory {
//
//    public static void main(String[] args) {
//        List<Potato> potatoes = List.of(
//                new Potato(1, 30, 30, 30),
//                new Potato(2, 35, 31, 35),
//                new Potato(3, 40, 35, 44),
//                new Potato(4, 28, 44, 41),
//                new Potato(5, 33, 23, 30),
//                new Potato(6, 35, 33, 33),
//                new Potato(7, 38, 41, 24)
//        );
//
//        List<Potato> fourUnderExperiment = findPotatoesForExperiment(potatoes);
//
//        System.out.println("Картофелины для эксперимента: " + fourUnderExperiment);
//    }
//
//    private static List<Potato> findPotatoesForExperiment(List<Potato> potatoes) {
//        ArrayList<Potato> potatoes1 = new ArrayList<>(potatoes);
//        Collections.sort(potatoes1);
//        Potato smallest1 = potatoes1.get(0);
//        Potato smallest2 = potatoes1.get(1);
//        Potato largest1 = potatoes1.get(potatoes1.size() - 1);
//        Potato largest2 = potatoes1.get(potatoes1.size() - 2);
//
//        List<Potato> result = new ArrayList<>();
//        result.add(smallest1);
//        result.add(smallest2);
//        result.add(largest2);
//        result.add(largest1);
//
//        return result;
//        return List.of(potatoes1.get(0), potatoes1.get(1), potatoes1.get(potatoes1.size() - 1), potatoes1.get(potatoes1.size() - 2));
//    }
//}