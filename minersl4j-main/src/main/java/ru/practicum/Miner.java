package ru.practicum;

import ch.qos.logback.classic.Level;
import info.schnatterer.mobynamesgenerator.MobyNamesGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class Miner {

    private static final int CANDIDATES_COUNT = 345;

    private static final int MINING_CYCLES_COUNT = 54321;
    private final static Logger log = LoggerFactory.getLogger(Miner.class);

    public static void main(String[] args) {
        ((ch.qos.logback.classic.Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME))
                .setLevel(Level.INFO);




        log.info("Starting a new JRE coin mining session!");
        Blockchain blockchain = new Blockchain();
        log.info("Created a blockchain");
        List<Candidate> candidateList = initCandidateList(blockchain, CANDIDATES_COUNT);
        log.info("Created list of candidates");

        log.info("Running a mining cycle");
        Map<String, Integer> rewards = new HashMap<>();

        for (int cycle = 0; cycle < MINING_CYCLES_COUNT; cycle++){
            System.out.println("Starting mining cycle "+cycle);
            for (Candidate candidate : candidateList) {
                System.out.println("Starting candidate try "+candidate.getName());
                int[] candidateHeader = candidate.getHeader();
                Optional<Blockchain.Block> maybeBlock = blockchain.checkHeader(candidate.getName(), candidateHeader);
                if(maybeBlock.isPresent()){
                    Blockchain.Block block = maybeBlock.get();
                    rewards.put(candidate.getName(), block.getReward() + rewards.getOrDefault(candidate.getName(), 0));
                    System.out.println("Candidate "+ candidate.getName()+"win a reward");
                } else {
                    System.out.println("Candidate "+ candidate.getName()+" did not win");
                }
            }
        }


        rewards.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(winner -> {
            System.out.println("Winner is "+winner.getKey()+" with reward "+winner.getValue());
        });
    }

    private static List<Candidate> initCandidateList(Blockchain blockchain, int count) {
        List<Candidate> list = new ArrayList<>();
        for(int idx = 0; idx < count; idx++){
            list.add(new Candidate(blockchain));
        }
        return list;
    }
}

class Candidate {
    private final Blockchain blockchain;
    private final String name;

    public Candidate(Blockchain blockchain){
        this.name = MobyNamesGenerator.getRandomName();
        this.blockchain = blockchain;
    }

    public int[] getHeader(){
        int[] header = new int[Blockchain.HEADER_LENGTH];
        for (int idx = 0; idx < header.length; idx++){
            int next = (int) Math.min(Math.max(0, Math.round(Math.random() * 10)), 9);
            header[idx] = next;
            System.out.print("..." + next);
        }
        System.out.println(";");
        return header;
    }

    public String getName() {
        return name;
    }
}