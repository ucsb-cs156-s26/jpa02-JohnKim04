package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "John K.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        // DONE: Change this to your github id
        return "JohnKim04";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        // DONE: Change this to your team name
        Team team = new Team("s26-05");
        team.addMember("Alexia");
        team.addMember("Elissa");
        team.addMember("John K.");
        team.addMember("Joaquin");
        team.addMember("Soome");
        team.addMember("Ibrahim");
        return team;
    }
}
