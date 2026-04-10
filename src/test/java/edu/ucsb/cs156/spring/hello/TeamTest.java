package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
        assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_same_object() {
        team = new Team();
        assertTrue(team.equals(team));
    }

    @Test
    public void equals_fails_non_team_obj() {
        team = new Team();
        assertFalse(team.equals("non-team type"));
    }

    @Test
    public void equals_teams_with_same_values() {
        team = new Team("team");
        team.addMember("mem1");

        Team team2 = new Team("team");
        team2.addMember("mem1");
        assertTrue(team.equals(team2));
    }

    @Test
    public void equals_teams_with_same_name_diff_mems() {
        team = new Team("team");
        team.addMember("mem1");

        Team team2 = new Team("team");
        team2.addMember("mem2");
        assertFalse(team.equals(team2));
    }

    @Test
    public void equals_teams_with_diff_names() {
        team = new Team("team");

        Team team2 = new Team("team2");
        assertFalse(team.equals(team2));
    }

    @Test
    public void valid_hashcode() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        int name_hash = t1.getName().hashCode();
        int member_hash = t1.getMembers().hashCode();
        assertEquals(t1.hashCode(), name_hash | member_hash);

        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
    }
}
